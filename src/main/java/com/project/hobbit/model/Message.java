package com.project.hobbit.model;

import java.time.*;
import java.util.*;

public class Message {
    private UUID id;
    private User author;
    private String text;
    private LocalTime time;
    private LocalDate date;

    public Message(User sender, String text, LocalTime time, LocalDate date) {
        this.author = sender;
        this.text = text;
        this.time = time;
        this.date = date;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
}
