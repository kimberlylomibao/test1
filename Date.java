import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Date {

    public static void main (String [] args) {
	 
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		
		System.out.println("Current Time:");

    }

}


