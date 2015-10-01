package com.vios.sheduling;

public class MainPlanner {
	public static void main(String[] args) throws InterruptedException {
		RunnableTask reportGenerator = new ReportGenerator("generator", null, 5000l, 0l);
		RunnableTask reportSender = new ReportSender("sender", null, 5000l, 0l);

		ScheduleHelper.addScheduleWithFixedRate(reportGenerator);
		ScheduleHelper.addScheduleWithFixedRate(reportSender);

		Thread.sleep(10000);
		ScheduleHelper.cancelScheduledFuture("generator");

		Thread.sleep(10000);

		ScheduleHelper.shutdownScheuler();
	}
}
