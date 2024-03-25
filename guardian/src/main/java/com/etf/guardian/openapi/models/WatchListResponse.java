package com.etf.guardian.openapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WatchListResponse
 */

public class WatchListResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ETFs")

  private List<WatchListItem> etFs = null;

  public WatchListResponse etFs(List<WatchListItem> etFs) {
    this.etFs = etFs;
    return this;
  }

  public WatchListResponse addEtFsItem(WatchListItem etFsItem) {
    if (this.etFs == null) {
      this.etFs = new ArrayList<>();
    }
    this.etFs.add(etFsItem);
    return this;
  }

  /**
   * Get etFs
   * @return etFs
  */

  public List<WatchListItem> getEtFs() {
    return etFs;
  }

  public void setEtFs(List<WatchListItem> etFs) {
    this.etFs = etFs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchListResponse watchListResponse = (WatchListResponse) o;
    return Objects.equals(this.etFs, watchListResponse.etFs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etFs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchListResponse {\n");
    
    sb.append("    etFs: ").append(toIndentedString(etFs)).append("\n");
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

