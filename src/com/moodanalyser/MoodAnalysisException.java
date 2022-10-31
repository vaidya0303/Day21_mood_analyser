package com.moodanalyser;


public class MoodAnalysisException extends Exception {
    public enum Exception_Type {
        NULL, EMPTY
    }

    public Exception_Type type;

    public MoodAnalysisException(String message, Exception_Type type) {
        super(message);
        this.type=type;
    }
}