package it.unical.provaIngSw;
import java.util.ArrayList;

import org.joda.time.LocalDateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	private MyListUtil listUtil = new MyListUtil();
	
	@BeforeClass
	public static void prepareAll() {
		LocalDateTime currentTime = new LocalDateTime();
		System.out.println("Inizio test: " + currentTime.getDayOfMonth() +
				"-" + currentTime.getMonthOfYear() + "-" + currentTime.getYear() +
				"-" + currentTime.getHourOfDay() + ":" + currentTime.getMinuteOfHour() + 
				":" + currentTime.getSecondOfMinute() + ":" + currentTime.getMillisOfSecond());
	}
	
	@AfterClass
	public static void afterAll() {
		LocalDateTime currentTime = new LocalDateTime();
		System.out.println("Fine test: " + currentTime.getDayOfMonth() +
				"-" + currentTime.getMonthOfYear() + "-" + currentTime.getYear() +
				"-" + currentTime.getHourOfDay() + ":" + currentTime.getMinuteOfHour() + 
				":" + currentTime.getSecondOfMinute() + ":" + currentTime.getMillisOfSecond());
	}
	
	@Test
	public void sortingWorks() {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 1000; i > 0; i--) {
			l.add(i);
		}
		listUtil.sort(l, 0);
		
		l.clear();
		for (int i = 0; i < 1000; i++) {
			l.add(i);
		}
		listUtil.sort(l, 1);
	}
}
