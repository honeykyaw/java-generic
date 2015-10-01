package com.vios.sheduling;

public abstract class RunnableTask implements Runnable {
	protected String taskname = null;
	protected Long delay = null;
	protected Long period = null;
	protected Long initialDelay = null;

	public String getTaskname() {
		return taskname;
	}

	public long getDelay() {
		return delay;
	}

	public long getPeriod() {
		return period;
	}

	public long getInitialDelay() {
		return initialDelay;
	}

}
