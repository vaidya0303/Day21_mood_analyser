package com.moodanalyser;

/**
 * TC 1.2 :- Given “I am in Any Mood” message Should Return HAPPY
 *         - To make the Test case pass analyseMood method need to check for Sad else return HAPPY
 */

/**
 * create a class name as MoodAnalyserMain
 */
public class MoodAnalyserMain {
    /**
     * create a constructor ,this is default constructor name as MoodAnalyserMain
     */
    public MoodAnalyserMain() {
    }

    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}