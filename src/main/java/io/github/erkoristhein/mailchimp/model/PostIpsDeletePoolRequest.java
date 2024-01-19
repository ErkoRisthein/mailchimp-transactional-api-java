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
 * PostIpsDeletePoolRequest
 */
@JsonPropertyOrder({
  PostIpsDeletePoolRequest.JSON_PROPERTY_KEY,
  PostIpsDeletePoolRequest.JSON_PROPERTY_POOL
})
@JsonTypeName("postIpsDeletePool_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostIpsDeletePoolRequest {
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_POOL = "pool";
  private String pool;

  public PostIpsDeletePoolRequest() {
  }

  public PostIpsDeletePoolRequest key(String key) {
    
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


  public PostIpsDeletePoolRequest pool(String pool) {
    
    this.pool = pool;
    return this;
  }

   /**
   * the name of the pool to delete
   * @return pool
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_POOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPool() {
    return pool;
  }


  @JsonProperty(JSON_PROPERTY_POOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPool(String pool) {
    this.pool = pool;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostIpsDeletePoolRequest postIpsDeletePoolRequest = (PostIpsDeletePoolRequest) o;
    return Objects.equals(this.key, postIpsDeletePoolRequest.key) &&
        Objects.equals(this.pool, postIpsDeletePoolRequest.pool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, pool);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostIpsDeletePoolRequest {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
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
