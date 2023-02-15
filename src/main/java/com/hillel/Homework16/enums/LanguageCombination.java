package com.hillel.Homework16.enums;

public enum LanguageCombination {
    ENGLISH_UKRAINIAN("eng-ukr"),
    UKRAINIAN_ENGLISH("ukr-eng"),
    SPANISH_UKRAINIAN("span-ukr");

    private String lang;

    public String getLang() {
        return lang;
    }
    LanguageCombination(String lang) {
        this.lang = lang;
    }
}
