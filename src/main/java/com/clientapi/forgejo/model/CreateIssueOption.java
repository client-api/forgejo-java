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
 * CreateIssueOption options to create one issue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class CreateIssueOption {
  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private String assignee;

  public static final String SERIALIZED_NAME_ASSIGNEES = "assignees";
  @SerializedName(SERIALIZED_NAME_ASSIGNEES)
  private List<String> assignees;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CLOSED = "closed";
  @SerializedName(SERIALIZED_NAME_CLOSED)
  private Boolean closed;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private OffsetDateTime dueDate;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<Long> labels;

  public static final String SERIALIZED_NAME_MILESTONE = "milestone";
  @SerializedName(SERIALIZED_NAME_MILESTONE)
  private Long milestone;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public CreateIssueOption() {
  }

  public CreateIssueOption assignee(String assignee) {
    
    this.assignee = assignee;
    return this;
  }

   /**
   * deprecated
   * @return assignee
  **/
  @javax.annotation.Nullable
  public String getAssignee() {
    return assignee;
  }


  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }


  public CreateIssueOption assignees(List<String> assignees) {
    
    this.assignees = assignees;
    return this;
  }

  public CreateIssueOption addAssigneesItem(String assigneesItem) {
    if (this.assignees == null) {
      this.assignees = new ArrayList<>();
    }
    this.assignees.add(assigneesItem);
    return this;
  }

   /**
   * Get assignees
   * @return assignees
  **/
  @javax.annotation.Nullable
  public List<String> getAssignees() {
    return assignees;
  }


  public void setAssignees(List<String> assignees) {
    this.assignees = assignees;
  }


  public CreateIssueOption body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public CreateIssueOption closed(Boolean closed) {
    
    this.closed = closed;
    return this;
  }

   /**
   * Get closed
   * @return closed
  **/
  @javax.annotation.Nullable
  public Boolean getClosed() {
    return closed;
  }


  public void setClosed(Boolean closed) {
    this.closed = closed;
  }


  public CreateIssueOption dueDate(OffsetDateTime dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDueDate() {
    return dueDate;
  }


  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }


  public CreateIssueOption labels(List<Long> labels) {
    
    this.labels = labels;
    return this;
  }

  public CreateIssueOption addLabelsItem(Long labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * list of label ids
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<Long> getLabels() {
    return labels;
  }


  public void setLabels(List<Long> labels) {
    this.labels = labels;
  }


  public CreateIssueOption milestone(Long milestone) {
    
    this.milestone = milestone;
    return this;
  }

   /**
   * milestone id
   * @return milestone
  **/
  @javax.annotation.Nullable
  public Long getMilestone() {
    return milestone;
  }


  public void setMilestone(Long milestone) {
    this.milestone = milestone;
  }


  public CreateIssueOption ref(String ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @javax.annotation.Nullable
  public String getRef() {
    return ref;
  }


  public void setRef(String ref) {
    this.ref = ref;
  }


  public CreateIssueOption title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
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
    CreateIssueOption createIssueOption = (CreateIssueOption) o;
    return Objects.equals(this.assignee, createIssueOption.assignee) &&
        Objects.equals(this.assignees, createIssueOption.assignees) &&
        Objects.equals(this.body, createIssueOption.body) &&
        Objects.equals(this.closed, createIssueOption.closed) &&
        Objects.equals(this.dueDate, createIssueOption.dueDate) &&
        Objects.equals(this.labels, createIssueOption.labels) &&
        Objects.equals(this.milestone, createIssueOption.milestone) &&
        Objects.equals(this.ref, createIssueOption.ref) &&
        Objects.equals(this.title, createIssueOption.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, assignees, body, closed, dueDate, labels, milestone, ref, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIssueOption {\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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
    openapiFields.add("assignee");
    openapiFields.add("assignees");
    openapiFields.add("body");
    openapiFields.add("closed");
    openapiFields.add("due_date");
    openapiFields.add("labels");
    openapiFields.add("milestone");
    openapiFields.add("ref");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateIssueOption
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateIssueOption.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateIssueOption is not found in the empty JSON string", CreateIssueOption.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateIssueOption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateIssueOption` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateIssueOption.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("assignee") != null && !jsonObj.get("assignee").isJsonNull()) && !jsonObj.get("assignee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assignee").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("assignees") != null && !jsonObj.get("assignees").isJsonNull() && !jsonObj.get("assignees").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignees` to be an array in the JSON string but got `%s`", jsonObj.get("assignees").toString()));
      }
      if ((jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull() && !jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }
      if ((jsonObj.get("ref") != null && !jsonObj.get("ref").isJsonNull()) && !jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateIssueOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateIssueOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateIssueOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateIssueOption.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateIssueOption>() {
           @Override
           public void write(JsonWriter out, CreateIssueOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateIssueOption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateIssueOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateIssueOption
  * @throws IOException if the JSON string is invalid with respect to CreateIssueOption
  */
  public static CreateIssueOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateIssueOption.class);
  }

 /**
  * Convert an instance of CreateIssueOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

