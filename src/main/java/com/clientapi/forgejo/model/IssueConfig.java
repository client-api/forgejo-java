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
import com.clientapi.forgejo.model.IssueConfigContactLink;
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
 * IssueConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class IssueConfig {
  public static final String SERIALIZED_NAME_BLANK_ISSUES_ENABLED = "blank_issues_enabled";
  @SerializedName(SERIALIZED_NAME_BLANK_ISSUES_ENABLED)
  private Boolean blankIssuesEnabled;

  public static final String SERIALIZED_NAME_CONTACT_LINKS = "contact_links";
  @SerializedName(SERIALIZED_NAME_CONTACT_LINKS)
  private List<IssueConfigContactLink> contactLinks;

  public IssueConfig() {
  }

  public IssueConfig blankIssuesEnabled(Boolean blankIssuesEnabled) {
    
    this.blankIssuesEnabled = blankIssuesEnabled;
    return this;
  }

   /**
   * Get blankIssuesEnabled
   * @return blankIssuesEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getBlankIssuesEnabled() {
    return blankIssuesEnabled;
  }


  public void setBlankIssuesEnabled(Boolean blankIssuesEnabled) {
    this.blankIssuesEnabled = blankIssuesEnabled;
  }


  public IssueConfig contactLinks(List<IssueConfigContactLink> contactLinks) {
    
    this.contactLinks = contactLinks;
    return this;
  }

  public IssueConfig addContactLinksItem(IssueConfigContactLink contactLinksItem) {
    if (this.contactLinks == null) {
      this.contactLinks = new ArrayList<>();
    }
    this.contactLinks.add(contactLinksItem);
    return this;
  }

   /**
   * Get contactLinks
   * @return contactLinks
  **/
  @javax.annotation.Nullable
  public List<IssueConfigContactLink> getContactLinks() {
    return contactLinks;
  }


  public void setContactLinks(List<IssueConfigContactLink> contactLinks) {
    this.contactLinks = contactLinks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueConfig issueConfig = (IssueConfig) o;
    return Objects.equals(this.blankIssuesEnabled, issueConfig.blankIssuesEnabled) &&
        Objects.equals(this.contactLinks, issueConfig.contactLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blankIssuesEnabled, contactLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueConfig {\n");
    sb.append("    blankIssuesEnabled: ").append(toIndentedString(blankIssuesEnabled)).append("\n");
    sb.append("    contactLinks: ").append(toIndentedString(contactLinks)).append("\n");
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
    openapiFields.add("blank_issues_enabled");
    openapiFields.add("contact_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IssueConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IssueConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueConfig is not found in the empty JSON string", IssueConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IssueConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("contact_links") != null && !jsonObj.get("contact_links").isJsonNull()) {
        JsonArray jsonArraycontactLinks = jsonObj.getAsJsonArray("contact_links");
        if (jsonArraycontactLinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contact_links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contact_links` to be an array in the JSON string but got `%s`", jsonObj.get("contact_links").toString()));
          }

          // validate the optional field `contact_links` (array)
          for (int i = 0; i < jsonArraycontactLinks.size(); i++) {
            IssueConfigContactLink.validateJsonElement(jsonArraycontactLinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueConfig>() {
           @Override
           public void write(JsonWriter out, IssueConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueConfig
  * @throws IOException if the JSON string is invalid with respect to IssueConfig
  */
  public static IssueConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueConfig.class);
  }

 /**
  * Convert an instance of IssueConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

