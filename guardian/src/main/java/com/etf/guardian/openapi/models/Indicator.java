package com.etf.guardian.openapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Objects;

/**
 * Indicator
 */


public class Indicator  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private String value;

  @JsonProperty("action")
  private String action;

  public Indicator (String name, String value, String action){
      this.name = name;
      this.value = value;
      this.action = action;
  }
  public Indicator name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */



  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Indicator value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */



  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Indicator action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  */


  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Indicator indicator = (Indicator) o;
    return Objects.equals(this.name, indicator.name) &&
        Objects.equals(this.value, indicator.value) &&
        Objects.equals(this.action, indicator.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Indicator {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

