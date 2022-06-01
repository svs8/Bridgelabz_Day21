package com.bridgelabz;

public class MoodAnalyser {
    public String message;
    public MoodAnalyser(){
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }


    public String analyseMood() {
        try {
            if (message.contains("sad")) {
                return "sad";
            } else {
                return "happy";
            }
        }catch(NullPointerException e){
            return "Happy";
        }

    }

    public String analysemoodexception() throws MoodAnalysisException {
        try {
            if (message.contains("sad")) {
                return "sad";
            } else {
                return "Happy";
            }
        }catch(NullPointerException e){
            throw new MoodAnalysisException("Null PointerException occurred please enter thr value other than null");
        }
    }
}
