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
import com.clientapi.forgejo.model.Team;
import com.clientapi.forgejo.model.User;
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
 * RepoTransfer represents a pending repo transfer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class RepoTransfer {
  public static final String SERIALIZED_NAME_DOER = "doer";
  @SerializedName(SERIALIZED_NAME_DOER)
  private User doer;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private User recipient;

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  private List<Team> teams;

  public RepoTransfer() {
  }

  public RepoTransfer doer(User doer) {
    
    this.doer = doer;
    return this;
  }

   /**
   * Get doer
   * @return doer
  **/
  @javax.annotation.Nullable
  public User getDoer() {
    return doer;
  }


  public void setDoer(User doer) {
    this.doer = doer;
  }


  public RepoTransfer recipient(User recipient) {
    
    this.recipient = recipient;
    return this;
  }

   /**
   * Get recipient
   * @return recipient
  **/
  @javax.annotation.Nullable
  public User getRecipient() {
    return recipient;
  }


  public void setRecipient(User recipient) {
    this.recipient = recipient;
  }


  public RepoTransfer teams(List<Team> teams) {
    
    this.teams = teams;
    return this;
  }

  public RepoTransfer addTeamsItem(Team teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @javax.annotation.Nullable
  public List<Team> getTeams() {
    return teams;
  }


  public void setTeams(List<Team> teams) {
    this.teams = teams;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepoTransfer repoTransfer = (RepoTransfer) o;
    return Objects.equals(this.doer, repoTransfer.doer) &&
        Objects.equals(this.recipient, repoTransfer.recipient) &&
        Objects.equals(this.teams, repoTransfer.teams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doer, recipient, teams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepoTransfer {\n");
    sb.append("    doer: ").append(toIndentedString(doer)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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
    openapiFields.add("doer");
    openapiFields.add("recipient");
    openapiFields.add("teams");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RepoTransfer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RepoTransfer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RepoTransfer is not found in the empty JSON string", RepoTransfer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RepoTransfer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RepoTransfer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `doer`
      if (jsonObj.get("doer") != null && !jsonObj.get("doer").isJsonNull()) {
        User.validateJsonElement(jsonObj.get("doer"));
      }
      // validate the optional field `recipient`
      if (jsonObj.get("recipient") != null && !jsonObj.get("recipient").isJsonNull()) {
        User.validateJsonElement(jsonObj.get("recipient"));
      }
      if (jsonObj.get("teams") != null && !jsonObj.get("teams").isJsonNull()) {
        JsonArray jsonArrayteams = jsonObj.getAsJsonArray("teams");
        if (jsonArrayteams != null) {
          // ensure the json data is an array
          if (!jsonObj.get("teams").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `teams` to be an array in the JSON string but got `%s`", jsonObj.get("teams").toString()));
          }

          // validate the optional field `teams` (array)
          for (int i = 0; i < jsonArrayteams.size(); i++) {
            Team.validateJsonElement(jsonArrayteams.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RepoTransfer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RepoTransfer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RepoTransfer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RepoTransfer.class));

       return (TypeAdapter<T>) new TypeAdapter<RepoTransfer>() {
           @Override
           public void write(JsonWriter out, RepoTransfer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RepoTransfer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RepoTransfer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RepoTransfer
  * @throws IOException if the JSON string is invalid with respect to RepoTransfer
  */
  public static RepoTransfer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RepoTransfer.class);
  }

 /**
  * Convert an instance of RepoTransfer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

