package com.example.andrewsamtoy.sentencewordcounter;

import java.util.ArrayList;

/**
 * Created by andrewsamtoy on 9/18/17.
 */

public class WordCounter {
    private ArrayList<String> wordArrayList;

    public WordCounter() {wordArrayList = new ArrayList<>(); }

    public ArrayList<String> getWords() {
        return wordArrayList;
    }

    public void setWords(ArrayList<String> words) {
        this.wordArrayList = words;
    }

    public void addWordsToArray(ArrayList<String> words) {
        this.wordArrayList.add(String);
        for(String word : words.split(" ")) {
            wordArrayList.add(word);
//            System.out.println(words);
    }

}
