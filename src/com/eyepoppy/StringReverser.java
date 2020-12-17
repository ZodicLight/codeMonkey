package com.eyepoppy;
import java.util.Stack;

public class StringReverser {

    public String reverse(String input){

        if(input == null){
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();

        char[] charArray = input.toCharArray();

        for (char c : charArray){//keep forgeting how to write loops
            stack.push(c);
        }

        StringBuffer reversed = new StringBuffer();
        while(!stack.empty()){//remove count valuable
            //System.out.println(stack.pop());//it pop out d & b
            //temp += stack.pop();// += everything create a new string
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
