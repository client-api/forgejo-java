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
 * CreateWikiPageOptions form for creating wiki
 */
@ApiModel(description = "CreateWikiPageOptions form for creating wiki")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-14T16:18:05.057+02:00")
public class CreateWikiPageOptions   {
  @SerializedName("content_base64")
  private String contentBase64 = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("title")
  private String title = null;

  public CreateWikiPageOptions contentBase64(String contentBase64) {
    this.contentBase64 = contentBase64;
    return this;
  }

   /**
   * content must be base64 encoded
   * @return contentBase64
  **/
  @ApiModelProperty(example = "null", value = "content must be base64 encoded")
  public String getContentBase64() {
    return contentBase64;
  }

  public void setContentBase64(String contentBase64) {
    this.contentBase64 = contentBase64;
  }

  public CreateWikiPageOptions message(String message) {
    this.message = message;
    return this;
  }

   /**
   * optional commit message summarizing the change
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "optional commit message summarizing the change")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CreateWikiPageOptions title(String title) {
    this.title = title;
    return this;
  }

   /**
   * page title. leave empty to keep unchanged
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "page title. leave empty to keep unchanged")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWikiPageOptions createWikiPageOptions = (CreateWikiPageOptions) o;
    return Objects.equals(this.contentBase64, createWikiPageOptions.contentBase64) &&
        Objects.equals(this.message, createWikiPageOptions.message) &&
        Objects.equals(this.title, createWikiPageOptions.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentBase64, message, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWikiPageOptions {\n");
    
    sb.append("    contentBase64: ").append(toIndentedString(contentBase64)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

