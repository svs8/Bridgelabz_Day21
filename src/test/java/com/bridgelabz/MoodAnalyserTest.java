package com.bridgelabz;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @org.junit.jupiter.api.Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodanalyser = new MoodAnalyser("Iam in sad mood");
        String mood= moodanalyser.analyseMood();
        Assert.assertEquals("sad", mood);

    }


    @org.junit.jupiter.api.Test
    void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodanalyser=new MoodAnalyser("Iam in any mood");
        String mood=moodanalyser.analyseMood();
        Assert.assertEquals("happy",mood);
    }

    @org.junit.jupiter.api.Test
    public void givenNullMood_ShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser(null);
        String mood= moodanalyser.analyseMood();
        Assert.assertEquals("Happy", mood);

    }

}