/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naivebayes;

/**
 *
 * @author panda
 */

import java.io.*;
import java.util.ArrayList;


public class NaiveBayes {
    
    //Takes in the directory path and puts all of the text files into one string, which is then returned
    public static String readFile(String dir) throws IOException {
        String file = "";
        File directory = new File(dir);
        
        if(directory.isDirectory()){
            
            File[] files = directory.listFiles();
        for (File f : files) {
            if(f.isFile()) {
                 BufferedReader inputStream = null;
                 //System.out.println("-----------------------------------------------------");
                 //System.out.println("File Name: " + f);
                 //System.out.println("-----------------------------------------------------");

                try {
                    inputStream = new BufferedReader(
                                    new FileReader(f));
                    String line;
                    
                    while ((line = inputStream.readLine()) != null) {
                        file = file + line + " ";
                        
                        
        }
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
        
        
    }
            }
        }
        }
        return file;
    }
    
    public static ArrayList<ArrayList<String>> wordCount(String word) {
        
       boolean match = false;
        ArrayList<ArrayList<String>> values = new ArrayList<>();
        values.add(new ArrayList<String>());
            values.add(new ArrayList<String>());
    values.add(new ArrayList<String>());
    values.get(0).add("1");
    values.get(0).add("2");
    values.get(0).add("3");
    values.get(1).add("0");
    values.get(1).add("0");
    values.get(1).add("0");

       
       
                    int s = values.size();
                   
                        String[] words = word.split("\\W+");
                        int n = values.size();
                        for (int k = 0; k < words.length; k++)
                           {
                               
                        for (int i = 0; i < s; i++)
                        {
                           //System.out.println(values.get(0));
                           //System.out.println();

                        if (words[k].equals(values.get(0).get(i))){
                                   String temp = Integer.toString(Integer.parseInt(values.get(1).get(i)) + 1);
                                   values.get(1).set(i, temp);
                                   //System.out.println(words[k] + "==" + values.get(0).get(i));
                                   //System.out.println("Count: " + temp);
                                   match = true;
                                   i = s+1;
                               }
                        
                        else {
                            
                           //System.out.println(values.get(0).get(i) + "!=" + words[k]);
                        }
                        }
                           if (match == false) {
                               String newWord = words[k];
                               values.get(0).add(newWord);
                               values.get(1).add("1");
                               s += 1;
                               //System.out.println("Add: " + words[k]);
                           }
                           
                           match = false;
                        }
                        
                        for (int c = 0; c < s; c++) {
                            
                            //System.out.println("Word: " + values.get(0).get(c) + " Count: " + values.get(1).get(c));
                        }
                     //System.out.println(line);
                    
                     return values;
    }
    
    
    public static void main(String[] args) throws IOException {
        

        String ham_dir = "test/ham";
        String spam_dir = "test/spam";
        
        String hamwords = readFile(ham_dir);
        String spamwords = readFile(spam_dir);
        //System.out.println("Ham Words: " + hamwords);
       
        ArrayList<ArrayList<String>> ham_values = wordCount(hamwords);
        ArrayList<ArrayList<String>> spam_values = wordCount(spamwords);  
                        
                        for (int c = 0; c < ham_values.get(0).size(); c++) {
                            
                            //System.out.println("Word: " + ham_values.get(0).get(c) + " Count: " + ham_values.get(1).get(c));
                        }
                        
                     //System.out.println("---------------------------------------------------------------------------------");
                     //System.out.println("------------------------------------S P A M--------------------------------------");
                     //System.out.println("---------------------------------------------------------------------------------");
                        
                     for (int r = 0; r < spam_values.get(0).size(); r++) {
                            
                            //System.out.println("Word: " + spam_values.get(0).get(r) + " Count: " + spam_values.get(1).get(r));
                        }
               
                
                
            
            
            
        
    }
    }
    
    
