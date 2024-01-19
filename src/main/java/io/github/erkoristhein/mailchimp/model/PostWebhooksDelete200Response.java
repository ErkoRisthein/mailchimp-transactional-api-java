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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * the information for the deleted webhook
 */
@JsonPropertyOrder({
  PostWebhooksDelete200Response.JSON_PROPERTY_ID,
  PostWebhooksDelete200Response.JSON_PROPERTY_URL,
  PostWebhooksDelete200Response.JSON_PROPERTY_DESCRIPTION,
  PostWebhooksDelete200Response.JSON_PROPERTY_AUTH_KEY,
  PostWebhooksDelete200Response.JSON_PROPERTY_EVENTS,
  PostWebhooksDelete200Response.JSON_PROPERTY_CREATED_AT,
  PostWebhooksDelete200Response.JSON_PROPERTY_LAST_SENT_AT,
  PostWebhooksDelete200Response.JSON_PROPERTY_BATCHES_SENT,
  PostWebhooksDelete200Response.JSON_PROPERTY_EVENTS_SENT,
  PostWebhooksDelete200Response.JSON_PROPERTY_LAST_ERROR
})
@JsonTypeName("postWebhooksDelete_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostWebhooksDelete200Response {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_AUTH_KEY = "auth_key";
  private String authKey;

  /**
   * the individual message event
   */
  public enum EventsEnum {
    SEND("send"),
    
    HARD_BOUNCE("hard_bounce"),
    
    SOFT_BOUNCE("soft_bounce"),
    
    OPEN("open"),
    
    CLICK("click"),
    
    SPAM("spam"),
    
    UNSUB("unsub"),
    
    REJECT("reject");

    private String value;

    EventsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventsEnum fromValue(String value) {
      for (EventsEnum b : EventsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<EventsEnum> events;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_LAST_SENT_AT = "last_sent_at";
  private OffsetDateTime lastSentAt;

  public static final String JSON_PROPERTY_BATCHES_SENT = "batches_sent";
  private Integer batchesSent;

  public static final String JSON_PROPERTY_EVENTS_SENT = "events_sent";
  private Integer eventsSent;

  public static final String JSON_PROPERTY_LAST_ERROR = "last_error";
  private String lastError;

  public PostWebhooksDelete200Response() {
  }

  public PostWebhooksDelete200Response id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * a unique integer indentifier for the webhook
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public PostWebhooksDelete200Response url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL that the event data will be posted to
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public PostWebhooksDelete200Response description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * a description of the webhook
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public PostWebhooksDelete200Response authKey(String authKey) {
    
    this.authKey = authKey;
    return this;
  }

   /**
   * the key used to requests for this webhook
   * @return authKey
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthKey() {
    return authKey;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthKey(String authKey) {
    this.authKey = authKey;
  }


  public PostWebhooksDelete200Response events(List<EventsEnum> events) {
    
    this.events = events;
    return this;
  }

  public PostWebhooksDelete200Response addEventsItem(EventsEnum eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * The message events that will be posted to the hook
   * @return events
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EventsEnum> getEvents() {
    return events;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvents(List<EventsEnum> events) {
    this.events = events;
  }


  public PostWebhooksDelete200Response createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * the date and time that the webhook was created as a UTC string in YYYY-MM-DD HH:MM:SS format
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


  public PostWebhooksDelete200Response lastSentAt(OffsetDateTime lastSentAt) {
    
    this.lastSentAt = lastSentAt;
    return this;
  }

   /**
   * the date and time that the webhook last successfully received events as a UTC string in YYYY-MM-DD HH:MM:SS format
   * @return lastSentAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SENT_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastSentAt() {
    return lastSentAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_SENT_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastSentAt(OffsetDateTime lastSentAt) {
    this.lastSentAt = lastSentAt;
  }


  public PostWebhooksDelete200Response batchesSent(Integer batchesSent) {
    
    this.batchesSent = batchesSent;
    return this;
  }

   /**
   * the number of event batches that have ever been sent to this webhook
   * @return batchesSent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCHES_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBatchesSent() {
    return batchesSent;
  }


  @JsonProperty(JSON_PROPERTY_BATCHES_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatchesSent(Integer batchesSent) {
    this.batchesSent = batchesSent;
  }


  public PostWebhooksDelete200Response eventsSent(Integer eventsSent) {
    
    this.eventsSent = eventsSent;
    return this;
  }

   /**
   * the total number of events that have ever been sent to this webhook
   * @return eventsSent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENTS_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEventsSent() {
    return eventsSent;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventsSent(Integer eventsSent) {
    this.eventsSent = eventsSent;
  }


  public PostWebhooksDelete200Response lastError(String lastError) {
    
    this.lastError = lastError;
    return this;
  }

   /**
   * if we&#39;ve ever gotten an error trying to post to this webhook, the last error that we&#39;ve seen
   * @return lastError
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastError() {
    return lastError;
  }


  @JsonProperty(JSON_PROPERTY_LAST_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastError(String lastError) {
    this.lastError = lastError;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostWebhooksDelete200Response postWebhooksDelete200Response = (PostWebhooksDelete200Response) o;
    return Objects.equals(this.id, postWebhooksDelete200Response.id) &&
        Objects.equals(this.url, postWebhooksDelete200Response.url) &&
        Objects.equals(this.description, postWebhooksDelete200Response.description) &&
        Objects.equals(this.authKey, postWebhooksDelete200Response.authKey) &&
        Objects.equals(this.events, postWebhooksDelete200Response.events) &&
        Objects.equals(this.createdAt, postWebhooksDelete200Response.createdAt) &&
        Objects.equals(this.lastSentAt, postWebhooksDelete200Response.lastSentAt) &&
        Objects.equals(this.batchesSent, postWebhooksDelete200Response.batchesSent) &&
        Objects.equals(this.eventsSent, postWebhooksDelete200Response.eventsSent) &&
        Objects.equals(this.lastError, postWebhooksDelete200Response.lastError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, description, authKey, events, createdAt, lastSentAt, batchesSent, eventsSent, lastError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostWebhooksDelete200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastSentAt: ").append(toIndentedString(lastSentAt)).append("\n");
    sb.append("    batchesSent: ").append(toIndentedString(batchesSent)).append("\n");
    sb.append("    eventsSent: ").append(toIndentedString(eventsSent)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
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

