package com.soda3x;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TimeFormat {
  CLOCK_24H_SS("24-hour + seconds", "HH:mm:ss"),
  CLOCK_24H("24-hour", "HH:mm"),
  CLOCK_12H_SS("12-hour + seconds", "hh:mm:ss a"),
  CLOCK_12H("12-hour", "hh:mm a"),
  DAY_TIME_24H_SS("Day + 24-hour + seconds", "E HH:mm:ss"),
  DAY_TIME_24H("Day + 24-hour + seconds", "E HH:mm:ss"),
  DAY_TIME_12H_SS("Day + 12-hour", "E hh:mm a"),
  DAY_TIME_12H("Day + 12-hour", "E hh:mm a"),
  DATE_TIME_24H_SS("Date + 24-hour + seconds", "d MMM HH:mm:ss"),
  DATE_TIME_24H("Date + 24-hour", "d MMM HH:mm"),
  DATE_TIME_12H_SS("Date + 12-hour + seconds", "d MMM hh:mm:ss a"),
  DATE_TIME_12H("Date + 12-hour", "d MMM hh:mm a");

  private final String displayName;
  private final String formatString;

  @Override
  public String toString() {
    return displayName;
  }
}