package com.etf.guardian.openapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SummaryResponse
 */

public class SummaryResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Indicators")

  private List<Indicator> indicators = null;

  public SummaryResponse indicators(List<Indicator> indicators) {
    this.indicators = indicators;
    return this;
  }

  public SummaryResponse addIndicatorsItem(Indicator indicatorsItem) {
    if (this.indicators == null) {
      this.indicators = new ArrayList<>();
    }
    this.indicators.add(indicatorsItem);
    return this;
  }

  /**
   * Get indicators
   * @return indicators
  */


  public List<Indicator> getIndicators() {
    return indicators;
  }

  public void setIndicators(List<Indicator> indicators) {
    this.indicators = indicators;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryResponse summaryResponse = (SummaryResponse) o;
    return Objects.equals(this.indicators, summaryResponse.indicators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryResponse {\n");
    
    sb.append("    indicators: ").append(toIndentedString(indicators)).append("\n");
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

