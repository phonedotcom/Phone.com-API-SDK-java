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

/**
 * The Full Express Service Code Object includes the properties in the Express Service Code Summary Object, along with the following:
 */
@ApiModel(description = "The Full Express Service Code Object includes the properties in the Express Service Code Summary Object, along with the following:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-31T14:54:48.237Z")
public class ExpressServiceCodeFull {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("express_service_code")
  private String expressServiceCode = null;

  @SerializedName("expire_date")
  private Integer expireDate = null;

  public ExpressServiceCodeFull id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ExpressServiceCodeFull expressServiceCode(String expressServiceCode) {
    this.expressServiceCode = expressServiceCode;
    return this;
  }

   /**
   * An 8-digit number in string format
   * @return expressServiceCode
  **/
  @ApiModelProperty(example = "null", value = "An 8-digit number in string format")
  public String getExpressServiceCode() {
    return expressServiceCode;
  }

  public void setExpressServiceCode(String expressServiceCode) {
    this.expressServiceCode = expressServiceCode;
  }

  public ExpressServiceCodeFull expireDate(Integer expireDate) {
    this.expireDate = expireDate;
    return this;
  }

   /**
   * UNIX time stamp representing the UTC time that the Express Service Code expires. Please note that every time this service is executed, the expire_date is set to now + 24 hours.
   * @return expireDate
  **/
  @ApiModelProperty(example = "null", value = "UNIX time stamp representing the UTC time that the Express Service Code expires. Please note that every time this service is executed, the expire_date is set to now + 24 hours.")
  public Integer getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(Integer expireDate) {
    this.expireDate = expireDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressServiceCodeFull expressServiceCodeFull = (ExpressServiceCodeFull) o;
    return Objects.equals(this.id, expressServiceCodeFull.id) &&
        Objects.equals(this.expressServiceCode, expressServiceCodeFull.expressServiceCode) &&
        Objects.equals(this.expireDate, expressServiceCodeFull.expireDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, expressServiceCode, expireDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressServiceCodeFull {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    expressServiceCode: ").append(toIndentedString(expressServiceCode)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
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

