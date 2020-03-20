// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: newsfeed.proto

package web.service.grpc.newsfeed;

public interface PostOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Post)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>int64 userId = 2;</code>
   */
  long getUserId();

  /**
   * <code>string content = 3;</code>
   */
  java.lang.String getContent();
  /**
   * <code>string content = 3;</code>
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>repeated .Comment comments = 4;</code>
   */
  java.util.List<web.service.grpc.newsfeed.Comment> 
      getCommentsList();
  /**
   * <code>repeated .Comment comments = 4;</code>
   */
  web.service.grpc.newsfeed.Comment getComments(int index);
  /**
   * <code>repeated .Comment comments = 4;</code>
   */
  int getCommentsCount();
  /**
   * <code>repeated .Comment comments = 4;</code>
   */
  java.util.List<? extends web.service.grpc.newsfeed.CommentOrBuilder> 
      getCommentsOrBuilderList();
  /**
   * <code>repeated .Comment comments = 4;</code>
   */
  web.service.grpc.newsfeed.CommentOrBuilder getCommentsOrBuilder(
      int index);

  /**
   * <code>repeated .Like likes = 5;</code>
   */
  java.util.List<web.service.grpc.newsfeed.Like> 
      getLikesList();
  /**
   * <code>repeated .Like likes = 5;</code>
   */
  web.service.grpc.newsfeed.Like getLikes(int index);
  /**
   * <code>repeated .Like likes = 5;</code>
   */
  int getLikesCount();
  /**
   * <code>repeated .Like likes = 5;</code>
   */
  java.util.List<? extends web.service.grpc.newsfeed.LikeOrBuilder> 
      getLikesOrBuilderList();
  /**
   * <code>repeated .Like likes = 5;</code>
   */
  web.service.grpc.newsfeed.LikeOrBuilder getLikesOrBuilder(
      int index);

  /**
   * <code>repeated .Share shares = 6;</code>
   */
  java.util.List<web.service.grpc.newsfeed.Share> 
      getSharesList();
  /**
   * <code>repeated .Share shares = 6;</code>
   */
  web.service.grpc.newsfeed.Share getShares(int index);
  /**
   * <code>repeated .Share shares = 6;</code>
   */
  int getSharesCount();
  /**
   * <code>repeated .Share shares = 6;</code>
   */
  java.util.List<? extends web.service.grpc.newsfeed.ShareOrBuilder> 
      getSharesOrBuilderList();
  /**
   * <code>repeated .Share shares = 6;</code>
   */
  web.service.grpc.newsfeed.ShareOrBuilder getSharesOrBuilder(
      int index);

  /**
   * <code>repeated .Tag tags = 7;</code>
   */
  java.util.List<web.service.grpc.newsfeed.Tag> 
      getTagsList();
  /**
   * <code>repeated .Tag tags = 7;</code>
   */
  web.service.grpc.newsfeed.Tag getTags(int index);
  /**
   * <code>repeated .Tag tags = 7;</code>
   */
  int getTagsCount();
  /**
   * <code>repeated .Tag tags = 7;</code>
   */
  java.util.List<? extends web.service.grpc.newsfeed.TagOrBuilder> 
      getTagsOrBuilderList();
  /**
   * <code>repeated .Tag tags = 7;</code>
   */
  web.service.grpc.newsfeed.TagOrBuilder getTagsOrBuilder(
      int index);
}