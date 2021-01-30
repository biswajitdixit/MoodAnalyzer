package com.moodAnalyser;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessgae_WhenSad_ShouldReturn_Sad() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a Sad Message");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD",mood);

    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("This is Happy Messgae");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY",mood);
    }

}
