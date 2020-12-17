package com.eyepoppy;

import java.util.Arrays;
import java.util.Stack;

public class Main{

    public static void main(String[] args){

        //Edge cases
        //(
        //(()
        //) (
        //( }

        boolean result;
        //String str = "(([1] + <2>))[a]";//once it hit a close bracket and go backward
//        String str = ")1 + 2(";//false, empty stack error
//        String str = "(1 + 2)";//true
//        String str = "C1 + 2(";//false
//        String str = "((1 + 2)";
        String str = "(1 + 2)";

        BalancedExp balance = new BalancedExp();
        result = balance.balExp(str);
        System.out.println(result);

//        String str = "abcd";
//
//        StringReverser reverser = new StringReverser();
//        String result = reverser.reverse(null);
//
//        System.out.println(result);


    }
}