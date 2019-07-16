package lec_10;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileLogger extends Loggers {
    public void log(String message) {
        try(FileWriter writer = new FileWriter("log.txt", false))
        {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

            writer.write(formatter.format(calendar.getTime()));
            writer.append('\n');
            writer.write(message);

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}