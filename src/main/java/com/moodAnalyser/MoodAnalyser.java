package com.moodAnalyser;


public class MoodAnalyser {
    private String message;


    public MoodAnalyser(String message) {
        this.message = message;
    }
    public  String analyzeMood(String message)throws MoodAnalyserException{
        this.message=message;
        return analyzeMood();
    }

    public String analyzeMood() throws MoodAnalyserException{
        try {

            if (message.length()==0)
                throw  new MoodAnalyserException(MoodAnalyserException.exceptionType.ENTERED_EMPTY,"please enter proper mood");
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.ENTERED_NULL,"please enter proper mood");
        }

    }
}