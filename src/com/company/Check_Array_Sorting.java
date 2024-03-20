package com.company;

public class Check_Array_Sorting {
    //check if an array is sorted or not
    public static boolean isSorted(int arr[], int index){
        if(index== arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
           return isSorted(arr,index+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
       int arr[] = {1,9,5};
        System.out.println(isSorted(arr,0));

    }
}
