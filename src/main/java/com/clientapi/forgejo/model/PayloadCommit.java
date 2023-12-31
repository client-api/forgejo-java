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
import com.clientapi.forgejo.model.PayloadCommitVerification;
import com.clientapi.forgejo.model.PayloadUser;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * PayloadCommit represents a commit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class PayloadCommit {
  public static final String SERIALIZED_NAME_ADDED = "added";
  @SerializedName(SERIALIZED_NAME_ADDED)
  private List<String> added;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private PayloadUser author;

  public static final String SERIALIZED_NAME_COMMITTER = "committer";
  @SerializedName(SERIALIZED_NAME_COMMITTER)
  private PayloadUser committer;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private List<String> modified;

  public static final String SERIALIZED_NAME_REMOVED = "removed";
  @SerializedName(SERIALIZED_NAME_REMOVED)
  private List<String> removed;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_VERIFICATION = "verification";
  @SerializedName(SERIALIZED_NAME_VERIFICATION)
  private PayloadCommitVerification verification;

  public PayloadCommit() {
  }

  public PayloadCommit added(List<String> added) {
    
    this.added = added;
    return this;
  }

  public PayloadCommit addAddedItem(String addedItem) {
    if (this.added == null) {
      this.added = new ArrayList<>();
    }
    this.added.add(addedItem);
    return this;
  }

   /**
   * Get added
   * @return added
  **/
  @javax.annotation.Nullable
  public List<String> getAdded() {
    return added;
  }


  public void setAdded(List<String> added) {
    this.added = added;
  }


  public PayloadCommit author(PayloadUser author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable
  public PayloadUser getAuthor() {
    return author;
  }


  public void setAuthor(PayloadUser author) {
    this.author = author;
  }


  public PayloadCommit committer(PayloadUser committer) {
    
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @javax.annotation.Nullable
  public PayloadUser getCommitter() {
    return committer;
  }


  public void setCommitter(PayloadUser committer) {
    this.committer = committer;
  }


  public PayloadCommit id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * sha1 hash of the commit
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PayloadCommit message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public PayloadCommit modified(List<String> modified) {
    
    this.modified = modified;
    return this;
  }

  public PayloadCommit addModifiedItem(String modifiedItem) {
    if (this.modified == null) {
      this.modified = new ArrayList<>();
    }
    this.modified.add(modifiedItem);
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @javax.annotation.Nullable
  public List<String> getModified() {
    return modified;
  }


  public void setModified(List<String> modified) {
    this.modified = modified;
  }


  public PayloadCommit removed(List<String> removed) {
    
    this.removed = removed;
    return this;
  }

  public PayloadCommit addRemovedItem(String removedItem) {
    if (this.removed == null) {
      this.removed = new ArrayList<>();
    }
    this.removed.add(removedItem);
    return this;
  }

   /**
   * Get removed
   * @return removed
  **/
  @javax.annotation.Nullable
  public List<String> getRemoved() {
    return removed;
  }


  public void setRemoved(List<String> removed) {
    this.removed = removed;
  }


  public PayloadCommit timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public PayloadCommit url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public PayloadCommit verification(PayloadCommitVerification verification) {
    
    this.verification = verification;
    return this;
  }

   /**
   * Get verification
   * @return verification
  **/
  @javax.annotation.Nullable
  public PayloadCommitVerification getVerification() {
    return verification;
  }


  public void setVerification(PayloadCommitVerification verification) {
    this.verification = verification;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadCommit payloadCommit = (PayloadCommit) o;
    return Objects.equals(this.added, payloadCommit.added) &&
        Objects.equals(this.author, payloadCommit.author) &&
        Objects.equals(this.committer, payloadCommit.committer) &&
        Objects.equals(this.id, payloadCommit.id) &&
        Objects.equals(this.message, payloadCommit.message) &&
        Objects.equals(this.modified, payloadCommit.modified) &&
        Objects.equals(this.removed, payloadCommit.removed) &&
        Objects.equals(this.timestamp, payloadCommit.timestamp) &&
        Objects.equals(this.url, payloadCommit.url) &&
        Objects.equals(this.verification, payloadCommit.verification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(added, author, committer, id, message, modified, removed, timestamp, url, verification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadCommit {\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
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
    openapiFields.add("added");
    openapiFields.add("author");
    openapiFields.add("committer");
    openapiFields.add("id");
    openapiFields.add("message");
    openapiFields.add("modified");
    openapiFields.add("removed");
    openapiFields.add("timestamp");
    openapiFields.add("url");
    openapiFields.add("verification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PayloadCommit
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PayloadCommit.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayloadCommit is not found in the empty JSON string", PayloadCommit.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PayloadCommit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PayloadCommit` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("added") != null && !jsonObj.get("added").isJsonNull() && !jsonObj.get("added").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `added` to be an array in the JSON string but got `%s`", jsonObj.get("added").toString()));
      }
      // validate the optional field `author`
      if (jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) {
        PayloadUser.validateJsonElement(jsonObj.get("author"));
      }
      // validate the optional field `committer`
      if (jsonObj.get("committer") != null && !jsonObj.get("committer").isJsonNull()) {
        PayloadUser.validateJsonElement(jsonObj.get("committer"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("modified") != null && !jsonObj.get("modified").isJsonNull() && !jsonObj.get("modified").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified` to be an array in the JSON string but got `%s`", jsonObj.get("modified").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("removed") != null && !jsonObj.get("removed").isJsonNull() && !jsonObj.get("removed").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `removed` to be an array in the JSON string but got `%s`", jsonObj.get("removed").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the optional field `verification`
      if (jsonObj.get("verification") != null && !jsonObj.get("verification").isJsonNull()) {
        PayloadCommitVerification.validateJsonElement(jsonObj.get("verification"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayloadCommit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayloadCommit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayloadCommit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayloadCommit.class));

       return (TypeAdapter<T>) new TypeAdapter<PayloadCommit>() {
           @Override
           public void write(JsonWriter out, PayloadCommit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PayloadCommit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PayloadCommit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayloadCommit
  * @throws IOException if the JSON string is invalid with respect to PayloadCommit
  */
  public static PayloadCommit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayloadCommit.class);
  }

 /**
  * Convert an instance of PayloadCommit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

