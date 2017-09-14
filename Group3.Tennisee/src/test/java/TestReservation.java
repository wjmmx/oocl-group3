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
		Assert.assertEquals(false, User.reserveSchedules(list, "9:00", "11:00"));
		Assert.assertEquals(true, User.reserveSchedules(list, "11:00", "13:00"));
		Assert.assertEquals(true, User.reserveSchedules(list, "13:00", "15:00"));
	}

	@Test
	public void testReserveAvailable() {
		ArrayList<Schedule> successList = new ArrayList<Schedule>();
		successList.add(new Schedule("A1", "A", "Tuesday", "09:00", "11:00"));
		successList.add(new Schedule("A2", "A", "Tuesday", "11:00", "13:00"));
		successList.add(new Schedule("A3", "A", "Tuesday", "13:00", "15:00"));
		for (Schedule x : successList) {
			System.out.println(x.getIsReserved());
		}
		Assert.assertEquals(true, User.reserveSchedules(successList, "09:00", "11:00", "Tuesday"));
		Assert.assertEquals(true, User.reserveSchedules(successList, "11:00", "13:00", "Tuesday"));
		Assert.assertEquals(true, User.reserveSchedules(successList, "13:00", "15:00", "Tuesday"));
	}

	@Test
	public void testReserveNotAvailable() {
		ArrayList<Schedule> failList = new ArrayList<Schedule>();
		failList.add(new Schedule("A1", "A", "Wednesday", "09:00", "11:00"));
		failList.add(new Schedule("A2", "A", "Wednesday", "11:00", "13:00"));
		failList.add(new Schedule("A3", "A", "Wednesday", "13:00", "15:00"));
		for(Schedule x : failList) {
			System.out.println(x.getIsReserved());
			x.setIsReserved(true);
		}
		
		Assert.assertEquals(false, User.reserveSchedules(failList, "09:00", "11:00", "Wednesday"));
		Assert.assertEquals(false, User.reserveSchedules(failList, "11:00", "13:00", "Wednesday"));
		Assert.assertEquals(false, User.reserveSchedules(failList, "13:00", "15:00", "Wednesday"));

	}
}
