package com.company;

public class CWH_24_break_continue {
    public static void main(String[] args) {
        int i=0;
       // while(i<5){
          //  System.out.println(i);
          //  System.out.println("java is great");
          //  i++;
           // if(i==2){
              //  System.out.println("ending the loop");
              //  break;
           // }
        //}
         do{
             System.out.println(i);
             i++;
             System.out.println("java is great");
             if(i==2){
                 System.out.println("ending the loop");
                 break;
             }
             
         }while (i<5);
        System.out.println("loop ends here");
    }
}
