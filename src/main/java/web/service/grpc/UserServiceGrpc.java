package web.service.grpc;

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
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<web.service.grpc.RegistrationRequestGrpc,
      web.service.grpc.RegistrationResponseGrpc> getRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Registration",
      requestType = web.service.grpc.RegistrationRequestGrpc.class,
      responseType = web.service.grpc.RegistrationResponseGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.RegistrationRequestGrpc,
      web.service.grpc.RegistrationResponseGrpc> getRegistrationMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.RegistrationRequestGrpc, web.service.grpc.RegistrationResponseGrpc> getRegistrationMethod;
    if ((getRegistrationMethod = UserServiceGrpc.getRegistrationMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRegistrationMethod = UserServiceGrpc.getRegistrationMethod) == null) {
          UserServiceGrpc.getRegistrationMethod = getRegistrationMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.RegistrationRequestGrpc, web.service.grpc.RegistrationResponseGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "Registration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.RegistrationRequestGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.RegistrationResponseGrpc.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Registration"))
                  .build();
          }
        }
     }
     return getRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.LoginRequest,
      web.service.grpc.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = web.service.grpc.LoginRequest.class,
      responseType = web.service.grpc.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.LoginRequest,
      web.service.grpc.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.LoginRequest, web.service.grpc.LoginResponse> getLoginMethod;
    if ((getLoginMethod = UserServiceGrpc.getLoginMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLoginMethod = UserServiceGrpc.getLoginMethod) == null) {
          UserServiceGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.LoginRequest, web.service.grpc.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.LoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.ConfirmEmailRequest,
      web.service.grpc.ConfirmEmailResponse> getVerificationTokenRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerificationTokenRegistration",
      requestType = web.service.grpc.ConfirmEmailRequest.class,
      responseType = web.service.grpc.ConfirmEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.ConfirmEmailRequest,
      web.service.grpc.ConfirmEmailResponse> getVerificationTokenRegistrationMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.ConfirmEmailRequest, web.service.grpc.ConfirmEmailResponse> getVerificationTokenRegistrationMethod;
    if ((getVerificationTokenRegistrationMethod = UserServiceGrpc.getVerificationTokenRegistrationMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getVerificationTokenRegistrationMethod = UserServiceGrpc.getVerificationTokenRegistrationMethod) == null) {
          UserServiceGrpc.getVerificationTokenRegistrationMethod = getVerificationTokenRegistrationMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.ConfirmEmailRequest, web.service.grpc.ConfirmEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "VerificationTokenRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.ConfirmEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.ConfirmEmailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("VerificationTokenRegistration"))
                  .build();
          }
        }
     }
     return getVerificationTokenRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.PasswordResetRequest,
      web.service.grpc.PasswordResetResponse> getPasswordForgotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PasswordForgot",
      requestType = web.service.grpc.PasswordResetRequest.class,
      responseType = web.service.grpc.PasswordResetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.PasswordResetRequest,
      web.service.grpc.PasswordResetResponse> getPasswordForgotMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.PasswordResetRequest, web.service.grpc.PasswordResetResponse> getPasswordForgotMethod;
    if ((getPasswordForgotMethod = UserServiceGrpc.getPasswordForgotMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getPasswordForgotMethod = UserServiceGrpc.getPasswordForgotMethod) == null) {
          UserServiceGrpc.getPasswordForgotMethod = getPasswordForgotMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.PasswordResetRequest, web.service.grpc.PasswordResetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "PasswordForgot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.PasswordResetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.PasswordResetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("PasswordForgot"))
                  .build();
          }
        }
     }
     return getPasswordForgotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.RegistrationInformationRequest,
      web.service.grpc.RegistrationInformationResponse> getRegistrationInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegistrationInformation",
      requestType = web.service.grpc.RegistrationInformationRequest.class,
      responseType = web.service.grpc.RegistrationInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.RegistrationInformationRequest,
      web.service.grpc.RegistrationInformationResponse> getRegistrationInformationMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.RegistrationInformationRequest, web.service.grpc.RegistrationInformationResponse> getRegistrationInformationMethod;
    if ((getRegistrationInformationMethod = UserServiceGrpc.getRegistrationInformationMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRegistrationInformationMethod = UserServiceGrpc.getRegistrationInformationMethod) == null) {
          UserServiceGrpc.getRegistrationInformationMethod = getRegistrationInformationMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.RegistrationInformationRequest, web.service.grpc.RegistrationInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "RegistrationInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.RegistrationInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.RegistrationInformationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RegistrationInformation"))
                  .build();
          }
        }
     }
     return getRegistrationInformationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registration(web.service.grpc.RegistrationRequestGrpc request,
        io.grpc.stub.StreamObserver<web.service.grpc.RegistrationResponseGrpc> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistrationMethod(), responseObserver);
    }

    /**
     */
    public void login(web.service.grpc.LoginRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void verificationTokenRegistration(web.service.grpc.ConfirmEmailRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.ConfirmEmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVerificationTokenRegistrationMethod(), responseObserver);
    }

    /**
     */
    public void passwordForgot(web.service.grpc.PasswordResetRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.PasswordResetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPasswordForgotMethod(), responseObserver);
    }

    /**
     */
    public void registrationInformation(web.service.grpc.RegistrationInformationRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.RegistrationInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistrationInformationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegistrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.RegistrationRequestGrpc,
                web.service.grpc.RegistrationResponseGrpc>(
                  this, METHODID_REGISTRATION)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.LoginRequest,
                web.service.grpc.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getVerificationTokenRegistrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.ConfirmEmailRequest,
                web.service.grpc.ConfirmEmailResponse>(
                  this, METHODID_VERIFICATION_TOKEN_REGISTRATION)))
          .addMethod(
            getPasswordForgotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.PasswordResetRequest,
                web.service.grpc.PasswordResetResponse>(
                  this, METHODID_PASSWORD_FORGOT)))
          .addMethod(
            getRegistrationInformationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.RegistrationInformationRequest,
                web.service.grpc.RegistrationInformationResponse>(
                  this, METHODID_REGISTRATION_INFORMATION)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void registration(web.service.grpc.RegistrationRequestGrpc request,
        io.grpc.stub.StreamObserver<web.service.grpc.RegistrationResponseGrpc> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(web.service.grpc.LoginRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verificationTokenRegistration(web.service.grpc.ConfirmEmailRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.ConfirmEmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerificationTokenRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void passwordForgot(web.service.grpc.PasswordResetRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.PasswordResetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPasswordForgotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registrationInformation(web.service.grpc.RegistrationInformationRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.RegistrationInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistrationInformationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public web.service.grpc.RegistrationResponseGrpc registration(web.service.grpc.RegistrationRequestGrpc request) {
      return blockingUnaryCall(
          getChannel(), getRegistrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public web.service.grpc.LoginResponse login(web.service.grpc.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public web.service.grpc.ConfirmEmailResponse verificationTokenRegistration(web.service.grpc.ConfirmEmailRequest request) {
      return blockingUnaryCall(
          getChannel(), getVerificationTokenRegistrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public web.service.grpc.PasswordResetResponse passwordForgot(web.service.grpc.PasswordResetRequest request) {
      return blockingUnaryCall(
          getChannel(), getPasswordForgotMethod(), getCallOptions(), request);
    }

    /**
     */
    public web.service.grpc.RegistrationInformationResponse registrationInformation(web.service.grpc.RegistrationInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegistrationInformationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.RegistrationResponseGrpc> registration(
        web.service.grpc.RegistrationRequestGrpc request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistrationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.LoginResponse> login(
        web.service.grpc.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.ConfirmEmailResponse> verificationTokenRegistration(
        web.service.grpc.ConfirmEmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVerificationTokenRegistrationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.PasswordResetResponse> passwordForgot(
        web.service.grpc.PasswordResetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPasswordForgotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.RegistrationInformationResponse> registrationInformation(
        web.service.grpc.RegistrationInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistrationInformationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTRATION = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_VERIFICATION_TOKEN_REGISTRATION = 2;
  private static final int METHODID_PASSWORD_FORGOT = 3;
  private static final int METHODID_REGISTRATION_INFORMATION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTRATION:
          serviceImpl.registration((web.service.grpc.RegistrationRequestGrpc) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.RegistrationResponseGrpc>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((web.service.grpc.LoginRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.LoginResponse>) responseObserver);
          break;
        case METHODID_VERIFICATION_TOKEN_REGISTRATION:
          serviceImpl.verificationTokenRegistration((web.service.grpc.ConfirmEmailRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.ConfirmEmailResponse>) responseObserver);
          break;
        case METHODID_PASSWORD_FORGOT:
          serviceImpl.passwordForgot((web.service.grpc.PasswordResetRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.PasswordResetResponse>) responseObserver);
          break;
        case METHODID_REGISTRATION_INFORMATION:
          serviceImpl.registrationInformation((web.service.grpc.RegistrationInformationRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.RegistrationInformationResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return web.service.grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getRegistrationMethod())
              .addMethod(getLoginMethod())
              .addMethod(getVerificationTokenRegistrationMethod())
              .addMethod(getPasswordForgotMethod())
              .addMethod(getRegistrationInformationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
