package com.example.bharat.virtassistant.models;

/**
 * Created by BHARAT on 19-10-2017.
 */

public class chmodel {
    public String message;
    public boolean isSend;

    public chmodel(String message, boolean isSend) {
        this.message = message;
        this.isSend = isSend;
    }

    public chmodel() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSend() {
        return isSend;
    }

    public void setSend(boolean send) {
        isSend = send;
    }
}
