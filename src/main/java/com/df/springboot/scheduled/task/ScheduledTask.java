package com.df.springboot.scheduled.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {
	private static final Logger logger = LoggerFactory.getLogger(ScheduledTask.class);
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void displayCurrentTime() {
		logger.info(sdf.format(new Date()));
	}
	
}
