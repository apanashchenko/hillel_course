package lec_16.Logger;

import lec_16.DateTimeHelper;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class FileLogger implements ILogger {
    public static final List<String> logList = new ArrayList<>();

    @Override
    public void log(String message) {
        try(FileWriter writer = new FileWriter("log.txt", false))
        {
            writer.write(DateTimeHelper.getCurrentDateTimeInStringFormat());
            writer.append('\n');
            writer.write(message);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
     public static void addToLogList(String massege){
        logList.add(DateTimeHelper.getCurrentDateTimeInStringFormat() + "    " + massege);
     }

     public static void writeLogToFile() throws IOException {
         Iterator<String> list = logList.iterator();
         FileWriter writer = new FileWriter("log.txt", false);
         while(list.hasNext()){
                 writer.write(list.next());
                 writer.append('\n');
         }
         writer.flush();
     }
}