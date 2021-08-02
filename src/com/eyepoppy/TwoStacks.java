package com.eyepoppy;

import java.util.Arrays;

public class TwoStacks {

    private int[] stacks; //array pural
    private int count1 = 0;// count1 = -2;
    private int count2 = 1;
    private int lastCount1;
    private int lastCount2;

    public TwoStacks(int length){
        stacks = new int[length];
    }

    public void printLen(){
        System.out.println("Array Length: " + stacks.length);
    }

    public void printCount(){
        System.out.println("Count1: " + count1);
    }

    public void printLast(){
        System.out.println(" ");
        System.out.println("lastCount1: " + lastCount1);
        System.out.println("lastCount2: " + lastCount2);
    }

    public void push1(int data){

        //System.out.println("count1: " + count1);
        //
        if(stacks.length-1 < count1){//correct, do I need -1
//            System.out.println("true");
//            System.out.println("Stack One Full");

            throw new ArrayIndexOutOfBoundsException();
        }

        stacks[count1] = data;//shot cut
        count1 = count1 + 2;//cause problem for pop1()

        lastCount1 = count1-2;
        //System.out.println("LastCount1: " + lastCount1);
    }


    public void push2(int data){
        System.out.println("count2: " + count2);

        if(stacks.length-1 < count2){//correct
            System.out.println("Stack two Full");
            throw new ArrayIndexOutOfBoundsException();
        }

        stacks[count2] = data;//shot cut
        count2 = count2 + 2;

        lastCount2 = count2-2;//bug here 

        System.out.println("LastCount2: " + lastCount2);
    }

    public void pop1(){
//        System.out.println("pop: ");
//        System.out.println("lastCount1: " + lastCount1);
//        System.out.println("Count1 start: " + count1);

        //System.out.println("pop count1: " + count1);
        stacks[lastCount1] = 0;
        count1 = count1 - 2;
        lastCount1 = lastCount1 -2;
//        System.out.println("count1 end: " + count1);
    }

    public void pop2(){
//        System.out.println("pop: ");
//        System.out.println("lastCount1: " + lastCount1);
//        System.out.println("Count1 start: " + count1);

        //System.out.println("pop count1: " + count1);
        stacks[lastCount2] = 0;
        count2 = count2 - 2;
        lastCount2 = lastCount2 -2;
//        System.out.println("count1 end: " + count1);
    }

    public boolean isEmpty1(){
        System.out.println("isEmpty1");
        System.out.println("count1: " + count1);
        if (count1 == 0) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty2(){
        System.out.println("isEmpty2");
        System.out.println("count2: " + count2);
        if (count2 == 1) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull1(){
        //mod to find out is it even or odd
        //length odd,  the last node is index 12, length -1
        //length even, the last node will be 11, length -2
        //System.out.println("result: " + result);

        if(stacks.length%2 == 0){
            //System.out.println("even");//len even: Len - 2 is the endindex
            if(stacks.length-2 == lastCount1){//don't know the length.. length could be odd or even
                return true;
            }else{
                return false;
            }
        }else{
            //System.out.println("odd");//Len odd: Len -1 is the endindex
            if(stacks.length-1 == lastCount1){//don't know the length.. length could be odd or even
                return true;
            }else{
                return false;
            }
        }
        //important skills to share this problem with other ppl and make it as simple as possible
    }

    public boolean isFull2(){
        //mod to find out is it even or odd
        //length odd,  the last node is index 12, length -2
        //length even, the last node will be 11, length -1

        if(stacks.length%2==0){
            System.out.println("even");
            if(stacks.length-1 == lastCount2){
                return true;
            }else{
                return false;
            }
        }else{
            System.out.println("odd");
            if(stacks.length-2 == lastCount2){
                return true;
            }else{
                return false;
            }
        }
    }


    @Override
    public String toString(){
        return Arrays.toString(stacks);
    }


}
