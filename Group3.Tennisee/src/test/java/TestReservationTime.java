import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import com.group3.tennisee.Schedule;
import com.group3.tennisee.Storage;

public class TestReservationTime {
	
	List<Schedule> schedules;
	Storage store;
	
	@Before
	public void setAvailSched() {
		schedules = store.getScheduleList();
		store = new Storage();
	}
	
	@After
	public void cleanAvailSched() {
		schedules = null;
		store = null;
	}

	@Test
	public void testIsFifteenMinute() {
		System.out.println("Test");
		
	}

}
