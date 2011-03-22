/**
 * EditLogger.java
 * Created on Aug 18, 2010, 11:06:41 AM
 * @author arthur
 */
package Kinyarwanda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openide.util.Exceptions;

/**
 * class EditLogger
 */
public class EditLogger
{

    private final String LOG_FOLDER = "edit_log";
//    public final String SYNC_URL = "http://localhost:8084/kamusiproject";
    public final String SYNC_URL = "http://173.203.102.17:8080/kamusiproject";

    /**
     * Initializes the class
     */
    public EditLogger()
    {
        //Start by creating the logApplicationMessage folder if it does not exist
        File logFolder = new File(getLogFileName()).getParentFile();

        if (!logFolder.exists())
        {
            logFolder.mkdir();
        }
    }

    /**
     * Logs system events to a file
     * @param message The message to be logged
     */
    public void logApplicationMessage(String message)
    {
        FileWriter fstream;
        BufferedWriter writer = null;
        try
        {
            fstream = new FileWriter(getLogFileName(), true);
            writer = new BufferedWriter(fstream);
            writer.write(getTimeStamp() + " | " + message);
            writer.newLine();
        }
        catch (IOException ex)
        {
            Exceptions.printStackTrace(ex);
        }
        finally
        {
            try
            {
                writer.close();
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
            }
        }
    }

    /**
     * Gets the current system time
     * @return The time in the form yyyy-MM-dd HH:mm:ss
     */
    private String getTimeStamp()
    {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return f.format(new Date());
    }

    /**
     * Gets the name of the logApplicationMessage file
     * @return The logApplicationMessage file in the form yyyy-MM-dd.logApplicationMessage
     */
    public String getLogFileName()
    {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String date = f.format(new Date());
        String fileName = LOG_FOLDER + System.getProperty("file.separator") + date + ".log";
        return fileName;
    }
}