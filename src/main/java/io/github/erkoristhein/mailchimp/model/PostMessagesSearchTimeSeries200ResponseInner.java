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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * the stats for a single hour
 */
@JsonPropertyOrder({
  PostMessagesSearchTimeSeries200ResponseInner.JSON_PROPERTY_TIME,
  PostMessagesSearchTimeSeries200ResponseInner.JSON_PROPERTY_SENT,
  PostMessagesSearchTimeSeries200ResponseInner.JSON_PROPERTY_HARD_BOUNCES,
  PostMessagesSearchTimeSeries200ResponseInner.JSON_PROPERTY_SOFT_BOUNCES,
  PostMessagesSearchTimeSeries200ResponseInner.JSON_PROPERTY_REJECTS,
  PostMessagesSearchTimeSeries200ResponseInner.JSON_PROPERTY_COMPLAINTS,
  PostMessagesSearchTimeSeries200ResponseInner.JSON_PROPERTY_UNSUBS,
  PostMessagesSearchTimeSeries200ResponseInner.JSON_PROPERTY_OPENS,
  PostMessagesSearchTimeSeries200ResponseInner.JSON_PROPERTY_UNIQUE_OPENS,
  PostMessagesSearchTimeSeries200ResponseInner.JSON_PROPERTY_CLICKS,
  PostMessagesSearchTimeSeries200ResponseInner.JSON_PROPERTY_UNIQUE_CLICKS
})
@JsonTypeName("postMessagesSearchTimeSeries_200_response_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostMessagesSearchTimeSeries200ResponseInner {
  public static final String JSON_PROPERTY_TIME = "time";
  private OffsetDateTime time;

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

  public PostMessagesSearchTimeSeries200ResponseInner() {
  }

  public PostMessagesSearchTimeSeries200ResponseInner time(OffsetDateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * the hour as a UTC date string in YYYY-MM-DD HH:MM:SS format
   * @return time
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  public PostMessagesSearchTimeSeries200ResponseInner sent(Integer sent) {
    
    this.sent = sent;
    return this;
  }

   /**
   * the number of emails that were sent during the hour
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


  public PostMessagesSearchTimeSeries200ResponseInner hardBounces(Integer hardBounces) {
    
    this.hardBounces = hardBounces;
    return this;
  }

   /**
   * the number of emails that hard bounced during the hour
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


  public PostMessagesSearchTimeSeries200ResponseInner softBounces(Integer softBounces) {
    
    this.softBounces = softBounces;
    return this;
  }

   /**
   * the number of emails that soft bounced during the hour
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


  public PostMessagesSearchTimeSeries200ResponseInner rejects(Integer rejects) {
    
    this.rejects = rejects;
    return this;
  }

   /**
   * the number of emails that were rejected during the hour
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


  public PostMessagesSearchTimeSeries200ResponseInner complaints(Integer complaints) {
    
    this.complaints = complaints;
    return this;
  }

   /**
   * the number of spam complaints received during the hour
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


  public PostMessagesSearchTimeSeries200ResponseInner unsubs(Integer unsubs) {
    
    this.unsubs = unsubs;
    return this;
  }

   /**
   * the number of unsubscribes received during the hour
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


  public PostMessagesSearchTimeSeries200ResponseInner opens(Integer opens) {
    
    this.opens = opens;
    return this;
  }

   /**
   * the number of emails opened during the hour
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


  public PostMessagesSearchTimeSeries200ResponseInner uniqueOpens(Integer uniqueOpens) {
    
    this.uniqueOpens = uniqueOpens;
    return this;
  }

   /**
   * the number of unique opens generated by messages sent during the hour
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


  public PostMessagesSearchTimeSeries200ResponseInner clicks(Integer clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * the number of tracked URLs clicked during the hour
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


  public PostMessagesSearchTimeSeries200ResponseInner uniqueClicks(Integer uniqueClicks) {
    
    this.uniqueClicks = uniqueClicks;
    return this;
  }

   /**
   * the number of unique clicks generated by messages sent during the hour
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
    PostMessagesSearchTimeSeries200ResponseInner postMessagesSearchTimeSeries200ResponseInner = (PostMessagesSearchTimeSeries200ResponseInner) o;
    return Objects.equals(this.time, postMessagesSearchTimeSeries200ResponseInner.time) &&
        Objects.equals(this.sent, postMessagesSearchTimeSeries200ResponseInner.sent) &&
        Objects.equals(this.hardBounces, postMessagesSearchTimeSeries200ResponseInner.hardBounces) &&
        Objects.equals(this.softBounces, postMessagesSearchTimeSeries200ResponseInner.softBounces) &&
        Objects.equals(this.rejects, postMessagesSearchTimeSeries200ResponseInner.rejects) &&
        Objects.equals(this.complaints, postMessagesSearchTimeSeries200ResponseInner.complaints) &&
        Objects.equals(this.unsubs, postMessagesSearchTimeSeries200ResponseInner.unsubs) &&
        Objects.equals(this.opens, postMessagesSearchTimeSeries200ResponseInner.opens) &&
        Objects.equals(this.uniqueOpens, postMessagesSearchTimeSeries200ResponseInner.uniqueOpens) &&
        Objects.equals(this.clicks, postMessagesSearchTimeSeries200ResponseInner.clicks) &&
        Objects.equals(this.uniqueClicks, postMessagesSearchTimeSeries200ResponseInner.uniqueClicks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, sent, hardBounces, softBounces, rejects, complaints, unsubs, opens, uniqueOpens, clicks, uniqueClicks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMessagesSearchTimeSeries200ResponseInner {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

