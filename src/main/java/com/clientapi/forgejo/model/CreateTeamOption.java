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
 * CreateTeamOption options for creating a team
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T17:14:00.188014500+02:00[Europe/Budapest]")
public class CreateTeamOption {
  public static final String SERIALIZED_NAME_CAN_CREATE_ORG_REPO = "can_create_org_repo";
  @SerializedName(SERIALIZED_NAME_CAN_CREATE_ORG_REPO)
  private Boolean canCreateOrgRepo;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INCLUDES_ALL_REPOSITORIES = "includes_all_repositories";
  @SerializedName(SERIALIZED_NAME_INCLUDES_ALL_REPOSITORIES)
  private Boolean includesAllRepositories;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets permission
   */
  @JsonAdapter(PermissionEnum.Adapter.class)
  public enum PermissionEnum {
    READ("read"),
    
    WRITE("write"),
    
    ADMIN("admin");

    private String value;

    PermissionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionEnum fromValue(String value) {
      for (PermissionEnum b : PermissionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PermissionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PermissionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERMISSION = "permission";
  @SerializedName(SERIALIZED_NAME_PERMISSION)
  private PermissionEnum permission;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private List<String> units;

  public static final String SERIALIZED_NAME_UNITS_MAP = "units_map";
  @SerializedName(SERIALIZED_NAME_UNITS_MAP)
  private Map<String, String> unitsMap = new HashMap<>();

  public CreateTeamOption() {
  }

  public CreateTeamOption canCreateOrgRepo(Boolean canCreateOrgRepo) {
    
    this.canCreateOrgRepo = canCreateOrgRepo;
    return this;
  }

   /**
   * Get canCreateOrgRepo
   * @return canCreateOrgRepo
  **/
  @javax.annotation.Nullable
  public Boolean getCanCreateOrgRepo() {
    return canCreateOrgRepo;
  }


  public void setCanCreateOrgRepo(Boolean canCreateOrgRepo) {
    this.canCreateOrgRepo = canCreateOrgRepo;
  }


  public CreateTeamOption description(String description) {
    
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


  public CreateTeamOption includesAllRepositories(Boolean includesAllRepositories) {
    
    this.includesAllRepositories = includesAllRepositories;
    return this;
  }

   /**
   * Get includesAllRepositories
   * @return includesAllRepositories
  **/
  @javax.annotation.Nullable
  public Boolean getIncludesAllRepositories() {
    return includesAllRepositories;
  }


  public void setIncludesAllRepositories(Boolean includesAllRepositories) {
    this.includesAllRepositories = includesAllRepositories;
  }


  public CreateTeamOption name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateTeamOption permission(PermissionEnum permission) {
    
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @javax.annotation.Nullable
  public PermissionEnum getPermission() {
    return permission;
  }


  public void setPermission(PermissionEnum permission) {
    this.permission = permission;
  }


  public CreateTeamOption units(List<String> units) {
    
    this.units = units;
    return this;
  }

  public CreateTeamOption addUnitsItem(String unitsItem) {
    if (this.units == null) {
      this.units = new ArrayList<>();
    }
    this.units.add(unitsItem);
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @javax.annotation.Nullable
  public List<String> getUnits() {
    return units;
  }


  public void setUnits(List<String> units) {
    this.units = units;
  }


  public CreateTeamOption unitsMap(Map<String, String> unitsMap) {
    
    this.unitsMap = unitsMap;
    return this;
  }

  public CreateTeamOption putUnitsMapItem(String key, String unitsMapItem) {
    if (this.unitsMap == null) {
      this.unitsMap = new HashMap<>();
    }
    this.unitsMap.put(key, unitsMapItem);
    return this;
  }

   /**
   * Get unitsMap
   * @return unitsMap
  **/
  @javax.annotation.Nullable
  public Map<String, String> getUnitsMap() {
    return unitsMap;
  }


  public void setUnitsMap(Map<String, String> unitsMap) {
    this.unitsMap = unitsMap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTeamOption createTeamOption = (CreateTeamOption) o;
    return Objects.equals(this.canCreateOrgRepo, createTeamOption.canCreateOrgRepo) &&
        Objects.equals(this.description, createTeamOption.description) &&
        Objects.equals(this.includesAllRepositories, createTeamOption.includesAllRepositories) &&
        Objects.equals(this.name, createTeamOption.name) &&
        Objects.equals(this.permission, createTeamOption.permission) &&
        Objects.equals(this.units, createTeamOption.units) &&
        Objects.equals(this.unitsMap, createTeamOption.unitsMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canCreateOrgRepo, description, includesAllRepositories, name, permission, units, unitsMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTeamOption {\n");
    sb.append("    canCreateOrgRepo: ").append(toIndentedString(canCreateOrgRepo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    includesAllRepositories: ").append(toIndentedString(includesAllRepositories)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    unitsMap: ").append(toIndentedString(unitsMap)).append("\n");
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
    openapiFields.add("can_create_org_repo");
    openapiFields.add("description");
    openapiFields.add("includes_all_repositories");
    openapiFields.add("name");
    openapiFields.add("permission");
    openapiFields.add("units");
    openapiFields.add("units_map");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTeamOption
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTeamOption.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTeamOption is not found in the empty JSON string", CreateTeamOption.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTeamOption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTeamOption` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTeamOption.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("permission") != null && !jsonObj.get("permission").isJsonNull()) && !jsonObj.get("permission").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permission` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permission").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("units") != null && !jsonObj.get("units").isJsonNull() && !jsonObj.get("units").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `units` to be an array in the JSON string but got `%s`", jsonObj.get("units").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTeamOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTeamOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTeamOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTeamOption.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTeamOption>() {
           @Override
           public void write(JsonWriter out, CreateTeamOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTeamOption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTeamOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTeamOption
  * @throws IOException if the JSON string is invalid with respect to CreateTeamOption
  */
  public static CreateTeamOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTeamOption.class);
  }

 /**
  * Convert an instance of CreateTeamOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

