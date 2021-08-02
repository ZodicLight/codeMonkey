package com.eyepoppy;
import java.util.Arrays;


public class BubbleSort {

    //constructor inside
    public BubbleSort(int[] array){//naming convention
        //array = new int[10];
        sort(array);
        display(array);
    }


    public void sort(int []array){

        for(int i = 0; i < array.length-1 ;i++){
            //missing forloop. Why two forLoop?
            if(array[i+1] < array[i]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                //swap();
            }
        }
    }

    private void swap(int[]array, int index1, int index2){//index 1 and index 2

    }



    public void display(int[] array){
        for(int i = 0; i < array.length ;i++){
            System.out.println(array);
        }

    }

    //test edge cases
    //only two number
    //only singe number
    //empty array



}
