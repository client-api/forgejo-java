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
import com.clientapi.forgejo.model.CommitMeta;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * Tag represents a repository tag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class Tag {
  public static final String SERIALIZED_NAME_COMMIT = "commit";
  @SerializedName(SERIALIZED_NAME_COMMIT)
  private CommitMeta commit;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TARBALL_URL = "tarball_url";
  @SerializedName(SERIALIZED_NAME_TARBALL_URL)
  private String tarballUrl;

  public static final String SERIALIZED_NAME_ZIPBALL_URL = "zipball_url";
  @SerializedName(SERIALIZED_NAME_ZIPBALL_URL)
  private String zipballUrl;

  public Tag() {
  }

  public Tag commit(CommitMeta commit) {
    
    this.commit = commit;
    return this;
  }

   /**
   * Get commit
   * @return commit
  **/
  @javax.annotation.Nullable
  public CommitMeta getCommit() {
    return commit;
  }


  public void setCommit(CommitMeta commit) {
    this.commit = commit;
  }


  public Tag id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Tag message(String message) {
    
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


  public Tag name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Tag tarballUrl(String tarballUrl) {
    
    this.tarballUrl = tarballUrl;
    return this;
  }

   /**
   * Get tarballUrl
   * @return tarballUrl
  **/
  @javax.annotation.Nullable
  public String getTarballUrl() {
    return tarballUrl;
  }


  public void setTarballUrl(String tarballUrl) {
    this.tarballUrl = tarballUrl;
  }


  public Tag zipballUrl(String zipballUrl) {
    
    this.zipballUrl = zipballUrl;
    return this;
  }

   /**
   * Get zipballUrl
   * @return zipballUrl
  **/
  @javax.annotation.Nullable
  public String getZipballUrl() {
    return zipballUrl;
  }


  public void setZipballUrl(String zipballUrl) {
    this.zipballUrl = zipballUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.commit, tag.commit) &&
        Objects.equals(this.id, tag.id) &&
        Objects.equals(this.message, tag.message) &&
        Objects.equals(this.name, tag.name) &&
        Objects.equals(this.tarballUrl, tag.tarballUrl) &&
        Objects.equals(this.zipballUrl, tag.zipballUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commit, id, message, name, tarballUrl, zipballUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tarballUrl: ").append(toIndentedString(tarballUrl)).append("\n");
    sb.append("    zipballUrl: ").append(toIndentedString(zipballUrl)).append("\n");
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
    openapiFields.add("commit");
    openapiFields.add("id");
    openapiFields.add("message");
    openapiFields.add("name");
    openapiFields.add("tarball_url");
    openapiFields.add("zipball_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Tag
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Tag.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tag is not found in the empty JSON string", Tag.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Tag.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tag` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `commit`
      if (jsonObj.get("commit") != null && !jsonObj.get("commit").isJsonNull()) {
        CommitMeta.validateJsonElement(jsonObj.get("commit"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("tarball_url") != null && !jsonObj.get("tarball_url").isJsonNull()) && !jsonObj.get("tarball_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tarball_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tarball_url").toString()));
      }
      if ((jsonObj.get("zipball_url") != null && !jsonObj.get("zipball_url").isJsonNull()) && !jsonObj.get("zipball_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipball_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipball_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Tag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tag.class));

       return (TypeAdapter<T>) new TypeAdapter<Tag>() {
           @Override
           public void write(JsonWriter out, Tag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tag read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Tag given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tag
  * @throws IOException if the JSON string is invalid with respect to Tag
  */
  public static Tag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tag.class);
  }

 /**
  * Convert an instance of Tag to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

