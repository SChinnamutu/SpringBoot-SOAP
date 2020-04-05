package com.tfg.keybank.ws.controller;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfg.keybank.ws.model.BatchResponse;
import com.tfg.keybank.ws.model.BatchResponse.StatusMessage;

import lombok.extern.slf4j.Slf4j;
 
@RestController
@Slf4j
public class BatchController {
 
    @Autowired
    JobLauncher jobLauncher;
 
    @Autowired
    @Qualifier("readUser")
    Job accountKeeperJob;
    
    @RequestMapping("/run-batch-job")
    public BatchResponse handle() throws Exception {
    	log.info("JobInvokerController :: handle() :: Init");
        JobParameters jobParameters = new JobParametersBuilder()
        								.addString("source", "Spring Boot")
        								.addDate("date", new Date())
        					            .addLong("time",System.currentTimeMillis()).toJobParameters();
        jobLauncher.run(accountKeeperJob, jobParameters);
        log.info("JobInvokerController :: handle() :: Batch job has been invoked");
        log.info("JobInvokerController :: handle() :: End");
        return BatchResponse.builder()
        						.status("SUCCESS")
        						.statusMessage(StatusMessage.builder().code("200").decs("Batch job has been invoked").build())
        					.build();	
    }
    
}

