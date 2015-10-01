package scheduling;

import static org.quartz.DateBuilder.futureDate;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

import java.util.Date;

import org.quartz.DateBuilder.IntervalUnit;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("Generating report - " + context.getJobDetail().getJobDataMap().get("someKey"));
		System.out.println("Current time is " + new Date());
	}

	public static void main(String[] args) throws SchedulerException {
		SchedulerFactory schedFactory = new StdSchedulerFactory();
		Scheduler sched = schedFactory.getScheduler();
		sched.start();

		JobDetail job = newJob(QuartzJob.class).withIdentity("myJob", "myGroup").storeDurably().requestRecovery()
				.usingJobData("someKey", "someValue").build();
		Trigger trg = newTrigger().withIdentity("myTrigger").startAt(futureDate(10, IntervalUnit.SECOND)).withPriority(6).forJob(job)
				.withSchedule(simpleSchedule().withIntervalInSeconds(30).repeatForever()).build();
		sched.scheduleJob(job, trg);

		// CronTrigger cronTrg = newTrigger().withIdentity("trigger1",
		// "group1").withSchedule(cronSchedule("0/1 * * * * ?"))
		// .build();
		//
		// sched.scheduleJob(job, cronTrg);
	}
}
