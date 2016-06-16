package org.voucher.web.bean;

import org.voucher.model.dao.DeviceDAOImpl;

import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by s.zakipour on 1/10/16.
 */
@Named
@SessionScoped
public class QueueMonitor implements Serializable {


    @EJB
    private DeviceDAOImpl _DeviceDAO;

    private Boolean activeJob;
    private long QueueSize;
    private String activeConnection;
    private String jobName;
    private long doneProcessSize;
    private long failedProcessSize;
    private long currentCycle;
    private String nextCycleTime;
    private String currentCycleTime;

//    private Scheduler scheduler;


    public QueueMonitor() {

    }

    public Boolean getActiveJob() {
        return activeJob;
    }

    public void setActiveJob(Boolean activeJob) {
        this.activeJob = activeJob;
    }

    public long getQueueSize() {
        return QueueSize;
    }

    public void setQueueSize(long queueSize) {
        QueueSize = queueSize;
    }

    public String getActiveConnection() {
        return activeConnection;
    }

    public void setActiveConnection(String activeConnection) {
        this.activeConnection = activeConnection;
    }

    public long getDoneProcessSize() {
        return doneProcessSize;
    }

    public void setDoneProcessSize(long doneProcessSize) {
        this.doneProcessSize = doneProcessSize;
    }

    public long getFailedProcessSize() {
        return failedProcessSize;
    }

    public void setFailedProcessSize(long failedProcessSize) {
        this.failedProcessSize = failedProcessSize;
    }

    public long getCurrentCycle() {
        return currentCycle;
    }

    public void setCurrentCycle(long currentCycle) {
        this.currentCycle = currentCycle;
    }


    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getNextCycleTime() {
        return nextCycleTime;
    }

    public void setNextCycleTime(String nextCycleTime) {
        this.nextCycleTime = nextCycleTime;
    }

    public String getCurrentCycleTime() {
        return currentCycleTime;
    }

    public void setCurrentCycleTime(String currentCycleTime) {
        this.currentCycleTime = currentCycleTime;
    }

    public void calculateJob() {
        try {
            System.out.println("eeeeeeeeeeeeeeeeee");
            _DeviceDAO.insert();
            this.activeJob = true;//scheduler.isShutdown();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


}
