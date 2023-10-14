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
import com.clientapi.forgejo.model.CommitUser;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * WikiCommit page commit/revision
 */
@ApiModel(description = "WikiCommit page commit/revision")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-14T16:18:05.057+02:00")
public class WikiCommit   {
  @SerializedName("author")
  private CommitUser author = null;

  @SerializedName("commiter")
  private CommitUser commiter = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("sha")
  private String sha = null;

  public WikiCommit author(CommitUser author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(example = "null", value = "")
  public CommitUser getAuthor() {
    return author;
  }

  public void setAuthor(CommitUser author) {
    this.author = author;
  }

  public WikiCommit commiter(CommitUser commiter) {
    this.commiter = commiter;
    return this;
  }

   /**
   * Get commiter
   * @return commiter
  **/
  @ApiModelProperty(example = "null", value = "")
  public CommitUser getCommiter() {
    return commiter;
  }

  public void setCommiter(CommitUser commiter) {
    this.commiter = commiter;
  }

  public WikiCommit message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public WikiCommit sha(String sha) {
    this.sha = sha;
    return this;
  }

   /**
   * Get sha
   * @return sha
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WikiCommit wikiCommit = (WikiCommit) o;
    return Objects.equals(this.author, wikiCommit.author) &&
        Objects.equals(this.commiter, wikiCommit.commiter) &&
        Objects.equals(this.message, wikiCommit.message) &&
        Objects.equals(this.sha, wikiCommit.sha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, commiter, message, sha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WikiCommit {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    commiter: ").append(toIndentedString(commiter)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
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

