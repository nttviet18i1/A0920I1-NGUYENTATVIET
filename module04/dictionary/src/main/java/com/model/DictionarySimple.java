package com.model;

public class DictionarySimple {
    private String english;
    private  String vietnam;

    public DictionarySimple(String english, String vietnam) {
        this.english = english;
        this.vietnam = vietnam;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getVietnam() {
        return vietnam;
    }

    public void setVietnam(String vietnam) {
        this.vietnam = vietnam;
    }
}
