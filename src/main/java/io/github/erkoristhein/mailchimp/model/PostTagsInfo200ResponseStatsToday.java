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
 * stats with this tag so far today
 */
@JsonPropertyOrder({
  PostTagsInfo200ResponseStatsToday.JSON_PROPERTY_SENT,
  PostTagsInfo200ResponseStatsToday.JSON_PROPERTY_HARD_BOUNCES,
  PostTagsInfo200ResponseStatsToday.JSON_PROPERTY_SOFT_BOUNCES,
  PostTagsInfo200ResponseStatsToday.JSON_PROPERTY_REJECTS,
  PostTagsInfo200ResponseStatsToday.JSON_PROPERTY_COMPLAINTS,
  PostTagsInfo200ResponseStatsToday.JSON_PROPERTY_UNSUBS,
  PostTagsInfo200ResponseStatsToday.JSON_PROPERTY_OPENS,
  PostTagsInfo200ResponseStatsToday.JSON_PROPERTY_UNIQUE_OPENS,
  PostTagsInfo200ResponseStatsToday.JSON_PROPERTY_CLICKS,
  PostTagsInfo200ResponseStatsToday.JSON_PROPERTY_UNIQUE_CLICKS
})
@JsonTypeName("postTagsInfo_200_response_stats_today")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostTagsInfo200ResponseStatsToday {
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

  public PostTagsInfo200ResponseStatsToday() {
  }

  public PostTagsInfo200ResponseStatsToday sent(Integer sent) {
    
    this.sent = sent;
    return this;
  }

   /**
   * the number of emails sent with this tag so far today
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


  public PostTagsInfo200ResponseStatsToday hardBounces(Integer hardBounces) {
    
    this.hardBounces = hardBounces;
    return this;
  }

   /**
   * the number of emails hard bounced with this tag so far today
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


  public PostTagsInfo200ResponseStatsToday softBounces(Integer softBounces) {
    
    this.softBounces = softBounces;
    return this;
  }

   /**
   * the number of emails soft bounced with this tag so far today
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


  public PostTagsInfo200ResponseStatsToday rejects(Integer rejects) {
    
    this.rejects = rejects;
    return this;
  }

   /**
   * the number of emails rejected for sending this sender so far today
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


  public PostTagsInfo200ResponseStatsToday complaints(Integer complaints) {
    
    this.complaints = complaints;
    return this;
  }

   /**
   * the number of spam complaints with this tag so far today
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


  public PostTagsInfo200ResponseStatsToday unsubs(Integer unsubs) {
    
    this.unsubs = unsubs;
    return this;
  }

   /**
   * the number of unsubscribes with this tag so far today
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


  public PostTagsInfo200ResponseStatsToday opens(Integer opens) {
    
    this.opens = opens;
    return this;
  }

   /**
   * the number of times emails have been opened with this tag so far today
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


  public PostTagsInfo200ResponseStatsToday uniqueOpens(Integer uniqueOpens) {
    
    this.uniqueOpens = uniqueOpens;
    return this;
  }

   /**
   * the number of unique opens for emails sent with this tag so far today
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


  public PostTagsInfo200ResponseStatsToday clicks(Integer clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * the number of URLs that have been clicked with this tag so far today
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


  public PostTagsInfo200ResponseStatsToday uniqueClicks(Integer uniqueClicks) {
    
    this.uniqueClicks = uniqueClicks;
    return this;
  }

   /**
   * the number of unique clicks for emails sent with this tag so far today
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
    PostTagsInfo200ResponseStatsToday postTagsInfo200ResponseStatsToday = (PostTagsInfo200ResponseStatsToday) o;
    return Objects.equals(this.sent, postTagsInfo200ResponseStatsToday.sent) &&
        Objects.equals(this.hardBounces, postTagsInfo200ResponseStatsToday.hardBounces) &&
        Objects.equals(this.softBounces, postTagsInfo200ResponseStatsToday.softBounces) &&
        Objects.equals(this.rejects, postTagsInfo200ResponseStatsToday.rejects) &&
        Objects.equals(this.complaints, postTagsInfo200ResponseStatsToday.complaints) &&
        Objects.equals(this.unsubs, postTagsInfo200ResponseStatsToday.unsubs) &&
        Objects.equals(this.opens, postTagsInfo200ResponseStatsToday.opens) &&
        Objects.equals(this.uniqueOpens, postTagsInfo200ResponseStatsToday.uniqueOpens) &&
        Objects.equals(this.clicks, postTagsInfo200ResponseStatsToday.clicks) &&
        Objects.equals(this.uniqueClicks, postTagsInfo200ResponseStatsToday.uniqueClicks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sent, hardBounces, softBounces, rejects, complaints, unsubs, opens, uniqueOpens, clicks, uniqueClicks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTagsInfo200ResponseStatsToday {\n");
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

