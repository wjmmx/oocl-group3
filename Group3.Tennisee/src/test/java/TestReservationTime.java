import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.junit.*;
import com.group3.tennisee.Schedule;
import com.group3.tennisee.Storage;

public class TestReservationTime {
	
	List<Schedule> schedules;
	Storage store;
	String code, courtCode;
	Date date;
	
	@Before
	public void setAvailSched() {
		store = new Storage();
		schedules = store.getScheduleList();
		date = new Date();
	}
	
	@After
	public void cleanAvailSched() {
		schedules = null;
		store = null;
		code = "";
		courtCode = "";
		date = null;
	}

	@Test
	public void testIsMoreThenFifteenMinutes() {
		code = "A2";
		courtCode = "B";
		
		Schedule sched = store.getScheduleListByCodeAndCourt(code, courtCode);
		String fromTime = sched.getFromHour();
		String currTime = "08:00";
		long diffMinutes = getTimeDiffInMinute(getTimeDate(fromTime), getTimeDate(currTime));
		
		assertTrue(isWithinFifteenMinuteReservation(diffMinutes));
	}
	
	@Test
	public void testIsLessThanFifteenMinutes() {
		code = "A1";
		courtCode = "A";
		
		Schedule sched = store.getScheduleListByCodeAndCourt(code, courtCode);
		String currTime = "10:48";
		String fromTime = sched.getFromHour();
		long diffMinutes = getTimeDiffInMinute(getTimeDate(fromTime), getTimeDate(currTime));
		
		assertFalse(isWithinFifteenMinuteReservation(diffMinutes));
	}
	
	@Test
	public void testIsFifteenMinute() {
		code = "A1";
		courtCode = "A";
		
		Schedule sched = store.getScheduleListByCodeAndCourt(code, courtCode);
		String currTime = getCurrentTime(); //System time
		String fromTime = sched.getFromHour(); //From schedule
		long diffMinutes = getTimeDiffInMinute(getTimeDate(fromTime), getTimeDate(currTime));
			
		assertTrue(isWithinFifteenMinuteReservation(diffMinutes));
		
	}
	
	public Date getTimeDate(String time) {
		Date date = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
		if(!time.isEmpty()) {
			try {
				date = dateFormat.parse(time);
			} catch (ParseException e) {
				e.printStackTrace();
				return null;
			}
		}
		return date;
	}
	
	public Boolean isWithinFifteenMinuteReservation(long min) {
		if(min >= 15) {
			return true;
		}
		return false;
	}
	
	public String getCurrentTime() {
		Calendar cal = new GregorianCalendar();
		String currTime = cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE);
		return currTime;
	}
	
	public long getTimeDiffInMinute(Date fromTime, Date currTime) {
		long diff = 0;
		diff = (fromTime.getTime() - currTime.getTime()) / (60*1000);
		return diff;
	}

}
