package com.vios.jobs.tasks;

import java.util.Date;
import java.util.TimerTask;

public class CustomTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("Running report generator. ");
		System.out.println("Current time is " + new Date());
	}

}
