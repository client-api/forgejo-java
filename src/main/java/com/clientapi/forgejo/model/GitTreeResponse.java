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
import com.clientapi.forgejo.model.GitEntry;
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
 * GitTreeResponse returns a git tree
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class GitTreeResponse {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Long page;

  public static final String SERIALIZED_NAME_SHA = "sha";
  @SerializedName(SERIALIZED_NAME_SHA)
  private String sha;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount;

  public static final String SERIALIZED_NAME_TREE = "tree";
  @SerializedName(SERIALIZED_NAME_TREE)
  private List<GitEntry> tree;

  public static final String SERIALIZED_NAME_TRUNCATED = "truncated";
  @SerializedName(SERIALIZED_NAME_TRUNCATED)
  private Boolean truncated;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public GitTreeResponse() {
  }

  public GitTreeResponse page(Long page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  public Long getPage() {
    return page;
  }


  public void setPage(Long page) {
    this.page = page;
  }


  public GitTreeResponse sha(String sha) {
    
    this.sha = sha;
    return this;
  }

   /**
   * Get sha
   * @return sha
  **/
  @javax.annotation.Nullable
  public String getSha() {
    return sha;
  }


  public void setSha(String sha) {
    this.sha = sha;
  }


  public GitTreeResponse totalCount(Long totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public Long getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  public GitTreeResponse tree(List<GitEntry> tree) {
    
    this.tree = tree;
    return this;
  }

  public GitTreeResponse addTreeItem(GitEntry treeItem) {
    if (this.tree == null) {
      this.tree = new ArrayList<>();
    }
    this.tree.add(treeItem);
    return this;
  }

   /**
   * Get tree
   * @return tree
  **/
  @javax.annotation.Nullable
  public List<GitEntry> getTree() {
    return tree;
  }


  public void setTree(List<GitEntry> tree) {
    this.tree = tree;
  }


  public GitTreeResponse truncated(Boolean truncated) {
    
    this.truncated = truncated;
    return this;
  }

   /**
   * Get truncated
   * @return truncated
  **/
  @javax.annotation.Nullable
  public Boolean getTruncated() {
    return truncated;
  }


  public void setTruncated(Boolean truncated) {
    this.truncated = truncated;
  }


  public GitTreeResponse url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitTreeResponse gitTreeResponse = (GitTreeResponse) o;
    return Objects.equals(this.page, gitTreeResponse.page) &&
        Objects.equals(this.sha, gitTreeResponse.sha) &&
        Objects.equals(this.totalCount, gitTreeResponse.totalCount) &&
        Objects.equals(this.tree, gitTreeResponse.tree) &&
        Objects.equals(this.truncated, gitTreeResponse.truncated) &&
        Objects.equals(this.url, gitTreeResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, sha, totalCount, tree, truncated, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitTreeResponse {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
    sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("sha");
    openapiFields.add("total_count");
    openapiFields.add("tree");
    openapiFields.add("truncated");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GitTreeResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GitTreeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GitTreeResponse is not found in the empty JSON string", GitTreeResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GitTreeResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GitTreeResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sha") != null && !jsonObj.get("sha").isJsonNull()) && !jsonObj.get("sha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha").toString()));
      }
      if (jsonObj.get("tree") != null && !jsonObj.get("tree").isJsonNull()) {
        JsonArray jsonArraytree = jsonObj.getAsJsonArray("tree");
        if (jsonArraytree != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tree").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tree` to be an array in the JSON string but got `%s`", jsonObj.get("tree").toString()));
          }

          // validate the optional field `tree` (array)
          for (int i = 0; i < jsonArraytree.size(); i++) {
            GitEntry.validateJsonElement(jsonArraytree.get(i));
          };
        }
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GitTreeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GitTreeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GitTreeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GitTreeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GitTreeResponse>() {
           @Override
           public void write(JsonWriter out, GitTreeResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GitTreeResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GitTreeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GitTreeResponse
  * @throws IOException if the JSON string is invalid with respect to GitTreeResponse
  */
  public static GitTreeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GitTreeResponse.class);
  }

 /**
  * Convert an instance of GitTreeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

