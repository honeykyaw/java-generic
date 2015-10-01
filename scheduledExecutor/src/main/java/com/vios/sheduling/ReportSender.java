package com.vios.sheduling;

public class ReportSender extends RunnableTask {

	public ReportSender() {
		super();
	}

	public ReportSender(String taskname, Long delay, Long period, Long initialDelay) {
		this.taskname = taskname;
		this.delay = delay;
		this.period = period;
		this.initialDelay = initialDelay;
	}

	@Override
	public void run() {
		System.out.println("ReportSending job starts to send reports!");

	}

}
