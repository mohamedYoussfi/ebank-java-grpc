package net.youssfi.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.StreamObserver;
import net.youssfi.grpc.stubs.Bank;
import net.youssfi.grpc.stubs.BankServiceGrpc;

import java.io.IOException;
import java.util.UUID;

public class GrpcClient {
    public static void main(String[] args) throws IOException {
        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",9090)
                .usePlaintext()
                .build();
        BankServiceGrpc.BankServiceBlockingStub blockingStub=BankServiceGrpc.newBlockingStub(managedChannel);
        BankServiceGrpc.BankServiceStub ayncStub=BankServiceGrpc.newStub(managedChannel);
        Bank.ConvertCurrencyRequest currencyRequest=Bank.ConvertCurrencyRequest.newBuilder()
                .setCurrencyFrom("MAD")
                .setCurrencyTo("EUR")
                .setAmount(8700)
                .build();
        Bank.ConvertCurrencyResponse response = blockingStub.convert(currencyRequest);
        System.out.println(response.toString());
        System.out.println("========================");
        ayncStub.convert(currencyRequest, new StreamObserver<Bank.ConvertCurrencyResponse>() {
            @Override
            public void onNext(Bank.ConvertCurrencyResponse convertCurrencyResponse) {
                System.out.println(".................");
                System.out.println(convertCurrencyResponse.toString());
                System.out.println(".................");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("End of conversation");
            }
        });
        Bank.GetAccountRequest getAccountRequest= Bank.GetAccountRequest.newBuilder()
                .setAccountId(UUID.randomUUID().toString()).build();
        ayncStub.getAccount(getAccountRequest, new StreamObserver<Bank.GetAccountResponse>() {
            @Override
            public void onNext(Bank.GetAccountResponse getAccountResponse) {
                System.out.println("---------------------------");
                System.out.println(getAccountResponse.getAccount());
                System.out.println("--------------------------");
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });
        Bank.GetStreamOfAccountTransactionsRequest streamOfAccountTransactionsRequest= Bank.GetStreamOfAccountTransactionsRequest.newBuilder()
                .setAccountId(UUID.randomUUID().toString())
                .build();
        ayncStub.getStreamOfAccountTransactions(streamOfAccountTransactionsRequest, new StreamObserver<Bank.AccountTransaction>() {
            @Override
            public void onNext(Bank.AccountTransaction accountTransaction) {
                System.out.println("******************");
                System.out.println(accountTransaction);
                System.out.println("******************");
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                System.out.println("------------------");
                System.out.println("End Stream of transactions");
                System.out.println("------------------");
            }
        });
        System.in.read();
    }
}
