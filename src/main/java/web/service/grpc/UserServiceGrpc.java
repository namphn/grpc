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

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.NewPasswordRequest,
      web.service.grpc.NewPasswordResponse> getPasswordResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PasswordReset",
      requestType = web.service.grpc.NewPasswordRequest.class,
      responseType = web.service.grpc.NewPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.NewPasswordRequest,
      web.service.grpc.NewPasswordResponse> getPasswordResetMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.NewPasswordRequest, web.service.grpc.NewPasswordResponse> getPasswordResetMethod;
    if ((getPasswordResetMethod = UserServiceGrpc.getPasswordResetMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getPasswordResetMethod = UserServiceGrpc.getPasswordResetMethod) == null) {
          UserServiceGrpc.getPasswordResetMethod = getPasswordResetMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.NewPasswordRequest, web.service.grpc.NewPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "PasswordReset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.NewPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.NewPasswordResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("PasswordReset"))
                  .build();
          }
        }
     }
     return getPasswordResetMethod;
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

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.VerificationResetPasswordTokenRequest,
      web.service.grpc.VerificationResetPasswordTokenResponse> getVerificationResetPasswordTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerificationResetPasswordToken",
      requestType = web.service.grpc.VerificationResetPasswordTokenRequest.class,
      responseType = web.service.grpc.VerificationResetPasswordTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.VerificationResetPasswordTokenRequest,
      web.service.grpc.VerificationResetPasswordTokenResponse> getVerificationResetPasswordTokenMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.VerificationResetPasswordTokenRequest, web.service.grpc.VerificationResetPasswordTokenResponse> getVerificationResetPasswordTokenMethod;
    if ((getVerificationResetPasswordTokenMethod = UserServiceGrpc.getVerificationResetPasswordTokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getVerificationResetPasswordTokenMethod = UserServiceGrpc.getVerificationResetPasswordTokenMethod) == null) {
          UserServiceGrpc.getVerificationResetPasswordTokenMethod = getVerificationResetPasswordTokenMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.VerificationResetPasswordTokenRequest, web.service.grpc.VerificationResetPasswordTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "VerificationResetPasswordToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.VerificationResetPasswordTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.VerificationResetPasswordTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("VerificationResetPasswordToken"))
                  .build();
          }
        }
     }
     return getVerificationResetPasswordTokenMethod;
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
     * <pre>
     * create a new account, save new email, password and send verification email
     * </pre>
     */
    public void registration(web.service.grpc.RegistrationRequestGrpc request,
        io.grpc.stub.StreamObserver<web.service.grpc.RegistrationResponseGrpc> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * login account
     * </pre>
     */
    public void login(web.service.grpc.LoginRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     * Verify email
     * </pre>
     */
    public void verificationTokenRegistration(web.service.grpc.ConfirmEmailRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.ConfirmEmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVerificationTokenRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * send reset password email
     * </pre>
     */
    public void passwordForgot(web.service.grpc.PasswordResetRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.PasswordResetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPasswordForgotMethod(), responseObserver);
    }

    /**
     * <pre>
     * save new password
     * </pre>
     */
    public void passwordReset(web.service.grpc.NewPasswordRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.NewPasswordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPasswordResetMethod(), responseObserver);
    }

    /**
     * <pre>
     * register account's information
     * </pre>
     */
    public void registrationInformation(web.service.grpc.RegistrationInformationRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.RegistrationInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistrationInformationMethod(), responseObserver);
    }

    /**
     * <pre>
     * verify reset password token
     * </pre>
     */
    public void verificationResetPasswordToken(web.service.grpc.VerificationResetPasswordTokenRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.VerificationResetPasswordTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVerificationResetPasswordTokenMethod(), responseObserver);
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
            getPasswordResetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.NewPasswordRequest,
                web.service.grpc.NewPasswordResponse>(
                  this, METHODID_PASSWORD_RESET)))
          .addMethod(
            getRegistrationInformationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.RegistrationInformationRequest,
                web.service.grpc.RegistrationInformationResponse>(
                  this, METHODID_REGISTRATION_INFORMATION)))
          .addMethod(
            getVerificationResetPasswordTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.VerificationResetPasswordTokenRequest,
                web.service.grpc.VerificationResetPasswordTokenResponse>(
                  this, METHODID_VERIFICATION_RESET_PASSWORD_TOKEN)))
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
     * <pre>
     * create a new account, save new email, password and send verification email
     * </pre>
     */
    public void registration(web.service.grpc.RegistrationRequestGrpc request,
        io.grpc.stub.StreamObserver<web.service.grpc.RegistrationResponseGrpc> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * login account
     * </pre>
     */
    public void login(web.service.grpc.LoginRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Verify email
     * </pre>
     */
    public void verificationTokenRegistration(web.service.grpc.ConfirmEmailRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.ConfirmEmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerificationTokenRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * send reset password email
     * </pre>
     */
    public void passwordForgot(web.service.grpc.PasswordResetRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.PasswordResetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPasswordForgotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * save new password
     * </pre>
     */
    public void passwordReset(web.service.grpc.NewPasswordRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.NewPasswordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPasswordResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * register account's information
     * </pre>
     */
    public void registrationInformation(web.service.grpc.RegistrationInformationRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.RegistrationInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistrationInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * verify reset password token
     * </pre>
     */
    public void verificationResetPasswordToken(web.service.grpc.VerificationResetPasswordTokenRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.VerificationResetPasswordTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerificationResetPasswordTokenMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * create a new account, save new email, password and send verification email
     * </pre>
     */
    public web.service.grpc.RegistrationResponseGrpc registration(web.service.grpc.RegistrationRequestGrpc request) {
      return blockingUnaryCall(
          getChannel(), getRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * login account
     * </pre>
     */
    public web.service.grpc.LoginResponse login(web.service.grpc.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Verify email
     * </pre>
     */
    public web.service.grpc.ConfirmEmailResponse verificationTokenRegistration(web.service.grpc.ConfirmEmailRequest request) {
      return blockingUnaryCall(
          getChannel(), getVerificationTokenRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * send reset password email
     * </pre>
     */
    public web.service.grpc.PasswordResetResponse passwordForgot(web.service.grpc.PasswordResetRequest request) {
      return blockingUnaryCall(
          getChannel(), getPasswordForgotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * save new password
     * </pre>
     */
    public web.service.grpc.NewPasswordResponse passwordReset(web.service.grpc.NewPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getPasswordResetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * register account's information
     * </pre>
     */
    public web.service.grpc.RegistrationInformationResponse registrationInformation(web.service.grpc.RegistrationInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegistrationInformationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * verify reset password token
     * </pre>
     */
    public web.service.grpc.VerificationResetPasswordTokenResponse verificationResetPasswordToken(web.service.grpc.VerificationResetPasswordTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getVerificationResetPasswordTokenMethod(), getCallOptions(), request);
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
     * <pre>
     * create a new account, save new email, password and send verification email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.RegistrationResponseGrpc> registration(
        web.service.grpc.RegistrationRequestGrpc request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * login account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.LoginResponse> login(
        web.service.grpc.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Verify email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.ConfirmEmailResponse> verificationTokenRegistration(
        web.service.grpc.ConfirmEmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVerificationTokenRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * send reset password email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.PasswordResetResponse> passwordForgot(
        web.service.grpc.PasswordResetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPasswordForgotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * save new password
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.NewPasswordResponse> passwordReset(
        web.service.grpc.NewPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPasswordResetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * register account's information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.RegistrationInformationResponse> registrationInformation(
        web.service.grpc.RegistrationInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistrationInformationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * verify reset password token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.VerificationResetPasswordTokenResponse> verificationResetPasswordToken(
        web.service.grpc.VerificationResetPasswordTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVerificationResetPasswordTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTRATION = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_VERIFICATION_TOKEN_REGISTRATION = 2;
  private static final int METHODID_PASSWORD_FORGOT = 3;
  private static final int METHODID_PASSWORD_RESET = 4;
  private static final int METHODID_REGISTRATION_INFORMATION = 5;
  private static final int METHODID_VERIFICATION_RESET_PASSWORD_TOKEN = 6;

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
        case METHODID_PASSWORD_RESET:
          serviceImpl.passwordReset((web.service.grpc.NewPasswordRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.NewPasswordResponse>) responseObserver);
          break;
        case METHODID_REGISTRATION_INFORMATION:
          serviceImpl.registrationInformation((web.service.grpc.RegistrationInformationRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.RegistrationInformationResponse>) responseObserver);
          break;
        case METHODID_VERIFICATION_RESET_PASSWORD_TOKEN:
          serviceImpl.verificationResetPasswordToken((web.service.grpc.VerificationResetPasswordTokenRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.VerificationResetPasswordTokenResponse>) responseObserver);
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
              .addMethod(getPasswordResetMethod())
              .addMethod(getRegistrationInformationMethod())
              .addMethod(getVerificationResetPasswordTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
