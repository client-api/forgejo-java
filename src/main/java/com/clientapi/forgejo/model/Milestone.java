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
import java.time.OffsetDateTime;
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
 * Milestone milestone is a collection of issues on one repository
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class Milestone {
  public static final String SERIALIZED_NAME_CLOSED_AT = "closed_at";
  @SerializedName(SERIALIZED_NAME_CLOSED_AT)
  private OffsetDateTime closedAt;

  public static final String SERIALIZED_NAME_CLOSED_ISSUES = "closed_issues";
  @SerializedName(SERIALIZED_NAME_CLOSED_ISSUES)
  private Long closedIssues;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DUE_ON = "due_on";
  @SerializedName(SERIALIZED_NAME_DUE_ON)
  private OffsetDateTime dueOn;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_OPEN_ISSUES = "open_issues";
  @SerializedName(SERIALIZED_NAME_OPEN_ISSUES)
  private Long openIssues;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Milestone() {
  }

  public Milestone closedAt(OffsetDateTime closedAt) {
    
    this.closedAt = closedAt;
    return this;
  }

   /**
   * Get closedAt
   * @return closedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getClosedAt() {
    return closedAt;
  }


  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }


  public Milestone closedIssues(Long closedIssues) {
    
    this.closedIssues = closedIssues;
    return this;
  }

   /**
   * Get closedIssues
   * @return closedIssues
  **/
  @javax.annotation.Nullable
  public Long getClosedIssues() {
    return closedIssues;
  }


  public void setClosedIssues(Long closedIssues) {
    this.closedIssues = closedIssues;
  }


  public Milestone createdAt(OffsetDateTime createdAt) {
    
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


  public Milestone description(String description) {
    
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


  public Milestone dueOn(OffsetDateTime dueOn) {
    
    this.dueOn = dueOn;
    return this;
  }

   /**
   * Get dueOn
   * @return dueOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDueOn() {
    return dueOn;
  }


  public void setDueOn(OffsetDateTime dueOn) {
    this.dueOn = dueOn;
  }


  public Milestone id(Long id) {
    
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


  public Milestone openIssues(Long openIssues) {
    
    this.openIssues = openIssues;
    return this;
  }

   /**
   * Get openIssues
   * @return openIssues
  **/
  @javax.annotation.Nullable
  public Long getOpenIssues() {
    return openIssues;
  }


  public void setOpenIssues(Long openIssues) {
    this.openIssues = openIssues;
  }


  public Milestone state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * StateType issue state type
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Milestone title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Milestone updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Milestone milestone = (Milestone) o;
    return Objects.equals(this.closedAt, milestone.closedAt) &&
        Objects.equals(this.closedIssues, milestone.closedIssues) &&
        Objects.equals(this.createdAt, milestone.createdAt) &&
        Objects.equals(this.description, milestone.description) &&
        Objects.equals(this.dueOn, milestone.dueOn) &&
        Objects.equals(this.id, milestone.id) &&
        Objects.equals(this.openIssues, milestone.openIssues) &&
        Objects.equals(this.state, milestone.state) &&
        Objects.equals(this.title, milestone.title) &&
        Objects.equals(this.updatedAt, milestone.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closedAt, closedIssues, createdAt, description, dueOn, id, openIssues, state, title, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Milestone {\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    closedIssues: ").append(toIndentedString(closedIssues)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    openIssues: ").append(toIndentedString(openIssues)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("closed_at");
    openapiFields.add("closed_issues");
    openapiFields.add("created_at");
    openapiFields.add("description");
    openapiFields.add("due_on");
    openapiFields.add("id");
    openapiFields.add("open_issues");
    openapiFields.add("state");
    openapiFields.add("title");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Milestone
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Milestone.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Milestone is not found in the empty JSON string", Milestone.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Milestone.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Milestone` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Milestone.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Milestone' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Milestone> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Milestone.class));

       return (TypeAdapter<T>) new TypeAdapter<Milestone>() {
           @Override
           public void write(JsonWriter out, Milestone value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Milestone read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Milestone given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Milestone
  * @throws IOException if the JSON string is invalid with respect to Milestone
  */
  public static Milestone fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Milestone.class);
  }

 /**
  * Convert an instance of Milestone to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

