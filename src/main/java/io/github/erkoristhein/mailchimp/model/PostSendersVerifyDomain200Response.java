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
 * information about the verification that was sent
 */
@JsonPropertyOrder({
  PostSendersVerifyDomain200Response.JSON_PROPERTY_STATUS,
  PostSendersVerifyDomain200Response.JSON_PROPERTY_DOMAIN,
  PostSendersVerifyDomain200Response.JSON_PROPERTY_EMAIL
})
@JsonTypeName("postSendersVerifyDomain_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostSendersVerifyDomain200Response {
  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public PostSendersVerifyDomain200Response() {
  }

  public PostSendersVerifyDomain200Response status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * \&quot;sent\&quot; indicates that the verification has been sent, \&quot;already_verified\&quot; indicates that the domain has already been verified with your account
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public PostSendersVerifyDomain200Response domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * the domain name you provided
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


  public PostSendersVerifyDomain200Response email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * the email address the verification email was sent to
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSendersVerifyDomain200Response postSendersVerifyDomain200Response = (PostSendersVerifyDomain200Response) o;
    return Objects.equals(this.status, postSendersVerifyDomain200Response.status) &&
        Objects.equals(this.domain, postSendersVerifyDomain200Response.domain) &&
        Objects.equals(this.email, postSendersVerifyDomain200Response.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, domain, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSendersVerifyDomain200Response {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
