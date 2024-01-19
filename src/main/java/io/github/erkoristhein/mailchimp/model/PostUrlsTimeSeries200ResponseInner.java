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
 * the information for a single hour
 */
@JsonPropertyOrder({
  PostUrlsTimeSeries200ResponseInner.JSON_PROPERTY_TIME,
  PostUrlsTimeSeries200ResponseInner.JSON_PROPERTY_SENT,
  PostUrlsTimeSeries200ResponseInner.JSON_PROPERTY_CLICKS,
  PostUrlsTimeSeries200ResponseInner.JSON_PROPERTY_UNIQUE_CLICKS
})
@JsonTypeName("postUrlsTimeSeries_200_response_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostUrlsTimeSeries200ResponseInner {
  public static final String JSON_PROPERTY_TIME = "time";
  private OffsetDateTime time;

  public static final String JSON_PROPERTY_SENT = "sent";
  private Integer sent;

  public static final String JSON_PROPERTY_CLICKS = "clicks";
  private Integer clicks;

  public static final String JSON_PROPERTY_UNIQUE_CLICKS = "unique_clicks";
  private Integer uniqueClicks;

  public PostUrlsTimeSeries200ResponseInner() {
  }

  public PostUrlsTimeSeries200ResponseInner time(OffsetDateTime time) {
    
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


  public PostUrlsTimeSeries200ResponseInner sent(Integer sent) {
    
    this.sent = sent;
    return this;
  }

   /**
   * the number of emails that were sent with the URL during the hour
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


  public PostUrlsTimeSeries200ResponseInner clicks(Integer clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * the number of times the URL was clicked during the hour
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


  public PostUrlsTimeSeries200ResponseInner uniqueClicks(Integer uniqueClicks) {
    
    this.uniqueClicks = uniqueClicks;
    return this;
  }

   /**
   * the number of unique clicks generated for emails sent with this URL during the hour
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
    PostUrlsTimeSeries200ResponseInner postUrlsTimeSeries200ResponseInner = (PostUrlsTimeSeries200ResponseInner) o;
    return Objects.equals(this.time, postUrlsTimeSeries200ResponseInner.time) &&
        Objects.equals(this.sent, postUrlsTimeSeries200ResponseInner.sent) &&
        Objects.equals(this.clicks, postUrlsTimeSeries200ResponseInner.clicks) &&
        Objects.equals(this.uniqueClicks, postUrlsTimeSeries200ResponseInner.uniqueClicks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, sent, clicks, uniqueClicks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUrlsTimeSeries200ResponseInner {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
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
