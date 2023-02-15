package com.hillel.Homework16.products;

import com.hillel.Homework16.abstraction.Books;
import com.hillel.Homework16.interfaces.AudioVersion;
import com.hillel.Homework16.enums.LanguageCombination;

public class Dictionaries extends Books implements AudioVersion {
    private LanguageCombination langCombination;

    public Dictionaries(String title, int pages, String bookSize, String publisher, LanguageCombination langCombination) {
        super(title, pages, bookSize, publisher);
         this.langCombination = langCombination;
    }

    public LanguageCombination getLangCombination() {
        return langCombination;
    }

    public void setLangCombination(LanguageCombination langCombination) {
        this.langCombination = langCombination;
    }
    @Override
    public void audioVersion(){
        System.out.println("Audio version is available for addtional material");
    }
    @Override
    public String getBookInfo(){
        return "Current dictionary is published by " + getPublisher();
    }
    @Override
    public String toString(){
        return  getTitle() +
                langCombination.getLang() +
               " dictionary has " + getPages() + " pages, " +
                getBookSize() + " format";
    }
}
