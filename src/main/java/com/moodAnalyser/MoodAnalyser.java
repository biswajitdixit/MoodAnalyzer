package com.moodAnalyser;

public class MoodAnalyser {
    private String message;


    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        if(message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }
}
