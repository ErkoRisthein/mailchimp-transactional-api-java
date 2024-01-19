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
 * a single supported attachment
 */
@JsonPropertyOrder({
  PostMessagesSendRequestMessageAttachmentsInner.JSON_PROPERTY_TYPE,
  PostMessagesSendRequestMessageAttachmentsInner.JSON_PROPERTY_NAME,
  PostMessagesSendRequestMessageAttachmentsInner.JSON_PROPERTY_CONTENT
})
@JsonTypeName("postMessagesSend_request_message_attachments_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostMessagesSendRequestMessageAttachmentsInner {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public PostMessagesSendRequestMessageAttachmentsInner() {
  }

  public PostMessagesSendRequestMessageAttachmentsInner type(String type) {
    
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


  public PostMessagesSendRequestMessageAttachmentsInner name(String name) {
    
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


  public PostMessagesSendRequestMessageAttachmentsInner content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * the content of the attachment as a base64-encoded string
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
    PostMessagesSendRequestMessageAttachmentsInner postMessagesSendRequestMessageAttachmentsInner = (PostMessagesSendRequestMessageAttachmentsInner) o;
    return Objects.equals(this.type, postMessagesSendRequestMessageAttachmentsInner.type) &&
        Objects.equals(this.name, postMessagesSendRequestMessageAttachmentsInner.name) &&
        Objects.equals(this.content, postMessagesSendRequestMessageAttachmentsInner.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMessagesSendRequestMessageAttachmentsInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

