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
 * CreateWikiPageOptions form for creating wiki
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class CreateWikiPageOptions {
  public static final String SERIALIZED_NAME_CONTENT_BASE64 = "content_base64";
  @SerializedName(SERIALIZED_NAME_CONTENT_BASE64)
  private String contentBase64;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public CreateWikiPageOptions() {
  }

  public CreateWikiPageOptions contentBase64(String contentBase64) {
    
    this.contentBase64 = contentBase64;
    return this;
  }

   /**
   * content must be base64 encoded
   * @return contentBase64
  **/
  @javax.annotation.Nullable
  public String getContentBase64() {
    return contentBase64;
  }


  public void setContentBase64(String contentBase64) {
    this.contentBase64 = contentBase64;
  }


  public CreateWikiPageOptions message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * optional commit message summarizing the change
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public CreateWikiPageOptions title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * page title. leave empty to keep unchanged
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWikiPageOptions createWikiPageOptions = (CreateWikiPageOptions) o;
    return Objects.equals(this.contentBase64, createWikiPageOptions.contentBase64) &&
        Objects.equals(this.message, createWikiPageOptions.message) &&
        Objects.equals(this.title, createWikiPageOptions.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentBase64, message, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWikiPageOptions {\n");
    sb.append("    contentBase64: ").append(toIndentedString(contentBase64)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("content_base64");
    openapiFields.add("message");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateWikiPageOptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateWikiPageOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateWikiPageOptions is not found in the empty JSON string", CreateWikiPageOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateWikiPageOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateWikiPageOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("content_base64") != null && !jsonObj.get("content_base64").isJsonNull()) && !jsonObj.get("content_base64").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_base64` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_base64").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateWikiPageOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateWikiPageOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateWikiPageOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateWikiPageOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateWikiPageOptions>() {
           @Override
           public void write(JsonWriter out, CreateWikiPageOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateWikiPageOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateWikiPageOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateWikiPageOptions
  * @throws IOException if the JSON string is invalid with respect to CreateWikiPageOptions
  */
  public static CreateWikiPageOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateWikiPageOptions.class);
  }

 /**
  * Convert an instance of CreateWikiPageOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

