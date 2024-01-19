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
 * PostInboundUpdateRouteRequest
 */
@JsonPropertyOrder({
  PostInboundUpdateRouteRequest.JSON_PROPERTY_KEY,
  PostInboundUpdateRouteRequest.JSON_PROPERTY_ID,
  PostInboundUpdateRouteRequest.JSON_PROPERTY_PATTERN,
  PostInboundUpdateRouteRequest.JSON_PROPERTY_URL
})
@JsonTypeName("postInboundUpdateRoute_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostInboundUpdateRouteRequest {
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private String pattern;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public PostInboundUpdateRouteRequest() {
  }

  public PostInboundUpdateRouteRequest key(String key) {
    
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


  public PostInboundUpdateRouteRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the unique identifier of an existing mailbox route
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public PostInboundUpdateRouteRequest pattern(String pattern) {
    
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


  public PostInboundUpdateRouteRequest url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * the webhook URL where the inbound messages will be published; Validation: webhookexists
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
    PostInboundUpdateRouteRequest postInboundUpdateRouteRequest = (PostInboundUpdateRouteRequest) o;
    return Objects.equals(this.key, postInboundUpdateRouteRequest.key) &&
        Objects.equals(this.id, postInboundUpdateRouteRequest.id) &&
        Objects.equals(this.pattern, postInboundUpdateRouteRequest.pattern) &&
        Objects.equals(this.url, postInboundUpdateRouteRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, id, pattern, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInboundUpdateRouteRequest {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

