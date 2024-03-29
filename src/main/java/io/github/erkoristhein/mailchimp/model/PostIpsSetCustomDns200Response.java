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
 * information about the dedicated IP&#39;s new configuration
 */
@JsonPropertyOrder({
  PostIpsSetCustomDns200Response.JSON_PROPERTY_IP,
  PostIpsSetCustomDns200Response.JSON_PROPERTY_CREATED_AT,
  PostIpsSetCustomDns200Response.JSON_PROPERTY_POOL,
  PostIpsSetCustomDns200Response.JSON_PROPERTY_DOMAIN,
  PostIpsSetCustomDns200Response.JSON_PROPERTY_CUSTOM_DNS,
  PostIpsSetCustomDns200Response.JSON_PROPERTY_WARMUP
})
@JsonTypeName("postIpsSetCustomDns_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostIpsSetCustomDns200Response {
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

  public PostIpsSetCustomDns200Response() {
  }

  public PostIpsSetCustomDns200Response ip(String ip) {
    
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


  public PostIpsSetCustomDns200Response createdAt(OffsetDateTime createdAt) {
    
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


  public PostIpsSetCustomDns200Response pool(String pool) {
    
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


  public PostIpsSetCustomDns200Response domain(String domain) {
    
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


  public PostIpsSetCustomDns200Response customDns(PostIpsList200ResponseInnerCustomDns customDns) {
    
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


  public PostIpsSetCustomDns200Response warmup(PostIpsList200ResponseInnerWarmup warmup) {
    
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
    PostIpsSetCustomDns200Response postIpsSetCustomDns200Response = (PostIpsSetCustomDns200Response) o;
    return Objects.equals(this.ip, postIpsSetCustomDns200Response.ip) &&
        Objects.equals(this.createdAt, postIpsSetCustomDns200Response.createdAt) &&
        Objects.equals(this.pool, postIpsSetCustomDns200Response.pool) &&
        Objects.equals(this.domain, postIpsSetCustomDns200Response.domain) &&
        Objects.equals(this.customDns, postIpsSetCustomDns200Response.customDns) &&
        Objects.equals(this.warmup, postIpsSetCustomDns200Response.warmup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, createdAt, pool, domain, customDns, warmup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostIpsSetCustomDns200Response {\n");
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

