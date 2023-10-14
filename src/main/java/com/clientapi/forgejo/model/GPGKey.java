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
import com.clientapi.forgejo.model.GPGKeyEmail;
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
 * GPGKey a user GPG key to sign commit and tag in repository
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class GPGKey {
  public static final String SERIALIZED_NAME_CAN_CERTIFY = "can_certify";
  @SerializedName(SERIALIZED_NAME_CAN_CERTIFY)
  private Boolean canCertify;

  public static final String SERIALIZED_NAME_CAN_ENCRYPT_COMMS = "can_encrypt_comms";
  @SerializedName(SERIALIZED_NAME_CAN_ENCRYPT_COMMS)
  private Boolean canEncryptComms;

  public static final String SERIALIZED_NAME_CAN_ENCRYPT_STORAGE = "can_encrypt_storage";
  @SerializedName(SERIALIZED_NAME_CAN_ENCRYPT_STORAGE)
  private Boolean canEncryptStorage;

  public static final String SERIALIZED_NAME_CAN_SIGN = "can_sign";
  @SerializedName(SERIALIZED_NAME_CAN_SIGN)
  private Boolean canSign;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<GPGKeyEmail> emails;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_KEY_ID = "key_id";
  @SerializedName(SERIALIZED_NAME_KEY_ID)
  private String keyId;

  public static final String SERIALIZED_NAME_PRIMARY_KEY_ID = "primary_key_id";
  @SerializedName(SERIALIZED_NAME_PRIMARY_KEY_ID)
  private String primaryKeyId;

  public static final String SERIALIZED_NAME_PUBLIC_KEY = "public_key";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY)
  private String publicKey;

  public static final String SERIALIZED_NAME_SUBKEYS = "subkeys";
  @SerializedName(SERIALIZED_NAME_SUBKEYS)
  private List<GPGKey> subkeys;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public GPGKey() {
  }

  public GPGKey canCertify(Boolean canCertify) {
    
    this.canCertify = canCertify;
    return this;
  }

   /**
   * Get canCertify
   * @return canCertify
  **/
  @javax.annotation.Nullable
  public Boolean getCanCertify() {
    return canCertify;
  }


  public void setCanCertify(Boolean canCertify) {
    this.canCertify = canCertify;
  }


  public GPGKey canEncryptComms(Boolean canEncryptComms) {
    
    this.canEncryptComms = canEncryptComms;
    return this;
  }

   /**
   * Get canEncryptComms
   * @return canEncryptComms
  **/
  @javax.annotation.Nullable
  public Boolean getCanEncryptComms() {
    return canEncryptComms;
  }


  public void setCanEncryptComms(Boolean canEncryptComms) {
    this.canEncryptComms = canEncryptComms;
  }


  public GPGKey canEncryptStorage(Boolean canEncryptStorage) {
    
    this.canEncryptStorage = canEncryptStorage;
    return this;
  }

   /**
   * Get canEncryptStorage
   * @return canEncryptStorage
  **/
  @javax.annotation.Nullable
  public Boolean getCanEncryptStorage() {
    return canEncryptStorage;
  }


  public void setCanEncryptStorage(Boolean canEncryptStorage) {
    this.canEncryptStorage = canEncryptStorage;
  }


  public GPGKey canSign(Boolean canSign) {
    
    this.canSign = canSign;
    return this;
  }

   /**
   * Get canSign
   * @return canSign
  **/
  @javax.annotation.Nullable
  public Boolean getCanSign() {
    return canSign;
  }


  public void setCanSign(Boolean canSign) {
    this.canSign = canSign;
  }


  public GPGKey createdAt(OffsetDateTime createdAt) {
    
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


  public GPGKey emails(List<GPGKeyEmail> emails) {
    
    this.emails = emails;
    return this;
  }

  public GPGKey addEmailsItem(GPGKeyEmail emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @javax.annotation.Nullable
  public List<GPGKeyEmail> getEmails() {
    return emails;
  }


  public void setEmails(List<GPGKeyEmail> emails) {
    this.emails = emails;
  }


  public GPGKey expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public GPGKey id(Long id) {
    
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


  public GPGKey keyId(String keyId) {
    
    this.keyId = keyId;
    return this;
  }

   /**
   * Get keyId
   * @return keyId
  **/
  @javax.annotation.Nullable
  public String getKeyId() {
    return keyId;
  }


  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }


  public GPGKey primaryKeyId(String primaryKeyId) {
    
    this.primaryKeyId = primaryKeyId;
    return this;
  }

   /**
   * Get primaryKeyId
   * @return primaryKeyId
  **/
  @javax.annotation.Nullable
  public String getPrimaryKeyId() {
    return primaryKeyId;
  }


  public void setPrimaryKeyId(String primaryKeyId) {
    this.primaryKeyId = primaryKeyId;
  }


  public GPGKey publicKey(String publicKey) {
    
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Get publicKey
   * @return publicKey
  **/
  @javax.annotation.Nullable
  public String getPublicKey() {
    return publicKey;
  }


  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  public GPGKey subkeys(List<GPGKey> subkeys) {
    
    this.subkeys = subkeys;
    return this;
  }

  public GPGKey addSubkeysItem(GPGKey subkeysItem) {
    if (this.subkeys == null) {
      this.subkeys = new ArrayList<>();
    }
    this.subkeys.add(subkeysItem);
    return this;
  }

   /**
   * Get subkeys
   * @return subkeys
  **/
  @javax.annotation.Nullable
  public List<GPGKey> getSubkeys() {
    return subkeys;
  }


  public void setSubkeys(List<GPGKey> subkeys) {
    this.subkeys = subkeys;
  }


  public GPGKey verified(Boolean verified) {
    
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/
  @javax.annotation.Nullable
  public Boolean getVerified() {
    return verified;
  }


  public void setVerified(Boolean verified) {
    this.verified = verified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GPGKey gpGKey = (GPGKey) o;
    return Objects.equals(this.canCertify, gpGKey.canCertify) &&
        Objects.equals(this.canEncryptComms, gpGKey.canEncryptComms) &&
        Objects.equals(this.canEncryptStorage, gpGKey.canEncryptStorage) &&
        Objects.equals(this.canSign, gpGKey.canSign) &&
        Objects.equals(this.createdAt, gpGKey.createdAt) &&
        Objects.equals(this.emails, gpGKey.emails) &&
        Objects.equals(this.expiresAt, gpGKey.expiresAt) &&
        Objects.equals(this.id, gpGKey.id) &&
        Objects.equals(this.keyId, gpGKey.keyId) &&
        Objects.equals(this.primaryKeyId, gpGKey.primaryKeyId) &&
        Objects.equals(this.publicKey, gpGKey.publicKey) &&
        Objects.equals(this.subkeys, gpGKey.subkeys) &&
        Objects.equals(this.verified, gpGKey.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canCertify, canEncryptComms, canEncryptStorage, canSign, createdAt, emails, expiresAt, id, keyId, primaryKeyId, publicKey, subkeys, verified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GPGKey {\n");
    sb.append("    canCertify: ").append(toIndentedString(canCertify)).append("\n");
    sb.append("    canEncryptComms: ").append(toIndentedString(canEncryptComms)).append("\n");
    sb.append("    canEncryptStorage: ").append(toIndentedString(canEncryptStorage)).append("\n");
    sb.append("    canSign: ").append(toIndentedString(canSign)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    primaryKeyId: ").append(toIndentedString(primaryKeyId)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    subkeys: ").append(toIndentedString(subkeys)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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
    openapiFields.add("can_certify");
    openapiFields.add("can_encrypt_comms");
    openapiFields.add("can_encrypt_storage");
    openapiFields.add("can_sign");
    openapiFields.add("created_at");
    openapiFields.add("emails");
    openapiFields.add("expires_at");
    openapiFields.add("id");
    openapiFields.add("key_id");
    openapiFields.add("primary_key_id");
    openapiFields.add("public_key");
    openapiFields.add("subkeys");
    openapiFields.add("verified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GPGKey
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GPGKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GPGKey is not found in the empty JSON string", GPGKey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GPGKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GPGKey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("emails") != null && !jsonObj.get("emails").isJsonNull()) {
        JsonArray jsonArrayemails = jsonObj.getAsJsonArray("emails");
        if (jsonArrayemails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("emails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `emails` to be an array in the JSON string but got `%s`", jsonObj.get("emails").toString()));
          }

          // validate the optional field `emails` (array)
          for (int i = 0; i < jsonArrayemails.size(); i++) {
            GPGKeyEmail.validateJsonElement(jsonArrayemails.get(i));
          };
        }
      }
      if ((jsonObj.get("key_id") != null && !jsonObj.get("key_id").isJsonNull()) && !jsonObj.get("key_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_id").toString()));
      }
      if ((jsonObj.get("primary_key_id") != null && !jsonObj.get("primary_key_id").isJsonNull()) && !jsonObj.get("primary_key_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary_key_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primary_key_id").toString()));
      }
      if ((jsonObj.get("public_key") != null && !jsonObj.get("public_key").isJsonNull()) && !jsonObj.get("public_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public_key").toString()));
      }
      if (jsonObj.get("subkeys") != null && !jsonObj.get("subkeys").isJsonNull()) {
        JsonArray jsonArraysubkeys = jsonObj.getAsJsonArray("subkeys");
        if (jsonArraysubkeys != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subkeys").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subkeys` to be an array in the JSON string but got `%s`", jsonObj.get("subkeys").toString()));
          }

          // validate the optional field `subkeys` (array)
          for (int i = 0; i < jsonArraysubkeys.size(); i++) {
            GPGKey.validateJsonElement(jsonArraysubkeys.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GPGKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GPGKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GPGKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GPGKey.class));

       return (TypeAdapter<T>) new TypeAdapter<GPGKey>() {
           @Override
           public void write(JsonWriter out, GPGKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GPGKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GPGKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GPGKey
  * @throws IOException if the JSON string is invalid with respect to GPGKey
  */
  public static GPGKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GPGKey.class);
  }

 /**
  * Convert an instance of GPGKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

