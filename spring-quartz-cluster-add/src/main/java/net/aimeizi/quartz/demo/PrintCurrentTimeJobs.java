package net.aimeizi.quartz.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class PrintCurrentTimeJobs extends QuartzJobBean
{


    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException
    {
        System.out.println("Job executed...");
    }
}
