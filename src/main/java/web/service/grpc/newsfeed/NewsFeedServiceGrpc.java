package web.service.grpc.newsfeed;

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
    comments = "Source: newsfeed.proto")
public final class NewsFeedServiceGrpc {

  private NewsFeedServiceGrpc() {}

  public static final String SERVICE_NAME = "NewsFeedService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<web.service.grpc.newsfeed.GetNewsFeedRequest,
      web.service.grpc.newsfeed.GetNewsFeedResponse> getGetNewsFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNewsFeed",
      requestType = web.service.grpc.newsfeed.GetNewsFeedRequest.class,
      responseType = web.service.grpc.newsfeed.GetNewsFeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.newsfeed.GetNewsFeedRequest,
      web.service.grpc.newsfeed.GetNewsFeedResponse> getGetNewsFeedMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.newsfeed.GetNewsFeedRequest, web.service.grpc.newsfeed.GetNewsFeedResponse> getGetNewsFeedMethod;
    if ((getGetNewsFeedMethod = NewsFeedServiceGrpc.getGetNewsFeedMethod) == null) {
      synchronized (NewsFeedServiceGrpc.class) {
        if ((getGetNewsFeedMethod = NewsFeedServiceGrpc.getGetNewsFeedMethod) == null) {
          NewsFeedServiceGrpc.getGetNewsFeedMethod = getGetNewsFeedMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.newsfeed.GetNewsFeedRequest, web.service.grpc.newsfeed.GetNewsFeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NewsFeedService", "getNewsFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.newsfeed.GetNewsFeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.newsfeed.GetNewsFeedResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NewsFeedServiceMethodDescriptorSupplier("getNewsFeed"))
                  .build();
          }
        }
     }
     return getGetNewsFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.newsfeed.Post,
      web.service.grpc.newsfeed.SaveNewPostResponse> getSaveNewPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveNewPost",
      requestType = web.service.grpc.newsfeed.Post.class,
      responseType = web.service.grpc.newsfeed.SaveNewPostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.newsfeed.Post,
      web.service.grpc.newsfeed.SaveNewPostResponse> getSaveNewPostMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.newsfeed.Post, web.service.grpc.newsfeed.SaveNewPostResponse> getSaveNewPostMethod;
    if ((getSaveNewPostMethod = NewsFeedServiceGrpc.getSaveNewPostMethod) == null) {
      synchronized (NewsFeedServiceGrpc.class) {
        if ((getSaveNewPostMethod = NewsFeedServiceGrpc.getSaveNewPostMethod) == null) {
          NewsFeedServiceGrpc.getSaveNewPostMethod = getSaveNewPostMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.newsfeed.Post, web.service.grpc.newsfeed.SaveNewPostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NewsFeedService", "saveNewPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.newsfeed.Post.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.newsfeed.SaveNewPostResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NewsFeedServiceMethodDescriptorSupplier("saveNewPost"))
                  .build();
          }
        }
     }
     return getSaveNewPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.newsfeed.LikeRequest,
      web.service.grpc.newsfeed.LikeResponse> getLikeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "like",
      requestType = web.service.grpc.newsfeed.LikeRequest.class,
      responseType = web.service.grpc.newsfeed.LikeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.newsfeed.LikeRequest,
      web.service.grpc.newsfeed.LikeResponse> getLikeMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.newsfeed.LikeRequest, web.service.grpc.newsfeed.LikeResponse> getLikeMethod;
    if ((getLikeMethod = NewsFeedServiceGrpc.getLikeMethod) == null) {
      synchronized (NewsFeedServiceGrpc.class) {
        if ((getLikeMethod = NewsFeedServiceGrpc.getLikeMethod) == null) {
          NewsFeedServiceGrpc.getLikeMethod = getLikeMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.newsfeed.LikeRequest, web.service.grpc.newsfeed.LikeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NewsFeedService", "like"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.newsfeed.LikeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.newsfeed.LikeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NewsFeedServiceMethodDescriptorSupplier("like"))
                  .build();
          }
        }
     }
     return getLikeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NewsFeedServiceStub newStub(io.grpc.Channel channel) {
    return new NewsFeedServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NewsFeedServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NewsFeedServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NewsFeedServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NewsFeedServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NewsFeedServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getNewsFeed(web.service.grpc.newsfeed.GetNewsFeedRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.newsfeed.GetNewsFeedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNewsFeedMethod(), responseObserver);
    }

    /**
     */
    public void saveNewPost(web.service.grpc.newsfeed.Post request,
        io.grpc.stub.StreamObserver<web.service.grpc.newsfeed.SaveNewPostResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveNewPostMethod(), responseObserver);
    }

    /**
     */
    public void like(web.service.grpc.newsfeed.LikeRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.newsfeed.LikeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLikeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNewsFeedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.newsfeed.GetNewsFeedRequest,
                web.service.grpc.newsfeed.GetNewsFeedResponse>(
                  this, METHODID_GET_NEWS_FEED)))
          .addMethod(
            getSaveNewPostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.newsfeed.Post,
                web.service.grpc.newsfeed.SaveNewPostResponse>(
                  this, METHODID_SAVE_NEW_POST)))
          .addMethod(
            getLikeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.newsfeed.LikeRequest,
                web.service.grpc.newsfeed.LikeResponse>(
                  this, METHODID_LIKE)))
          .build();
    }
  }

  /**
   */
  public static final class NewsFeedServiceStub extends io.grpc.stub.AbstractStub<NewsFeedServiceStub> {
    private NewsFeedServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NewsFeedServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewsFeedServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NewsFeedServiceStub(channel, callOptions);
    }

    /**
     */
    public void getNewsFeed(web.service.grpc.newsfeed.GetNewsFeedRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.newsfeed.GetNewsFeedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNewsFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveNewPost(web.service.grpc.newsfeed.Post request,
        io.grpc.stub.StreamObserver<web.service.grpc.newsfeed.SaveNewPostResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveNewPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void like(web.service.grpc.newsfeed.LikeRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.newsfeed.LikeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLikeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NewsFeedServiceBlockingStub extends io.grpc.stub.AbstractStub<NewsFeedServiceBlockingStub> {
    private NewsFeedServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NewsFeedServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewsFeedServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NewsFeedServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public web.service.grpc.newsfeed.GetNewsFeedResponse getNewsFeed(web.service.grpc.newsfeed.GetNewsFeedRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNewsFeedMethod(), getCallOptions(), request);
    }

    /**
     */
    public web.service.grpc.newsfeed.SaveNewPostResponse saveNewPost(web.service.grpc.newsfeed.Post request) {
      return blockingUnaryCall(
          getChannel(), getSaveNewPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public web.service.grpc.newsfeed.LikeResponse like(web.service.grpc.newsfeed.LikeRequest request) {
      return blockingUnaryCall(
          getChannel(), getLikeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NewsFeedServiceFutureStub extends io.grpc.stub.AbstractStub<NewsFeedServiceFutureStub> {
    private NewsFeedServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NewsFeedServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewsFeedServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NewsFeedServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.newsfeed.GetNewsFeedResponse> getNewsFeed(
        web.service.grpc.newsfeed.GetNewsFeedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNewsFeedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.newsfeed.SaveNewPostResponse> saveNewPost(
        web.service.grpc.newsfeed.Post request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveNewPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.newsfeed.LikeResponse> like(
        web.service.grpc.newsfeed.LikeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLikeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NEWS_FEED = 0;
  private static final int METHODID_SAVE_NEW_POST = 1;
  private static final int METHODID_LIKE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NewsFeedServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NewsFeedServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NEWS_FEED:
          serviceImpl.getNewsFeed((web.service.grpc.newsfeed.GetNewsFeedRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.newsfeed.GetNewsFeedResponse>) responseObserver);
          break;
        case METHODID_SAVE_NEW_POST:
          serviceImpl.saveNewPost((web.service.grpc.newsfeed.Post) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.newsfeed.SaveNewPostResponse>) responseObserver);
          break;
        case METHODID_LIKE:
          serviceImpl.like((web.service.grpc.newsfeed.LikeRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.newsfeed.LikeResponse>) responseObserver);
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

  private static abstract class NewsFeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NewsFeedServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return web.service.grpc.newsfeed.Newsfeed.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NewsFeedService");
    }
  }

  private static final class NewsFeedServiceFileDescriptorSupplier
      extends NewsFeedServiceBaseDescriptorSupplier {
    NewsFeedServiceFileDescriptorSupplier() {}
  }

  private static final class NewsFeedServiceMethodDescriptorSupplier
      extends NewsFeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NewsFeedServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NewsFeedServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NewsFeedServiceFileDescriptorSupplier())
              .addMethod(getGetNewsFeedMethod())
              .addMethod(getSaveNewPostMethod())
              .addMethod(getLikeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
