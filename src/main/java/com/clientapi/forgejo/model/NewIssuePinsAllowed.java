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
 * NewIssuePinsAllowed represents an API response that says if new Issue Pins are allowed
 */
@ApiModel(description = "NewIssuePinsAllowed represents an API response that says if new Issue Pins are allowed")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-14T16:18:05.057+02:00")
public class NewIssuePinsAllowed   {
  @SerializedName("issues")
  private Boolean issues = null;

  @SerializedName("pull_requests")
  private Boolean pullRequests = null;

  public NewIssuePinsAllowed issues(Boolean issues) {
    this.issues = issues;
    return this;
  }

   /**
   * Get issues
   * @return issues
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIssues() {
    return issues;
  }

  public void setIssues(Boolean issues) {
    this.issues = issues;
  }

  public NewIssuePinsAllowed pullRequests(Boolean pullRequests) {
    this.pullRequests = pullRequests;
    return this;
  }

   /**
   * Get pullRequests
   * @return pullRequests
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPullRequests() {
    return pullRequests;
  }

  public void setPullRequests(Boolean pullRequests) {
    this.pullRequests = pullRequests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewIssuePinsAllowed newIssuePinsAllowed = (NewIssuePinsAllowed) o;
    return Objects.equals(this.issues, newIssuePinsAllowed.issues) &&
        Objects.equals(this.pullRequests, newIssuePinsAllowed.pullRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issues, pullRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewIssuePinsAllowed {\n");
    
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
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

