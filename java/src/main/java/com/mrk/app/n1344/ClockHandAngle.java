package com.mrk.app.n1344;

public class ClockHandAngle {

  final static double DEGREES_PER_MINUTE = 6;
  final static double DEGREES_PER_HOUR = 30;
  final static double DEGREES_OFFSET = 90;

  public static double getHourAngle(int hour, int minutes) {
    double hourAngle = ((hour * DEGREES_PER_HOUR) + DEGREES_OFFSET) % 360;
    double minuteOffset = minutes == 0 ? 0 : (double) ((DEGREES_PER_HOUR * minutes) / 60);
    return (hourAngle + minuteOffset) % 360;
  }

  public static double getMinutesAngle(int minutes) {
    return ((minutes * DEGREES_PER_MINUTE) + DEGREES_OFFSET) % 360;
  }

  public static double calcAngle(double a, double b) {
    return (a > b ? a - b : (a + 360) - b) % 360;
  }

  public static double angleClock(int hour, int minutes) {
    double hoursAngle = getHourAngle(hour, minutes);
    double minutesAngle = getMinutesAngle(minutes);
    return Math.min(calcAngle(hoursAngle, minutesAngle), calcAngle(minutesAngle, hoursAngle));
  }
}
