/**
 * Forgejo API.
 * This documentation describes the Forgejo API.
 *
 * OpenAPI spec version: 1.20.5+0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.clientapi.forgejo.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * OrganizationPermissions list different users permissions on an organization
 */
@ApiModel(description = "OrganizationPermissions list different users permissions on an organization")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-14T16:18:05.057+02:00")
public class OrganizationPermissions   {
  @SerializedName("can_create_repository")
  private Boolean canCreateRepository = null;

  @SerializedName("can_read")
  private Boolean canRead = null;

  @SerializedName("can_write")
  private Boolean canWrite = null;

  @SerializedName("is_admin")
  private Boolean isAdmin = null;

  @SerializedName("is_owner")
  private Boolean isOwner = null;

  public OrganizationPermissions canCreateRepository(Boolean canCreateRepository) {
    this.canCreateRepository = canCreateRepository;
    return this;
  }

   /**
   * Get canCreateRepository
   * @return canCreateRepository
  **/
  @ApiModelProperty(example = "null", value = "")
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
  @ApiModelProperty(example = "null", value = "")
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
  @ApiModelProperty(example = "null", value = "")
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
  @ApiModelProperty(example = "null", value = "")
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
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsOwner() {
    return isOwner;
  }

  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

