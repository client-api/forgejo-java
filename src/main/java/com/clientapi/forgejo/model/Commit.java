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
import com.clientapi.forgejo.model.CommitAffectedFiles;
import com.clientapi.forgejo.model.CommitMeta;
import com.clientapi.forgejo.model.CommitStats;
import com.clientapi.forgejo.model.RepoCommit;
import com.clientapi.forgejo.model.User;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * Commit
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-14T16:18:05.057+02:00")
public class Commit   {
  @SerializedName("author")
  private User author = null;

  @SerializedName("commit")
  private RepoCommit commit = null;

  @SerializedName("committer")
  private User committer = null;

  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("files")
  private List<CommitAffectedFiles> files = new ArrayList<CommitAffectedFiles>();

  @SerializedName("html_url")
  private String htmlUrl = null;

  @SerializedName("parents")
  private List<CommitMeta> parents = new ArrayList<CommitMeta>();

  @SerializedName("sha")
  private String sha = null;

  @SerializedName("stats")
  private CommitStats stats = null;

  @SerializedName("url")
  private String url = null;

  public Commit author(User author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(example = "null", value = "")
  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }

  public Commit commit(RepoCommit commit) {
    this.commit = commit;
    return this;
  }

   /**
   * Get commit
   * @return commit
  **/
  @ApiModelProperty(example = "null", value = "")
  public RepoCommit getCommit() {
    return commit;
  }

  public void setCommit(RepoCommit commit) {
    this.commit = commit;
  }

  public Commit committer(User committer) {
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @ApiModelProperty(example = "null", value = "")
  public User getCommitter() {
    return committer;
  }

  public void setCommitter(User committer) {
    this.committer = committer;
  }

  public Commit created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public Commit files(List<CommitAffectedFiles> files) {
    this.files = files;
    return this;
  }

  public Commit addFilesItem(CommitAffectedFiles filesItem) {
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CommitAffectedFiles> getFiles() {
    return files;
  }

  public void setFiles(List<CommitAffectedFiles> files) {
    this.files = files;
  }

  public Commit htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Get htmlUrl
   * @return htmlUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHtmlUrl() {
    return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public Commit parents(List<CommitMeta> parents) {
    this.parents = parents;
    return this;
  }

  public Commit addParentsItem(CommitMeta parentsItem) {
    this.parents.add(parentsItem);
    return this;
  }

   /**
   * Get parents
   * @return parents
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CommitMeta> getParents() {
    return parents;
  }

  public void setParents(List<CommitMeta> parents) {
    this.parents = parents;
  }

  public Commit sha(String sha) {
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

  public Commit stats(CommitStats stats) {
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @ApiModelProperty(example = "null", value = "")
  public CommitStats getStats() {
    return stats;
  }

  public void setStats(CommitStats stats) {
    this.stats = stats;
  }

  public Commit url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Commit commit = (Commit) o;
    return Objects.equals(this.author, commit.author) &&
        Objects.equals(this.commit, commit.commit) &&
        Objects.equals(this.committer, commit.committer) &&
        Objects.equals(this.created, commit.created) &&
        Objects.equals(this.files, commit.files) &&
        Objects.equals(this.htmlUrl, commit.htmlUrl) &&
        Objects.equals(this.parents, commit.parents) &&
        Objects.equals(this.sha, commit.sha) &&
        Objects.equals(this.stats, commit.stats) &&
        Objects.equals(this.url, commit.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, commit, committer, created, files, htmlUrl, parents, sha, stats, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Commit {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

