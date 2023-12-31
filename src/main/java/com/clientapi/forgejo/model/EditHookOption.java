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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * EditHookOption options when modify one hook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class EditHookOption {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_AUTHORIZATION_HEADER = "authorization_header";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_HEADER)
  private String authorizationHeader;

  public static final String SERIALIZED_NAME_BRANCH_FILTER = "branch_filter";
  @SerializedName(SERIALIZED_NAME_BRANCH_FILTER)
  private String branchFilter;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Map<String, String> config = new HashMap<>();

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events;

  public EditHookOption() {
  }

  public EditHookOption active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public EditHookOption authorizationHeader(String authorizationHeader) {
    
    this.authorizationHeader = authorizationHeader;
    return this;
  }

   /**
   * Get authorizationHeader
   * @return authorizationHeader
  **/
  @javax.annotation.Nullable
  public String getAuthorizationHeader() {
    return authorizationHeader;
  }


  public void setAuthorizationHeader(String authorizationHeader) {
    this.authorizationHeader = authorizationHeader;
  }


  public EditHookOption branchFilter(String branchFilter) {
    
    this.branchFilter = branchFilter;
    return this;
  }

   /**
   * Get branchFilter
   * @return branchFilter
  **/
  @javax.annotation.Nullable
  public String getBranchFilter() {
    return branchFilter;
  }


  public void setBranchFilter(String branchFilter) {
    this.branchFilter = branchFilter;
  }


  public EditHookOption config(Map<String, String> config) {
    
    this.config = config;
    return this;
  }

  public EditHookOption putConfigItem(String key, String configItem) {
    if (this.config == null) {
      this.config = new HashMap<>();
    }
    this.config.put(key, configItem);
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  public Map<String, String> getConfig() {
    return config;
  }


  public void setConfig(Map<String, String> config) {
    this.config = config;
  }


  public EditHookOption events(List<String> events) {
    
    this.events = events;
    return this;
  }

  public EditHookOption addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    this.events = events;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditHookOption editHookOption = (EditHookOption) o;
    return Objects.equals(this.active, editHookOption.active) &&
        Objects.equals(this.authorizationHeader, editHookOption.authorizationHeader) &&
        Objects.equals(this.branchFilter, editHookOption.branchFilter) &&
        Objects.equals(this.config, editHookOption.config) &&
        Objects.equals(this.events, editHookOption.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, authorizationHeader, branchFilter, config, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditHookOption {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    authorizationHeader: ").append(toIndentedString(authorizationHeader)).append("\n");
    sb.append("    branchFilter: ").append(toIndentedString(branchFilter)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("authorization_header");
    openapiFields.add("branch_filter");
    openapiFields.add("config");
    openapiFields.add("events");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EditHookOption
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EditHookOption.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EditHookOption is not found in the empty JSON string", EditHookOption.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EditHookOption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EditHookOption` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("authorization_header") != null && !jsonObj.get("authorization_header").isJsonNull()) && !jsonObj.get("authorization_header").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization_header` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorization_header").toString()));
      }
      if ((jsonObj.get("branch_filter") != null && !jsonObj.get("branch_filter").isJsonNull()) && !jsonObj.get("branch_filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branch_filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branch_filter").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("events") != null && !jsonObj.get("events").isJsonNull() && !jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EditHookOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EditHookOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EditHookOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EditHookOption.class));

       return (TypeAdapter<T>) new TypeAdapter<EditHookOption>() {
           @Override
           public void write(JsonWriter out, EditHookOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EditHookOption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EditHookOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EditHookOption
  * @throws IOException if the JSON string is invalid with respect to EditHookOption
  */
  public static EditHookOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EditHookOption.class);
  }

 /**
  * Convert an instance of EditHookOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

