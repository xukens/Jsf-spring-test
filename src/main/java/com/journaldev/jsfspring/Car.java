package com.journaldev.jsfspring;

import java.io.Serializable;

/**
 * Created by RudyKot on 2016-06-09.
 */
public class Car implements Serializable{

    Type type;
    String name;

    Integer speed = 1;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Car() {
    }

    public Car(Type type, String name) {
        this.type = type;
        this.name = name;
    }
}
