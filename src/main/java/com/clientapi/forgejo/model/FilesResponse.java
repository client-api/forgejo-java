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
import com.clientapi.forgejo.model.ContentsResponse;
import com.clientapi.forgejo.model.FileCommitResponse;
import com.clientapi.forgejo.model.PayloadCommitVerification;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * FilesResponse contains information about multiple files from a repo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class FilesResponse {
  public static final String SERIALIZED_NAME_COMMIT = "commit";
  @SerializedName(SERIALIZED_NAME_COMMIT)
  private FileCommitResponse commit;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<ContentsResponse> files;

  public static final String SERIALIZED_NAME_VERIFICATION = "verification";
  @SerializedName(SERIALIZED_NAME_VERIFICATION)
  private PayloadCommitVerification verification;

  public FilesResponse() {
  }

  public FilesResponse commit(FileCommitResponse commit) {
    
    this.commit = commit;
    return this;
  }

   /**
   * Get commit
   * @return commit
  **/
  @javax.annotation.Nullable
  public FileCommitResponse getCommit() {
    return commit;
  }


  public void setCommit(FileCommitResponse commit) {
    this.commit = commit;
  }


  public FilesResponse files(List<ContentsResponse> files) {
    
    this.files = files;
    return this;
  }

  public FilesResponse addFilesItem(ContentsResponse filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nullable
  public List<ContentsResponse> getFiles() {
    return files;
  }


  public void setFiles(List<ContentsResponse> files) {
    this.files = files;
  }


  public FilesResponse verification(PayloadCommitVerification verification) {
    
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
    FilesResponse filesResponse = (FilesResponse) o;
    return Objects.equals(this.commit, filesResponse.commit) &&
        Objects.equals(this.files, filesResponse.files) &&
        Objects.equals(this.verification, filesResponse.verification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commit, files, verification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesResponse {\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
    openapiFields.add("commit");
    openapiFields.add("files");
    openapiFields.add("verification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FilesResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FilesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FilesResponse is not found in the empty JSON string", FilesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FilesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FilesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `commit`
      if (jsonObj.get("commit") != null && !jsonObj.get("commit").isJsonNull()) {
        FileCommitResponse.validateJsonElement(jsonObj.get("commit"));
      }
      if (jsonObj.get("files") != null && !jsonObj.get("files").isJsonNull()) {
        JsonArray jsonArrayfiles = jsonObj.getAsJsonArray("files");
        if (jsonArrayfiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("files").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `files` to be an array in the JSON string but got `%s`", jsonObj.get("files").toString()));
          }

          // validate the optional field `files` (array)
          for (int i = 0; i < jsonArrayfiles.size(); i++) {
            ContentsResponse.validateJsonElement(jsonArrayfiles.get(i));
          };
        }
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
       if (!FilesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<FilesResponse>() {
           @Override
           public void write(JsonWriter out, FilesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FilesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilesResponse
  * @throws IOException if the JSON string is invalid with respect to FilesResponse
  */
  public static FilesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilesResponse.class);
  }

 /**
  * Convert an instance of FilesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

