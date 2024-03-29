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
 * the information for the deleted metadata field
 */
@JsonPropertyOrder({
  PostMetadataDelete200Response.JSON_PROPERTY_NAME,
  PostMetadataDelete200Response.JSON_PROPERTY_STATE,
  PostMetadataDelete200Response.JSON_PROPERTY_VIEW_TEMPLATE
})
@JsonTypeName("postMetadataDelete_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class PostMetadataDelete200Response {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * the current state of the metadata field
   */
  public enum StateEnum {
    ACTIVE("active"),
    
    DELETE("delete"),
    
    INDEX("index");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATE = "state";
  private StateEnum state;

  public static final String JSON_PROPERTY_VIEW_TEMPLATE = "view_template";
  private String viewTemplate;

  public PostMetadataDelete200Response() {
  }

  public PostMetadataDelete200Response name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the unique identifier of the metadata field to update
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


  public PostMetadataDelete200Response state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * the current state of the metadata field
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StateEnum getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(StateEnum state) {
    this.state = state;
  }


  public PostMetadataDelete200Response viewTemplate(String viewTemplate) {
    
    this.viewTemplate = viewTemplate;
    return this;
  }

   /**
   * Mustache template to control how the metadata is rendered in your activity log
   * @return viewTemplate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEW_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getViewTemplate() {
    return viewTemplate;
  }


  @JsonProperty(JSON_PROPERTY_VIEW_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewTemplate(String viewTemplate) {
    this.viewTemplate = viewTemplate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostMetadataDelete200Response postMetadataDelete200Response = (PostMetadataDelete200Response) o;
    return Objects.equals(this.name, postMetadataDelete200Response.name) &&
        Objects.equals(this.state, postMetadataDelete200Response.state) &&
        Objects.equals(this.viewTemplate, postMetadataDelete200Response.viewTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, state, viewTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMetadataDelete200Response {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    viewTemplate: ").append(toIndentedString(viewTemplate)).append("\n");
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

