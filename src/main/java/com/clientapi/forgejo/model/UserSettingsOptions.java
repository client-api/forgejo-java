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
 * UserSettingsOptions represents options to change user settings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class UserSettingsOptions {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DIFF_VIEW_STYLE = "diff_view_style";
  @SerializedName(SERIALIZED_NAME_DIFF_VIEW_STYLE)
  private String diffViewStyle;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_HIDE_ACTIVITY = "hide_activity";
  @SerializedName(SERIALIZED_NAME_HIDE_ACTIVITY)
  private Boolean hideActivity;

  public static final String SERIALIZED_NAME_HIDE_EMAIL = "hide_email";
  @SerializedName(SERIALIZED_NAME_HIDE_EMAIL)
  private Boolean hideEmail;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_THEME = "theme";
  @SerializedName(SERIALIZED_NAME_THEME)
  private String theme;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public UserSettingsOptions() {
  }

  public UserSettingsOptions description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UserSettingsOptions diffViewStyle(String diffViewStyle) {
    
    this.diffViewStyle = diffViewStyle;
    return this;
  }

   /**
   * Get diffViewStyle
   * @return diffViewStyle
  **/
  @javax.annotation.Nullable
  public String getDiffViewStyle() {
    return diffViewStyle;
  }


  public void setDiffViewStyle(String diffViewStyle) {
    this.diffViewStyle = diffViewStyle;
  }


  public UserSettingsOptions fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public UserSettingsOptions hideActivity(Boolean hideActivity) {
    
    this.hideActivity = hideActivity;
    return this;
  }

   /**
   * Get hideActivity
   * @return hideActivity
  **/
  @javax.annotation.Nullable
  public Boolean getHideActivity() {
    return hideActivity;
  }


  public void setHideActivity(Boolean hideActivity) {
    this.hideActivity = hideActivity;
  }


  public UserSettingsOptions hideEmail(Boolean hideEmail) {
    
    this.hideEmail = hideEmail;
    return this;
  }

   /**
   * Privacy
   * @return hideEmail
  **/
  @javax.annotation.Nullable
  public Boolean getHideEmail() {
    return hideEmail;
  }


  public void setHideEmail(Boolean hideEmail) {
    this.hideEmail = hideEmail;
  }


  public UserSettingsOptions language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public UserSettingsOptions location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public UserSettingsOptions theme(String theme) {
    
    this.theme = theme;
    return this;
  }

   /**
   * Get theme
   * @return theme
  **/
  @javax.annotation.Nullable
  public String getTheme() {
    return theme;
  }


  public void setTheme(String theme) {
    this.theme = theme;
  }


  public UserSettingsOptions website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @javax.annotation.Nullable
  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSettingsOptions userSettingsOptions = (UserSettingsOptions) o;
    return Objects.equals(this.description, userSettingsOptions.description) &&
        Objects.equals(this.diffViewStyle, userSettingsOptions.diffViewStyle) &&
        Objects.equals(this.fullName, userSettingsOptions.fullName) &&
        Objects.equals(this.hideActivity, userSettingsOptions.hideActivity) &&
        Objects.equals(this.hideEmail, userSettingsOptions.hideEmail) &&
        Objects.equals(this.language, userSettingsOptions.language) &&
        Objects.equals(this.location, userSettingsOptions.location) &&
        Objects.equals(this.theme, userSettingsOptions.theme) &&
        Objects.equals(this.website, userSettingsOptions.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, diffViewStyle, fullName, hideActivity, hideEmail, language, location, theme, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSettingsOptions {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    diffViewStyle: ").append(toIndentedString(diffViewStyle)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    hideActivity: ").append(toIndentedString(hideActivity)).append("\n");
    sb.append("    hideEmail: ").append(toIndentedString(hideEmail)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("diff_view_style");
    openapiFields.add("full_name");
    openapiFields.add("hide_activity");
    openapiFields.add("hide_email");
    openapiFields.add("language");
    openapiFields.add("location");
    openapiFields.add("theme");
    openapiFields.add("website");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UserSettingsOptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserSettingsOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserSettingsOptions is not found in the empty JSON string", UserSettingsOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserSettingsOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserSettingsOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("diff_view_style") != null && !jsonObj.get("diff_view_style").isJsonNull()) && !jsonObj.get("diff_view_style").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `diff_view_style` to be a primitive type in the JSON string but got `%s`", jsonObj.get("diff_view_style").toString()));
      }
      if ((jsonObj.get("full_name") != null && !jsonObj.get("full_name").isJsonNull()) && !jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("theme") != null && !jsonObj.get("theme").isJsonNull()) && !jsonObj.get("theme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `theme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("theme").toString()));
      }
      if ((jsonObj.get("website") != null && !jsonObj.get("website").isJsonNull()) && !jsonObj.get("website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserSettingsOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserSettingsOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserSettingsOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserSettingsOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<UserSettingsOptions>() {
           @Override
           public void write(JsonWriter out, UserSettingsOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserSettingsOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserSettingsOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserSettingsOptions
  * @throws IOException if the JSON string is invalid with respect to UserSettingsOptions
  */
  public static UserSettingsOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserSettingsOptions.class);
  }

 /**
  * Convert an instance of UserSettingsOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

