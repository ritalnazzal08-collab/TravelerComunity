package com.example.travelercommunity;

public class Notification {
    private String title;
    private String message;
    private String type;
    private String date;

    private boolean isRead;

    public Notification(String title, String message, String type, String date, boolean isRead) {
        this.title = title;
        this.message = message;
        this.type = type;
        this.date = date;
        this.isRead = isRead;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", isRead=" + isRead +
                '}';
    }
}
