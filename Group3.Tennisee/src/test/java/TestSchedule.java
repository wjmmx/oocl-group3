import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.group3.tennisee.Storage;

public class TestSchedule {
	Storage storage;
	@Before
	public void setUp() {
		storage = new Storage();
	}
	
	@Test
	public void testGetSchedule() {
		//fail("Not yet implemented");
		Assert.assertEquals(12,storage.getScheduleList().size());
	}
	
	@Test
	public void testResetSchedule() {
		storage.resetScheduleList();
		Assert.assertNull(storage.getScheduleList());
	}
	
	@Test
	public void testGetScheduleByCourt() {
		Assert.assertNotNull(storage.getScheduleListByCourtCode("B"));
	}
	
	@Test
	public void testGetScheduleByCodeAndCourt() {
		Assert.assertNotNull(storage.getScheduleListByCodeAndCourt("A1","A"));
		Assert.assertNotNull(storage.getScheduleListByCodeAndCourt("A2","A"));

	}
	

}
