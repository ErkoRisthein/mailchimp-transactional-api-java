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
import io.github.erkoristhein.mailchimp.model.PostSendersInfo200ResponseStats;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * the detailed information on the sender
 */
@JsonPropertyOrder({
  PostSendersInfo200Response.JSON_PROPERTY_ADDRESS,
  PostSendersInfo200Response.JSON_PROPERTY_CREATED_AT,
  PostSendersInfo200Response.JSON_PROPERTY_SENT,
  PostSendersInfo200Response.JSON_PROPERTY_HARD_BOUNCES,
  PostSendersInfo200Response.JSON_PROPERTY_SOFT_BOUNCES,
  PostSendersInfo200Response.JSON_PROPERTY_REJECTS,
  PostSendersInfo200Response.JSON_PROPERTY_COMPLAINTS,
  PostSendersInfo200Response.JSON_PROPERTY_UNSUBS,
  PostSendersInfo200Response.JSON_PROPERTY_OPENS,
  PostSendersInfo200Response.JSON_PROPERTY_CLICKS,
  PostSendersInfo200Response.JSON_PROPERTY_STATS
})
@JsonTypeName("postSendersInfo_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostSendersInfo200Response {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_SENT = "sent";
  private Integer sent;

  public static final String JSON_PROPERTY_HARD_BOUNCES = "hard_bounces";
  private Integer hardBounces;

  public static final String JSON_PROPERTY_SOFT_BOUNCES = "soft_bounces";
  private Integer softBounces;

  public static final String JSON_PROPERTY_REJECTS = "rejects";
  private Integer rejects;

  public static final String JSON_PROPERTY_COMPLAINTS = "complaints";
  private Integer complaints;

  public static final String JSON_PROPERTY_UNSUBS = "unsubs";
  private Integer unsubs;

  public static final String JSON_PROPERTY_OPENS = "opens";
  private Integer opens;

  public static final String JSON_PROPERTY_CLICKS = "clicks";
  private Integer clicks;

  public static final String JSON_PROPERTY_STATS = "stats";
  private PostSendersInfo200ResponseStats stats;

  public PostSendersInfo200Response() {
  }

  public PostSendersInfo200Response address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * the sender&#39;s email address
   * @return address
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(String address) {
    this.address = address;
  }


  public PostSendersInfo200Response createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * the date and time that the sender was first seen by Mandrill as a UTC date string in YYYY-MM-DD HH:MM:SS format
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


  public PostSendersInfo200Response sent(Integer sent) {
    
    this.sent = sent;
    return this;
  }

   /**
   * the total number of messages sent by this sender
   * @return sent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSent() {
    return sent;
  }


  @JsonProperty(JSON_PROPERTY_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSent(Integer sent) {
    this.sent = sent;
  }


  public PostSendersInfo200Response hardBounces(Integer hardBounces) {
    
    this.hardBounces = hardBounces;
    return this;
  }

   /**
   * the total number of hard bounces by messages by this sender
   * @return hardBounces
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HARD_BOUNCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHardBounces() {
    return hardBounces;
  }


  @JsonProperty(JSON_PROPERTY_HARD_BOUNCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHardBounces(Integer hardBounces) {
    this.hardBounces = hardBounces;
  }


  public PostSendersInfo200Response softBounces(Integer softBounces) {
    
    this.softBounces = softBounces;
    return this;
  }

   /**
   * the total number of soft bounces by messages by this sender
   * @return softBounces
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOFT_BOUNCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSoftBounces() {
    return softBounces;
  }


  @JsonProperty(JSON_PROPERTY_SOFT_BOUNCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftBounces(Integer softBounces) {
    this.softBounces = softBounces;
  }


  public PostSendersInfo200Response rejects(Integer rejects) {
    
    this.rejects = rejects;
    return this;
  }

   /**
   * the total number of rejected messages by this sender
   * @return rejects
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRejects() {
    return rejects;
  }


  @JsonProperty(JSON_PROPERTY_REJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRejects(Integer rejects) {
    this.rejects = rejects;
  }


  public PostSendersInfo200Response complaints(Integer complaints) {
    
    this.complaints = complaints;
    return this;
  }

   /**
   * the total number of spam complaints received for messages by this sender
   * @return complaints
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getComplaints() {
    return complaints;
  }


  @JsonProperty(JSON_PROPERTY_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplaints(Integer complaints) {
    this.complaints = complaints;
  }


  public PostSendersInfo200Response unsubs(Integer unsubs) {
    
    this.unsubs = unsubs;
    return this;
  }

   /**
   * the total number of unsubscribe requests received for messages by this sender
   * @return unsubs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNSUBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnsubs() {
    return unsubs;
  }


  @JsonProperty(JSON_PROPERTY_UNSUBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnsubs(Integer unsubs) {
    this.unsubs = unsubs;
  }


  public PostSendersInfo200Response opens(Integer opens) {
    
    this.opens = opens;
    return this;
  }

   /**
   * the total number of times messages by this sender have been opened
   * @return opens
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOpens() {
    return opens;
  }


  @JsonProperty(JSON_PROPERTY_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpens(Integer opens) {
    this.opens = opens;
  }


  public PostSendersInfo200Response clicks(Integer clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * the total number of times tracked URLs in messages by this sender have been clicked
   * @return clicks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getClicks() {
    return clicks;
  }


  @JsonProperty(JSON_PROPERTY_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClicks(Integer clicks) {
    this.clicks = clicks;
  }


  public PostSendersInfo200Response stats(PostSendersInfo200ResponseStats stats) {
    
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

  public PostSendersInfo200ResponseStats getStats() {
    return stats;
  }


  @JsonProperty(JSON_PROPERTY_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStats(PostSendersInfo200ResponseStats stats) {
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
    PostSendersInfo200Response postSendersInfo200Response = (PostSendersInfo200Response) o;
    return Objects.equals(this.address, postSendersInfo200Response.address) &&
        Objects.equals(this.createdAt, postSendersInfo200Response.createdAt) &&
        Objects.equals(this.sent, postSendersInfo200Response.sent) &&
        Objects.equals(this.hardBounces, postSendersInfo200Response.hardBounces) &&
        Objects.equals(this.softBounces, postSendersInfo200Response.softBounces) &&
        Objects.equals(this.rejects, postSendersInfo200Response.rejects) &&
        Objects.equals(this.complaints, postSendersInfo200Response.complaints) &&
        Objects.equals(this.unsubs, postSendersInfo200Response.unsubs) &&
        Objects.equals(this.opens, postSendersInfo200Response.opens) &&
        Objects.equals(this.clicks, postSendersInfo200Response.clicks) &&
        Objects.equals(this.stats, postSendersInfo200Response.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, createdAt, sent, hardBounces, softBounces, rejects, complaints, unsubs, opens, clicks, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSendersInfo200Response {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    hardBounces: ").append(toIndentedString(hardBounces)).append("\n");
    sb.append("    softBounces: ").append(toIndentedString(softBounces)).append("\n");
    sb.append("    rejects: ").append(toIndentedString(rejects)).append("\n");
    sb.append("    complaints: ").append(toIndentedString(complaints)).append("\n");
    sb.append("    unsubs: ").append(toIndentedString(unsubs)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
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

