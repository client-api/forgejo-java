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
 * DismissPullReviewOptions are options to dismiss a pull review
 */
@ApiModel(description = "DismissPullReviewOptions are options to dismiss a pull review")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-14T16:18:05.057+02:00")
public class DismissPullReviewOptions   {
  @SerializedName("message")
  private String message = null;

  @SerializedName("priors")
  private Boolean priors = null;

  public DismissPullReviewOptions message(String message) {
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

  public DismissPullReviewOptions priors(Boolean priors) {
    this.priors = priors;
    return this;
  }

   /**
   * Get priors
   * @return priors
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPriors() {
    return priors;
  }

  public void setPriors(Boolean priors) {
    this.priors = priors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DismissPullReviewOptions dismissPullReviewOptions = (DismissPullReviewOptions) o;
    return Objects.equals(this.message, dismissPullReviewOptions.message) &&
        Objects.equals(this.priors, dismissPullReviewOptions.priors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, priors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DismissPullReviewOptions {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    priors: ").append(toIndentedString(priors)).append("\n");
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

