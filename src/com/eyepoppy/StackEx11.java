package com.eyepoppy;

import java.util.Arrays;

public class StackEx11 {

    private int[] stacks;
    private int count;


    public StackEx11(int length){

        stacks = new int[length];
        //System.out.println("StartCount: " + count);
    };

    public void push(int data){

        if(stacks.length == count){
            //Create a new array(twice the size)
            int[] newStacks = new int[count * 2];

            //Copy all the existing items
            for(int i=0; i < count; i++)
                newStacks[i] = stacks[i];

            // Set "items" to this new array
            stacks = newStacks;
        }
        //System.out.println("Count1: " + count);//count = 0

        stacks[count] = data;//shot cut
        count = count + 1;

        //System.out.println("Count2: " + count);//count = 1

    }

    public void pop(){
        int index = count -1;//don't use stacks.length, it won't work

        //stacks[index] == null;

        if(index < 0 || index >= count)
        {
            throw new IllegalStateException();// IllegalSateException()
        }

        for(int i = index; i < count; i++){//don't use stacks.length

            stacks[i] = stacks[i+1];//what is stack

            //System.out.println("pop stacks[i+1]: " + stacks[i+1]);
        }
        count --;
        //return stack[--count]; <- I don't like this.
    }

    public boolean isEmpty(){

        if(count == 0){
            return true;
        }else{
            return false;
        }
    }

    public void peek(){//only return the top item
        System.out.println(stacks[count-1]);
    }

//    public void peek(){//only return the top item
//        for(int i =0; i < count; i++){
//            System.out.println(stacks[i]);
//        }
//        System.out.println("Peek Count: " + count);
//    }

//    @Override
//    public String toString(){
//        int[] content = Arrays.copyOfRange(stacks, 0, count);
//        return Arrays.toString(content);
//    }
    @Override
    public String toString(){
        return Arrays.toString(stacks);
    }

    public void print(){
        System.out.println("Print");
        System.out.println("=============================");
        for(int i =0; i < stacks.length; i++){
            System.out.println(stacks[i]);
            System.out.println("-------------------------");

        }
        System.out.println("print Count: " + count);
        System.out.println("print Length: " + stacks.length);
    }

}
