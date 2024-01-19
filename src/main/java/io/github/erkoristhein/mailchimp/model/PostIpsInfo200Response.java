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
import io.github.erkoristhein.mailchimp.model.PostIpsList200ResponseInnerCustomDns;
import io.github.erkoristhein.mailchimp.model.PostIpsList200ResponseInnerWarmup;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about the dedicated ip
 */
@JsonPropertyOrder({
  PostIpsInfo200Response.JSON_PROPERTY_IP,
  PostIpsInfo200Response.JSON_PROPERTY_CREATED_AT,
  PostIpsInfo200Response.JSON_PROPERTY_POOL,
  PostIpsInfo200Response.JSON_PROPERTY_DOMAIN,
  PostIpsInfo200Response.JSON_PROPERTY_CUSTOM_DNS,
  PostIpsInfo200Response.JSON_PROPERTY_WARMUP
})
@JsonTypeName("postIpsInfo_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostIpsInfo200Response {
  public static final String JSON_PROPERTY_IP = "ip";
  private String ip;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_POOL = "pool";
  private String pool;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_CUSTOM_DNS = "custom_dns";
  private PostIpsList200ResponseInnerCustomDns customDns;

  public static final String JSON_PROPERTY_WARMUP = "warmup";
  private PostIpsList200ResponseInnerWarmup warmup;

  public PostIpsInfo200Response() {
  }

  public PostIpsInfo200Response ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * the ip address
   * @return ip
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIp() {
    return ip;
  }


  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIp(String ip) {
    this.ip = ip;
  }


  public PostIpsInfo200Response createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * the date and time that the dedicated IP was created as a UTC string in YYYY-MM-DD HH:MM:SS format
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


  public PostIpsInfo200Response pool(String pool) {
    
    this.pool = pool;
    return this;
  }

   /**
   * the name of the pool that this dedicated IP belongs to
   * @return pool
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPool() {
    return pool;
  }


  @JsonProperty(JSON_PROPERTY_POOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPool(String pool) {
    this.pool = pool;
  }


  public PostIpsInfo200Response domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * the domain name (reverse dns) of this dedicated IP
   * @return domain
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomain(String domain) {
    this.domain = domain;
  }


  public PostIpsInfo200Response customDns(PostIpsList200ResponseInnerCustomDns customDns) {
    
    this.customDns = customDns;
    return this;
  }

   /**
   * Get customDns
   * @return customDns
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_DNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostIpsList200ResponseInnerCustomDns getCustomDns() {
    return customDns;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_DNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomDns(PostIpsList200ResponseInnerCustomDns customDns) {
    this.customDns = customDns;
  }


  public PostIpsInfo200Response warmup(PostIpsList200ResponseInnerWarmup warmup) {
    
    this.warmup = warmup;
    return this;
  }

   /**
   * Get warmup
   * @return warmup
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARMUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostIpsList200ResponseInnerWarmup getWarmup() {
    return warmup;
  }


  @JsonProperty(JSON_PROPERTY_WARMUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarmup(PostIpsList200ResponseInnerWarmup warmup) {
    this.warmup = warmup;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostIpsInfo200Response postIpsInfo200Response = (PostIpsInfo200Response) o;
    return Objects.equals(this.ip, postIpsInfo200Response.ip) &&
        Objects.equals(this.createdAt, postIpsInfo200Response.createdAt) &&
        Objects.equals(this.pool, postIpsInfo200Response.pool) &&
        Objects.equals(this.domain, postIpsInfo200Response.domain) &&
        Objects.equals(this.customDns, postIpsInfo200Response.customDns) &&
        Objects.equals(this.warmup, postIpsInfo200Response.warmup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, createdAt, pool, domain, customDns, warmup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostIpsInfo200Response {\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    customDns: ").append(toIndentedString(customDns)).append("\n");
    sb.append("    warmup: ").append(toIndentedString(warmup)).append("\n");
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
