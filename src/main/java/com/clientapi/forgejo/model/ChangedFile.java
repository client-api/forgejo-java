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
 * ChangedFile store information about files affected by the pull request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class ChangedFile {
  public static final String SERIALIZED_NAME_ADDITIONS = "additions";
  @SerializedName(SERIALIZED_NAME_ADDITIONS)
  private Long additions;

  public static final String SERIALIZED_NAME_CHANGES = "changes";
  @SerializedName(SERIALIZED_NAME_CHANGES)
  private Long changes;

  public static final String SERIALIZED_NAME_CONTENTS_URL = "contents_url";
  @SerializedName(SERIALIZED_NAME_CONTENTS_URL)
  private String contentsUrl;

  public static final String SERIALIZED_NAME_DELETIONS = "deletions";
  @SerializedName(SERIALIZED_NAME_DELETIONS)
  private Long deletions;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_HTML_URL = "html_url";
  @SerializedName(SERIALIZED_NAME_HTML_URL)
  private String htmlUrl;

  public static final String SERIALIZED_NAME_PREVIOUS_FILENAME = "previous_filename";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_FILENAME)
  private String previousFilename;

  public static final String SERIALIZED_NAME_RAW_URL = "raw_url";
  @SerializedName(SERIALIZED_NAME_RAW_URL)
  private String rawUrl;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public ChangedFile() {
  }

  public ChangedFile additions(Long additions) {
    
    this.additions = additions;
    return this;
  }

   /**
   * Get additions
   * @return additions
  **/
  @javax.annotation.Nullable
  public Long getAdditions() {
    return additions;
  }


  public void setAdditions(Long additions) {
    this.additions = additions;
  }


  public ChangedFile changes(Long changes) {
    
    this.changes = changes;
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @javax.annotation.Nullable
  public Long getChanges() {
    return changes;
  }


  public void setChanges(Long changes) {
    this.changes = changes;
  }


  public ChangedFile contentsUrl(String contentsUrl) {
    
    this.contentsUrl = contentsUrl;
    return this;
  }

   /**
   * Get contentsUrl
   * @return contentsUrl
  **/
  @javax.annotation.Nullable
  public String getContentsUrl() {
    return contentsUrl;
  }


  public void setContentsUrl(String contentsUrl) {
    this.contentsUrl = contentsUrl;
  }


  public ChangedFile deletions(Long deletions) {
    
    this.deletions = deletions;
    return this;
  }

   /**
   * Get deletions
   * @return deletions
  **/
  @javax.annotation.Nullable
  public Long getDeletions() {
    return deletions;
  }


  public void setDeletions(Long deletions) {
    this.deletions = deletions;
  }


  public ChangedFile filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @javax.annotation.Nullable
  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public ChangedFile htmlUrl(String htmlUrl) {
    
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


  public ChangedFile previousFilename(String previousFilename) {
    
    this.previousFilename = previousFilename;
    return this;
  }

   /**
   * Get previousFilename
   * @return previousFilename
  **/
  @javax.annotation.Nullable
  public String getPreviousFilename() {
    return previousFilename;
  }


  public void setPreviousFilename(String previousFilename) {
    this.previousFilename = previousFilename;
  }


  public ChangedFile rawUrl(String rawUrl) {
    
    this.rawUrl = rawUrl;
    return this;
  }

   /**
   * Get rawUrl
   * @return rawUrl
  **/
  @javax.annotation.Nullable
  public String getRawUrl() {
    return rawUrl;
  }


  public void setRawUrl(String rawUrl) {
    this.rawUrl = rawUrl;
  }


  public ChangedFile status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangedFile changedFile = (ChangedFile) o;
    return Objects.equals(this.additions, changedFile.additions) &&
        Objects.equals(this.changes, changedFile.changes) &&
        Objects.equals(this.contentsUrl, changedFile.contentsUrl) &&
        Objects.equals(this.deletions, changedFile.deletions) &&
        Objects.equals(this.filename, changedFile.filename) &&
        Objects.equals(this.htmlUrl, changedFile.htmlUrl) &&
        Objects.equals(this.previousFilename, changedFile.previousFilename) &&
        Objects.equals(this.rawUrl, changedFile.rawUrl) &&
        Objects.equals(this.status, changedFile.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additions, changes, contentsUrl, deletions, filename, htmlUrl, previousFilename, rawUrl, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangedFile {\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    contentsUrl: ").append(toIndentedString(contentsUrl)).append("\n");
    sb.append("    deletions: ").append(toIndentedString(deletions)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    previousFilename: ").append(toIndentedString(previousFilename)).append("\n");
    sb.append("    rawUrl: ").append(toIndentedString(rawUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("additions");
    openapiFields.add("changes");
    openapiFields.add("contents_url");
    openapiFields.add("deletions");
    openapiFields.add("filename");
    openapiFields.add("html_url");
    openapiFields.add("previous_filename");
    openapiFields.add("raw_url");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChangedFile
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChangedFile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangedFile is not found in the empty JSON string", ChangedFile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChangedFile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangedFile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contents_url") != null && !jsonObj.get("contents_url").isJsonNull()) && !jsonObj.get("contents_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contents_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contents_url").toString()));
      }
      if ((jsonObj.get("filename") != null && !jsonObj.get("filename").isJsonNull()) && !jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      if ((jsonObj.get("html_url") != null && !jsonObj.get("html_url").isJsonNull()) && !jsonObj.get("html_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_url").toString()));
      }
      if ((jsonObj.get("previous_filename") != null && !jsonObj.get("previous_filename").isJsonNull()) && !jsonObj.get("previous_filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previous_filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previous_filename").toString()));
      }
      if ((jsonObj.get("raw_url") != null && !jsonObj.get("raw_url").isJsonNull()) && !jsonObj.get("raw_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `raw_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("raw_url").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangedFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangedFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangedFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangedFile.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangedFile>() {
           @Override
           public void write(JsonWriter out, ChangedFile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangedFile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChangedFile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangedFile
  * @throws IOException if the JSON string is invalid with respect to ChangedFile
  */
  public static ChangedFile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangedFile.class);
  }

 /**
  * Convert an instance of ChangedFile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

