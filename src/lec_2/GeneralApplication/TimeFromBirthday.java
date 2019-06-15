package lec_2.GeneralApplication;

import java.util.Calendar;
import java.util.Date;

public class TimeFromBirthday {
    public static void main(String[] args) {

        Date dateNow = new Date();

        Calendar calendar= Calendar.getInstance();
        calendar.set(1987,4,9,6,45);

        System.out.println(dateNow);
        System.out.println(calendar.getTime());


        double ddd= calendar.getTimeInMillis();
        double bbb= dateNow.getTime()-ddd;

        double secondsFromBirthdays = (dateNow.getTime()- calendar.getTimeInMillis())/1000;

        double minutesFromBirthdays = secondsFromBirthdays/60;
        double hoursFromBirthdays =secondsFromBirthdays/(60*60);
        double daysFromBirthdays =secondsFromBirthdays/(60*60*24);
        double weeksFromBirthdays =secondsFromBirthdays/(60*60*24*7);
        double yearsFromBirthdays =secondsFromBirthdays/(60*60*24*365);

        System.out.println(secondsFromBirthdays+" seconds from birthdays");
        System.out.println(minutesFromBirthdays+" minutes from birthdays");
        System.out.println(hoursFromBirthdays+" hours from birthdays");
        System.out.println(daysFromBirthdays+" days from birthdays");
        System.out.println(weeksFromBirthdays+" weeks from birthdays");
        System.out.println(yearsFromBirthdays+" years from birthdays");
    }
}
