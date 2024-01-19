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
 * the individual subaccount info
 */
@JsonPropertyOrder({
  PostSubaccountsList200ResponseInner.JSON_PROPERTY_ID,
  PostSubaccountsList200ResponseInner.JSON_PROPERTY_NAME,
  PostSubaccountsList200ResponseInner.JSON_PROPERTY_CUSTOM_QUOTA,
  PostSubaccountsList200ResponseInner.JSON_PROPERTY_STATUS,
  PostSubaccountsList200ResponseInner.JSON_PROPERTY_REPUTATION,
  PostSubaccountsList200ResponseInner.JSON_PROPERTY_CREATED_AT,
  PostSubaccountsList200ResponseInner.JSON_PROPERTY_FIRST_SENT_AT,
  PostSubaccountsList200ResponseInner.JSON_PROPERTY_SENT_WEEKLY,
  PostSubaccountsList200ResponseInner.JSON_PROPERTY_SENT_MONTHLY,
  PostSubaccountsList200ResponseInner.JSON_PROPERTY_SENT_TOTAL
})
@JsonTypeName("postSubaccountsList_200_response_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostSubaccountsList200ResponseInner {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CUSTOM_QUOTA = "custom_quota";
  private Integer customQuota;

  /**
   * the current sending status of the subaccount
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    PAUSED("paused");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_REPUTATION = "reputation";
  private Integer reputation;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_FIRST_SENT_AT = "first_sent_at";
  private OffsetDateTime firstSentAt;

  public static final String JSON_PROPERTY_SENT_WEEKLY = "sent_weekly";
  private Integer sentWeekly;

  public static final String JSON_PROPERTY_SENT_MONTHLY = "sent_monthly";
  private Integer sentMonthly;

  public static final String JSON_PROPERTY_SENT_TOTAL = "sent_total";
  private Integer sentTotal;

  public PostSubaccountsList200ResponseInner() {
  }

  public PostSubaccountsList200ResponseInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * a unique indentifier for the subaccount
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public PostSubaccountsList200ResponseInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * an optional display name for the subaccount
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


  public PostSubaccountsList200ResponseInner customQuota(Integer customQuota) {
    
    this.customQuota = customQuota;
    return this;
  }

   /**
   * an optional manual hourly quota for the subaccount. If not specified, the hourly quota will be managed based on reputation
   * @return customQuota
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCustomQuota() {
    return customQuota;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomQuota(Integer customQuota) {
    this.customQuota = customQuota;
  }


  public PostSubaccountsList200ResponseInner status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * the current sending status of the subaccount
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public PostSubaccountsList200ResponseInner reputation(Integer reputation) {
    
    this.reputation = reputation;
    return this;
  }

   /**
   * the subaccount&#39;s current reputation on a scale from 0 to 100
   * minimum: 0
   * maximum: 100
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


  public PostSubaccountsList200ResponseInner createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * the date and time that the subaccount was created as a UTC string in YYYY-MM-DD HH:MM:SS format
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


  public PostSubaccountsList200ResponseInner firstSentAt(OffsetDateTime firstSentAt) {
    
    this.firstSentAt = firstSentAt;
    return this;
  }

   /**
   * the date and time that the subaccount first sent as a UTC string in YYYY-MM-DD HH:MM:SS format
   * @return firstSentAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_SENT_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFirstSentAt() {
    return firstSentAt;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_SENT_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstSentAt(OffsetDateTime firstSentAt) {
    this.firstSentAt = firstSentAt;
  }


  public PostSubaccountsList200ResponseInner sentWeekly(Integer sentWeekly) {
    
    this.sentWeekly = sentWeekly;
    return this;
  }

   /**
   * the number of emails the subaccount has sent so far this week (weeks start on midnight Monday, UTC)
   * @return sentWeekly
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENT_WEEKLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSentWeekly() {
    return sentWeekly;
  }


  @JsonProperty(JSON_PROPERTY_SENT_WEEKLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentWeekly(Integer sentWeekly) {
    this.sentWeekly = sentWeekly;
  }


  public PostSubaccountsList200ResponseInner sentMonthly(Integer sentMonthly) {
    
    this.sentMonthly = sentMonthly;
    return this;
  }

   /**
   * the number of emails the subaccount has sent so far this month (months start on midnight of the 1st, UTC)
   * @return sentMonthly
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENT_MONTHLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSentMonthly() {
    return sentMonthly;
  }


  @JsonProperty(JSON_PROPERTY_SENT_MONTHLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentMonthly(Integer sentMonthly) {
    this.sentMonthly = sentMonthly;
  }


  public PostSubaccountsList200ResponseInner sentTotal(Integer sentTotal) {
    
    this.sentTotal = sentTotal;
    return this;
  }

   /**
   * the number of emails the subaccount has sent since it was created
   * @return sentTotal
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENT_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSentTotal() {
    return sentTotal;
  }


  @JsonProperty(JSON_PROPERTY_SENT_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentTotal(Integer sentTotal) {
    this.sentTotal = sentTotal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSubaccountsList200ResponseInner postSubaccountsList200ResponseInner = (PostSubaccountsList200ResponseInner) o;
    return Objects.equals(this.id, postSubaccountsList200ResponseInner.id) &&
        Objects.equals(this.name, postSubaccountsList200ResponseInner.name) &&
        Objects.equals(this.customQuota, postSubaccountsList200ResponseInner.customQuota) &&
        Objects.equals(this.status, postSubaccountsList200ResponseInner.status) &&
        Objects.equals(this.reputation, postSubaccountsList200ResponseInner.reputation) &&
        Objects.equals(this.createdAt, postSubaccountsList200ResponseInner.createdAt) &&
        Objects.equals(this.firstSentAt, postSubaccountsList200ResponseInner.firstSentAt) &&
        Objects.equals(this.sentWeekly, postSubaccountsList200ResponseInner.sentWeekly) &&
        Objects.equals(this.sentMonthly, postSubaccountsList200ResponseInner.sentMonthly) &&
        Objects.equals(this.sentTotal, postSubaccountsList200ResponseInner.sentTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, customQuota, status, reputation, createdAt, firstSentAt, sentWeekly, sentMonthly, sentTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSubaccountsList200ResponseInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customQuota: ").append(toIndentedString(customQuota)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reputation: ").append(toIndentedString(reputation)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    firstSentAt: ").append(toIndentedString(firstSentAt)).append("\n");
    sb.append("    sentWeekly: ").append(toIndentedString(sentWeekly)).append("\n");
    sb.append("    sentMonthly: ").append(toIndentedString(sentMonthly)).append("\n");
    sb.append("    sentTotal: ").append(toIndentedString(sentTotal)).append("\n");
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

