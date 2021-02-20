package com.eyepoppy;

import java.util.Arrays;
import java.util.Stack;

public class Main{

    public static void main(String[] args){
        boolean result;
        //String str = "{1 + 2)";
        //int[] numbers = new int[4];
        //int[] numbers = {10,20,30};

        TwoStacks stack = new TwoStacks(13);
        stack.printLen();
        stack.push1(10);
        stack.push1(20);
        stack.push1(30);
        stack.push1(40);
        stack.push1(50);
        stack.push1(60);
        stack.push1(70);//return full
//        stack.push1(80);


//        System.out.println(stack.isEmpty1());
//        stack.pop1();
//        stack.push1(81);
//        stack.pop1();
//        stack.pop1();
//        stack.push1(82);
//=============================================
        stack.push2(15);
//        stack.push2(25);
//        stack.push2(35);
//        stack.push2(45);
//        stack.push2(55);
//        stack.push2(65);//lastCount2 11 correct
//        stack.push2(75);//ArrayIndexOutOfBoundsException

//        stack.pop2();
//        stack.push2(75);
//        stack.pop2();
//        stack.pop2();
//        stack.push2(76);

//        System.out.println(stack.isEmpty2());
        //stack.printCount();
        System.out.println(stack.toString());
        stack.printLast();

//        StackEx11 numbers = new StackEx11(3);
//
//        numbers.push(10);
//        numbers.push(20);
//        numbers.push(30);
//        numbers.push(40);
//        numbers.pop();
//        numbers.pop();


        //result = numbers.isEmpty();
//        numbers.peek();
        //System.out.println(numbers);//call toString method on the object

//        numbers.print();
        //System.out.println("isEmpty: " + result);

        
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));

        //String str = "(([1] + <2>))[a]";//once it hit a close bracket and go backward
//        String str = ")1 + 2(";//false, empty stack error
//        String str = "(1 + 2)";//true
//        String str = "C1 + 2(";//false
//        String str = "((1 + 2)";

//        //balance brackets=============================
//        //=============================================
//        BalancedExp balance = new BalancedExp();
//        result = balance.balExp(str);
//        System.out.println(result);


//        //String Reverser
//        //===============================================
//        String str = "abcd";
//
//        StringReverser reverser = new StringReverser();
//        String result = reverser.reverse(null);
//
//        System.out.println(result);


    }
}