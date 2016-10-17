package com.incresol.calendarquickstart;

import com.google.api.client.util.DateTime;

import java.util.Date;

/**
 * Created by Incresol-078 on 07-10-2016.
 */

public class EventDetails  {
    private String eventDescription;
    private DateTime startTime;
    private DateTime endTime;

    public DateTime getEndTime() {
        return endTime;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public DateTime getStartTime() {
        return startTime;
    }

    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }
}
