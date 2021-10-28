package it.unical.provaIngSw;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalDateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	private static LocalDateTime currentTime;
	
	private MyListUtil listUtil;
	
	@BeforeClass
	public static void prepareAll() {
		System.out.println("Inizio test: " + currentTime.get(DateTimeFieldType.dayOfMonth()) +
				"-" + currentTime.get(DateTimeFieldType.monthOfYear()) + "-" + currentTime.get(DateTimeFieldType.year()));
	}
	
	@AfterClass
	public static void afterAll() {
		System.out.println("Inizio test: " + currentTime.get(DateTimeFieldType.dayOfMonth()) +
				"-" + currentTime.get(DateTimeFieldType.monthOfYear()) + "-" + currentTime.get(DateTimeFieldType.year()));
	}
	
	@Test
	public void sortingWorks() {
		
	}
}
