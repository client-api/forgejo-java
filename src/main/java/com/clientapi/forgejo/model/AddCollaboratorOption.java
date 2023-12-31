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
 * AddCollaboratorOption options when adding a user as a collaborator of a repository
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class AddCollaboratorOption {
  public static final String SERIALIZED_NAME_PERMISSION = "permission";
  @SerializedName(SERIALIZED_NAME_PERMISSION)
  private String permission;

  public AddCollaboratorOption() {
  }

  public AddCollaboratorOption permission(String permission) {
    
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @javax.annotation.Nullable
  public String getPermission() {
    return permission;
  }


  public void setPermission(String permission) {
    this.permission = permission;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCollaboratorOption addCollaboratorOption = (AddCollaboratorOption) o;
    return Objects.equals(this.permission, addCollaboratorOption.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCollaboratorOption {\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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
    openapiFields.add("permission");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddCollaboratorOption
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddCollaboratorOption.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddCollaboratorOption is not found in the empty JSON string", AddCollaboratorOption.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddCollaboratorOption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddCollaboratorOption` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("permission") != null && !jsonObj.get("permission").isJsonNull()) && !jsonObj.get("permission").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permission` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permission").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddCollaboratorOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddCollaboratorOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddCollaboratorOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddCollaboratorOption.class));

       return (TypeAdapter<T>) new TypeAdapter<AddCollaboratorOption>() {
           @Override
           public void write(JsonWriter out, AddCollaboratorOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddCollaboratorOption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddCollaboratorOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddCollaboratorOption
  * @throws IOException if the JSON string is invalid with respect to AddCollaboratorOption
  */
  public static AddCollaboratorOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddCollaboratorOption.class);
  }

 /**
  * Convert an instance of AddCollaboratorOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

