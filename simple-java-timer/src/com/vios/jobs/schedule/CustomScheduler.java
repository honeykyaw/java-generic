package com.vios.jobs.schedule;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CustomScheduler {
	public static void main(String[] args) {
		Calendar startDate = Calendar.getInstance();
		startDate.set(Calendar.HOUR_OF_DAY, 0);
		startDate.set(Calendar.MINUTE, 0);
		startDate.set(Calendar.SECOND, 0);
		startDate.set(Calendar.MILLISECOND, 0);
		// CustomTimer.createSchedule(startDate, Constants.FIVE_SECONDS);
		System.out.println(startDate.getTime());
		startDate.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(startDate.getTime());

		Calendar currentDate = new GregorianCalendar();
		System.out.println(currentDate.getTime());
		System.out.println(currentDate.getTimeZone());

		long currentMilliseconds = currentDate.getTimeInMillis();
		long startDateMilliseconds = startDate.getTimeInMillis();

	}
}
