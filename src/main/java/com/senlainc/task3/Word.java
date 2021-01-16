package com.senlainc.task3;

import java.util.Comparator;
import java.util.Objects;

public class Word implements Comparator<Word> {
    private StringBuilder word;

    public void setWord(String aWord){
        this.word = new StringBuilder(aWord);
    }

    public String getWord(){
        return word.toString();
    }

    public String toUpperCaseFirstChar(){
        String firstChar = word.substring(0,1);
        firstChar = firstChar.toUpperCase();
        word.replace(0,1, firstChar);
        return word.toString();
    }

    public int getLength(){
        return word.length();
    }

    @Override
    public int compare(Word word1, Word word2) {
        return word1.getLength()-word2.getLength();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;
        Word word1 = (Word) o;
        return Objects.equals(getWord(), word1.getWord());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWord());
    }

}
