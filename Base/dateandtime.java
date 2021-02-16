package Base;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.plaf.nimbus.State;

public class dateandtime {
	
	public static Date getFromTime(int year,int date)
	{
		//menthod to get from time range
		Date frmDate = new GregorianCalendar(year, Calendar.JANUARY, date).getTime();
		 return frmDate;
	}

	public static Date getToTime(int year,int date)
	{
		//menthod to get to time range
		Date toDate = new GregorianCalendar(year, Calendar.JANUARY, date).getTime();
		 return toDate;
	}
	


}
