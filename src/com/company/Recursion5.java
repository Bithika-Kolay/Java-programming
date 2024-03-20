package com.company;

public class Recursion5 {
    public static void moveAllX(String str,int index,int count,String newString){
        if(index==str.length()){
            for(int i = 0;i<count;i++){
                newString += 'x';

            }
            System.out.println(newString);
            return;
        }
        char currentCharacter = str.charAt(index);
        if(currentCharacter=='x'){
            count++;
            moveAllX(str,index+1,count,newString);

        }else {
            newString += currentCharacter;
            moveAllX(str,index+1,count,newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbxcxdx";
        moveAllX(str,0,0,"");


    }
}
