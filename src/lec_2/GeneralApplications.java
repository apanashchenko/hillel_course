package lec_2;

import java.util.Date;
import java.util.Calendar;

public class GeneralApplications {
    public static void main(String[] args) {
        int seconds = 347234723;

        System.out.println(seconds +" seconds=" +secondToDays(seconds) +" days");
        System.out.println(seconds +" seconds=" +secondToHours(seconds) +" hours");
        System.out.println(seconds +" seconds=" +secondToMinutes(seconds) +" minutes");

       Date now = new Date();

        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.MINUTE,45);
        birthday.set(Calendar.HOUR_OF_DAY,6);
        birthday.set(Calendar.YEAR,1987);
        birthday.set(Calendar.MONTH, 4);
        birthday.set(Calendar.DAY_OF_MONTH,9);

        long second = (now.getTime()- birthday.getTimeInMillis())/1000;
        System.out.println("I was born "+second+" seconds ago");

    }

    private static double secondToDays(int second) {
        return second/(60.0*60.0*24.0);
    }

    private static double secondToHours(int second) {
        return second/(60.0*60.0);
    }

    private static double secondToMinutes(int second) {
        return second/60.0;
    }
}






