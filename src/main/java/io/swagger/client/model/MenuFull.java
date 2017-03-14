/*
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.MediaSummary;
import io.swagger.client.model.Option;
import io.swagger.client.model.RouteSummary;
import java.util.ArrayList;
import java.util.List;

/**
 * The Full Menu Object contains the same properties as the Menu Summary Object, along with the following:
 */
@ApiModel(description = "The Full Menu Object contains the same properties as the Menu Summary Object, along with the following:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-13T08:15:06.119Z")
public class MenuFull {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("allow_extension_dial")
  private Boolean allowExtensionDial = null;

  @SerializedName("keypress_wait_time")
  private Integer keypressWaitTime = null;

  @SerializedName("greeting")
  private MediaSummary greeting = null;

  @SerializedName("keypress_error")
  private MediaSummary keypressError = null;

  @SerializedName("timeout_handler")
  private RouteSummary timeoutHandler = null;

  @SerializedName("options")
  private List<Option> options = new ArrayList<Option>();

  public MenuFull id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Integer Menu ID. Read-only.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Integer Menu ID. Read-only.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MenuFull name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name. Required. Unique.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name. Required. Unique.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MenuFull allowExtensionDial(Boolean allowExtensionDial) {
    this.allowExtensionDial = allowExtensionDial;
    return this;
  }

   /**
   * Boolean. Determines whether a caller can enter an extension number to bypass the menu.
   * @return allowExtensionDial
  **/
  @ApiModelProperty(example = "null", value = "Boolean. Determines whether a caller can enter an extension number to bypass the menu.")
  public Boolean getAllowExtensionDial() {
    return allowExtensionDial;
  }

  public void setAllowExtensionDial(Boolean allowExtensionDial) {
    this.allowExtensionDial = allowExtensionDial;
  }

  public MenuFull keypressWaitTime(Integer keypressWaitTime) {
    this.keypressWaitTime = keypressWaitTime;
    return this;
  }

   /**
   * Boolean. Determines whether a caller can enter an extension number to bypass the menu.
   * @return keypressWaitTime
  **/
  @ApiModelProperty(example = "null", value = "Boolean. Determines whether a caller can enter an extension number to bypass the menu.")
  public Integer getKeypressWaitTime() {
    return keypressWaitTime;
  }

  public void setKeypressWaitTime(Integer keypressWaitTime) {
    this.keypressWaitTime = keypressWaitTime;
  }

  public MenuFull greeting(MediaSummary greeting) {
    this.greeting = greeting;
    return this;
  }

   /**
   * Greeting that is played when a caller enters a menu. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE.
   * @return greeting
  **/
  @ApiModelProperty(example = "null", value = "Greeting that is played when a caller enters a menu. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE.")
  public MediaSummary getGreeting() {
    return greeting;
  }

  public void setGreeting(MediaSummary greeting) {
    this.greeting = greeting;
  }

  public MenuFull keypressError(MediaSummary keypressError) {
    this.keypressError = keypressError;
    return this;
  }

   /**
   * Message that is played when the caller makes a keypress error. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE.
   * @return keypressError
  **/
  @ApiModelProperty(example = "null", value = "Message that is played when the caller makes a keypress error. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE.")
  public MediaSummary getKeypressError() {
    return keypressError;
  }

  public void setKeypressError(MediaSummary keypressError) {
    this.keypressError = keypressError;
  }

  public MenuFull timeoutHandler(RouteSummary timeoutHandler) {
    this.timeoutHandler = timeoutHandler;
    return this;
  }

   /**
   * Route that will be entered when the caller fails to choose a menu option within the allotted time. Output is a Route Summary Object if the route is named, otherwise the Full Route Object will be shown. Input must be a Route Lookup Object pointing to a named route.
   * @return timeoutHandler
  **/
  @ApiModelProperty(example = "null", value = "Route that will be entered when the caller fails to choose a menu option within the allotted time. Output is a Route Summary Object if the route is named, otherwise the Full Route Object will be shown. Input must be a Route Lookup Object pointing to a named route.")
  public RouteSummary getTimeoutHandler() {
    return timeoutHandler;
  }

  public void setTimeoutHandler(RouteSummary timeoutHandler) {
    this.timeoutHandler = timeoutHandler;
  }

  public MenuFull options(List<Option> options) {
    this.options = options;
    return this;
  }

  public MenuFull addOptionsItem(Option optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Array of menu option objects. See below for details.
   * @return options
  **/
  @ApiModelProperty(example = "null", value = "Array of menu option objects. See below for details.")
  public List<Option> getOptions() {
    return options;
  }

  public void setOptions(List<Option> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuFull menuFull = (MenuFull) o;
    return Objects.equals(this.id, menuFull.id) &&
        Objects.equals(this.name, menuFull.name) &&
        Objects.equals(this.allowExtensionDial, menuFull.allowExtensionDial) &&
        Objects.equals(this.keypressWaitTime, menuFull.keypressWaitTime) &&
        Objects.equals(this.greeting, menuFull.greeting) &&
        Objects.equals(this.keypressError, menuFull.keypressError) &&
        Objects.equals(this.timeoutHandler, menuFull.timeoutHandler) &&
        Objects.equals(this.options, menuFull.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, allowExtensionDial, keypressWaitTime, greeting, keypressError, timeoutHandler, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuFull {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    allowExtensionDial: ").append(toIndentedString(allowExtensionDial)).append("\n");
    sb.append("    keypressWaitTime: ").append(toIndentedString(keypressWaitTime)).append("\n");
    sb.append("    greeting: ").append(toIndentedString(greeting)).append("\n");
    sb.append("    keypressError: ").append(toIndentedString(keypressError)).append("\n");
    sb.append("    timeoutHandler: ").append(toIndentedString(timeoutHandler)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

