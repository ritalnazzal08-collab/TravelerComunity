package com.example.travelercommunity;

public class Question {
    private String question;
    private String answer;

    private String username;
    private String placeName;

    private String date;

    public Question(String question, String answer, String username, String placeName, String date) {
        this.question = question;
        this.answer = answer;
        this.username = username;
        this.placeName = placeName;
        this.date = date;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getUsername() {
        return username;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getDate() {
        return date;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", username='" + username + '\'' +
                ", placeName='" + placeName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
