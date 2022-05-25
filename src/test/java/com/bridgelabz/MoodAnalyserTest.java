package com.bridgelabz;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @org.junit.jupiter.api.Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodanalyser=new MoodAnalyser();
        String mood=moodanalyser.analyseMood("Iam in a sad mood");
        Assert.assertEquals("sad",mood);

    }

    @org.junit.jupiter.api.Test
    void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodanalyser=new MoodAnalyser();
        String mood=moodanalyser.analyseMood("Iam in any mood");
        Assert.assertEquals("happy",mood);
    }
}