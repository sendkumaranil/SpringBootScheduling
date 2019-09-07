package com.springboot.scheduling.example.app.schedulejob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
Anil Kumar
**/
@Component
public class SpringBootScheduling {

	private Logger logger=LoggerFactory.getLogger(SpringBootScheduling.class);
	
	@Scheduled(fixedRate=5000)
	public void scheduleJob() {
		logger.info("Printing message every 5 seconds");
	}
	
	@Scheduled(cron="0 0 6,19 * * *")
	public void scheduleCronJob() {
		logger.info("Run this job every day at 6 am and 6 pm");
	}
}
