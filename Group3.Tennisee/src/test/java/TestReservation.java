import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.group3.tennisee.Schedule;

public class TestReservation {
	@Before
	public void createScheduleList() {
		ArrayList list = new ArrayList();
		
		list.add(new Schedule("Monday","9:00","10:00"));
		list.add(new Schedule("Monday","10:00","11:00"));
		list.add(new Schedule("Monday","11:00","12:00"));
		
	}
	@Test
	public void testViewSchedules() {
		//fail("Not yet implemented");
		Assert.assertEquals(Arrays.asList(), Schedule.getSchedules());
	}
	@Test
	public void testCreateReservation() {
		//fail("Not yet implemented");
		Assert.assertEquals(true, Schedule.reserveSchedules(new Schedule()));
	}

}
