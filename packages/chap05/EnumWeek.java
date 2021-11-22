package chap05;

import java.util.Calendar;

public class EnumWeek {
    public static void main(String[] args) {
        Week today = null;
        today = Week.Friday;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.printf("Today is %1$s!\n", week);
        System.out.println();
    }
}
