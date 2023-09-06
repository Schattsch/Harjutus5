package com.karel.program;

public class SecondsInYear {
    public static void main(String[] args) {
        int daysInYear = 365;

        int secondsPerMinute = 60;
        int minutesPerHour = 60;

        double secondsInYear = (double) daysInYear * secondsPerMinute * minutesPerHour * 24;

        System.out.println("There are " + secondsInYear + " seconds in a year.");
    }
}
