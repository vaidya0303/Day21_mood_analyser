package com.moodanalyser;

/**
 * UC1 :- Given a Message, ability to analyse and respond Happy or Sad Mood
 *       - Create MoodAnalyser Object
 *       - Call analyseMood function with message as parameter and return Happy or Sad Mood
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