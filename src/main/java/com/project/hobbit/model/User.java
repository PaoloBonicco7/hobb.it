package com.project.hobbit.model;

import javax.persistence.*;
import java.util.*;

@Entity(name = "User")
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(
            name = "name",
            nullable = false
    )
    private String name;
    @Column(
            name = "surname",
            nullable = false
    )
    private String surname;
    @Column(
            name = "email",
            nullable = false
    )
    private String email;
    @Column(
            name = "cellNum"
    )
    private String cellNum;
    @Column(
            name = "password",
            nullable = false
    )
    private String password;

    public User(String name, String surname, String email, String cellNum, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.cellNum = cellNum;
        this.password = password;
    }

    public User() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellNum() {
        return cellNum;
    }

    public void setCellNum(String cellNum) {
        this.cellNum = cellNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean createHobbyCard(HobbyCard hobbyCard){
        return true;
    }

    public boolean createRequest(Request request){
        return true;
    }

    public boolean deleteHobbyCard(UUID hobbyCardId){
        return true;
    }

    public boolean deleteRequest(UUID requestId){
        return true;
    }

    public boolean suggestCategory(Category suggestedCategory){
        return true;
    }
}
