/*
 * Mailchimp Transactional API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.55
 * Contact: apihelp@mailchimp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.erkoristhein.mailchimp.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * information about an individual attachment
 */
@JsonPropertyOrder({
  PostMessagesParse200ResponseAttachmentsInner.JSON_PROPERTY_NAME,
  PostMessagesParse200ResponseAttachmentsInner.JSON_PROPERTY_TYPE,
  PostMessagesParse200ResponseAttachmentsInner.JSON_PROPERTY_BINARY,
  PostMessagesParse200ResponseAttachmentsInner.JSON_PROPERTY_CONTENT
})
@JsonTypeName("postMessagesParse_200_response_attachments_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostMessagesParse200ResponseAttachmentsInner {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_BINARY = "binary";
  private Boolean binary;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public PostMessagesParse200ResponseAttachmentsInner() {
  }

  public PostMessagesParse200ResponseAttachmentsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the file name of the attachment
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public PostMessagesParse200ResponseAttachmentsInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * the MIME type of the attachment
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public PostMessagesParse200ResponseAttachmentsInner binary(Boolean binary) {
    
    this.binary = binary;
    return this;
  }

   /**
   * if this is set to true, the attachment is not pure-text, and the content will be base64 encoded
   * @return binary
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BINARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBinary() {
    return binary;
  }


  @JsonProperty(JSON_PROPERTY_BINARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinary(Boolean binary) {
    this.binary = binary;
  }


  public PostMessagesParse200ResponseAttachmentsInner content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * the content of the attachment as a base64 encoded string
   * @return content
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostMessagesParse200ResponseAttachmentsInner postMessagesParse200ResponseAttachmentsInner = (PostMessagesParse200ResponseAttachmentsInner) o;
    return Objects.equals(this.name, postMessagesParse200ResponseAttachmentsInner.name) &&
        Objects.equals(this.type, postMessagesParse200ResponseAttachmentsInner.type) &&
        Objects.equals(this.binary, postMessagesParse200ResponseAttachmentsInner.binary) &&
        Objects.equals(this.content, postMessagesParse200ResponseAttachmentsInner.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, binary, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMessagesParse200ResponseAttachmentsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

