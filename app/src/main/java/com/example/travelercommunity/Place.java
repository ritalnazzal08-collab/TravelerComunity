package com.example.travelercommunity;

public class Place {
   private String plaseName;
   private String plaseType;
   private String description;
   private String imagtion;
   private String location;
   private String city;
   private String country;

   private double latirude;
   private double longitude;
   private double rating;

   private int visitsCount;
   private int likesCount;

   private boolean wifi;
   private boolean parking;
   private boolean food;
   private boolean swimmingPool;
   private boolean campingArea;

   private String pladeStatus;
   private String addedBy;
   private String dateAdded;

    public Place() {
    }

    public Place(String plaseName, String plaseType, String description, String imagtion, String location, String city, String country, double latirude, double longitude, double rating, int visitsCount, int likesCount, boolean wifi, boolean parking, boolean food, boolean swimmingPool, boolean campingArea, String pladeStatus, String addedBy, String dateAdded) {
        this.plaseName = plaseName;
        this.plaseType = plaseType;
        this.description = description;
        this.imagtion = imagtion;
        this.location = location;
        this.city = city;
        this.country = country;
        this.latirude = latirude;
        this.longitude = longitude;
        this.rating = rating;
        this.visitsCount = visitsCount;
        this.likesCount = likesCount;
        this.wifi = wifi;
        this.parking = parking;
        this.food = food;
        this.swimmingPool = swimmingPool;
        this.campingArea = campingArea;
        this.pladeStatus = pladeStatus;
        this.addedBy = addedBy;
        this.dateAdded = dateAdded;
    }

    public String getPlaseName() {
        return plaseName;
    }

    public String getPlaseType() {
        return plaseType;
    }

    public String getDescription() {
        return description;
    }

    public String getImagtion() {
        return imagtion;
    }

    public String getLocation() {
        return location;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public double getLatirude() {
        return latirude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getRating() {
        return rating;
    }

    public int getVisitsCount() {
        return visitsCount;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public boolean isWifi() {
        return wifi;
    }

    public boolean isParking() {
        return parking;
    }

    public boolean isFood() {
        return food;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public boolean isCampingArea() {
        return campingArea;
    }

    public String getPladeStatus() {
        return pladeStatus;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setPlaseName(String plaseName) {
        this.plaseName = plaseName;
    }

    public void setPlaseType(String plaseType) {
        this.plaseType = plaseType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImagtion(String imagtion) {
        this.imagtion = imagtion;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLatirude(double latirude) {
        this.latirude = latirude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setVisitsCount(int visitsCount) {
        this.visitsCount = visitsCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public void setCampingArea(boolean campingArea) {
        this.campingArea = campingArea;
    }

    public void setPladeStatus(String pladeStatus) {
        this.pladeStatus = pladeStatus;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "Place{" +
                "plaseName='" + plaseName + '\'' +
                ", plaseType='" + plaseType + '\'' +
                ", description='" + description + '\'' +
                ", imagtion='" + imagtion + '\'' +
                ", location='" + location + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", latirude=" + latirude +
                ", longitude=" + longitude +
                ", rating=" + rating +
                ", visitsCount=" + visitsCount +
                ", likesCount=" + likesCount +
                ", wifi=" + wifi +
                ", parking=" + parking +
                ", food=" + food +
                ", swimmingPool=" + swimmingPool +
                ", campingArea=" + campingArea +
                ", pladeStatus='" + pladeStatus + '\'' +
                ", addedBy='" + addedBy + '\'' +
                ", dateAdded='" + dateAdded + '\'' +
                '}';
    }
}
