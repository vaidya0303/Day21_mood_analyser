package com.moodanalyser;

/**
 *  Refactor the code to take the mood message in Constructor
 * - Note:
 * - MoodAnalyser will have a message Field
 * - MoodAnalyser will have 2 Constructors –
 *   Default - MoodAnalyser() and with
 *   Parameters – MoodAnalyser(message)
 * - analyseMood method will change to
 *   support no parameters and use message
 *   Field defined for the Class
 */

/**
 * create a class name as MoodAnalyserMain
 */
public class MoodAnalyserMain {
    private String message;
    /**
     * create a constructor ,this is default constructor name as MoodAnalyserMain
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