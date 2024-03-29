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
 * tats for the lifetime of the user&#39;s account
 */
@JsonPropertyOrder({
  PostUsersInfo200ResponseStatsAllTime.JSON_PROPERTY_SENT,
  PostUsersInfo200ResponseStatsAllTime.JSON_PROPERTY_HARD_BOUNCES,
  PostUsersInfo200ResponseStatsAllTime.JSON_PROPERTY_SOFT_BOUNCES,
  PostUsersInfo200ResponseStatsAllTime.JSON_PROPERTY_REJECTS,
  PostUsersInfo200ResponseStatsAllTime.JSON_PROPERTY_COMPLAINTS,
  PostUsersInfo200ResponseStatsAllTime.JSON_PROPERTY_UNSUBS,
  PostUsersInfo200ResponseStatsAllTime.JSON_PROPERTY_OPENS,
  PostUsersInfo200ResponseStatsAllTime.JSON_PROPERTY_UNIQUE_OPENS,
  PostUsersInfo200ResponseStatsAllTime.JSON_PROPERTY_CLICKS,
  PostUsersInfo200ResponseStatsAllTime.JSON_PROPERTY_UNIQUE_CLICKS
})
@JsonTypeName("postUsersInfo_200_response_stats_all_time")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostUsersInfo200ResponseStatsAllTime {
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

  public static final String JSON_PROPERTY_UNIQUE_OPENS = "unique_opens";
  private Integer uniqueOpens;

  public static final String JSON_PROPERTY_CLICKS = "clicks";
  private Integer clicks;

  public static final String JSON_PROPERTY_UNIQUE_CLICKS = "unique_clicks";
  private Integer uniqueClicks;

  public PostUsersInfo200ResponseStatsAllTime() {
  }

  public PostUsersInfo200ResponseStatsAllTime sent(Integer sent) {
    
    this.sent = sent;
    return this;
  }

   /**
   * the number of emails sent in the lifetime of the user&#39;s account
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


  public PostUsersInfo200ResponseStatsAllTime hardBounces(Integer hardBounces) {
    
    this.hardBounces = hardBounces;
    return this;
  }

   /**
   * the number of emails hard bounced in the lifetime of the user&#39;s account
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


  public PostUsersInfo200ResponseStatsAllTime softBounces(Integer softBounces) {
    
    this.softBounces = softBounces;
    return this;
  }

   /**
   * the number of emails soft bounced in the lifetime of the user&#39;s account
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


  public PostUsersInfo200ResponseStatsAllTime rejects(Integer rejects) {
    
    this.rejects = rejects;
    return this;
  }

   /**
   * the number of emails rejected for sending this user so far today
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


  public PostUsersInfo200ResponseStatsAllTime complaints(Integer complaints) {
    
    this.complaints = complaints;
    return this;
  }

   /**
   * the number of spam complaints in the lifetime of the user&#39;s account
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


  public PostUsersInfo200ResponseStatsAllTime unsubs(Integer unsubs) {
    
    this.unsubs = unsubs;
    return this;
  }

   /**
   * the number of unsubscribes in the lifetime of the user&#39;s account
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


  public PostUsersInfo200ResponseStatsAllTime opens(Integer opens) {
    
    this.opens = opens;
    return this;
  }

   /**
   * the number of times emails have been opened in the lifetime of the user&#39;s account
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


  public PostUsersInfo200ResponseStatsAllTime uniqueOpens(Integer uniqueOpens) {
    
    this.uniqueOpens = uniqueOpens;
    return this;
  }

   /**
   * the number of unique opens for emails sent in the lifetime of the user&#39;s account
   * @return uniqueOpens
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUE_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUniqueOpens() {
    return uniqueOpens;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueOpens(Integer uniqueOpens) {
    this.uniqueOpens = uniqueOpens;
  }


  public PostUsersInfo200ResponseStatsAllTime clicks(Integer clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * the number of URLs that have been clicked in the lifetime of the user&#39;s account
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


  public PostUsersInfo200ResponseStatsAllTime uniqueClicks(Integer uniqueClicks) {
    
    this.uniqueClicks = uniqueClicks;
    return this;
  }

   /**
   * the number of unique clicks for emails sent in the lifetime of the user&#39;s account
   * @return uniqueClicks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUE_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUniqueClicks() {
    return uniqueClicks;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueClicks(Integer uniqueClicks) {
    this.uniqueClicks = uniqueClicks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUsersInfo200ResponseStatsAllTime postUsersInfo200ResponseStatsAllTime = (PostUsersInfo200ResponseStatsAllTime) o;
    return Objects.equals(this.sent, postUsersInfo200ResponseStatsAllTime.sent) &&
        Objects.equals(this.hardBounces, postUsersInfo200ResponseStatsAllTime.hardBounces) &&
        Objects.equals(this.softBounces, postUsersInfo200ResponseStatsAllTime.softBounces) &&
        Objects.equals(this.rejects, postUsersInfo200ResponseStatsAllTime.rejects) &&
        Objects.equals(this.complaints, postUsersInfo200ResponseStatsAllTime.complaints) &&
        Objects.equals(this.unsubs, postUsersInfo200ResponseStatsAllTime.unsubs) &&
        Objects.equals(this.opens, postUsersInfo200ResponseStatsAllTime.opens) &&
        Objects.equals(this.uniqueOpens, postUsersInfo200ResponseStatsAllTime.uniqueOpens) &&
        Objects.equals(this.clicks, postUsersInfo200ResponseStatsAllTime.clicks) &&
        Objects.equals(this.uniqueClicks, postUsersInfo200ResponseStatsAllTime.uniqueClicks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sent, hardBounces, softBounces, rejects, complaints, unsubs, opens, uniqueOpens, clicks, uniqueClicks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUsersInfo200ResponseStatsAllTime {\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    hardBounces: ").append(toIndentedString(hardBounces)).append("\n");
    sb.append("    softBounces: ").append(toIndentedString(softBounces)).append("\n");
    sb.append("    rejects: ").append(toIndentedString(rejects)).append("\n");
    sb.append("    complaints: ").append(toIndentedString(complaints)).append("\n");
    sb.append("    unsubs: ").append(toIndentedString(unsubs)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    uniqueOpens: ").append(toIndentedString(uniqueOpens)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    uniqueClicks: ").append(toIndentedString(uniqueClicks)).append("\n");
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

