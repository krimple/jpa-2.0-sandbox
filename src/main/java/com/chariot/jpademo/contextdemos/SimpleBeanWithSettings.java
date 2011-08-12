package com.chariot.jpademo.contextdemos;

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;

public class SimpleBeanWithSettings {

    private String value;

    public String getValue() {
        return value;
    }

    @PostConstruct
    public void doSomething() {
        System.err.println("owwie!");
    }
    
}
