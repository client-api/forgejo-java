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
 * OrganizationPermissions list different users permissions on an organization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class OrganizationPermissions {
  public static final String SERIALIZED_NAME_CAN_CREATE_REPOSITORY = "can_create_repository";
  @SerializedName(SERIALIZED_NAME_CAN_CREATE_REPOSITORY)
  private Boolean canCreateRepository;

  public static final String SERIALIZED_NAME_CAN_READ = "can_read";
  @SerializedName(SERIALIZED_NAME_CAN_READ)
  private Boolean canRead;

  public static final String SERIALIZED_NAME_CAN_WRITE = "can_write";
  @SerializedName(SERIALIZED_NAME_CAN_WRITE)
  private Boolean canWrite;

  public static final String SERIALIZED_NAME_IS_ADMIN = "is_admin";
  @SerializedName(SERIALIZED_NAME_IS_ADMIN)
  private Boolean isAdmin;

  public static final String SERIALIZED_NAME_IS_OWNER = "is_owner";
  @SerializedName(SERIALIZED_NAME_IS_OWNER)
  private Boolean isOwner;

  public OrganizationPermissions() {
  }

  public OrganizationPermissions canCreateRepository(Boolean canCreateRepository) {
    
    this.canCreateRepository = canCreateRepository;
    return this;
  }

   /**
   * Get canCreateRepository
   * @return canCreateRepository
  **/
  @javax.annotation.Nullable
  public Boolean getCanCreateRepository() {
    return canCreateRepository;
  }


  public void setCanCreateRepository(Boolean canCreateRepository) {
    this.canCreateRepository = canCreateRepository;
  }


  public OrganizationPermissions canRead(Boolean canRead) {
    
    this.canRead = canRead;
    return this;
  }

   /**
   * Get canRead
   * @return canRead
  **/
  @javax.annotation.Nullable
  public Boolean getCanRead() {
    return canRead;
  }


  public void setCanRead(Boolean canRead) {
    this.canRead = canRead;
  }


  public OrganizationPermissions canWrite(Boolean canWrite) {
    
    this.canWrite = canWrite;
    return this;
  }

   /**
   * Get canWrite
   * @return canWrite
  **/
  @javax.annotation.Nullable
  public Boolean getCanWrite() {
    return canWrite;
  }


  public void setCanWrite(Boolean canWrite) {
    this.canWrite = canWrite;
  }


  public OrganizationPermissions isAdmin(Boolean isAdmin) {
    
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Get isAdmin
   * @return isAdmin
  **/
  @javax.annotation.Nullable
  public Boolean getIsAdmin() {
    return isAdmin;
  }


  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }


  public OrganizationPermissions isOwner(Boolean isOwner) {
    
    this.isOwner = isOwner;
    return this;
  }

   /**
   * Get isOwner
   * @return isOwner
  **/
  @javax.annotation.Nullable
  public Boolean getIsOwner() {
    return isOwner;
  }


  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationPermissions organizationPermissions = (OrganizationPermissions) o;
    return Objects.equals(this.canCreateRepository, organizationPermissions.canCreateRepository) &&
        Objects.equals(this.canRead, organizationPermissions.canRead) &&
        Objects.equals(this.canWrite, organizationPermissions.canWrite) &&
        Objects.equals(this.isAdmin, organizationPermissions.isAdmin) &&
        Objects.equals(this.isOwner, organizationPermissions.isOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canCreateRepository, canRead, canWrite, isAdmin, isOwner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationPermissions {\n");
    sb.append("    canCreateRepository: ").append(toIndentedString(canCreateRepository)).append("\n");
    sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
    sb.append("    canWrite: ").append(toIndentedString(canWrite)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
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
    openapiFields.add("can_create_repository");
    openapiFields.add("can_read");
    openapiFields.add("can_write");
    openapiFields.add("is_admin");
    openapiFields.add("is_owner");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrganizationPermissions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrganizationPermissions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganizationPermissions is not found in the empty JSON string", OrganizationPermissions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrganizationPermissions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrganizationPermissions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganizationPermissions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganizationPermissions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganizationPermissions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganizationPermissions.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganizationPermissions>() {
           @Override
           public void write(JsonWriter out, OrganizationPermissions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrganizationPermissions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrganizationPermissions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrganizationPermissions
  * @throws IOException if the JSON string is invalid with respect to OrganizationPermissions
  */
  public static OrganizationPermissions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganizationPermissions.class);
  }

 /**
  * Convert an instance of OrganizationPermissions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

