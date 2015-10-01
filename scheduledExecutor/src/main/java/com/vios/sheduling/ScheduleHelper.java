package com.vios.sheduling;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleHelper {

	private static final int NUM_THREADS = 3;
	private static final ScheduledExecutorService fScheduler;
	private static final Map<String, ScheduledFuture<?>> futureTasks;

	static {
		futureTasks = new HashMap<String, ScheduledFuture<?>>();
		fScheduler = Executors.newScheduledThreadPool(NUM_THREADS);
	}

	public static void addScheduleWithFixedDelay(RunnableTask task) {
		futureTasks.put(task.getTaskname(), fScheduler.scheduleWithFixedDelay(task, task.getInitialDelay(), task.getDelay(), TimeUnit.MILLISECONDS));
	}

	public static void addScheduleWithFixedRate(RunnableTask task) {
		futureTasks.put(task.getTaskname(), fScheduler.scheduleWithFixedDelay(task, task.getInitialDelay(), task.getPeriod(), TimeUnit.MILLISECONDS));
	}

	public static void cancelScheduledFuture(String taskname) {
		boolean interrupt = false;
		ScheduledFuture<?> taskToCancel = futureTasks.get(taskname);
		if (taskToCancel == null) {
			return;
		}
		taskToCancel.cancel(interrupt);
	}

	public static void shutdownScheuler() {
		fScheduler.shutdown();
	}
}
