package com.example.gmail;

public class Email {
    private String email;
    private String content;
    private String time;

    public Email(String email, String content, String time) {
        this.email = email;
        this.content = content;
        this.time = time;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
