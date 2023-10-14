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
 * MarkdownOption markdown options
 */
@ApiModel(description = "MarkdownOption markdown options")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-14T16:18:05.057+02:00")
public class MarkdownOption   {
  @SerializedName("Context")
  private String context = null;

  @SerializedName("Mode")
  private String mode = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("Wiki")
  private Boolean wiki = null;

  public MarkdownOption context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Context to render  in: body
   * @return context
  **/
  @ApiModelProperty(example = "null", value = "Context to render  in: body")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public MarkdownOption mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Mode to render (comment, gfm, markdown)  in: body
   * @return mode
  **/
  @ApiModelProperty(example = "null", value = "Mode to render (comment, gfm, markdown)  in: body")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public MarkdownOption text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text markdown to render  in: body
   * @return text
  **/
  @ApiModelProperty(example = "null", value = "Text markdown to render  in: body")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MarkdownOption wiki(Boolean wiki) {
    this.wiki = wiki;
    return this;
  }

   /**
   * Is it a wiki page ?  in: body
   * @return wiki
  **/
  @ApiModelProperty(example = "null", value = "Is it a wiki page ?  in: body")
  public Boolean getWiki() {
    return wiki;
  }

  public void setWiki(Boolean wiki) {
    this.wiki = wiki;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkdownOption markdownOption = (MarkdownOption) o;
    return Objects.equals(this.context, markdownOption.context) &&
        Objects.equals(this.mode, markdownOption.mode) &&
        Objects.equals(this.text, markdownOption.text) &&
        Objects.equals(this.wiki, markdownOption.wiki);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, mode, text, wiki);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkdownOption {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    wiki: ").append(toIndentedString(wiki)).append("\n");
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

