package com.eyepoppy;
import sun.text.normalizer.UCharacter;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExp {

    //every time this is called, it will create a new memory block, which is not good.
    private final List<Character> leftBrackets = Arrays.asList('(','<','[','{');
    private final List<Character> rightBrackets = Arrays.asList(')','>',']','}');


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
//                System.out.println("top: " + top);
//                System.out.println("c: " + c);
                System.out.println("isBracket: " + isBracketMatch(c, top));
                //if(!isBracketMatch(c, top)) return false;
                if(!isBracketMatch(c, top)) return false;// ! or no ! plus false or true
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


    private boolean isRightBracket(char c)
    {
        return rightBrackets.contains(c);
    }

//    private boolean isBracketMatch(char right, char left){//alt & enter rename the whole c to left & top to right
//        // ( < [ {
//        // ) > ] }
//        //System.out.println("right: " + rightBrackets.indexOf(right));
//        //System.out.println("left: " + leftBrackets.indexOf(left));
//        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
//
//    }

    private boolean isBracketMatch(char left, char right){//alt & enter rename the whole c to left & top to right
//        System.out.println("left: " + left);
//        System.out.println("right: " + right);


        return  (left == ')' && right == '(')||//don't like this kind logical, if return false. Why??
                (left == '>' && right == '<')||
                (left == ']' && right == '[')||
                (left == '}' && right == '{');

//        return  (left == ')' && right != '(')||//don't like this kind logical, if return false. Why??
//                (left == '>' && right != '<')||
//                (left == ']' && right != '[')||
//                (left == '}' && right != '{');
    }

}

