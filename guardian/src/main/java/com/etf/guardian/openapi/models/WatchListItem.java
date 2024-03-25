package com.etf.guardian.openapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * WatchListItem
 */


public class WatchListItem  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name;

  @JsonProperty("price")
  private String price;

  @JsonProperty("1month")
  private String _1month;

  @JsonProperty("3month")
  private String _3month;

  @JsonProperty("1year")
  private String _1year;

  @JsonProperty("3year")
  private String _3year;

  @JsonProperty("5year")
  private String _5year;

  public WatchListItem name(String name) {
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

  public WatchListItem price(String price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */



  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public WatchListItem _1month(String _1month) {
    this._1month = _1month;
    return this;
  }

  /**
   * Get _1month
   * @return _1month
  */



  public String get1month() {
    return _1month;
  }

  public void set1month(String _1month) {
    this._1month = _1month;
  }

  public WatchListItem _3month(String _3month) {
    this._3month = _3month;
    return this;
  }

  /**
   * Get _3month
   * @return _3month
  */



  public String get3month() {
    return _3month;
  }

  public void set3month(String _3month) {
    this._3month = _3month;
  }

  public WatchListItem _1year(String _1year) {
    this._1year = _1year;
    return this;
  }

  /**
   * Get _1year
   * @return _1year
  */



  public String get1year() {
    return _1year;
  }

  public void set1year(String _1year) {
    this._1year = _1year;
  }

  public WatchListItem _3year(String _3year) {
    this._3year = _3year;
    return this;
  }

  /**
   * Get _3year
   * @return _3year
  */



  public String get3year() {
    return _3year;
  }

  public void set3year(String _3year) {
    this._3year = _3year;
  }

  public WatchListItem _5year(String _5year) {
    this._5year = _5year;
    return this;
  }

  /**
   * Get _5year
   * @return _5year
  */



  public String get5year() {
    return _5year;
  }

  public void set5year(String _5year) {
    this._5year = _5year;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchListItem watchListItem = (WatchListItem) o;
    return Objects.equals(this.name, watchListItem.name) &&
        Objects.equals(this.price, watchListItem.price) &&
        Objects.equals(this._1month, watchListItem._1month) &&
        Objects.equals(this._3month, watchListItem._3month) &&
        Objects.equals(this._1year, watchListItem._1year) &&
        Objects.equals(this._3year, watchListItem._3year) &&
        Objects.equals(this._5year, watchListItem._5year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price, _1month, _3month, _1year, _3year, _5year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchListItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    _1month: ").append(toIndentedString(_1month)).append("\n");
    sb.append("    _3month: ").append(toIndentedString(_3month)).append("\n");
    sb.append("    _1year: ").append(toIndentedString(_1year)).append("\n");
    sb.append("    _3year: ").append(toIndentedString(_3year)).append("\n");
    sb.append("    _5year: ").append(toIndentedString(_5year)).append("\n");
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

