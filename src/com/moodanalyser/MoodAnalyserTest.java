package com.moodanalyser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * create a class name as MoodAnalyserTest
 */
public class MoodAnalyserTest {
    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        /**
         * create object for  MoodAnalyserMain class
         */
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain();
        String mood = moodAnalyser.analyseMood("I am in Any Mood");
        assertSame("HAPPY", mood);
    }
}