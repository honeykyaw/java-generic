package com.vios.sheduling;

public class ReportGenerator extends RunnableTask {

	public ReportGenerator() {
		super();
	}

	public ReportGenerator(String taskname, Long delay, Long period, Long initialDelay) {
		this.taskname = taskname;
		this.delay = delay;
		this.period = period;
		this.initialDelay = initialDelay;
	}

	@Override
	public void run() {
		System.out.println("ReportGeneration job starts to generate reports!");

	}

}
