// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: newsfeed.proto

package web.service.grpc.newsfeed;

/**
 * Protobuf type {@code GetNewsFeedResponse}
 */
public  final class GetNewsFeedResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetNewsFeedResponse)
    GetNewsFeedResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetNewsFeedResponse.newBuilder() to construct.
  private GetNewsFeedResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetNewsFeedResponse() {
    posts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetNewsFeedResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              posts_ = new java.util.ArrayList<web.service.grpc.newsfeed.Post>();
              mutable_bitField0_ |= 0x00000001;
            }
            posts_.add(
                input.readMessage(web.service.grpc.newsfeed.Post.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        posts_ = java.util.Collections.unmodifiableList(posts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return web.service.grpc.newsfeed.Newsfeed.internal_static_GetNewsFeedResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return web.service.grpc.newsfeed.Newsfeed.internal_static_GetNewsFeedResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            web.service.grpc.newsfeed.GetNewsFeedResponse.class, web.service.grpc.newsfeed.GetNewsFeedResponse.Builder.class);
  }

  public static final int POSTS_FIELD_NUMBER = 1;
  private java.util.List<web.service.grpc.newsfeed.Post> posts_;
  /**
   * <code>repeated .Post posts = 1;</code>
   */
  public java.util.List<web.service.grpc.newsfeed.Post> getPostsList() {
    return posts_;
  }
  /**
   * <code>repeated .Post posts = 1;</code>
   */
  public java.util.List<? extends web.service.grpc.newsfeed.PostOrBuilder> 
      getPostsOrBuilderList() {
    return posts_;
  }
  /**
   * <code>repeated .Post posts = 1;</code>
   */
  public int getPostsCount() {
    return posts_.size();
  }
  /**
   * <code>repeated .Post posts = 1;</code>
   */
  public web.service.grpc.newsfeed.Post getPosts(int index) {
    return posts_.get(index);
  }
  /**
   * <code>repeated .Post posts = 1;</code>
   */
  public web.service.grpc.newsfeed.PostOrBuilder getPostsOrBuilder(
      int index) {
    return posts_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < posts_.size(); i++) {
      output.writeMessage(1, posts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < posts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, posts_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof web.service.grpc.newsfeed.GetNewsFeedResponse)) {
      return super.equals(obj);
    }
    web.service.grpc.newsfeed.GetNewsFeedResponse other = (web.service.grpc.newsfeed.GetNewsFeedResponse) obj;

    boolean result = true;
    result = result && getPostsList()
        .equals(other.getPostsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPostsCount() > 0) {
      hash = (37 * hash) + POSTS_FIELD_NUMBER;
      hash = (53 * hash) + getPostsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static web.service.grpc.newsfeed.GetNewsFeedResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static web.service.grpc.newsfeed.GetNewsFeedResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static web.service.grpc.newsfeed.GetNewsFeedResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static web.service.grpc.newsfeed.GetNewsFeedResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static web.service.grpc.newsfeed.GetNewsFeedResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static web.service.grpc.newsfeed.GetNewsFeedResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static web.service.grpc.newsfeed.GetNewsFeedResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static web.service.grpc.newsfeed.GetNewsFeedResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static web.service.grpc.newsfeed.GetNewsFeedResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static web.service.grpc.newsfeed.GetNewsFeedResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static web.service.grpc.newsfeed.GetNewsFeedResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static web.service.grpc.newsfeed.GetNewsFeedResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(web.service.grpc.newsfeed.GetNewsFeedResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code GetNewsFeedResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetNewsFeedResponse)
      web.service.grpc.newsfeed.GetNewsFeedResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return web.service.grpc.newsfeed.Newsfeed.internal_static_GetNewsFeedResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return web.service.grpc.newsfeed.Newsfeed.internal_static_GetNewsFeedResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              web.service.grpc.newsfeed.GetNewsFeedResponse.class, web.service.grpc.newsfeed.GetNewsFeedResponse.Builder.class);
    }

    // Construct using web.service.grpc.newsfeed.GetNewsFeedResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getPostsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (postsBuilder_ == null) {
        posts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        postsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return web.service.grpc.newsfeed.Newsfeed.internal_static_GetNewsFeedResponse_descriptor;
    }

    public web.service.grpc.newsfeed.GetNewsFeedResponse getDefaultInstanceForType() {
      return web.service.grpc.newsfeed.GetNewsFeedResponse.getDefaultInstance();
    }

    public web.service.grpc.newsfeed.GetNewsFeedResponse build() {
      web.service.grpc.newsfeed.GetNewsFeedResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public web.service.grpc.newsfeed.GetNewsFeedResponse buildPartial() {
      web.service.grpc.newsfeed.GetNewsFeedResponse result = new web.service.grpc.newsfeed.GetNewsFeedResponse(this);
      int from_bitField0_ = bitField0_;
      if (postsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          posts_ = java.util.Collections.unmodifiableList(posts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.posts_ = posts_;
      } else {
        result.posts_ = postsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof web.service.grpc.newsfeed.GetNewsFeedResponse) {
        return mergeFrom((web.service.grpc.newsfeed.GetNewsFeedResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(web.service.grpc.newsfeed.GetNewsFeedResponse other) {
      if (other == web.service.grpc.newsfeed.GetNewsFeedResponse.getDefaultInstance()) return this;
      if (postsBuilder_ == null) {
        if (!other.posts_.isEmpty()) {
          if (posts_.isEmpty()) {
            posts_ = other.posts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePostsIsMutable();
            posts_.addAll(other.posts_);
          }
          onChanged();
        }
      } else {
        if (!other.posts_.isEmpty()) {
          if (postsBuilder_.isEmpty()) {
            postsBuilder_.dispose();
            postsBuilder_ = null;
            posts_ = other.posts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            postsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPostsFieldBuilder() : null;
          } else {
            postsBuilder_.addAllMessages(other.posts_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      web.service.grpc.newsfeed.GetNewsFeedResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (web.service.grpc.newsfeed.GetNewsFeedResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<web.service.grpc.newsfeed.Post> posts_ =
      java.util.Collections.emptyList();
    private void ensurePostsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        posts_ = new java.util.ArrayList<web.service.grpc.newsfeed.Post>(posts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        web.service.grpc.newsfeed.Post, web.service.grpc.newsfeed.Post.Builder, web.service.grpc.newsfeed.PostOrBuilder> postsBuilder_;

    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public java.util.List<web.service.grpc.newsfeed.Post> getPostsList() {
      if (postsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(posts_);
      } else {
        return postsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public int getPostsCount() {
      if (postsBuilder_ == null) {
        return posts_.size();
      } else {
        return postsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public web.service.grpc.newsfeed.Post getPosts(int index) {
      if (postsBuilder_ == null) {
        return posts_.get(index);
      } else {
        return postsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public Builder setPosts(
        int index, web.service.grpc.newsfeed.Post value) {
      if (postsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostsIsMutable();
        posts_.set(index, value);
        onChanged();
      } else {
        postsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public Builder setPosts(
        int index, web.service.grpc.newsfeed.Post.Builder builderForValue) {
      if (postsBuilder_ == null) {
        ensurePostsIsMutable();
        posts_.set(index, builderForValue.build());
        onChanged();
      } else {
        postsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public Builder addPosts(web.service.grpc.newsfeed.Post value) {
      if (postsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostsIsMutable();
        posts_.add(value);
        onChanged();
      } else {
        postsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public Builder addPosts(
        int index, web.service.grpc.newsfeed.Post value) {
      if (postsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostsIsMutable();
        posts_.add(index, value);
        onChanged();
      } else {
        postsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public Builder addPosts(
        web.service.grpc.newsfeed.Post.Builder builderForValue) {
      if (postsBuilder_ == null) {
        ensurePostsIsMutable();
        posts_.add(builderForValue.build());
        onChanged();
      } else {
        postsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public Builder addPosts(
        int index, web.service.grpc.newsfeed.Post.Builder builderForValue) {
      if (postsBuilder_ == null) {
        ensurePostsIsMutable();
        posts_.add(index, builderForValue.build());
        onChanged();
      } else {
        postsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public Builder addAllPosts(
        java.lang.Iterable<? extends web.service.grpc.newsfeed.Post> values) {
      if (postsBuilder_ == null) {
        ensurePostsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, posts_);
        onChanged();
      } else {
        postsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public Builder clearPosts() {
      if (postsBuilder_ == null) {
        posts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        postsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public Builder removePosts(int index) {
      if (postsBuilder_ == null) {
        ensurePostsIsMutable();
        posts_.remove(index);
        onChanged();
      } else {
        postsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public web.service.grpc.newsfeed.Post.Builder getPostsBuilder(
        int index) {
      return getPostsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public web.service.grpc.newsfeed.PostOrBuilder getPostsOrBuilder(
        int index) {
      if (postsBuilder_ == null) {
        return posts_.get(index);  } else {
        return postsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public java.util.List<? extends web.service.grpc.newsfeed.PostOrBuilder> 
         getPostsOrBuilderList() {
      if (postsBuilder_ != null) {
        return postsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(posts_);
      }
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public web.service.grpc.newsfeed.Post.Builder addPostsBuilder() {
      return getPostsFieldBuilder().addBuilder(
          web.service.grpc.newsfeed.Post.getDefaultInstance());
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public web.service.grpc.newsfeed.Post.Builder addPostsBuilder(
        int index) {
      return getPostsFieldBuilder().addBuilder(
          index, web.service.grpc.newsfeed.Post.getDefaultInstance());
    }
    /**
     * <code>repeated .Post posts = 1;</code>
     */
    public java.util.List<web.service.grpc.newsfeed.Post.Builder> 
         getPostsBuilderList() {
      return getPostsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        web.service.grpc.newsfeed.Post, web.service.grpc.newsfeed.Post.Builder, web.service.grpc.newsfeed.PostOrBuilder> 
        getPostsFieldBuilder() {
      if (postsBuilder_ == null) {
        postsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            web.service.grpc.newsfeed.Post, web.service.grpc.newsfeed.Post.Builder, web.service.grpc.newsfeed.PostOrBuilder>(
                posts_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        posts_ = null;
      }
      return postsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GetNewsFeedResponse)
  }

  // @@protoc_insertion_point(class_scope:GetNewsFeedResponse)
  private static final web.service.grpc.newsfeed.GetNewsFeedResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new web.service.grpc.newsfeed.GetNewsFeedResponse();
  }

  public static web.service.grpc.newsfeed.GetNewsFeedResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetNewsFeedResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetNewsFeedResponse>() {
    public GetNewsFeedResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetNewsFeedResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetNewsFeedResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetNewsFeedResponse> getParserForType() {
    return PARSER;
  }

  public web.service.grpc.newsfeed.GetNewsFeedResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

