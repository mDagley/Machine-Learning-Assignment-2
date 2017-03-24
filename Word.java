/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naivebayes;

import java.util.Comparator;

/**
 *
 * @author Melissa Dagley
 */
public class Word implements Comparable<Word> {
    private String value;
    private int count;
    
    public Word(String value, int count) {
        super();
        this.value = value;
        this.count = count;
    }

   public String getWord() {
       return value;
   }
   
   public void setWord(String value) {
       this.value = value;
   }
   
   public int getCount() {
       return count;
   }
   
   public void setCount(int count){
       this.count = count;
   }
   
    @Override
   public int compareTo(Word compareWord){
       int compareCount = ((Word) compareWord).getCount();
       
       return compareCount - this.count;
   }
   
   public static Comparator<Word> WordValueComparator = (Word word1, Word word2) -> {
       String wordValue1 = word1.getWord().toUpperCase();
       String wordValue2 = word2.getWord().toUpperCase();
       
       return wordValue1.compareTo(wordValue2);
    };

}