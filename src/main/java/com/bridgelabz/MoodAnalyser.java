package com.bridgelabz;

public class MoodAnalyser {
    public String message;
    public MoodAnalyser(){
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }


    public String analyseMood(){
        if(message.contains("sad")) {
            return "sad";
        }else{
            return "happy";
        }
    }
}
