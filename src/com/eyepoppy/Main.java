package com.eyepoppy;

import java.util.Arrays;
import java.util.Stack;

public class Main{

    public static void main(String[] args){
        //boolean result;
        //String str = "{1 + 2)";
        //int[] numbers = new int[4];
        //int[] numbers = {10,20,30};

        //recursion call
        //System.out.println(factorial(4));

        //===================================================
        //Btree
        //===================================================

        int[] sortArray = {5,3,9, 7, 10, 8};
        BubbleSort aBubble = new BubbleSort(sortArray);



//        Btree tree = new Btree();
//        tree.insert(7);
//        tree.insert(4);
//        tree.insert(9);
//        tree.insert(1);
//        tree.insert(6);
//        tree.insert(8);
//        tree.insert(10);


//        tree.insert(1);
//        tree.insert(4);
//        tree.insert(6);
//        tree.insert(7);
//        tree.insert(8);
//        tree.insert(9);
//        tree.insert(10);

//        tree.insert(9);
//        tree.insert(7);
//        tree.insert(4);
//        tree.insert(6);
//        tree.insert(8);
//        tree.insert(1);
//        tree.insert(10);

//        tree.traversePreOrder();//can't pass the root node because it is private?
//        //System.out.println(tree.find(10));
//        tree.traverseInOrder();
//        tree.traversePostOrder();
//
//        System.out.println("Done");




        //===================================================
        //LinkList
        //===================================================

//        LinkedList test = new LinkedList();
//
//        test.addFirst(10);
//        test.addFirst(20);
//        test.addFirst(30);
//        test.print();;


        //===================================================
        //minStacks
        //===================================================
//        MinStack stack = new MinStack(5);
//        stack.push(5);
//        stack.push(2);
//        stack.push(10);
////        stack.push(1);
//        stack.push(-3);
//        stack.push(-4);
//
//
//
////        stack.pop();
////        stack.pop();
////        stack.pop();
////        stack.pop();
//
//        stack.print();
//        stack.min();

        //===================================================
        //TwoStacks
        //===================================================

//        TwoStacks stack = new TwoStacks(16);
//        stack.printLen();
//        stack.push1(10);
//        stack.push1(20);
//        stack.push1(30);
//        stack.push1(40);
//        stack.push1(50);
//        stack.push1(60);
//        stack.push1(70);//return full
//        stack.push1(80);
//
//
//        System.out.println(stack.isEmpty1());
//        stack.pop1();
//        stack.push1(81);
//        stack.pop1();
//        stack.pop1();
//        stack.push1(82);
//
//        stack.push2(15);
//        stack.push2(25);
//        stack.push2(35);
//        stack.push2(45);
//        stack.push2(55);
//        stack.push2(65);
//        stack.push2(75);//ArrayIndexOutOfBoundsException
//
//        stack.pop2();
//        stack.push2(75);
//        stack.pop2();
//        stack.pop2();
//        stack.push2(76);
//
//        System.out.println(stack.isEmpty2());
//        System.out.println(stack.toString());
//        System.out.println(stack.isFull1());
//        System.out.println(stack.isFull2());
//
//        stack.printLast();

//===================================================
        //stackEx11
        //dynamic array
//===================================================


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

//        =============================================
//        //balance brackets
//        =============================================
//        BalancedExp balance = new BalancedExp();
//        result = balance.balExp(str);
//        System.out.println(result);

//        ===============================================
//        //String Reverser
//        ===============================================
//        String str = "abcd";
//
//        StringReverser reverser = new StringReverser();
//        String result = reverser.reverse(null);
//
//        System.out.println(result);

    }
    //===================================================
    //Recursion
    //===================================================
    //recursion
    public static int factorial(int n){
        if(n == 0)
            return 1;
        return n * factorial(n-1);
    }


//    public static int factorial(int n)//not recursion but same result
//    {
//        int factorial = 1;
//        for (int i = n; i > 1; i--){//i = 4; i > 1; i --
//            factorial *= i;//<- what does this do?
//            System.out.println("i: " + i);
//            System.out.println("inside: " + factorial);
//
//        }
//
//        return factorial;
//    };



}