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
 * PostUrlsSearchDeprecatedRequest
 */
@JsonPropertyOrder({
  PostUrlsSearchDeprecatedRequest.JSON_PROPERTY_KEY,
  PostUrlsSearchDeprecatedRequest.JSON_PROPERTY_Q
})
@JsonTypeName("postUrlsSearchDeprecated_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostUrlsSearchDeprecatedRequest {
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public PostUrlsSearchDeprecatedRequest() {
  }

  public PostUrlsSearchDeprecatedRequest key(String key) {
    
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


  public PostUrlsSearchDeprecatedRequest q(String q) {
    
    this.q = q;
    return this;
  }

   /**
   * a search query
   * @return q
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQ() {
    return q;
  }


  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQ(String q) {
    this.q = q;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUrlsSearchDeprecatedRequest postUrlsSearchDeprecatedRequest = (PostUrlsSearchDeprecatedRequest) o;
    return Objects.equals(this.key, postUrlsSearchDeprecatedRequest.key) &&
        Objects.equals(this.q, postUrlsSearchDeprecatedRequest.q);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, q);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUrlsSearchDeprecatedRequest {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
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

