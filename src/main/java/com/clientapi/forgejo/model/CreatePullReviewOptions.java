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
import com.clientapi.forgejo.model.CreatePullReviewComment;
import com.clientapi.forgejo.model.ReviewStateType;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * CreatePullReviewOptions are options to create a pull review
 */
@ApiModel(description = "CreatePullReviewOptions are options to create a pull review")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-14T16:18:05.057+02:00")
public class CreatePullReviewOptions   {
  @SerializedName("body")
  private String body = null;

  @SerializedName("comments")
  private List<CreatePullReviewComment> comments = new ArrayList<CreatePullReviewComment>();

  @SerializedName("commit_id")
  private String commitId = null;

  @SerializedName("event")
  private ReviewStateType event = null;

  public CreatePullReviewOptions body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public CreatePullReviewOptions comments(List<CreatePullReviewComment> comments) {
    this.comments = comments;
    return this;
  }

  public CreatePullReviewOptions addCommentsItem(CreatePullReviewComment commentsItem) {
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CreatePullReviewComment> getComments() {
    return comments;
  }

  public void setComments(List<CreatePullReviewComment> comments) {
    this.comments = comments;
  }

  public CreatePullReviewOptions commitId(String commitId) {
    this.commitId = commitId;
    return this;
  }

   /**
   * Get commitId
   * @return commitId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCommitId() {
    return commitId;
  }

  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }

  public CreatePullReviewOptions event(ReviewStateType event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @ApiModelProperty(example = "null", value = "")
  public ReviewStateType getEvent() {
    return event;
  }

  public void setEvent(ReviewStateType event) {
    this.event = event;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePullReviewOptions createPullReviewOptions = (CreatePullReviewOptions) o;
    return Objects.equals(this.body, createPullReviewOptions.body) &&
        Objects.equals(this.comments, createPullReviewOptions.comments) &&
        Objects.equals(this.commitId, createPullReviewOptions.commitId) &&
        Objects.equals(this.event, createPullReviewOptions.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, comments, commitId, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePullReviewOptions {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

