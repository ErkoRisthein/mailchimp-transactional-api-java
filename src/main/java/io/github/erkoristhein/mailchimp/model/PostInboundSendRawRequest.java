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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PostInboundSendRawRequest
 */
@JsonPropertyOrder({
  PostInboundSendRawRequest.JSON_PROPERTY_KEY,
  PostInboundSendRawRequest.JSON_PROPERTY_RAW_MESSAGE,
  PostInboundSendRawRequest.JSON_PROPERTY_TO,
  PostInboundSendRawRequest.JSON_PROPERTY_MAIL_FROM,
  PostInboundSendRawRequest.JSON_PROPERTY_HELO,
  PostInboundSendRawRequest.JSON_PROPERTY_CLIENT_ADDRESS
})
@JsonTypeName("postInboundSendRaw_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostInboundSendRawRequest {
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_RAW_MESSAGE = "raw_message";
  private String rawMessage;

  public static final String JSON_PROPERTY_TO = "to";
  private List<String> to;

  public static final String JSON_PROPERTY_MAIL_FROM = "mail_from";
  private String mailFrom;

  public static final String JSON_PROPERTY_HELO = "helo";
  private String helo;

  public static final String JSON_PROPERTY_CLIENT_ADDRESS = "client_address";
  private String clientAddress;

  public PostInboundSendRawRequest() {
  }

  public PostInboundSendRawRequest key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * a valid api key
   * @return key
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKey(String key) {
    this.key = key;
  }


  public PostInboundSendRawRequest rawMessage(String rawMessage) {
    
    this.rawMessage = rawMessage;
    return this;
  }

   /**
   * the full MIME document of an email message
   * @return rawMessage
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RAW_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRawMessage() {
    return rawMessage;
  }


  @JsonProperty(JSON_PROPERTY_RAW_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRawMessage(String rawMessage) {
    this.rawMessage = rawMessage;
  }


  public PostInboundSendRawRequest to(List<String> to) {
    
    this.to = to;
    return this;
  }

  public PostInboundSendRawRequest addToItem(String toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * optionally define the recipients to receive the message - otherwise we&#39;ll use the To, Cc, and Bcc headers provided in the document
   * @return to
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTo(List<String> to) {
    this.to = to;
  }


  public PostInboundSendRawRequest mailFrom(String mailFrom) {
    
    this.mailFrom = mailFrom;
    return this;
  }

   /**
   * the address specified in the MAIL FROM stage of the SMTP conversation. Required for the SPF check.
   * @return mailFrom
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAIL_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMailFrom() {
    return mailFrom;
  }


  @JsonProperty(JSON_PROPERTY_MAIL_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMailFrom(String mailFrom) {
    this.mailFrom = mailFrom;
  }


  public PostInboundSendRawRequest helo(String helo) {
    
    this.helo = helo;
    return this;
  }

   /**
   * the identification provided by the client mta in the MTA state of the SMTP conversation. Required for the SPF check.
   * @return helo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HELO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHelo() {
    return helo;
  }


  @JsonProperty(JSON_PROPERTY_HELO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHelo(String helo) {
    this.helo = helo;
  }


  public PostInboundSendRawRequest clientAddress(String clientAddress) {
    
    this.clientAddress = clientAddress;
    return this;
  }

   /**
   * the remote MTA&#39;s ip address. Optional; required for the SPF check.
   * @return clientAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientAddress() {
    return clientAddress;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientAddress(String clientAddress) {
    this.clientAddress = clientAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostInboundSendRawRequest postInboundSendRawRequest = (PostInboundSendRawRequest) o;
    return Objects.equals(this.key, postInboundSendRawRequest.key) &&
        Objects.equals(this.rawMessage, postInboundSendRawRequest.rawMessage) &&
        Objects.equals(this.to, postInboundSendRawRequest.to) &&
        Objects.equals(this.mailFrom, postInboundSendRawRequest.mailFrom) &&
        Objects.equals(this.helo, postInboundSendRawRequest.helo) &&
        Objects.equals(this.clientAddress, postInboundSendRawRequest.clientAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, rawMessage, to, mailFrom, helo, clientAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInboundSendRawRequest {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    rawMessage: ").append(toIndentedString(rawMessage)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    mailFrom: ").append(toIndentedString(mailFrom)).append("\n");
    sb.append("    helo: ").append(toIndentedString(helo)).append("\n");
    sb.append("    clientAddress: ").append(toIndentedString(clientAddress)).append("\n");
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
