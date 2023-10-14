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
import com.clientapi.forgejo.model.Repository;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * PRBranchInfo information about a branch
 */
@ApiModel(description = "PRBranchInfo information about a branch")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-14T16:18:05.057+02:00")
public class PRBranchInfo   {
  @SerializedName("label")
  private String label = null;

  @SerializedName("ref")
  private String ref = null;

  @SerializedName("repo")
  private Repository repo = null;

  @SerializedName("repo_id")
  private Long repoId = null;

  @SerializedName("sha")
  private String sha = null;

  public PRBranchInfo label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public PRBranchInfo ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public PRBranchInfo repo(Repository repo) {
    this.repo = repo;
    return this;
  }

   /**
   * Get repo
   * @return repo
  **/
  @ApiModelProperty(example = "null", value = "")
  public Repository getRepo() {
    return repo;
  }

  public void setRepo(Repository repo) {
    this.repo = repo;
  }

  public PRBranchInfo repoId(Long repoId) {
    this.repoId = repoId;
    return this;
  }

   /**
   * Get repoId
   * @return repoId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getRepoId() {
    return repoId;
  }

  public void setRepoId(Long repoId) {
    this.repoId = repoId;
  }

  public PRBranchInfo sha(String sha) {
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
    PRBranchInfo pRBranchInfo = (PRBranchInfo) o;
    return Objects.equals(this.label, pRBranchInfo.label) &&
        Objects.equals(this.ref, pRBranchInfo.ref) &&
        Objects.equals(this.repo, pRBranchInfo.repo) &&
        Objects.equals(this.repoId, pRBranchInfo.repoId) &&
        Objects.equals(this.sha, pRBranchInfo.sha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, ref, repo, repoId, sha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PRBranchInfo {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
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

