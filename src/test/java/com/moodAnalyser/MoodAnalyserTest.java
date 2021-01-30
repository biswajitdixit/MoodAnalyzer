package com.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void givenMessgae_WhenSad_ShouldReturn_Sad() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a Sad Message");
        String mood;
        try {
            mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("SAD", mood);
        } catch (MoodAnalyserException e) {
        }
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("This is Happy Messgae");
        String mood;
        try {
            mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyserException e) {
        }

    }
    @Test
    public void givenNullMood_ShouldReturn_Happy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        String mood;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            mood = moodAnalyzer.analyzeMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenNullMood_ShouldThrow_Exception() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        try {
            moodAnalyzer.analyzeMood(null);
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.exceptionType.ENTERED_NULL, e.type);
        }
    }

}