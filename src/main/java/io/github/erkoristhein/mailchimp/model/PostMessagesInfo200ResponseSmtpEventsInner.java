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
 * information about a specific smtp event
 */
@JsonPropertyOrder({
  PostMessagesInfo200ResponseSmtpEventsInner.JSON_PROPERTY_TS,
  PostMessagesInfo200ResponseSmtpEventsInner.JSON_PROPERTY_TYPE,
  PostMessagesInfo200ResponseSmtpEventsInner.JSON_PROPERTY_DIAG
})
@JsonTypeName("postMessagesInfo_200_response_smtp_events_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostMessagesInfo200ResponseSmtpEventsInner {
  public static final String JSON_PROPERTY_TS = "ts";
  private Integer ts;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_DIAG = "diag";
  private String diag;

  public PostMessagesInfo200ResponseSmtpEventsInner() {
  }

  public PostMessagesInfo200ResponseSmtpEventsInner ts(Integer ts) {
    
    this.ts = ts;
    return this;
  }

   /**
   * the Unix timestamp when the event occured
   * @return ts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTs() {
    return ts;
  }


  @JsonProperty(JSON_PROPERTY_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTs(Integer ts) {
    this.ts = ts;
  }


  public PostMessagesInfo200ResponseSmtpEventsInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * the message&#39;s state as a result of this event
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


  public PostMessagesInfo200ResponseSmtpEventsInner diag(String diag) {
    
    this.diag = diag;
    return this;
  }

   /**
   * the SMTP response from the recipient&#39;s server
   * @return diag
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDiag() {
    return diag;
  }


  @JsonProperty(JSON_PROPERTY_DIAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiag(String diag) {
    this.diag = diag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostMessagesInfo200ResponseSmtpEventsInner postMessagesInfo200ResponseSmtpEventsInner = (PostMessagesInfo200ResponseSmtpEventsInner) o;
    return Objects.equals(this.ts, postMessagesInfo200ResponseSmtpEventsInner.ts) &&
        Objects.equals(this.type, postMessagesInfo200ResponseSmtpEventsInner.type) &&
        Objects.equals(this.diag, postMessagesInfo200ResponseSmtpEventsInner.diag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ts, type, diag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMessagesInfo200ResponseSmtpEventsInner {\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    diag: ").append(toIndentedString(diag)).append("\n");
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
