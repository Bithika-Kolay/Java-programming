package com.company;

public class CWH_14_String_methods {
    public static void main(String[] args) {
        String name= "Harry";
        System.out.println(name.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,3));
      //  System.out.println(name.replace('r','p'));
      //  System.out.println(name.replace("rry","ier"));
        System.out.println(name.startsWith("ha"));
      //  System.out.println(name.charAt(2));
      //  System.out.println(name.indexOf("ar"));
        System.out.println(name.indexOf("ry",3));
       // System.out.println(name.indexOf("kiyft",4));
       // String Modified_name = "Harryrryrry";
       // System.out.println(Modified_name.lastIndexOf("rry"));
       // System.out.println(Modified_name.lastIndexOf("rry",7));
        //System.out.println("I am Bithika \t I am a student");


    }
}
