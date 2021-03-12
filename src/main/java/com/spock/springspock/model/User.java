package com.spock.springspock.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
    String userName;
    int age;
    @Id
Integer id;
    public User( ) {
    }

    public User(String userName, int age, Integer id) {
        this.userName = userName;
        this.age = age;
        this.id = id;
    }

    public String getUserName() {

        return userName;
    }

    public User setUserName(String userName) {
        if (userName == null) {
            throw new IllegalArgumentException("Username given was invalid");
        }
        this.userName = userName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
