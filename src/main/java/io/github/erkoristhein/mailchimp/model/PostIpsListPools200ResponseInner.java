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
import io.github.erkoristhein.mailchimp.model.PostIpsListPools200ResponseInnerIpsInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * information about each dedicated IP pool
 */
@JsonPropertyOrder({
  PostIpsListPools200ResponseInner.JSON_PROPERTY_NAME,
  PostIpsListPools200ResponseInner.JSON_PROPERTY_CREATED_AT,
  PostIpsListPools200ResponseInner.JSON_PROPERTY_IPS
})
@JsonTypeName("postIpsListPools_200_response_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostIpsListPools200ResponseInner {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_IPS = "ips";
  private List<PostIpsListPools200ResponseInnerIpsInner> ips;

  public PostIpsListPools200ResponseInner() {
  }

  public PostIpsListPools200ResponseInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * this pool&#39;s name
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


  public PostIpsListPools200ResponseInner createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * the date and time that this pool was created as a UTC timestamp in YYYY-MM-DD HH:MM:SS format
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PostIpsListPools200ResponseInner ips(List<PostIpsListPools200ResponseInnerIpsInner> ips) {
    
    this.ips = ips;
    return this;
  }

  public PostIpsListPools200ResponseInner addIpsItem(PostIpsListPools200ResponseInnerIpsInner ipsItem) {
    if (this.ips == null) {
      this.ips = new ArrayList<>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * the dedicated IPs in this pool
   * @return ips
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PostIpsListPools200ResponseInnerIpsInner> getIps() {
    return ips;
  }


  @JsonProperty(JSON_PROPERTY_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIps(List<PostIpsListPools200ResponseInnerIpsInner> ips) {
    this.ips = ips;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostIpsListPools200ResponseInner postIpsListPools200ResponseInner = (PostIpsListPools200ResponseInner) o;
    return Objects.equals(this.name, postIpsListPools200ResponseInner.name) &&
        Objects.equals(this.createdAt, postIpsListPools200ResponseInner.createdAt) &&
        Objects.equals(this.ips, postIpsListPools200ResponseInner.ips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, createdAt, ips);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostIpsListPools200ResponseInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
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
