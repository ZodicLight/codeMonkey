package com.eyepoppy;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExp {

    //every time this is called, it will create a new memory block, which is not good.
    private final List<Character> leftBrackets = Arrays.asList('(','<','[','{');

    public boolean balExp(String input){
        int count = 0;

        if(input == null){
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();

        //char[] charArray = input.toCharArray();

        for (char c : input.toCharArray())
        {
            if(isLeftBracket(c))//(
            {
                stack.push(c);
            }

            //stack.peek();

            if(isRightBracket(c))//(
            {
                if(stack.empty()){
                    return false;
                }

                char top = stack.pop();
                System.out.println(top);
                if(isBracketMatch(c, top)) return false;
                //this condition is hard to understand.  c equal ) and top not equal ( -> return false

            }
//            System.out.println(stack.peek());

        }

        //System.out.println(stack.peek());

        return stack.empty();
    }

    private boolean isLeftBracket(char c)
    {
        return leftBrackets.contains(c);
    }

    private boolean isRightBracket(char c){
        return c == ')'|| c == '>' || c == ']' || c == '}';
    }

    private boolean isBracketMatch(char left, char right){//alt & enter rename the whole c to left & top to right
        return      (left == ')' && right != '(')||
                (left == '>' && right != '<')||
                (left == ']' && right != '[')||
                (left == '}' && right != '{');
    }
}

