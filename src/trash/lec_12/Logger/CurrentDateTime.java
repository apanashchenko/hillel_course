package trash.lec_12.Logger;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentDateTime {
    public static String getCurrentDateTime(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return formatter.format(calendar.getTime());
    }
}