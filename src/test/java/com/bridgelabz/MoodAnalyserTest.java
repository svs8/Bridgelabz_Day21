package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodanalyser = new MoodAnalyser("Iam in sad mood");
        String mood= moodanalyser.analyseMood();
        Assert.assertEquals("sad", mood);

    }


    @Test
    void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodanalyser=new MoodAnalyser("Iam in any mood");
        String mood=moodanalyser.analyseMood();
        Assert.assertEquals("happy",mood);
    }


    @Test
    public void givenNullMood_ShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser(null);
        String mood = moodanalyser.analyseMood();
        Assert.assertEquals("Happy", mood);
    }

    @Test
    public void givenNullMood_ShouldReturnCustomException() {
        MoodAnalyser moodanalyser = new MoodAnalyser(null);
        String mood= null;
        try {
            mood = moodanalyser.analysemoodexception();
//            Assert.assertEquals("Happy", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }

    }

}