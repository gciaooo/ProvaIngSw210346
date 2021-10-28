package it.unical.provaIngSw;
import static org.junit.Assert.assertEquals;

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
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for (int i = 9; i > -1; i--) {
			l1.add(i);
		}
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			l2.add(i);
		}
		assertEquals(l2, listUtil.sort(l1, 0));
		
		l1.clear();
		for (int i = 9; i > -1; i--) {
			l1.add(i);
		}
		
		assertEquals(l1, listUtil.sort(l2, 1));
	}
	
	@Test(timeout = 3000)
	public void sortingTimeWorks() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for (int i = 9999; i > -1; i--) {
			l1.add(i);
		}
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for (int i = 0; i < 10000; i++) {
			l2.add(i);
		}
		listUtil.sort(l1, 0);
		listUtil.sort(l2, 1);
	}
	
	@Test(expected = NullPointerException.class)
	public void sortingNullWorks() {
		ArrayList<Integer> l1 = null;
		listUtil.sort(l1, 0);
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void sortingEmptyWorks() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		listUtil.sort(l1, 0);
	}
}
