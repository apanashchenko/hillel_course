package trash.lec_12.Logger;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements ILogger {
    @Override
    public void log(String message) {
        try(FileWriter writer = new FileWriter("log.log", false))
        {
            writer.write(CurrentDateTime.getCurrentDateTime() + "   " + ThreadInfo.getThreadName() + "    " + message);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}