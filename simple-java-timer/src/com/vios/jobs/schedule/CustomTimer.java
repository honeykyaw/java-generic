package com.vios.jobs.schedule;

import java.util.Calendar;
import java.util.Timer;

import com.vios.jobs.tasks.CustomTask;

public class CustomTimer {

	public static void createSchedule(Calendar startDate, long duration) {
		Timer timer = new Timer();
		timer.schedule(new CustomTask(), startDate.getTime(), duration);
	}

	/**
	 * To catch up any delay in actual starting time. Two or more executions
	 * will occur in rapid succession to catch up.
	 * 
	 * @param startDate
	 * @param duration
	 */
	public static void createScheduleAtFixedRate(Calendar startDate, long duration) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new CustomTask(), startDate.getTime(), duration);
	}
}
