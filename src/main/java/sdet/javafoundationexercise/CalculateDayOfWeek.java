package sdet.javafoundationexercise;

import org.junit.Test;
import org.testng.Assert;

public class CalculateDayOfWeek {   public String dayOfTheWeek(int day, int month, int year) {
	String[] weekarray= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	int[] leapYearDaysForMonts = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	int[] nonLeapYearDaysForMonts = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	int leapYearDays =366, nonLeapYearDays=365,daysInYear=0,totalnoofdays=0,daysInmonth=0,dayofweek=0,noOfYears=0,noofleapyears=0,noofNonleapyears=0;
	String dayOfWeek="";
	noOfYears=(year-1)%400;
	System.out.println(noOfYears);
	for (int i=1;i <=noOfYears;i++) {
		if (i<100) {
			if(i%4==0) {
				noofleapyears++;
			}
		}
		else if (i%100!=0 && i%4==0) {
			noofleapyears++;
		}
		
	}
	System.out.println("leap years are"+noofleapyears);
	noofNonleapyears = noOfYears-noofleapyears;
	daysInYear=(nonLeapYearDays*noofNonleapyears)+(leapYearDays*noofleapyears);
	System.out.println(daysInYear);
	if((year%100==0&& year%400==0) ||(year%100!=0&& year%4==0)){
	for(int i = 0 ;i<month-1;i++){
	daysInmonth=daysInmonth+leapYearDaysForMonts[i];
	}

	daysInmonth=daysInmonth+day;
	System.out.println("month days"+daysInmonth);
	}

	else{
	for(int i =0 ;i<month-1;i++){
	daysInmonth=daysInmonth+nonLeapYearDaysForMonts[i];
	System.out.println("month days"+daysInmonth);
	}

	daysInmonth=daysInmonth+day;
	System.out.println("month days"+daysInmonth);

	}

	totalnoofdays=daysInYear+daysInmonth;
	dayofweek=totalnoofdays%7;
	 return weekarray[dayofweek] ;     
	    }

//@Test
//
//public void verifyDayOfTheWeekSc1() {
//	Assert.assertEquals("Sunday", dayOfTheWeek(13,8,2023));
//}
//
//@Test
//
//public void verifyDayOfTheWeekSc2() {
//	Assert.assertEquals("Wednesday", dayOfTheWeek(14,8,2024));
//}

@Test

public void verifyDayOfTheWeekSc3() {
	Assert.assertEquals("Sunday", dayOfTheWeek(18,7,1999));
}

}
