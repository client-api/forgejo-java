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
 * PushMirror represents information of a push mirror
 */
@ApiModel(description = "PushMirror represents information of a push mirror")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-14T16:18:05.057+02:00")
public class PushMirror   {
  @SerializedName("created")
  private String created = null;

  @SerializedName("interval")
  private String interval = null;

  @SerializedName("last_error")
  private String lastError = null;

  @SerializedName("last_update")
  private String lastUpdate = null;

  @SerializedName("remote_address")
  private String remoteAddress = null;

  @SerializedName("remote_name")
  private String remoteName = null;

  @SerializedName("repo_name")
  private String repoName = null;

  @SerializedName("sync_on_commit")
  private Boolean syncOnCommit = null;

  public PushMirror created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public PushMirror interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public PushMirror lastError(String lastError) {
    this.lastError = lastError;
    return this;
  }

   /**
   * Get lastError
   * @return lastError
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastError() {
    return lastError;
  }

  public void setLastError(String lastError) {
    this.lastError = lastError;
  }

  public PushMirror lastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public PushMirror remoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
    return this;
  }

   /**
   * Get remoteAddress
   * @return remoteAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRemoteAddress() {
    return remoteAddress;
  }

  public void setRemoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
  }

  public PushMirror remoteName(String remoteName) {
    this.remoteName = remoteName;
    return this;
  }

   /**
   * Get remoteName
   * @return remoteName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRemoteName() {
    return remoteName;
  }

  public void setRemoteName(String remoteName) {
    this.remoteName = remoteName;
  }

  public PushMirror repoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

   /**
   * Get repoName
   * @return repoName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRepoName() {
    return repoName;
  }

  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }

  public PushMirror syncOnCommit(Boolean syncOnCommit) {
    this.syncOnCommit = syncOnCommit;
    return this;
  }

   /**
   * Get syncOnCommit
   * @return syncOnCommit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSyncOnCommit() {
    return syncOnCommit;
  }

  public void setSyncOnCommit(Boolean syncOnCommit) {
    this.syncOnCommit = syncOnCommit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushMirror pushMirror = (PushMirror) o;
    return Objects.equals(this.created, pushMirror.created) &&
        Objects.equals(this.interval, pushMirror.interval) &&
        Objects.equals(this.lastError, pushMirror.lastError) &&
        Objects.equals(this.lastUpdate, pushMirror.lastUpdate) &&
        Objects.equals(this.remoteAddress, pushMirror.remoteAddress) &&
        Objects.equals(this.remoteName, pushMirror.remoteName) &&
        Objects.equals(this.repoName, pushMirror.repoName) &&
        Objects.equals(this.syncOnCommit, pushMirror.syncOnCommit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, interval, lastError, lastUpdate, remoteAddress, remoteName, repoName, syncOnCommit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushMirror {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    remoteAddress: ").append(toIndentedString(remoteAddress)).append("\n");
    sb.append("    remoteName: ").append(toIndentedString(remoteName)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
    sb.append("    syncOnCommit: ").append(toIndentedString(syncOnCommit)).append("\n");
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

