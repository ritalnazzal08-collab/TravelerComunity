package com.example.travelercommunity;

import java.util.List;

public class Profile {
    private String username;
    private String email;
    private String password;
    private String profileImage;

    private int followersCount;
    private int followingCount;
    private int tripsCount;
    private int points;



    public Profile(String username, String email, String password, String profileImage, int followersCount, int followingCount, int tripsCount, int points) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.profileImage = profileImage;
        this.followersCount = followersCount;
        this.followingCount = followingCount;
        this.tripsCount = tripsCount;
        this.points = points;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public int getTripsCount() {
        return tripsCount;
    }

    public int getPoints() {
        return points;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }

    public void setTripsCount(int tripsCount) {
        this.tripsCount = tripsCount;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", profileImage='" + profileImage + '\'' +
                ", followersCount=" + followersCount +
                ", followingCount=" + followingCount +
                ", tripsCount=" + tripsCount +
                ", points=" + points +
                '}';
    }
}
