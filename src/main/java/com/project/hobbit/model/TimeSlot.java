package com.project.hobbit.model;

import java.time.*;
import java.util.*;

public class TimeSlot {
    private UUID id;
    private LocalTime time;
    private LocalDate date;
    private boolean available;

    public TimeSlot(LocalTime time, LocalDate date, boolean available) {
        this.time = time;
        this.date = date;
        this.available = available;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
