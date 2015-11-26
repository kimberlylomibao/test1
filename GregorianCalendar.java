/**
 * @(#)GregorianCalendar.java
 *
 *
 * @author
 * @version 1.00 2014/9/19
 */

import java.util.Calendar;
import java.text.SimpleDateFormat;
public class GregorianCalendar {

    public static void main (String [] args) {

		Calendar cal = Calendar.getInstance();
		
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyy hh:mm:ss");
		String t1 = sdf.format(cal.getTime());
		System.out.println("Current Date and Time: " + sdf.format(cal.getTime()));


		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

    }

}


