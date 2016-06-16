package org.voucher.jobs;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;

import java.util.List;

/**
 * Created by s.zakipour on 12/31/15.
 */
public class MessageNotifier implements Job {

    final Logger logger = Logger.getLogger(this.getClass());

    public void execute(JobExecutionContext jobExecutionContext)  {
        try
        {


            System.out.println("------------------------------- 001");
            logger.log(Level.INFO, "Job start");

        }
        catch (Exception ex)
        {
            logger.log(Level.INFO , ex.getMessage());
        }

    }


}
