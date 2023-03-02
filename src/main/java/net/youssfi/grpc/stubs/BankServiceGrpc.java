package net.youssfi.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bank.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.ConvertCurrencyRequest,
      net.youssfi.grpc.stubs.Bank.ConvertCurrencyResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = net.youssfi.grpc.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = net.youssfi.grpc.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.ConvertCurrencyRequest,
      net.youssfi.grpc.stubs.Bank.ConvertCurrencyResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.ConvertCurrencyRequest, net.youssfi.grpc.stubs.Bank.ConvertCurrencyResponse> getConvertMethod;
    if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
          BankServiceGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<net.youssfi.grpc.stubs.Bank.ConvertCurrencyRequest, net.youssfi.grpc.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.grpc.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.grpc.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.GetAccountRequest,
      net.youssfi.grpc.stubs.Bank.GetAccountResponse> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAccount",
      requestType = net.youssfi.grpc.stubs.Bank.GetAccountRequest.class,
      responseType = net.youssfi.grpc.stubs.Bank.GetAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.GetAccountRequest,
      net.youssfi.grpc.stubs.Bank.GetAccountResponse> getGetAccountMethod() {
    io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.GetAccountRequest, net.youssfi.grpc.stubs.Bank.GetAccountResponse> getGetAccountMethod;
    if ((getGetAccountMethod = BankServiceGrpc.getGetAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetAccountMethod = BankServiceGrpc.getGetAccountMethod) == null) {
          BankServiceGrpc.getGetAccountMethod = getGetAccountMethod = 
              io.grpc.MethodDescriptor.<net.youssfi.grpc.stubs.Bank.GetAccountRequest, net.youssfi.grpc.stubs.Bank.GetAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.grpc.stubs.Bank.GetAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.grpc.stubs.Bank.GetAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getAccount"))
                  .build();
          }
        }
     }
     return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.GetListAccountsRequest,
      net.youssfi.grpc.stubs.Bank.GetListAccountResponse> getGetListAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListAccounts",
      requestType = net.youssfi.grpc.stubs.Bank.GetListAccountsRequest.class,
      responseType = net.youssfi.grpc.stubs.Bank.GetListAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.GetListAccountsRequest,
      net.youssfi.grpc.stubs.Bank.GetListAccountResponse> getGetListAccountsMethod() {
    io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.GetListAccountsRequest, net.youssfi.grpc.stubs.Bank.GetListAccountResponse> getGetListAccountsMethod;
    if ((getGetListAccountsMethod = BankServiceGrpc.getGetListAccountsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetListAccountsMethod = BankServiceGrpc.getGetListAccountsMethod) == null) {
          BankServiceGrpc.getGetListAccountsMethod = getGetListAccountsMethod = 
              io.grpc.MethodDescriptor.<net.youssfi.grpc.stubs.Bank.GetListAccountsRequest, net.youssfi.grpc.stubs.Bank.GetListAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getListAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.grpc.stubs.Bank.GetListAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.grpc.stubs.Bank.GetListAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getListAccounts"))
                  .build();
          }
        }
     }
     return getGetListAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.GetStreamOfAccountTransactionsRequest,
      net.youssfi.grpc.stubs.Bank.AccountTransaction> getGetStreamOfAccountTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStreamOfAccountTransactions",
      requestType = net.youssfi.grpc.stubs.Bank.GetStreamOfAccountTransactionsRequest.class,
      responseType = net.youssfi.grpc.stubs.Bank.AccountTransaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.GetStreamOfAccountTransactionsRequest,
      net.youssfi.grpc.stubs.Bank.AccountTransaction> getGetStreamOfAccountTransactionsMethod() {
    io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.GetStreamOfAccountTransactionsRequest, net.youssfi.grpc.stubs.Bank.AccountTransaction> getGetStreamOfAccountTransactionsMethod;
    if ((getGetStreamOfAccountTransactionsMethod = BankServiceGrpc.getGetStreamOfAccountTransactionsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetStreamOfAccountTransactionsMethod = BankServiceGrpc.getGetStreamOfAccountTransactionsMethod) == null) {
          BankServiceGrpc.getGetStreamOfAccountTransactionsMethod = getGetStreamOfAccountTransactionsMethod = 
              io.grpc.MethodDescriptor.<net.youssfi.grpc.stubs.Bank.GetStreamOfAccountTransactionsRequest, net.youssfi.grpc.stubs.Bank.AccountTransaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getStreamOfAccountTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.grpc.stubs.Bank.GetStreamOfAccountTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.grpc.stubs.Bank.AccountTransaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getStreamOfAccountTransactions"))
                  .build();
          }
        }
     }
     return getGetStreamOfAccountTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.AccountTransaction,
      net.youssfi.grpc.stubs.Bank.PerformStreamOfTransactionResponse> getSubmitStreamOfTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "submitStreamOfTransactions",
      requestType = net.youssfi.grpc.stubs.Bank.AccountTransaction.class,
      responseType = net.youssfi.grpc.stubs.Bank.PerformStreamOfTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.AccountTransaction,
      net.youssfi.grpc.stubs.Bank.PerformStreamOfTransactionResponse> getSubmitStreamOfTransactionsMethod() {
    io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.AccountTransaction, net.youssfi.grpc.stubs.Bank.PerformStreamOfTransactionResponse> getSubmitStreamOfTransactionsMethod;
    if ((getSubmitStreamOfTransactionsMethod = BankServiceGrpc.getSubmitStreamOfTransactionsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getSubmitStreamOfTransactionsMethod = BankServiceGrpc.getSubmitStreamOfTransactionsMethod) == null) {
          BankServiceGrpc.getSubmitStreamOfTransactionsMethod = getSubmitStreamOfTransactionsMethod = 
              io.grpc.MethodDescriptor.<net.youssfi.grpc.stubs.Bank.AccountTransaction, net.youssfi.grpc.stubs.Bank.PerformStreamOfTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "submitStreamOfTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.grpc.stubs.Bank.AccountTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.grpc.stubs.Bank.PerformStreamOfTransactionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("submitStreamOfTransactions"))
                  .build();
          }
        }
     }
     return getSubmitStreamOfTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.AccountTransaction,
      net.youssfi.grpc.stubs.Bank.AccountTransaction> getExecuteStreamOfTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "executeStreamOfTransaction",
      requestType = net.youssfi.grpc.stubs.Bank.AccountTransaction.class,
      responseType = net.youssfi.grpc.stubs.Bank.AccountTransaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.AccountTransaction,
      net.youssfi.grpc.stubs.Bank.AccountTransaction> getExecuteStreamOfTransactionMethod() {
    io.grpc.MethodDescriptor<net.youssfi.grpc.stubs.Bank.AccountTransaction, net.youssfi.grpc.stubs.Bank.AccountTransaction> getExecuteStreamOfTransactionMethod;
    if ((getExecuteStreamOfTransactionMethod = BankServiceGrpc.getExecuteStreamOfTransactionMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getExecuteStreamOfTransactionMethod = BankServiceGrpc.getExecuteStreamOfTransactionMethod) == null) {
          BankServiceGrpc.getExecuteStreamOfTransactionMethod = getExecuteStreamOfTransactionMethod = 
              io.grpc.MethodDescriptor.<net.youssfi.grpc.stubs.Bank.AccountTransaction, net.youssfi.grpc.stubs.Bank.AccountTransaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "executeStreamOfTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.grpc.stubs.Bank.AccountTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.grpc.stubs.Bank.AccountTransaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("executeStreamOfTransaction"))
                  .build();
          }
        }
     }
     return getExecuteStreamOfTransactionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary bModel
     * </pre>
     */
    public void convert(net.youssfi.grpc.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     */
    public void getAccount(net.youssfi.grpc.stubs.Bank.GetAccountRequest request,
        io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.GetAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    public void getListAccounts(net.youssfi.grpc.stubs.Bank.GetListAccountsRequest request,
        io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.GetListAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server Streaming Model
     * </pre>
     */
    public void getStreamOfAccountTransactions(net.youssfi.grpc.stubs.Bank.GetStreamOfAccountTransactionsRequest request,
        io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.AccountTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStreamOfAccountTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.AccountTransaction> submitStreamOfTransactions(
        io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.PerformStreamOfTransactionResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSubmitStreamOfTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.AccountTransaction> executeStreamOfTransaction(
        io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.AccountTransaction> responseObserver) {
      return asyncUnimplementedStreamingCall(getExecuteStreamOfTransactionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.youssfi.grpc.stubs.Bank.ConvertCurrencyRequest,
                net.youssfi.grpc.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.youssfi.grpc.stubs.Bank.GetAccountRequest,
                net.youssfi.grpc.stubs.Bank.GetAccountResponse>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetListAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.youssfi.grpc.stubs.Bank.GetListAccountsRequest,
                net.youssfi.grpc.stubs.Bank.GetListAccountResponse>(
                  this, METHODID_GET_LIST_ACCOUNTS)))
          .addMethod(
            getGetStreamOfAccountTransactionsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                net.youssfi.grpc.stubs.Bank.GetStreamOfAccountTransactionsRequest,
                net.youssfi.grpc.stubs.Bank.AccountTransaction>(
                  this, METHODID_GET_STREAM_OF_ACCOUNT_TRANSACTIONS)))
          .addMethod(
            getSubmitStreamOfTransactionsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                net.youssfi.grpc.stubs.Bank.AccountTransaction,
                net.youssfi.grpc.stubs.Bank.PerformStreamOfTransactionResponse>(
                  this, METHODID_SUBMIT_STREAM_OF_TRANSACTIONS)))
          .addMethod(
            getExecuteStreamOfTransactionMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                net.youssfi.grpc.stubs.Bank.AccountTransaction,
                net.youssfi.grpc.stubs.Bank.AccountTransaction>(
                  this, METHODID_EXECUTE_STREAM_OF_TRANSACTION)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary bModel
     * </pre>
     */
    public void convert(net.youssfi.grpc.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccount(net.youssfi.grpc.stubs.Bank.GetAccountRequest request,
        io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.GetAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListAccounts(net.youssfi.grpc.stubs.Bank.GetListAccountsRequest request,
        io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.GetListAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server Streaming Model
     * </pre>
     */
    public void getStreamOfAccountTransactions(net.youssfi.grpc.stubs.Bank.GetStreamOfAccountTransactionsRequest request,
        io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.AccountTransaction> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStreamOfAccountTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.AccountTransaction> submitStreamOfTransactions(
        io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.PerformStreamOfTransactionResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSubmitStreamOfTransactionsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.AccountTransaction> executeStreamOfTransaction(
        io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.AccountTransaction> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getExecuteStreamOfTransactionMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary bModel
     * </pre>
     */
    public net.youssfi.grpc.stubs.Bank.ConvertCurrencyResponse convert(net.youssfi.grpc.stubs.Bank.ConvertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.youssfi.grpc.stubs.Bank.GetAccountResponse getAccount(net.youssfi.grpc.stubs.Bank.GetAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.youssfi.grpc.stubs.Bank.GetListAccountResponse getListAccounts(net.youssfi.grpc.stubs.Bank.GetListAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server Streaming Model
     * </pre>
     */
    public java.util.Iterator<net.youssfi.grpc.stubs.Bank.AccountTransaction> getStreamOfAccountTransactions(
        net.youssfi.grpc.stubs.Bank.GetStreamOfAccountTransactionsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStreamOfAccountTransactionsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary bModel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<net.youssfi.grpc.stubs.Bank.ConvertCurrencyResponse> convert(
        net.youssfi.grpc.stubs.Bank.ConvertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.youssfi.grpc.stubs.Bank.GetAccountResponse> getAccount(
        net.youssfi.grpc.stubs.Bank.GetAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.youssfi.grpc.stubs.Bank.GetListAccountResponse> getListAccounts(
        net.youssfi.grpc.stubs.Bank.GetListAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListAccountsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_ACCOUNT = 1;
  private static final int METHODID_GET_LIST_ACCOUNTS = 2;
  private static final int METHODID_GET_STREAM_OF_ACCOUNT_TRANSACTIONS = 3;
  private static final int METHODID_SUBMIT_STREAM_OF_TRANSACTIONS = 4;
  private static final int METHODID_EXECUTE_STREAM_OF_TRANSACTION = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((net.youssfi.grpc.stubs.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((net.youssfi.grpc.stubs.Bank.GetAccountRequest) request,
              (io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.GetAccountResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_ACCOUNTS:
          serviceImpl.getListAccounts((net.youssfi.grpc.stubs.Bank.GetListAccountsRequest) request,
              (io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.GetListAccountResponse>) responseObserver);
          break;
        case METHODID_GET_STREAM_OF_ACCOUNT_TRANSACTIONS:
          serviceImpl.getStreamOfAccountTransactions((net.youssfi.grpc.stubs.Bank.GetStreamOfAccountTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.AccountTransaction>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBMIT_STREAM_OF_TRANSACTIONS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.submitStreamOfTransactions(
              (io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.PerformStreamOfTransactionResponse>) responseObserver);
        case METHODID_EXECUTE_STREAM_OF_TRANSACTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.executeStreamOfTransaction(
              (io.grpc.stub.StreamObserver<net.youssfi.grpc.stubs.Bank.AccountTransaction>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.youssfi.grpc.stubs.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetListAccountsMethod())
              .addMethod(getGetStreamOfAccountTransactionsMethod())
              .addMethod(getSubmitStreamOfTransactionsMethod())
              .addMethod(getExecuteStreamOfTransactionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
