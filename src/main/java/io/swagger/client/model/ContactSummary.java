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
 * The Contact Summary Object is used to briefly represent a contact from your address book. It can be seen in several places throughout this API. Here are the properties:
 */
@ApiModel(description = "The Contact Summary Object is used to briefly represent a contact from your address book. It can be seen in several places throughout this API. Here are the properties:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-31T14:54:48.237Z")
public class ContactSummary {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("middle_name")
  private String middleName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("nickname")
  private String nickname = null;

  @SerializedName("company")
  private String company = null;

  public ContactSummary id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Integer ID. Read-only.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Integer ID. Read-only.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ContactSummary prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Salutation, such as Mr, Mrs, or Dr
   * @return prefix
  **/
  @ApiModelProperty(example = "null", value = "Salutation, such as Mr, Mrs, or Dr")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public ContactSummary firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name or given name
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "First name or given name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ContactSummary middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Middle or second name
   * @return middleName
  **/
  @ApiModelProperty(example = "null", value = "Middle or second name")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public ContactSummary lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name or surname
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "Last name or surname")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ContactSummary suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Suffix, such as 'Jr.', 'Sr.', 'II', or 'III'
   * @return suffix
  **/
  @ApiModelProperty(example = "null", value = "Suffix, such as 'Jr.', 'Sr.', 'II', or 'III'")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public ContactSummary nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Nickname, or a shortened informal version of the contact's name
   * @return nickname
  **/
  @ApiModelProperty(example = "null", value = "Nickname, or a shortened informal version of the contact's name")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public ContactSummary company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Name of the contact's company
   * @return company
  **/
  @ApiModelProperty(example = "null", value = "Name of the contact's company")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactSummary contactSummary = (ContactSummary) o;
    return Objects.equals(this.id, contactSummary.id) &&
        Objects.equals(this.prefix, contactSummary.prefix) &&
        Objects.equals(this.firstName, contactSummary.firstName) &&
        Objects.equals(this.middleName, contactSummary.middleName) &&
        Objects.equals(this.lastName, contactSummary.lastName) &&
        Objects.equals(this.suffix, contactSummary.suffix) &&
        Objects.equals(this.nickname, contactSummary.nickname) &&
        Objects.equals(this.company, contactSummary.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, prefix, firstName, middleName, lastName, suffix, nickname, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

