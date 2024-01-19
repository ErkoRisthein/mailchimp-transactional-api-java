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
 * the updated mailbox route information
 */
@JsonPropertyOrder({
  PostInboundUpdateRoute200Response.JSON_PROPERTY_ID,
  PostInboundUpdateRoute200Response.JSON_PROPERTY_PATTERN,
  PostInboundUpdateRoute200Response.JSON_PROPERTY_URL
})
@JsonTypeName("postInboundUpdateRoute_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostInboundUpdateRoute200Response {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private String pattern;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public PostInboundUpdateRoute200Response() {
  }

  public PostInboundUpdateRoute200Response id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the unique identifier of the route
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public PostInboundUpdateRoute200Response pattern(String pattern) {
    
    this.pattern = pattern;
    return this;
  }

   /**
   * the search pattern that the mailbox name should match
   * @return pattern
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPattern() {
    return pattern;
  }


  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public PostInboundUpdateRoute200Response url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * the webhook URL where inbound messages will be published
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostInboundUpdateRoute200Response postInboundUpdateRoute200Response = (PostInboundUpdateRoute200Response) o;
    return Objects.equals(this.id, postInboundUpdateRoute200Response.id) &&
        Objects.equals(this.pattern, postInboundUpdateRoute200Response.pattern) &&
        Objects.equals(this.url, postInboundUpdateRoute200Response.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pattern, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInboundUpdateRoute200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

