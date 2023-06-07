package SeventhJune;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DisplayCurrentTime {

    public static void main(String[] args) {
        // Getting the current time
        Date date = new Date();
        System.out.println("Current Time is : " + date);
        // set format in 12 hours
        SimpleDateFormat formatTime = new SimpleDateFormat("hh.mm aa");
        // changing the format of 'date'
        String time = formatTime.format(date);
        // display time as per format
        System.out.println("Current Time in AM/PM Format is : " + time);
    }
}