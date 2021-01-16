package com.senlainc.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sentence {
    private List<Word> CurrentSentence;

    public Sentence(){
        CurrentSentence = new ArrayList<>();
    }

    public void enterStringAsSentence(String inputSentence){
        String[] arrayWords = inputSentence.split(" ");
        for (String tmpWord:arrayWords) {
            Word word = new Word();
            word.setWord(tmpWord);
            CurrentSentence.add(word);
        }
    }

    public int getCountWordInSentence(){
        return CurrentSentence.size();
    }

    public List<Word> getCurrentSentenceInUpperCaseFirstChar(){
        for (Word w:this.CurrentSentence) {
            w.toUpperCaseFirstChar();
        }
        return this.CurrentSentence;
    }

    public List<Word> getSortedCurrentSentence(){
        CurrentSentence.sort((a, b) -> Long.compare(a.getLength(), b.getLength()));
        return getCurrentSentenceInUpperCaseFirstChar();
    }
}
