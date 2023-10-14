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
 * CreateOAuth2ApplicationOptions holds options to create an oauth2 application
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class CreateOAuth2ApplicationOptions {
  public static final String SERIALIZED_NAME_CONFIDENTIAL_CLIENT = "confidential_client";
  @SerializedName(SERIALIZED_NAME_CONFIDENTIAL_CLIENT)
  private Boolean confidentialClient;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REDIRECT_URIS = "redirect_uris";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URIS)
  private List<String> redirectUris;

  public CreateOAuth2ApplicationOptions() {
  }

  public CreateOAuth2ApplicationOptions confidentialClient(Boolean confidentialClient) {
    
    this.confidentialClient = confidentialClient;
    return this;
  }

   /**
   * Get confidentialClient
   * @return confidentialClient
  **/
  @javax.annotation.Nullable
  public Boolean getConfidentialClient() {
    return confidentialClient;
  }


  public void setConfidentialClient(Boolean confidentialClient) {
    this.confidentialClient = confidentialClient;
  }


  public CreateOAuth2ApplicationOptions name(String name) {
    
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


  public CreateOAuth2ApplicationOptions redirectUris(List<String> redirectUris) {
    
    this.redirectUris = redirectUris;
    return this;
  }

  public CreateOAuth2ApplicationOptions addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new ArrayList<>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

   /**
   * Get redirectUris
   * @return redirectUris
  **/
  @javax.annotation.Nullable
  public List<String> getRedirectUris() {
    return redirectUris;
  }


  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOAuth2ApplicationOptions createOAuth2ApplicationOptions = (CreateOAuth2ApplicationOptions) o;
    return Objects.equals(this.confidentialClient, createOAuth2ApplicationOptions.confidentialClient) &&
        Objects.equals(this.name, createOAuth2ApplicationOptions.name) &&
        Objects.equals(this.redirectUris, createOAuth2ApplicationOptions.redirectUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidentialClient, name, redirectUris);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOAuth2ApplicationOptions {\n");
    sb.append("    confidentialClient: ").append(toIndentedString(confidentialClient)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
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
    openapiFields.add("confidential_client");
    openapiFields.add("name");
    openapiFields.add("redirect_uris");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateOAuth2ApplicationOptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateOAuth2ApplicationOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOAuth2ApplicationOptions is not found in the empty JSON string", CreateOAuth2ApplicationOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateOAuth2ApplicationOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOAuth2ApplicationOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("redirect_uris") != null && !jsonObj.get("redirect_uris").isJsonNull() && !jsonObj.get("redirect_uris").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirect_uris` to be an array in the JSON string but got `%s`", jsonObj.get("redirect_uris").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOAuth2ApplicationOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOAuth2ApplicationOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOAuth2ApplicationOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOAuth2ApplicationOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOAuth2ApplicationOptions>() {
           @Override
           public void write(JsonWriter out, CreateOAuth2ApplicationOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOAuth2ApplicationOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateOAuth2ApplicationOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateOAuth2ApplicationOptions
  * @throws IOException if the JSON string is invalid with respect to CreateOAuth2ApplicationOptions
  */
  public static CreateOAuth2ApplicationOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOAuth2ApplicationOptions.class);
  }

 /**
  * Convert an instance of CreateOAuth2ApplicationOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

