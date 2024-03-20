package com.company;

public class CWH_forEachLoop {
    public static void main(String[] args) {
        int [] marks ={3,6,8,9,2};
       // for(int i=0;i<marks.length;i++){
       //     System.out.println(marks[i]);
      //  }
        for(int element:marks){
            System.out.println(element);
        }
    }
}
