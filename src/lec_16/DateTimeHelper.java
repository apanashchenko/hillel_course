package lec_16;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeHelper {
    public static String getCurrentDateTimeInStringFormat() {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        return formatter.format(calendar.getTime());
    }
}
