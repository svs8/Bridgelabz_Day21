package com.bridgelabz;

public class MoodAnalyser {

    public String message;

    public MoodAnalyser(){

    }
    

    public String analyseMood(String message){
        if(message.contains("sad")) {
            return "sad";
        }else{
            return "happy";
        }
    }
}
