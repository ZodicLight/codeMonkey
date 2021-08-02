package com.eyepoppy;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;

public class MinStack {
    private int[] stacks;//array use pural
    private int count = 0;
//    private int lastCount = 0;

    //dynamic array? all the null value is zero. It would be a problem
    //good facebook question

    //constructor
    public MinStack(int length){
        stacks = new int [length];//value name no cap?
    }

    public void push(int value){
        if(count > stacks.length-1){// 4 > 3 true, 3 > 3 false
            System.out.println("Count larger than index: " + count);
            throw new ArrayIndexOutOfBoundsException();
        }
        stacks[count] = value;
        count = count + 1;//this count will create problem with edge case with pop function. It need for push stack, so the program will know the next one
        //lastCount = count - 1;//seems there is a better way to do it. Can I change this program without using lastCount??
    }

    public void pop(){
        //System.out.println("Last Count: " + lastCount);
        count = count -1;
        if(count < 0){
            System.out.println("Count less Zero: " + count);
            throw new ArrayIndexOutOfBoundsException();
        }else{
            System.out.println("pop Count: " + count);
            stacks[count] = 0;//it crash the program

            //stacks[lastCount] = 0;//need lastCount for pop
            //lastCount = lastCount -1;
        }
    }

    public int min(){
        //if lastCount or count = 0??
        int min = stacks[0];
        if (count == 0){
            System.out.println("min Count: " + count);
            System.out.println("min empty stack");
            return min;
        }else{
            for(int i=0; i < count; i++){
                if(min > stacks[i]){
                    min = stacks[i];
                }
            }
            System.out.println("Min: " + min);
            return min;
        }
    }

    public void print(){
        //how does the toString override work?
        if(count <=0 ){
            System.out.println("print empty stack");
            return;
        }
        for(int i=0; i< count ;i++){
            System.out.println("Print array: " + stacks[i]);
        }

        System.out.println("Print Count " + count);
//        System.out.println("Print Last Count " + lastCount);
    }

    @Override
    public String toString(){
        return Arrays.toString(stacks);
    }
}
