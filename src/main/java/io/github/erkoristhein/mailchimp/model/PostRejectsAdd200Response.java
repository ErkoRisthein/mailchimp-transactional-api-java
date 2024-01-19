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
 * a status object containing the address and the result of the operation
 */
@JsonPropertyOrder({
  PostRejectsAdd200Response.JSON_PROPERTY_EMAIL,
  PostRejectsAdd200Response.JSON_PROPERTY_ADDED
})
@JsonTypeName("postRejectsAdd_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostRejectsAdd200Response {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_ADDED = "added";
  private Boolean added;

  public PostRejectsAdd200Response() {
  }

  public PostRejectsAdd200Response email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * the email address you provided
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


  public PostRejectsAdd200Response added(Boolean added) {
    
    this.added = added;
    return this;
  }

   /**
   * whether the operation succeeded
   * @return added
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAdded() {
    return added;
  }


  @JsonProperty(JSON_PROPERTY_ADDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdded(Boolean added) {
    this.added = added;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostRejectsAdd200Response postRejectsAdd200Response = (PostRejectsAdd200Response) o;
    return Objects.equals(this.email, postRejectsAdd200Response.email) &&
        Objects.equals(this.added, postRejectsAdd200Response.added);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, added);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRejectsAdd200Response {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
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

