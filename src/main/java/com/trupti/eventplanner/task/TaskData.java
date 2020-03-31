package com.trupti.eventplanner.task;


import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

public class TaskData {
    private int taskId;
    @NotNull
    @Size(min = 4,message = "Task should be atleast 4 characters")
    private String taskName;
    private String taskDescription;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private boolean markAsDone;

    public TaskData(int taskId, String taskName, String taskDescription, Date date) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.date = date;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isMarkAsDone() {
        return markAsDone;
    }

    public void setMarkAsDone(boolean markAsDone) {
        this.markAsDone = markAsDone;
    }
}
