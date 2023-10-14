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
import java.util.ArrayList;
import java.util.List;


/**
 * TransferRepoOption options when transfer a repository&#39;s ownership
 */
@ApiModel(description = "TransferRepoOption options when transfer a repository's ownership")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-14T16:18:05.057+02:00")
public class TransferRepoOption   {
  @SerializedName("new_owner")
  private String newOwner = null;

  @SerializedName("team_ids")
  private List<Long> teamIds = new ArrayList<Long>();

  public TransferRepoOption newOwner(String newOwner) {
    this.newOwner = newOwner;
    return this;
  }

   /**
   * Get newOwner
   * @return newOwner
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getNewOwner() {
    return newOwner;
  }

  public void setNewOwner(String newOwner) {
    this.newOwner = newOwner;
  }

  public TransferRepoOption teamIds(List<Long> teamIds) {
    this.teamIds = teamIds;
    return this;
  }

  public TransferRepoOption addTeamIdsItem(Long teamIdsItem) {
    this.teamIds.add(teamIdsItem);
    return this;
  }

   /**
   * ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories.
   * @return teamIds
  **/
  @ApiModelProperty(example = "null", value = "ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories.")
  public List<Long> getTeamIds() {
    return teamIds;
  }

  public void setTeamIds(List<Long> teamIds) {
    this.teamIds = teamIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRepoOption transferRepoOption = (TransferRepoOption) o;
    return Objects.equals(this.newOwner, transferRepoOption.newOwner) &&
        Objects.equals(this.teamIds, transferRepoOption.teamIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newOwner, teamIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRepoOption {\n");
    
    sb.append("    newOwner: ").append(toIndentedString(newOwner)).append("\n");
    sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
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

