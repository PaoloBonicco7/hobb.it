package com.project.hobbit.model;

import java.time.*;
import java.util.*;

public class Request {
    private UUID id;
    private User sender;
    private LocalTime time;
    private LocalDate date;
    private HobbyCard hobbyCard;
    private boolean confirmed;
    private List<Message> chat;

    public Request(User sender, LocalTime time, LocalDate date, HobbyCard hobbyCard, boolean confirmed, List<Message> chat) {
        this.sender = sender;
        this.time = time;
        this.date = date;
        this.hobbyCard = hobbyCard;
        this.confirmed = confirmed;
        this.chat = chat;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
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

    public HobbyCard getHobbyCard() {
        return hobbyCard;
    }

    public void setHobbyCard(HobbyCard hobbyCard) {
        this.hobbyCard = hobbyCard;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public List<Message> getChat() {
        return chat;
    }

    public void setChat(List<Message> chat) {
        this.chat = chat;
    }

    public boolean renewRequest(LocalDate newDate, LocalTime newTime){
        return true;
    }

    public boolean newMessage(Message message){
        return true;
    }

}
