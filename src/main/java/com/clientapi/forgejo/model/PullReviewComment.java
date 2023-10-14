/*
 * Forgejo API.
 * This documentation describes the Forgejo API.
 *
 * The version of the OpenAPI document: 1.20.5+0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.clientapi.forgejo.model;

import java.util.Objects;
import com.clientapi.forgejo.model.User;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.clientapi.forgejo.invoker.JSON;

/**
 * PullReviewComment represents a comment on a pull request review
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class PullReviewComment {
  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_COMMIT_ID = "commit_id";
  @SerializedName(SERIALIZED_NAME_COMMIT_ID)
  private String commitId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DIFF_HUNK = "diff_hunk";
  @SerializedName(SERIALIZED_NAME_DIFF_HUNK)
  private String diffHunk;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private String htmlUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ORIGINAL_COMMIT_ID = "original_commit_id";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_COMMIT_ID)
  private String originalCommitId;

  public static final String SERIALIZED_NAME_ORIGINAL_POSITION = "original_position";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_POSITION)
  private Integer originalPosition;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_PULL_REQUEST_REVIEW_ID = "pull_request_review_id";
  @SerializedName(SERIALIZED_NAME_PULL_REQUEST_REVIEW_ID)
  private Long pullRequestReviewId;

  public static final String SERIALIZED_NAME_PULL_REQUEST_URL = "pull_request_url";
  @SerializedName(SERIALIZED_NAME_PULL_REQUEST_URL)
  private String pullRequestUrl;

  public static final String SERIALIZED_NAME_RESOLVER = "resolver";
  @SerializedName(SERIALIZED_NAME_RESOLVER)
  private User resolver;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public PullReviewComment() {
  }

  public PullReviewComment body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public PullReviewComment commitId(String commitId) {
    
    this.commitId = commitId;
    return this;
  }

   /**
   * Get commitId
   * @return commitId
  **/
  @javax.annotation.Nullable
  public String getCommitId() {
    return commitId;
  }


  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }


  public PullReviewComment createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PullReviewComment diffHunk(String diffHunk) {
    
    this.diffHunk = diffHunk;
    return this;
  }

   /**
   * Get diffHunk
   * @return diffHunk
  **/
  @javax.annotation.Nullable
  public String getDiffHunk() {
    return diffHunk;
  }


  public void setDiffHunk(String diffHunk) {
    this.diffHunk = diffHunk;
  }


  public PullReviewComment htmlUrl(String htmlUrl) {
    
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @javax.annotation.Nullable
  public String getHtmlUrl() {
    return htmlUrl;
  }


  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }


  public PullReviewComment id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public PullReviewComment originalCommitId(String originalCommitId) {
    
    this.originalCommitId = originalCommitId;
    return this;
  }

   /**
   * Get originalCommitId
   * @return originalCommitId
  **/
  @javax.annotation.Nullable
  public String getOriginalCommitId() {
    return originalCommitId;
  }


  public void setOriginalCommitId(String originalCommitId) {
    this.originalCommitId = originalCommitId;
  }


  public PullReviewComment originalPosition(Integer originalPosition) {
    
    this.originalPosition = originalPosition;
    return this;
  }

   /**
   * Get originalPosition
   * @return originalPosition
  **/
  @javax.annotation.Nullable
  public Integer getOriginalPosition() {
    return originalPosition;
  }


  public void setOriginalPosition(Integer originalPosition) {
    this.originalPosition = originalPosition;
  }


  public PullReviewComment path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public PullReviewComment position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public PullReviewComment pullRequestReviewId(Long pullRequestReviewId) {
    
    this.pullRequestReviewId = pullRequestReviewId;
    return this;
  }

   /**
   * Get pullRequestReviewId
   * @return pullRequestReviewId
  **/
  @javax.annotation.Nullable
  public Long getPullRequestReviewId() {
    return pullRequestReviewId;
  }


  public void setPullRequestReviewId(Long pullRequestReviewId) {
    this.pullRequestReviewId = pullRequestReviewId;
  }


  public PullReviewComment pullRequestUrl(String pullRequestUrl) {
    
    this.pullRequestUrl = pullRequestUrl;
    return this;
  }

   /**
   * Get pullRequestUrl
   * @return pullRequestUrl
  **/
  @javax.annotation.Nullable
  public String getPullRequestUrl() {
    return pullRequestUrl;
  }


  public void setPullRequestUrl(String pullRequestUrl) {
    this.pullRequestUrl = pullRequestUrl;
  }


  public PullReviewComment resolver(User resolver) {
    
    this.resolver = resolver;
    return this;
  }

   /**
   * Get resolver
   * @return resolver
  **/
  @javax.annotation.Nullable
  public User getResolver() {
    return resolver;
  }


  public void setResolver(User resolver) {
    this.resolver = resolver;
  }


  public PullReviewComment updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public PullReviewComment user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PullReviewComment pullReviewComment = (PullReviewComment) o;
    return Objects.equals(this.body, pullReviewComment.body) &&
        Objects.equals(this.commitId, pullReviewComment.commitId) &&
        Objects.equals(this.createdAt, pullReviewComment.createdAt) &&
        Objects.equals(this.diffHunk, pullReviewComment.diffHunk) &&
        Objects.equals(this.htmlUrl, pullReviewComment.htmlUrl) &&
        Objects.equals(this.id, pullReviewComment.id) &&
        Objects.equals(this.originalCommitId, pullReviewComment.originalCommitId) &&
        Objects.equals(this.originalPosition, pullReviewComment.originalPosition) &&
        Objects.equals(this.path, pullReviewComment.path) &&
        Objects.equals(this.position, pullReviewComment.position) &&
        Objects.equals(this.pullRequestReviewId, pullReviewComment.pullRequestReviewId) &&
        Objects.equals(this.pullRequestUrl, pullReviewComment.pullRequestUrl) &&
        Objects.equals(this.resolver, pullReviewComment.resolver) &&
        Objects.equals(this.updatedAt, pullReviewComment.updatedAt) &&
        Objects.equals(this.user, pullReviewComment.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, commitId, createdAt, diffHunk, htmlUrl, id, originalCommitId, originalPosition, path, position, pullRequestReviewId, pullRequestUrl, resolver, updatedAt, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullReviewComment {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    diffHunk: ").append(toIndentedString(diffHunk)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    originalCommitId: ").append(toIndentedString(originalCommitId)).append("\n");
    sb.append("    originalPosition: ").append(toIndentedString(originalPosition)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    pullRequestReviewId: ").append(toIndentedString(pullRequestReviewId)).append("\n");
    sb.append("    pullRequestUrl: ").append(toIndentedString(pullRequestUrl)).append("\n");
    sb.append("    resolver: ").append(toIndentedString(resolver)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("body");
    openapiFields.add("commit_id");
    openapiFields.add("created_at");
    openapiFields.add("diff_hunk");
    openapiFields.add("html_url");
    openapiFields.add("id");
    openapiFields.add("original_commit_id");
    openapiFields.add("original_position");
    openapiFields.add("path");
    openapiFields.add("position");
    openapiFields.add("pull_request_review_id");
    openapiFields.add("pull_request_url");
    openapiFields.add("resolver");
    openapiFields.add("updated_at");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PullReviewComment
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PullReviewComment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PullReviewComment is not found in the empty JSON string", PullReviewComment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PullReviewComment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PullReviewComment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("commit_id") != null && !jsonObj.get("commit_id").isJsonNull()) && !jsonObj.get("commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_id").toString()));
      }
      if ((jsonObj.get("diff_hunk") != null && !jsonObj.get("diff_hunk").isJsonNull()) && !jsonObj.get("diff_hunk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `diff_hunk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("diff_hunk").toString()));
      }
      if ((jsonObj.get("html_url") != null && !jsonObj.get("html_url").isJsonNull()) && !jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if ((jsonObj.get("original_commit_id") != null && !jsonObj.get("original_commit_id").isJsonNull()) && !jsonObj.get("original_commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_commit_id").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("pull_request_url") != null && !jsonObj.get("pull_request_url").isJsonNull()) && !jsonObj.get("pull_request_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pull_request_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pull_request_url").toString()));
      }
      // validate the optional field `resolver`
      if (jsonObj.get("resolver") != null && !jsonObj.get("resolver").isJsonNull()) {
        User.validateJsonElement(jsonObj.get("resolver"));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        User.validateJsonElement(jsonObj.get("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PullReviewComment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PullReviewComment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PullReviewComment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PullReviewComment.class));

       return (TypeAdapter<T>) new TypeAdapter<PullReviewComment>() {
           @Override
           public void write(JsonWriter out, PullReviewComment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PullReviewComment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PullReviewComment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PullReviewComment
  * @throws IOException if the JSON string is invalid with respect to PullReviewComment
  */
  public static PullReviewComment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PullReviewComment.class);
  }

 /**
  * Convert an instance of PullReviewComment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

