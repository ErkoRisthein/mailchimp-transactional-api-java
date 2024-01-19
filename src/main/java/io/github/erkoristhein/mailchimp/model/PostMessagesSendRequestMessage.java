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
import io.github.erkoristhein.mailchimp.model.PostMessagesSendRequestMessageAttachmentsInner;
import io.github.erkoristhein.mailchimp.model.PostMessagesSendRequestMessageGlobalMergeVarsInner;
import io.github.erkoristhein.mailchimp.model.PostMessagesSendRequestMessageImagesInner;
import io.github.erkoristhein.mailchimp.model.PostMessagesSendRequestMessageMergeVarsInner;
import io.github.erkoristhein.mailchimp.model.PostMessagesSendRequestMessageMetadata;
import io.github.erkoristhein.mailchimp.model.PostMessagesSendRequestMessageRecipientMetadataInner;
import io.github.erkoristhein.mailchimp.model.PostMessagesSendRequestMessageToInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * the information on the message to send
 */
@JsonPropertyOrder({
  PostMessagesSendRequestMessage.JSON_PROPERTY_HTML,
  PostMessagesSendRequestMessage.JSON_PROPERTY_TEXT,
  PostMessagesSendRequestMessage.JSON_PROPERTY_SUBJECT,
  PostMessagesSendRequestMessage.JSON_PROPERTY_FROM_EMAIL,
  PostMessagesSendRequestMessage.JSON_PROPERTY_FROM_NAME,
  PostMessagesSendRequestMessage.JSON_PROPERTY_TO,
  PostMessagesSendRequestMessage.JSON_PROPERTY_HEADERS,
  PostMessagesSendRequestMessage.JSON_PROPERTY_IMPORTANT,
  PostMessagesSendRequestMessage.JSON_PROPERTY_TRACK_OPENS,
  PostMessagesSendRequestMessage.JSON_PROPERTY_TRACK_CLICKS,
  PostMessagesSendRequestMessage.JSON_PROPERTY_AUTO_TEXT,
  PostMessagesSendRequestMessage.JSON_PROPERTY_AUTO_HTML,
  PostMessagesSendRequestMessage.JSON_PROPERTY_INLINE_CSS,
  PostMessagesSendRequestMessage.JSON_PROPERTY_URL_STRIP_QS,
  PostMessagesSendRequestMessage.JSON_PROPERTY_PRESERVE_RECIPIENTS,
  PostMessagesSendRequestMessage.JSON_PROPERTY_VIEW_CONTENT_LINK,
  PostMessagesSendRequestMessage.JSON_PROPERTY_BCC_ADDRESS,
  PostMessagesSendRequestMessage.JSON_PROPERTY_TRACKING_DOMAIN,
  PostMessagesSendRequestMessage.JSON_PROPERTY_SIGNING_DOMAIN,
  PostMessagesSendRequestMessage.JSON_PROPERTY_RETURN_PATH_DOMAIN,
  PostMessagesSendRequestMessage.JSON_PROPERTY_MERGE,
  PostMessagesSendRequestMessage.JSON_PROPERTY_MERGE_LANGUAGE,
  PostMessagesSendRequestMessage.JSON_PROPERTY_GLOBAL_MERGE_VARS,
  PostMessagesSendRequestMessage.JSON_PROPERTY_MERGE_VARS,
  PostMessagesSendRequestMessage.JSON_PROPERTY_TAGS,
  PostMessagesSendRequestMessage.JSON_PROPERTY_SUBACCOUNT,
  PostMessagesSendRequestMessage.JSON_PROPERTY_GOOGLE_ANALYTICS_DOMAINS,
  PostMessagesSendRequestMessage.JSON_PROPERTY_GOOGLE_ANALYTICS_CAMPAIGN,
  PostMessagesSendRequestMessage.JSON_PROPERTY_METADATA,
  PostMessagesSendRequestMessage.JSON_PROPERTY_RECIPIENT_METADATA,
  PostMessagesSendRequestMessage.JSON_PROPERTY_ATTACHMENTS,
  PostMessagesSendRequestMessage.JSON_PROPERTY_IMAGES
})
@JsonTypeName("postMessagesSend_request_message")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostMessagesSendRequestMessage {
  public static final String JSON_PROPERTY_HTML = "html";
  private String html;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_FROM_EMAIL = "from_email";
  private String fromEmail;

  public static final String JSON_PROPERTY_FROM_NAME = "from_name";
  private String fromName;

  public static final String JSON_PROPERTY_TO = "to";
  private List<PostMessagesSendRequestMessageToInner> to;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private Object headers;

  public static final String JSON_PROPERTY_IMPORTANT = "important";
  private Boolean important;

  public static final String JSON_PROPERTY_TRACK_OPENS = "track_opens";
  private Boolean trackOpens;

  public static final String JSON_PROPERTY_TRACK_CLICKS = "track_clicks";
  private Boolean trackClicks;

  public static final String JSON_PROPERTY_AUTO_TEXT = "auto_text";
  private Boolean autoText;

  public static final String JSON_PROPERTY_AUTO_HTML = "auto_html";
  private Boolean autoHtml;

  public static final String JSON_PROPERTY_INLINE_CSS = "inline_css";
  private Boolean inlineCss;

  public static final String JSON_PROPERTY_URL_STRIP_QS = "url_strip_qs";
  private Boolean urlStripQs;

  public static final String JSON_PROPERTY_PRESERVE_RECIPIENTS = "preserve_recipients";
  private Boolean preserveRecipients;

  public static final String JSON_PROPERTY_VIEW_CONTENT_LINK = "view_content_link";
  private Boolean viewContentLink;

  public static final String JSON_PROPERTY_BCC_ADDRESS = "bcc_address";
  private String bccAddress;

  public static final String JSON_PROPERTY_TRACKING_DOMAIN = "tracking_domain";
  private String trackingDomain;

  public static final String JSON_PROPERTY_SIGNING_DOMAIN = "signing_domain";
  private String signingDomain;

  public static final String JSON_PROPERTY_RETURN_PATH_DOMAIN = "return_path_domain";
  private String returnPathDomain;

  public static final String JSON_PROPERTY_MERGE = "merge";
  private Boolean merge;

  /**
   * the merge tag language to use when evaluating merge tags, either mailchimp or handlebars
   */
  public enum MergeLanguageEnum {
    MAILCHIMP("mailchimp"),
    
    HANDLEBARS("handlebars");

    private String value;

    MergeLanguageEnum(String value) {
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
    public static MergeLanguageEnum fromValue(String value) {
      for (MergeLanguageEnum b : MergeLanguageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MERGE_LANGUAGE = "merge_language";
  private MergeLanguageEnum mergeLanguage;

  public static final String JSON_PROPERTY_GLOBAL_MERGE_VARS = "global_merge_vars";
  private List<PostMessagesSendRequestMessageGlobalMergeVarsInner> globalMergeVars;

  public static final String JSON_PROPERTY_MERGE_VARS = "merge_vars";
  private List<PostMessagesSendRequestMessageMergeVarsInner> mergeVars;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags;

  public static final String JSON_PROPERTY_SUBACCOUNT = "subaccount";
  private String subaccount;

  public static final String JSON_PROPERTY_GOOGLE_ANALYTICS_DOMAINS = "google_analytics_domains";
  private List<String> googleAnalyticsDomains;

  public static final String JSON_PROPERTY_GOOGLE_ANALYTICS_CAMPAIGN = "google_analytics_campaign";
  private String googleAnalyticsCampaign;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private PostMessagesSendRequestMessageMetadata metadata;

  public static final String JSON_PROPERTY_RECIPIENT_METADATA = "recipient_metadata";
  private List<PostMessagesSendRequestMessageRecipientMetadataInner> recipientMetadata;

  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  private List<PostMessagesSendRequestMessageAttachmentsInner> attachments;

  public static final String JSON_PROPERTY_IMAGES = "images";
  private List<PostMessagesSendRequestMessageImagesInner> images;

  public PostMessagesSendRequestMessage() {
  }

  public PostMessagesSendRequestMessage html(String html) {
    
    this.html = html;
    return this;
  }

   /**
   * the full HTML content to be sent
   * @return html
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtml() {
    return html;
  }


  @JsonProperty(JSON_PROPERTY_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtml(String html) {
    this.html = html;
  }


  public PostMessagesSendRequestMessage text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * optional full text content to be sent
   * @return text
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  public PostMessagesSendRequestMessage subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * the message subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public PostMessagesSendRequestMessage fromEmail(String fromEmail) {
    
    this.fromEmail = fromEmail;
    return this;
  }

   /**
   * the sender email address
   * @return fromEmail
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromEmail() {
    return fromEmail;
  }


  @JsonProperty(JSON_PROPERTY_FROM_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
  }


  public PostMessagesSendRequestMessage fromName(String fromName) {
    
    this.fromName = fromName;
    return this;
  }

   /**
   * optional from name to be used
   * @return fromName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromName() {
    return fromName;
  }


  @JsonProperty(JSON_PROPERTY_FROM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromName(String fromName) {
    this.fromName = fromName;
  }


  public PostMessagesSendRequestMessage to(List<PostMessagesSendRequestMessageToInner> to) {
    
    this.to = to;
    return this;
  }

  public PostMessagesSendRequestMessage addToItem(PostMessagesSendRequestMessageToInner toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * an array of recipient information.
   * @return to
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PostMessagesSendRequestMessageToInner> getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTo(List<PostMessagesSendRequestMessageToInner> to) {
    this.to = to;
  }


  public PostMessagesSendRequestMessage headers(Object headers) {
    
    this.headers = headers;
    return this;
  }

   /**
   * optional extra headers to add to the message (most headers are allowed)
   * @return headers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getHeaders() {
    return headers;
  }


  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaders(Object headers) {
    this.headers = headers;
  }


  public PostMessagesSendRequestMessage important(Boolean important) {
    
    this.important = important;
    return this;
  }

   /**
   * whether or not this message is important, and should be delivered ahead of non-important messages
   * @return important
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPORTANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getImportant() {
    return important;
  }


  @JsonProperty(JSON_PROPERTY_IMPORTANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImportant(Boolean important) {
    this.important = important;
  }


  public PostMessagesSendRequestMessage trackOpens(Boolean trackOpens) {
    
    this.trackOpens = trackOpens;
    return this;
  }

   /**
   * whether or not to turn on open tracking for the message
   * @return trackOpens
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACK_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTrackOpens() {
    return trackOpens;
  }


  @JsonProperty(JSON_PROPERTY_TRACK_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackOpens(Boolean trackOpens) {
    this.trackOpens = trackOpens;
  }


  public PostMessagesSendRequestMessage trackClicks(Boolean trackClicks) {
    
    this.trackClicks = trackClicks;
    return this;
  }

   /**
   * whether or not to turn on click tracking for the message
   * @return trackClicks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACK_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTrackClicks() {
    return trackClicks;
  }


  @JsonProperty(JSON_PROPERTY_TRACK_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackClicks(Boolean trackClicks) {
    this.trackClicks = trackClicks;
  }


  public PostMessagesSendRequestMessage autoText(Boolean autoText) {
    
    this.autoText = autoText;
    return this;
  }

   /**
   * whether or not to automatically generate a text part for messages that are not given text
   * @return autoText
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoText() {
    return autoText;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoText(Boolean autoText) {
    this.autoText = autoText;
  }


  public PostMessagesSendRequestMessage autoHtml(Boolean autoHtml) {
    
    this.autoHtml = autoHtml;
    return this;
  }

   /**
   * whether or not to automatically generate an HTML part for messages that are not given HTML
   * @return autoHtml
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoHtml() {
    return autoHtml;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoHtml(Boolean autoHtml) {
    this.autoHtml = autoHtml;
  }


  public PostMessagesSendRequestMessage inlineCss(Boolean inlineCss) {
    
    this.inlineCss = inlineCss;
    return this;
  }

   /**
   * whether or not to automatically inline all CSS styles provided in the message HTML - only for HTML documents less than 256KB in size
   * @return inlineCss
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INLINE_CSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInlineCss() {
    return inlineCss;
  }


  @JsonProperty(JSON_PROPERTY_INLINE_CSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInlineCss(Boolean inlineCss) {
    this.inlineCss = inlineCss;
  }


  public PostMessagesSendRequestMessage urlStripQs(Boolean urlStripQs) {
    
    this.urlStripQs = urlStripQs;
    return this;
  }

   /**
   * whether or not to strip the query string from URLs when aggregating tracked URL data
   * @return urlStripQs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL_STRIP_QS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUrlStripQs() {
    return urlStripQs;
  }


  @JsonProperty(JSON_PROPERTY_URL_STRIP_QS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlStripQs(Boolean urlStripQs) {
    this.urlStripQs = urlStripQs;
  }


  public PostMessagesSendRequestMessage preserveRecipients(Boolean preserveRecipients) {
    
    this.preserveRecipients = preserveRecipients;
    return this;
  }

   /**
   * whether or not to expose all recipients in to \&quot;To\&quot; header for each email
   * @return preserveRecipients
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRESERVE_RECIPIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPreserveRecipients() {
    return preserveRecipients;
  }


  @JsonProperty(JSON_PROPERTY_PRESERVE_RECIPIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreserveRecipients(Boolean preserveRecipients) {
    this.preserveRecipients = preserveRecipients;
  }


  public PostMessagesSendRequestMessage viewContentLink(Boolean viewContentLink) {
    
    this.viewContentLink = viewContentLink;
    return this;
  }

   /**
   * set to false to remove content logging for sensitive emails
   * @return viewContentLink
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEW_CONTENT_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getViewContentLink() {
    return viewContentLink;
  }


  @JsonProperty(JSON_PROPERTY_VIEW_CONTENT_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewContentLink(Boolean viewContentLink) {
    this.viewContentLink = viewContentLink;
  }


  public PostMessagesSendRequestMessage bccAddress(String bccAddress) {
    
    this.bccAddress = bccAddress;
    return this;
  }

   /**
   * an optional address to receive an exact copy of each recipient&#39;s email
   * @return bccAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BCC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBccAddress() {
    return bccAddress;
  }


  @JsonProperty(JSON_PROPERTY_BCC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBccAddress(String bccAddress) {
    this.bccAddress = bccAddress;
  }


  public PostMessagesSendRequestMessage trackingDomain(String trackingDomain) {
    
    this.trackingDomain = trackingDomain;
    return this;
  }

   /**
   * a custom domain to use for tracking opens and clicks instead of mandrillapp.com
   * @return trackingDomain
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKING_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingDomain() {
    return trackingDomain;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingDomain(String trackingDomain) {
    this.trackingDomain = trackingDomain;
  }


  public PostMessagesSendRequestMessage signingDomain(String signingDomain) {
    
    this.signingDomain = signingDomain;
    return this;
  }

   /**
   * a custom domain to use for SPF/DKIM signing instead of mandrill (for \&quot;via\&quot; or \&quot;on behalf of\&quot; in email clients)
   * @return signingDomain
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNING_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSigningDomain() {
    return signingDomain;
  }


  @JsonProperty(JSON_PROPERTY_SIGNING_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSigningDomain(String signingDomain) {
    this.signingDomain = signingDomain;
  }


  public PostMessagesSendRequestMessage returnPathDomain(String returnPathDomain) {
    
    this.returnPathDomain = returnPathDomain;
    return this;
  }

   /**
   * a custom domain to use for the messages&#39;s return-path
   * @return returnPathDomain
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_PATH_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReturnPathDomain() {
    return returnPathDomain;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_PATH_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnPathDomain(String returnPathDomain) {
    this.returnPathDomain = returnPathDomain;
  }


  public PostMessagesSendRequestMessage merge(Boolean merge) {
    
    this.merge = merge;
    return this;
  }

   /**
   * whether to evaluate merge tags in the message. Will automatically be set to true if either merge_vars or global_merge_vars are provided.
   * @return merge
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMerge() {
    return merge;
  }


  @JsonProperty(JSON_PROPERTY_MERGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerge(Boolean merge) {
    this.merge = merge;
  }


  public PostMessagesSendRequestMessage mergeLanguage(MergeLanguageEnum mergeLanguage) {
    
    this.mergeLanguage = mergeLanguage;
    return this;
  }

   /**
   * the merge tag language to use when evaluating merge tags, either mailchimp or handlebars
   * @return mergeLanguage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERGE_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MergeLanguageEnum getMergeLanguage() {
    return mergeLanguage;
  }


  @JsonProperty(JSON_PROPERTY_MERGE_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMergeLanguage(MergeLanguageEnum mergeLanguage) {
    this.mergeLanguage = mergeLanguage;
  }


  public PostMessagesSendRequestMessage globalMergeVars(List<PostMessagesSendRequestMessageGlobalMergeVarsInner> globalMergeVars) {
    
    this.globalMergeVars = globalMergeVars;
    return this;
  }

  public PostMessagesSendRequestMessage addGlobalMergeVarsItem(PostMessagesSendRequestMessageGlobalMergeVarsInner globalMergeVarsItem) {
    if (this.globalMergeVars == null) {
      this.globalMergeVars = new ArrayList<>();
    }
    this.globalMergeVars.add(globalMergeVarsItem);
    return this;
  }

   /**
   * global merge variables to use for all recipients. You can override these per recipient.
   * @return globalMergeVars
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_MERGE_VARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PostMessagesSendRequestMessageGlobalMergeVarsInner> getGlobalMergeVars() {
    return globalMergeVars;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_MERGE_VARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobalMergeVars(List<PostMessagesSendRequestMessageGlobalMergeVarsInner> globalMergeVars) {
    this.globalMergeVars = globalMergeVars;
  }


  public PostMessagesSendRequestMessage mergeVars(List<PostMessagesSendRequestMessageMergeVarsInner> mergeVars) {
    
    this.mergeVars = mergeVars;
    return this;
  }

  public PostMessagesSendRequestMessage addMergeVarsItem(PostMessagesSendRequestMessageMergeVarsInner mergeVarsItem) {
    if (this.mergeVars == null) {
      this.mergeVars = new ArrayList<>();
    }
    this.mergeVars.add(mergeVarsItem);
    return this;
  }

   /**
   * per-recipient merge variables, which override global merge variables with the same name.
   * @return mergeVars
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERGE_VARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PostMessagesSendRequestMessageMergeVarsInner> getMergeVars() {
    return mergeVars;
  }


  @JsonProperty(JSON_PROPERTY_MERGE_VARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMergeVars(List<PostMessagesSendRequestMessageMergeVarsInner> mergeVars) {
    this.mergeVars = mergeVars;
  }


  public PostMessagesSendRequestMessage tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public PostMessagesSendRequestMessage addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * an array of string to tag the message with. Stats are accumulated using tags, though we only store the first 100 we see, so this should not be unique or change frequently. Tags should be 50 characters or less. Any tags starting with an underscore are reserved for internal use and will cause errors.
   * @return tags
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public PostMessagesSendRequestMessage subaccount(String subaccount) {
    
    this.subaccount = subaccount;
    return this;
  }

   /**
   * the unique id of a subaccount for this message - must already exist or will fail with an error
   * @return subaccount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubaccount() {
    return subaccount;
  }


  @JsonProperty(JSON_PROPERTY_SUBACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubaccount(String subaccount) {
    this.subaccount = subaccount;
  }


  public PostMessagesSendRequestMessage googleAnalyticsDomains(List<String> googleAnalyticsDomains) {
    
    this.googleAnalyticsDomains = googleAnalyticsDomains;
    return this;
  }

  public PostMessagesSendRequestMessage addGoogleAnalyticsDomainsItem(String googleAnalyticsDomainsItem) {
    if (this.googleAnalyticsDomains == null) {
      this.googleAnalyticsDomains = new ArrayList<>();
    }
    this.googleAnalyticsDomains.add(googleAnalyticsDomainsItem);
    return this;
  }

   /**
   * an array of strings indicating for which any matching URLs will automatically have Google Analytics parameters appended to their query string automatically.
   * @return googleAnalyticsDomains
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GOOGLE_ANALYTICS_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getGoogleAnalyticsDomains() {
    return googleAnalyticsDomains;
  }


  @JsonProperty(JSON_PROPERTY_GOOGLE_ANALYTICS_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoogleAnalyticsDomains(List<String> googleAnalyticsDomains) {
    this.googleAnalyticsDomains = googleAnalyticsDomains;
  }


  public PostMessagesSendRequestMessage googleAnalyticsCampaign(String googleAnalyticsCampaign) {
    
    this.googleAnalyticsCampaign = googleAnalyticsCampaign;
    return this;
  }

   /**
   * optional string indicating the value to set for the utm_campaign tracking parameter. If this isn&#39;t provided the email&#39;s from address will be used instead.
   * @return googleAnalyticsCampaign
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GOOGLE_ANALYTICS_CAMPAIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGoogleAnalyticsCampaign() {
    return googleAnalyticsCampaign;
  }


  @JsonProperty(JSON_PROPERTY_GOOGLE_ANALYTICS_CAMPAIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoogleAnalyticsCampaign(String googleAnalyticsCampaign) {
    this.googleAnalyticsCampaign = googleAnalyticsCampaign;
  }


  public PostMessagesSendRequestMessage metadata(PostMessagesSendRequestMessageMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostMessagesSendRequestMessageMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(PostMessagesSendRequestMessageMetadata metadata) {
    this.metadata = metadata;
  }


  public PostMessagesSendRequestMessage recipientMetadata(List<PostMessagesSendRequestMessageRecipientMetadataInner> recipientMetadata) {
    
    this.recipientMetadata = recipientMetadata;
    return this;
  }

  public PostMessagesSendRequestMessage addRecipientMetadataItem(PostMessagesSendRequestMessageRecipientMetadataInner recipientMetadataItem) {
    if (this.recipientMetadata == null) {
      this.recipientMetadata = new ArrayList<>();
    }
    this.recipientMetadata.add(recipientMetadataItem);
    return this;
  }

   /**
   * Per-recipient metadata that will override the global values specified in the metadata parameter.
   * @return recipientMetadata
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PostMessagesSendRequestMessageRecipientMetadataInner> getRecipientMetadata() {
    return recipientMetadata;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipientMetadata(List<PostMessagesSendRequestMessageRecipientMetadataInner> recipientMetadata) {
    this.recipientMetadata = recipientMetadata;
  }


  public PostMessagesSendRequestMessage attachments(List<PostMessagesSendRequestMessageAttachmentsInner> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public PostMessagesSendRequestMessage addAttachmentsItem(PostMessagesSendRequestMessageAttachmentsInner attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * an array of supported attachments to add to the message
   * @return attachments
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PostMessagesSendRequestMessageAttachmentsInner> getAttachments() {
    return attachments;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachments(List<PostMessagesSendRequestMessageAttachmentsInner> attachments) {
    this.attachments = attachments;
  }


  public PostMessagesSendRequestMessage images(List<PostMessagesSendRequestMessageImagesInner> images) {
    
    this.images = images;
    return this;
  }

  public PostMessagesSendRequestMessage addImagesItem(PostMessagesSendRequestMessageImagesInner imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * an array of embedded images to add to the message
   * @return images
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PostMessagesSendRequestMessageImagesInner> getImages() {
    return images;
  }


  @JsonProperty(JSON_PROPERTY_IMAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImages(List<PostMessagesSendRequestMessageImagesInner> images) {
    this.images = images;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostMessagesSendRequestMessage postMessagesSendRequestMessage = (PostMessagesSendRequestMessage) o;
    return Objects.equals(this.html, postMessagesSendRequestMessage.html) &&
        Objects.equals(this.text, postMessagesSendRequestMessage.text) &&
        Objects.equals(this.subject, postMessagesSendRequestMessage.subject) &&
        Objects.equals(this.fromEmail, postMessagesSendRequestMessage.fromEmail) &&
        Objects.equals(this.fromName, postMessagesSendRequestMessage.fromName) &&
        Objects.equals(this.to, postMessagesSendRequestMessage.to) &&
        Objects.equals(this.headers, postMessagesSendRequestMessage.headers) &&
        Objects.equals(this.important, postMessagesSendRequestMessage.important) &&
        Objects.equals(this.trackOpens, postMessagesSendRequestMessage.trackOpens) &&
        Objects.equals(this.trackClicks, postMessagesSendRequestMessage.trackClicks) &&
        Objects.equals(this.autoText, postMessagesSendRequestMessage.autoText) &&
        Objects.equals(this.autoHtml, postMessagesSendRequestMessage.autoHtml) &&
        Objects.equals(this.inlineCss, postMessagesSendRequestMessage.inlineCss) &&
        Objects.equals(this.urlStripQs, postMessagesSendRequestMessage.urlStripQs) &&
        Objects.equals(this.preserveRecipients, postMessagesSendRequestMessage.preserveRecipients) &&
        Objects.equals(this.viewContentLink, postMessagesSendRequestMessage.viewContentLink) &&
        Objects.equals(this.bccAddress, postMessagesSendRequestMessage.bccAddress) &&
        Objects.equals(this.trackingDomain, postMessagesSendRequestMessage.trackingDomain) &&
        Objects.equals(this.signingDomain, postMessagesSendRequestMessage.signingDomain) &&
        Objects.equals(this.returnPathDomain, postMessagesSendRequestMessage.returnPathDomain) &&
        Objects.equals(this.merge, postMessagesSendRequestMessage.merge) &&
        Objects.equals(this.mergeLanguage, postMessagesSendRequestMessage.mergeLanguage) &&
        Objects.equals(this.globalMergeVars, postMessagesSendRequestMessage.globalMergeVars) &&
        Objects.equals(this.mergeVars, postMessagesSendRequestMessage.mergeVars) &&
        Objects.equals(this.tags, postMessagesSendRequestMessage.tags) &&
        Objects.equals(this.subaccount, postMessagesSendRequestMessage.subaccount) &&
        Objects.equals(this.googleAnalyticsDomains, postMessagesSendRequestMessage.googleAnalyticsDomains) &&
        Objects.equals(this.googleAnalyticsCampaign, postMessagesSendRequestMessage.googleAnalyticsCampaign) &&
        Objects.equals(this.metadata, postMessagesSendRequestMessage.metadata) &&
        Objects.equals(this.recipientMetadata, postMessagesSendRequestMessage.recipientMetadata) &&
        Objects.equals(this.attachments, postMessagesSendRequestMessage.attachments) &&
        Objects.equals(this.images, postMessagesSendRequestMessage.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(html, text, subject, fromEmail, fromName, to, headers, important, trackOpens, trackClicks, autoText, autoHtml, inlineCss, urlStripQs, preserveRecipients, viewContentLink, bccAddress, trackingDomain, signingDomain, returnPathDomain, merge, mergeLanguage, globalMergeVars, mergeVars, tags, subaccount, googleAnalyticsDomains, googleAnalyticsCampaign, metadata, recipientMetadata, attachments, images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMessagesSendRequestMessage {\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
    sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    important: ").append(toIndentedString(important)).append("\n");
    sb.append("    trackOpens: ").append(toIndentedString(trackOpens)).append("\n");
    sb.append("    trackClicks: ").append(toIndentedString(trackClicks)).append("\n");
    sb.append("    autoText: ").append(toIndentedString(autoText)).append("\n");
    sb.append("    autoHtml: ").append(toIndentedString(autoHtml)).append("\n");
    sb.append("    inlineCss: ").append(toIndentedString(inlineCss)).append("\n");
    sb.append("    urlStripQs: ").append(toIndentedString(urlStripQs)).append("\n");
    sb.append("    preserveRecipients: ").append(toIndentedString(preserveRecipients)).append("\n");
    sb.append("    viewContentLink: ").append(toIndentedString(viewContentLink)).append("\n");
    sb.append("    bccAddress: ").append(toIndentedString(bccAddress)).append("\n");
    sb.append("    trackingDomain: ").append(toIndentedString(trackingDomain)).append("\n");
    sb.append("    signingDomain: ").append(toIndentedString(signingDomain)).append("\n");
    sb.append("    returnPathDomain: ").append(toIndentedString(returnPathDomain)).append("\n");
    sb.append("    merge: ").append(toIndentedString(merge)).append("\n");
    sb.append("    mergeLanguage: ").append(toIndentedString(mergeLanguage)).append("\n");
    sb.append("    globalMergeVars: ").append(toIndentedString(globalMergeVars)).append("\n");
    sb.append("    mergeVars: ").append(toIndentedString(mergeVars)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    subaccount: ").append(toIndentedString(subaccount)).append("\n");
    sb.append("    googleAnalyticsDomains: ").append(toIndentedString(googleAnalyticsDomains)).append("\n");
    sb.append("    googleAnalyticsCampaign: ").append(toIndentedString(googleAnalyticsCampaign)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    recipientMetadata: ").append(toIndentedString(recipientMetadata)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

