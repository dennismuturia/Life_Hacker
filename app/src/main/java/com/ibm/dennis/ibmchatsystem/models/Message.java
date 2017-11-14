package com.ibm.dennis.ibmchatsystem.models;

/**
 * Created by dennis on 11/14/17.
 */

public class Message {
    public String message;
    public String myMessage;
    public int myTime;
    public String user;

    public Message(String message, String myMessage, int myTime, String user){
        this.message = message;
        this.myMessage = myMessage;
        this.myTime = myTime;
        this.user = user;
    }

    public int getMyTime() {
        return myTime;
    }

    public String getMyMessage() {
        return myMessage;
    }

    public void setMyMessage(String myMessage) {
        this.myMessage = myMessage;
    }

    public String getUser() {
        return user;
    }
}
