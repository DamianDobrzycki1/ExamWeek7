package ie.atu.exam;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {

    private static final SimpleDateFormat sdf3 = new SimpleDateFormat("2024-10-31T12:34:56Z");

    public static void main(String[] args)
    {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        Date date = new Date();
        System.out.println(new Timestamp(date.getTime()));

        System.out.println(timestamp.getTime());

        System.out.println(sdf3.format(timestamp));
    }
}
