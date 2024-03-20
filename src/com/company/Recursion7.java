package com.company;
import java.util.HashSet;
public class Recursion7 {
    //print all unique subsequences of a string
    public static void uniqueSubsequences(String str, int idx, String newString,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar = str.charAt(idx);
     uniqueSubsequences(str,idx+1,newString+currentChar,set);
     uniqueSubsequences(str,idx+1,newString,set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequences(str,0,"",set);

    }
}
