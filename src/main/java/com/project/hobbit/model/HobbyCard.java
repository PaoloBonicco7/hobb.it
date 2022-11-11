package com.project.hobbit.model;

import java.util.*;

public class HobbyCard {
    private UUID id;
    private List<Category> categories;
    private User expert;
    private String description;
    private List<TimeSlot> calendar;

    public HobbyCard(List<Category> categories, User expert, String description, List<TimeSlot> calendar) {
        this.categories = categories;
        this.expert = expert;
        this.description = description;
        this.calendar = calendar;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public User getExpert() {
        return expert;
    }

    public void setExpert(User expert) {
        this.expert = expert;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TimeSlot> getCalendar() {
        return calendar;
    }

    public void setCalendar(List<TimeSlot> calendar) {
        this.calendar = calendar;
    }

    public void modifyHobbyCard(List<TimeSlot> newCalendar, String newDescription){

    }
}
