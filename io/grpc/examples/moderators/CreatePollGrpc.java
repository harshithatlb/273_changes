package io.grpc.examples.moderators;

import static io.grpc.stub.Calls.createMethodDescriptor;
import static io.grpc.stub.Calls.asyncUnaryCall;
import static io.grpc.stub.Calls.asyncServerStreamingCall;
import static io.grpc.stub.Calls.asyncClientStreamingCall;
import static io.grpc.stub.Calls.duplexStreamingCall;
import static io.grpc.stub.Calls.blockingUnaryCall;
import static io.grpc.stub.Calls.blockingServerStreamingCall;
import static io.grpc.stub.Calls.unaryFutureCall;
import static io.grpc.stub.ServerCalls.createMethodDefinition;
import static io.grpc.stub.ServerCalls.asyncUnaryRequestCall;
import static io.grpc.stub.ServerCalls.asyncStreamingRequestCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class CreatePollGrpc {

  private static final io.grpc.stub.Method<io.grpc.examples.moderators.PollDetails,
      io.grpc.examples.moderators.Poll> METHOD_CREATE_POLL =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "createPoll",
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.moderators.PollDetails.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.moderators.Poll.PARSER));

  public static CreatePollStub newStub(io.grpc.Channel channel) {
    return new CreatePollStub(channel, CONFIG);
  }

  public static CreatePollBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CreatePollBlockingStub(channel, CONFIG);
  }

  public static CreatePollFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CreatePollFutureStub(channel, CONFIG);
  }

  public static final CreatePollServiceDescriptor CONFIG =
      new CreatePollServiceDescriptor();

  @javax.annotation.concurrent.Immutable
  public static class CreatePollServiceDescriptor extends
      io.grpc.stub.AbstractServiceDescriptor<CreatePollServiceDescriptor> {
    public final io.grpc.MethodDescriptor<io.grpc.examples.moderators.PollDetails,
        io.grpc.examples.moderators.Poll> createPoll;

    private CreatePollServiceDescriptor() {
      createPoll = createMethodDescriptor(
          "grpc.example.moderator.CreatePoll", METHOD_CREATE_POLL);
    }

    @SuppressWarnings("unchecked")
    private CreatePollServiceDescriptor(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      createPoll = (io.grpc.MethodDescriptor<io.grpc.examples.moderators.PollDetails,
          io.grpc.examples.moderators.Poll>) methodMap.get(
          CONFIG.createPoll.getName());
    }

    @java.lang.Override
    protected CreatePollServiceDescriptor build(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      return new CreatePollServiceDescriptor(methodMap);
    }

    @java.lang.Override
    public com.google.common.collect.ImmutableList<io.grpc.MethodDescriptor<?, ?>> methods() {
      return com.google.common.collect.ImmutableList.<io.grpc.MethodDescriptor<?, ?>>of(
          createPoll);
    }
  }

  public static interface CreatePoll {

    public void createPoll(io.grpc.examples.moderators.PollDetails request,
        io.grpc.stub.StreamObserver<io.grpc.examples.moderators.Poll> responseObserver);
  }

  public static interface CreatePollBlockingClient {

    public io.grpc.examples.moderators.Poll createPoll(io.grpc.examples.moderators.PollDetails request);
  }

  public static interface CreatePollFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.moderators.Poll> createPoll(
        io.grpc.examples.moderators.PollDetails request);
  }

  public static class CreatePollStub extends
      io.grpc.stub.AbstractStub<CreatePollStub, CreatePollServiceDescriptor>
      implements CreatePoll {
    private CreatePollStub(io.grpc.Channel channel,
        CreatePollServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected CreatePollStub build(io.grpc.Channel channel,
        CreatePollServiceDescriptor config) {
      return new CreatePollStub(channel, config);
    }

    @java.lang.Override
    public void createPoll(io.grpc.examples.moderators.PollDetails request,
        io.grpc.stub.StreamObserver<io.grpc.examples.moderators.Poll> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.createPoll), request, responseObserver);
    }
  }

  public static class CreatePollBlockingStub extends
      io.grpc.stub.AbstractStub<CreatePollBlockingStub, CreatePollServiceDescriptor>
      implements CreatePollBlockingClient {
    private CreatePollBlockingStub(io.grpc.Channel channel,
        CreatePollServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected CreatePollBlockingStub build(io.grpc.Channel channel,
        CreatePollServiceDescriptor config) {
      return new CreatePollBlockingStub(channel, config);
    }

    @java.lang.Override
    public io.grpc.examples.moderators.Poll createPoll(io.grpc.examples.moderators.PollDetails request) {
      return blockingUnaryCall(
          channel.newCall(config.createPoll), request);
    }
  }

  public static class CreatePollFutureStub extends
      io.grpc.stub.AbstractStub<CreatePollFutureStub, CreatePollServiceDescriptor>
      implements CreatePollFutureClient {
    private CreatePollFutureStub(io.grpc.Channel channel,
        CreatePollServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected CreatePollFutureStub build(io.grpc.Channel channel,
        CreatePollServiceDescriptor config) {
      return new CreatePollFutureStub(channel, config);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.moderators.Poll> createPoll(
        io.grpc.examples.moderators.PollDetails request) {
      return unaryFutureCall(
          channel.newCall(config.createPoll), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final CreatePoll serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("grpc.example.moderator.CreatePoll")
      .addMethod(createMethodDefinition(
          METHOD_CREATE_POLL,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                io.grpc.examples.moderators.PollDetails,
                io.grpc.examples.moderators.Poll>() {
              @java.lang.Override
              public void invoke(
                  io.grpc.examples.moderators.PollDetails request,
                  io.grpc.stub.StreamObserver<io.grpc.examples.moderators.Poll> responseObserver) {
                serviceImpl.createPoll(request, responseObserver);
              }
            }))).build();
  }
}
