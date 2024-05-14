package com.poc.model;


import lombok.Data;

public class Message {

    private String s;

    public Message(String s) {
        this.s = s;
    }

    public Message() {
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Message{" +
                "s='" + s + '\'' +
                '}';
    }


}
