package com.moodanalyser;

/**
 * Repeat TC 1.1 :-
 *
 * Given “I am in Sad Mood” message in Constructor Should  Return SAD
 * To pass this Test Case when calling analyseMood method with no params should return SAD
 */

/**
 * create a class name as MoodAnalyserMain
 */
public class MoodAnalyserMain {
    private String message;

    /**
     * default constructor name as MoodAnalyserMain
     */
    public MoodAnalyserMain() {
    }

    public MoodAnalyserMain(String message) {
        this.message=message;
    }
    public String analyseMood() {
        if (this.message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}