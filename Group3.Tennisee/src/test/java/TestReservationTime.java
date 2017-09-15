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
		long diffMinutes = Schedule.getTimeDiffInMinute(Schedule.getTimeDate(fromTime), Schedule.getTimeDate(currTime));
		
		assertTrue(Schedule.isWithinFifteenMinuteReservation(diffMinutes));
	}
	
	@Test
	public void testIsLessThanFifteenMinutes() {
		code = "A1";
		courtCode = "A";
		
		Schedule sched = store.getScheduleListByCodeAndCourt(code, courtCode);
		String currTime = "10:48";
		String fromTime = sched.getFromHour();
		long diffMinutes = Schedule.getTimeDiffInMinute(Schedule.getTimeDate(fromTime), Schedule.getTimeDate(currTime));
		
		assertTrue(!Schedule.isWithinFifteenMinuteReservation(diffMinutes));
	}
	
	@Test
	public void testIsFifteenMinute() {
		code = "A6";
		courtCode = "A";
		
		Schedule sched = store.getScheduleListByCodeAndCourt(code, courtCode);
		String currTime = Schedule.getCurrentTime(); //System time
		String fromTime = sched.getFromHour(); //From schedule
		long diffMinutes = Schedule.getTimeDiffInMinute(Schedule.getTimeDate(fromTime), Schedule.getTimeDate(currTime));
			
		assertTrue(Schedule.isWithinFifteenMinuteReservation(diffMinutes));
		
	}
	
	

}
