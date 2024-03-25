package com.etf.guardian.openapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Objects;

/**
 * PopularETF
 */


public class PopularETF  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private String status;

  @JsonProperty("change")
  private String change;

  @JsonProperty("totalReturn")
  private String totalReturn;

  public PopularETF name(String name) {
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

  public PopularETF status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */



  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PopularETF change(String change) {
    this.change = change;
    return this;
  }

  /**
   * Get change
   * @return change
  */



  public String getChange() {
    return change;
  }

  public void setChange(String change) {
    this.change = change;
  }

  public PopularETF totalReturn(String totalReturn) {
    this.totalReturn = totalReturn;
    return this;
  }

  /**
   * Get totalReturn
   * @return totalReturn
  */



  public String getTotalReturn() {
    return totalReturn;
  }

  public void setTotalReturn(String totalReturn) {
    this.totalReturn = totalReturn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PopularETF popularETF = (PopularETF) o;
    return Objects.equals(this.name, popularETF.name) &&
        Objects.equals(this.status, popularETF.status) &&
        Objects.equals(this.change, popularETF.change) &&
        Objects.equals(this.totalReturn, popularETF.totalReturn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, change, totalReturn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PopularETF {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    totalReturn: ").append(toIndentedString(totalReturn)).append("\n");
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

