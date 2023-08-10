package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class CalculateDayOfTheYear {
	public int dayOfYear(String date) {
		int totaldays = 0;
		int[] leapYearDaysForMonts = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] nonLeapYearDaysForMonts = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		String year = date.substring(0, 4);
		String month = date.substring(5, 7);
		String day = date.substring(8, 10);

		int intYear = Integer.parseInt(year);
		int intmonth = Integer.parseInt(month);
		int intday = Integer.parseInt(day);

		if ((intYear%100!=0 &&intYear % 4 == 0)||(intYear%100==0 &&intYear%400==0)) {

			for (int i = 0; i < intmonth-1; i++) {
				totaldays = totaldays + leapYearDaysForMonts[i];

			}
			totaldays=totaldays+intday;

		} else {

			for (int i = 0; i < intmonth-1; i++) {
				totaldays = totaldays + nonLeapYearDaysForMonts[i];

			}
			totaldays=totaldays+intday;

		}

		return totaldays;
	}
@Test
public void calculateDaysOfTheYear() {
	Assert.assertEquals(63, dayOfYear("2016-03-03"));
}
@Test
public void calculateDaysOfTheYearSc1() {
	Assert.assertEquals(1, dayOfYear("2016-01-01"));
}
@Test
public void calculateDaysOfTheYearSc3() {
	Assert.assertEquals(60, dayOfYear("2017-03-01"));
}
@Test
public void calculateDaysOfTheYearSc4() {
	Assert.assertEquals(9, dayOfYear("2019-01-09"));
}
@Test
public void calculateDaysOfTheYearSc5() {
	Assert.assertEquals(41, dayOfYear("2019-02-10"));
}

@Test
public void calculateDaysOfTheYearSc6() {
	Assert.assertEquals(122, dayOfYear("1900-05-02"));
}
}
