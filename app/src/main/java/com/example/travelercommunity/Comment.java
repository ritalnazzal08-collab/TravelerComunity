package com.example.travelercommunity;

public class Comment {
    private String username;
    private String comment;
    private String date;

    private boolean rating;

    public Comment(String username, String comment, String date, boolean rating) {
        this.username = username;
        this.comment = comment;
        this.date = date;
        this.rating = rating;
    }

    public String getUsername() {
        return username;
    }

    public String getComment() {
        return comment;
    }

    public String getDate() {
        return date;
    }

    public boolean isRating() {
        return rating;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRating(boolean rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "username='" + username + '\'' +
                ", comment='" + comment + '\'' +
                ", date='" + date + '\'' +
                ", rating=" + rating +
                '}';
    }
}
