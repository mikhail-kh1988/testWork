package com.senlainc.task4;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private List<Word> NewSentence   = new ArrayList<>();
    private int count                = 0;
    private String searchWord        = "";

    public Sentence(String stringSentence, String searchWord){

        String[] tmpWords = stringSentence.split(" ");
        for (String s: tmpWords){
            Word word = new Word();
            word.setString(s);
            NewSentence.add(word);
        }
        this.searchWord = searchWord;
        getCountWordInSentence(searchWord);

    }

    public void getCountWordInSentence(String aSearchWord){
        for (int i = 0; i<NewSentence.size(); i++){
            if (aSearchWord.equalsIgnoreCase(NewSentence.get(i).getString()))
                count++;
        }
    }

    public void reportAboutWord(){
        System.out.println("Слово \""+searchWord+"\" встречается "+count+" раз(а).");
    }
}
