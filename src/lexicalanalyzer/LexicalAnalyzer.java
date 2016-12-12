/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicalanalyzer;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 *
 * @author Akram
 */
public class LexicalAnalyzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Map<String, String> keywords = new HashMap<String, String>();
         ArrayList<String> code = new ArrayList<>();
         IO file = new IO();
         ArrayList<Token> tokensList = new ArrayList<>();
         keywords = file.LoadKeywords(keywords); //Load Keywords
         code = file.ReadFile("code.rb");//Load Code
         
         Tokenizer tokenizer = new Tokenizer(keywords,code);
         tokensList=tokenizer.tokenize();
        
        if(!tokenizer.isErrorflag()){
         for (Token tokensList1 : tokensList) {
            tokensList1.showPair();
        }
        }
//         Scanner s = new Scanner(System.in);      
//         String sentence = s.nextLine();
//         StringTokenizer st = new StringTokenizer(sentence,"[+-*=() ]",true);
//         while(st.hasMoreTokens()){
//             String nextToken = st.nextToken();
//             if(keywords.containsKey(nextToken)){
//                 System.out.println(nextToken+ " "+ keywords.get(nextToken));
//             }
//         }

         

        
        
    }
    
    
    
}
