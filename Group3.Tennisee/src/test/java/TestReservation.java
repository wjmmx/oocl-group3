import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.group3.tennisee.Schedule;
import com.group3.tennisee.Storage;
import com.group3.tennisee.User;

public class TestReservation {
	ArrayList list;
	Storage store;
	@Before
	public void createScheduleList() {
		store = new Storage();
		list = new ArrayList();
		list = store.getScheduleList();
	}
	@Test
	public void testViewSchedules() {
		//fail("Not yet implemented");
		Assert.assertEquals(Arrays.asList(), Schedule.getSchedules());
	}
	@Test
	public void testReservation() {
		//fail("Not yet implemented");
		Assert.assertEquals(true, User.reserveSchedules(list, "9:00", "11:00"));
		Assert.assertEquals(false, User.reserveSchedules(list, "11:00", "13:00"));
		Assert.assertEquals(true, User.reserveSchedules(list, "13:00", "15:00"));
	}
	@Test
	public void testInputCorrectCode() {
		Assert.assertEquals(true, Schedule.courtCodeSchedule("A1"));
		Assert.assertEquals(true, Schedule.courtCodeSchedule("C2"));
		Assert.assertEquals(true, Schedule.courtCodeSchedule("D3"));
		Assert.assertEquals(true, Schedule.courtCodeSchedule("B7"));
		Assert.assertEquals(true, Schedule.courtCodeSchedule("G4"));
	}
	@Test
	public void testInputIncorrectCode() {
		Assert.assertEquals(false, Schedule.courtCodeSchedule("A10"));
		Assert.assertEquals(false, Schedule.courtCodeSchedule("J2"));
		Assert.assertEquals(false, Schedule.courtCodeSchedule("Drg3"));
		Assert.assertEquals(false, Schedule.courtCodeSchedule("B75"));
		Assert.assertEquals(false, Schedule.courtCodeSchedule("4G"));
	}

}
