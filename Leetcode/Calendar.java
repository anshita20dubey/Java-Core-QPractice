package Leetcode;

import java.util.Locale;

public class Calendar {
    public static String findDay(int month, int day, int year) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(year, month - 1, day);
        return cal.getDisplayName(java.util.Calendar.DAY_OF_WEEK, java.util.Calendar.LONG, Locale.US).toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(findDay(8, 5, 2015)); // Output: WEDNESDAY
    }
}
