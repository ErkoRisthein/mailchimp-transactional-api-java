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
import io.github.erkoristhein.mailchimp.model.PostUsersInfo200ResponseStats;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * the user information including username, key, reputation, quota, and historical sending stats
 */
@JsonPropertyOrder({
  PostUsersInfo200Response.JSON_PROPERTY_USERNAME,
  PostUsersInfo200Response.JSON_PROPERTY_CREATED_AT,
  PostUsersInfo200Response.JSON_PROPERTY_PUBLIC_ID,
  PostUsersInfo200Response.JSON_PROPERTY_REPUTATION,
  PostUsersInfo200Response.JSON_PROPERTY_HOURLY_QUOTA,
  PostUsersInfo200Response.JSON_PROPERTY_BACKLOG,
  PostUsersInfo200Response.JSON_PROPERTY_STATS
})
@JsonTypeName("postUsersInfo_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostUsersInfo200Response {
  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_REPUTATION = "reputation";
  private Integer reputation;

  public static final String JSON_PROPERTY_HOURLY_QUOTA = "hourly_quota";
  private Integer hourlyQuota;

  public static final String JSON_PROPERTY_BACKLOG = "backlog";
  private Integer backlog;

  public static final String JSON_PROPERTY_STATS = "stats";
  private PostUsersInfo200ResponseStats stats;

  public PostUsersInfo200Response() {
  }

  public PostUsersInfo200Response username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * the username of the user (used for SMTP authentication)
   * @return username
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  public PostUsersInfo200Response createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * the date and time that the user&#39;s Mandrill account was created as a UTC string in YYYY-MM-DD HH:MM:SS format
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public PostUsersInfo200Response publicId(String publicId) {
    
    this.publicId = publicId;
    return this;
  }

   /**
   * a unique, permanent identifier for this user
   * @return publicId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicId() {
    return publicId;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }


  public PostUsersInfo200Response reputation(Integer reputation) {
    
    this.reputation = reputation;
    return this;
  }

   /**
   * the reputation of the user on a scale from 0 to 100, with 75 generally being a \&quot;good\&quot; reputation
   * @return reputation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPUTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReputation() {
    return reputation;
  }


  @JsonProperty(JSON_PROPERTY_REPUTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReputation(Integer reputation) {
    this.reputation = reputation;
  }


  public PostUsersInfo200Response hourlyQuota(Integer hourlyQuota) {
    
    this.hourlyQuota = hourlyQuota;
    return this;
  }

   /**
   * the maximum number of emails Mandrill will deliver for this user each hour. Any emails beyond that will be accepted and queued for later delivery. Users with higher reputations will have higher hourly quotas
   * @return hourlyQuota
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOURLY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHourlyQuota() {
    return hourlyQuota;
  }


  @JsonProperty(JSON_PROPERTY_HOURLY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHourlyQuota(Integer hourlyQuota) {
    this.hourlyQuota = hourlyQuota;
  }


  public PostUsersInfo200Response backlog(Integer backlog) {
    
    this.backlog = backlog;
    return this;
  }

   /**
   * the number of emails that are queued for delivery due to exceeding your monthly or hourly quotas
   * @return backlog
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKLOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBacklog() {
    return backlog;
  }


  @JsonProperty(JSON_PROPERTY_BACKLOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBacklog(Integer backlog) {
    this.backlog = backlog;
  }


  public PostUsersInfo200Response stats(PostUsersInfo200ResponseStats stats) {
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostUsersInfo200ResponseStats getStats() {
    return stats;
  }


  @JsonProperty(JSON_PROPERTY_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStats(PostUsersInfo200ResponseStats stats) {
    this.stats = stats;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUsersInfo200Response postUsersInfo200Response = (PostUsersInfo200Response) o;
    return Objects.equals(this.username, postUsersInfo200Response.username) &&
        Objects.equals(this.createdAt, postUsersInfo200Response.createdAt) &&
        Objects.equals(this.publicId, postUsersInfo200Response.publicId) &&
        Objects.equals(this.reputation, postUsersInfo200Response.reputation) &&
        Objects.equals(this.hourlyQuota, postUsersInfo200Response.hourlyQuota) &&
        Objects.equals(this.backlog, postUsersInfo200Response.backlog) &&
        Objects.equals(this.stats, postUsersInfo200Response.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, createdAt, publicId, reputation, hourlyQuota, backlog, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUsersInfo200Response {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    reputation: ").append(toIndentedString(reputation)).append("\n");
    sb.append("    hourlyQuota: ").append(toIndentedString(hourlyQuota)).append("\n");
    sb.append("    backlog: ").append(toIndentedString(backlog)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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
