package net.youssfi.grpc.service;

import io.grpc.stub.StreamObserver;
import net.youssfi.grpc.stubs.Bank;
import net.youssfi.grpc.stubs.BankServiceGrpc;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

public class BankGrpcServiceImpl extends BankServiceGrpc.BankServiceImplBase {
    @Override
    public void convert(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        double amount = request.getAmount();
        String currencyFrom=request.getCurrencyFrom();
        String currencyTo=request.getCurrencyTo();
        double result=11.3*amount;
        Bank.ConvertCurrencyResponse response=Bank.ConvertCurrencyResponse.newBuilder()
                .setCurrencyFrom(currencyFrom)
                .setCurrencyTo(currencyTo)
                .setAmount(amount)
                .setResult(result)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAccount(Bank.GetAccountRequest request, StreamObserver<Bank.GetAccountResponse> responseObserver) {
        Bank.Account account=Bank.Account.newBuilder()
                .setAccountId(request.getAccountId())
                .setBalance(Math.random()*60000)
                .setCurrency("MAD")
                .setCreatedAt(new Date().getTime())
                .setStatus(Bank.AccountStatus.ACTIVATED)
                .setType(Bank.AccountType.CURRENT_ACCOUNT)
                .build();
        Bank.GetAccountResponse accountResponse=Bank.GetAccountResponse.newBuilder()
                .setAccount(account)
                .build();
        responseObserver.onNext(accountResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getListAccounts(Bank.GetListAccountsRequest request, StreamObserver<Bank.GetListAccountResponse> responseObserver) {
        Bank.GetListAccountResponse.Builder builder = Bank.GetListAccountResponse.newBuilder();
        for (int i = 0; i < 3; i++) {
            Bank.Account account=Bank.Account.newBuilder()
                    .setAccountId(UUID.randomUUID().toString())
                    .setBalance(Math.random()*60000)
                    .setCurrency("MAD")
                    .setCreatedAt(new Date().getTime())
                    .setStatus(Math.random()>0.5?Bank.AccountStatus.ACTIVATED: Bank.AccountStatus.SUSPENDED)
                    .setType(Math.random()>0.5?Bank.AccountType.CURRENT_ACCOUNT: Bank.AccountType.SAVING_ACCOUNT)
                    .build();
            builder.addAccounts(account);
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getStreamOfAccountTransactions(Bank.GetStreamOfAccountTransactionsRequest request, StreamObserver<Bank.AccountTransaction> responseObserver) {
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            private int counter;
            @Override
            public void run() {
                Bank.AccountTransaction accountTransaction=Bank.AccountTransaction.newBuilder()
                        .setAccountId(request.getAccountId())
                        .setAmount(1000+Math.random()*9000)
                        .setTransactionDate(System.currentTimeMillis())
                        .setType(Math.random()>0.5?Bank.TransactionType.CREDIT: Bank.TransactionType.DEBIT)
                        .build();
                responseObserver.onNext(accountTransaction);
                ++counter;
                if(counter>20) {
                    responseObserver.onCompleted();
                    timer.cancel();
                }

            }
        },1000,1000);
    }

    @Override
    public StreamObserver<Bank.AccountTransaction> submitStreamOfTransactions(StreamObserver<Bank.PerformStreamOfTransactionResponse> responseObserver) {
        return new StreamObserver<Bank.AccountTransaction>() {
            long numberOfPerformedTransactions=0;
            double totalAmountOfPerformedTransactions=0;
            @Override
            public void onNext(Bank.AccountTransaction accountTransaction) {
                ++numberOfPerformedTransactions;
                totalAmountOfPerformedTransactions+=accountTransaction.getAmount();
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                Bank.PerformStreamOfTransactionResponse.Builder responseBuilder = Bank.PerformStreamOfTransactionResponse.newBuilder();
                responseBuilder.setTotalAmountOfPerformedTransactions(totalAmountOfPerformedTransactions);
                responseBuilder.setNumberOfPerformedTransactions(numberOfPerformedTransactions);
                responseObserver.onNext(responseBuilder.build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<Bank.AccountTransaction> executeStreamOfTransaction(StreamObserver<Bank.AccountTransaction> responseObserver) {
        return new StreamObserver<Bank.AccountTransaction>() {
            @Override
            public void onNext(Bank.AccountTransaction accountTransaction) {
                Bank.AccountTransaction item= Bank.AccountTransaction.newBuilder()
                        .setTransactionId(accountTransaction.getTransactionId())
                        .setAccountId(accountTransaction.getAccountId())
                        .setStatus(Bank.TransactionStatus.EXECUTED)
                        .setAmount(accountTransaction.getAmount())
                        .setTransactionDate(accountTransaction.getTransactionDate())
                        .setType(accountTransaction.getType())
                        .build();
                responseObserver.onNext(item);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
