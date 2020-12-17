package com.eyepoppy;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.function.DoubleToIntFunction;

class LinkedList{

    private class Node {//class within a class
        private int _value;
        private Node _next;

        public Node(int value){
            this._value = value;
        }//I like this naming convention _value
    }

    private Node _head;
    private Node _tail;
    private int size;

    public void show(){//great way to start LinkList.. display a NODE info
        Node newNode = new Node(9);
        System.out.println("Head: " + _head);
        System.out.println("tail: " + _tail);
        //System.out.println("newNode.next: " + newNode._next);
        //System.out.println("newNode.value: " + newNode._value);
    }

    public void addLast(int value){
        Node newNode = new Node(value);//newNode is great name
        if(_head == null){//no linkList
            _head = _tail = newNode;//important, every list must have head and tail
            size++;
        }else{
            _tail._next = newNode;//correct
            _tail = newNode;//correct
            //newNode._next = null;
            size++;
        }
    }

    public void addFirst(int value){
        Node newNode = new Node(value);//why he use var instead of Node
        if(_head == null){
            _head = _tail = newNode;//important, every list must have head and tail
            size++;
//            System.out.println("head47: "+ _head);
//            System.out.println("value48: "+ _head._value);
        }else{
            newNode._next = _head;
            _head = newNode;
            size++;
//            System.out.println("head53: "+ _head);
//            System.out.println("value54: "+ _head._value);
        }
//        System.out.println("value53: "+ _head._value);
//        System.out.println("head52: "+ _head);

    }

    public void removeFirst(){
        Node current = _head;
        if(_head == null)
        {
            System.out.println("empty LinkList");
            throw new NoSuchElementException();
        }else if (_head == _tail)
        {
            _head = _tail = null;
            size--;
        }else
        {
            //_head._next = null;//this cause problem
            _head =current._next;
            current._next = null;
            size--;
        }
//        System.out.println("current: " + current);
//        System.out.println("head: " + _head);
//        System.out.println("current.next: " + current._next);
//        System.out.println("head.next: " + _head._next);
    }

    public void removeLast(){
        Node current = _head;
        if(_head == null)
        {
            //System.out.println("empty Linklist");
            throw new NoSuchElementException();
        }
        else if(_head == _tail)
        {
            //System.out.println("empty Linklist");
            _head = _tail = null;
            size--;
        }
        else
        {
            while(current != null){

                if(current._next == _tail){//if it is only one node, current._next will be null. So this will never execute
                    System.out.println("value: " + current._value);
                    _tail = current;//2nd last node
                    _tail._next = null;//for garbage collector
                    size--;//should I put it here
                }
                current = current._next;//while loop move to the next node
            }
            //size--;//should I put it here
        }

//        System.out.println("End current: " + current);
//        //System.out.println("current.next: " + current._next);//this line cost error
//        System.out.println("tail: " + _tail);
//        System.out.println("tail next: " + _tail._next);
//        System.out.println("tail value: " + _tail._value);
    }

    private Node getPrevious(Node node){//this will be good for reverse
        Node current = _head;

        while(current != null){

            if(current._next == node){//if it is only one node, current._next will be null. So this will never execute
                System.out.println(" previous value: " + current._value);
                return current;
            }
            current = current._next;//while loop move to the next node
        }
        return null;
    }


    public boolean isEmpty(){
        if(_head == null){
            //System.out.println("LinkList is Empty");
            return true;
        }else{
            //System.out.println("LinkList is NOT Empty");
            return false;
        }
    }

    public boolean contain(int value){
        //may be better return int, 0 mean none, 1, 2, 3, 4. is this magic number?
        boolean isExist;
        Node current = _head;
        if(isEmpty()){//if true then
            System.out.println("No LinkList created");
        }else{
            while(current != null){
                if(current._value == value){
                    //System.out.println("current._value: " + current._value);
                    return isExist = true;
                }
                current = current._next;
            }
        }
        return isExist = false;//how many?
    }

    public ArrayList indexOf(int value){

        ArrayList indexes = new ArrayList();

        Node current = _head;
        int count = -1;//count = -1 change to array index

        if (contain(value) == false){
            System.out.println("No value in the LinkList");
        }else{

            while(current != null){
                if(current._value == value){
                    count = count +1;
                    //System.out.println("value: " + current._value);
                    indexes.add(count);
                    //System.out.println("count: " + count);

                }else{
                    count = count +1;
                }
            current = current._next;
            }
        }
        return indexes;
    }

    public int size(){
        //System.out.println("size: " + size);
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        Node current = _head;
        int index = 0;
        while(current != null){
            array[index++] = current._value;
            current = current._next;
        }
        return array;
    }

    public void print(){
        if(_head == null){
            //throw ArrayIndexOutOfBoundsException;//try catch
            System.out.println("No LinkList Node");

        }else{
            //System.out.println("else");
            Node current = _head;
            //System.out.println("start: " + current);
            System.out.println("===========Print LinkList==============");
            while (current != null) {
                //System.out.println("while loop");
                System.out.println(current._value);
                System.out.println(current);
                current = current._next;
               // System.out.println("inside: " + current);
            }
//            System.out.println("head: " + _head);
//            System.out.println("tail: " + _tail);
        }
    }

    public void reverse()
    {
        //spend too much time
        //Mosh code
        Node previous = _head;
//        System.out.println("Head230  " + _head);
//        System.out.println("Previous231  " + previous);
        Node current = _head._next;
        System.out.println("--------------------");
        int loop = 0;
        //Node current =_head
        //Node current =_tail;

        if(isEmpty())
        {
            System.out.println("empty LinkList");
        }
        else if(_head==_tail)
        {
            System.out.println("only one node");
        }
        else{

            //System.out.println("size" + size);
//            for (int i=size; i >= 0; i-- ){//the size count reverse
//                //System.out.println("for loop");
//                System.out.println("--------------------");
//                System.out.println("int i: " + i);
//                System.out.println(getPrevious(current));
//                current = current._next;
//            }
//            Node previous = _head;
//            Node current = _head._next;

            while(current != null){
//                loop = loop +1;
//                System.out.println("loop" + loop);
                Node next = current._next; //482
//                System.out.println("previous260: " + previous);
                current._next = previous;//7b6

                previous = current;//482
//                System.out.println("current265: " + current);
//                System.out.println("previou266: " + previous);
                current = next;//

//                System.out.println("--------------------");

//                //System.out.println("int i: " + i);
//                System.out.println(getPrevious(current));
//                current = current._next;
            }
            _tail = _head;
            _tail._next = null;
            _head = previous;


        }

    }

//    public void getKthFromTheEnd(int k)
//    {
//        Node current = _head;
//        Node Kindex;
//        int count = 1;
//        int index;
//        index = size - k;
//        //K-1 -> found how many loop
//
//        while(current != null)
//        {
//            //System.out.println("size: " + size);//start from 1
////            System.out.println("count: " + count);
////            System.out.println("current: " + current);
//            if(count == index)
//            {
//                Kindex = current;
//                System.out.println("index value: " + Kindex._value);
//            }
//            current = current._next;
//            count = count + 1;//where u put the count is important;
//        }
//    }

    public int getKthFromTheEnd(int k)
    {
       if(isEmpty())
       {
            throw new IllegalStateException();
       }

       Node a = _head;//distance pointer, this one return an answer
       Node b = _head;//last pointer

       for (int i=0; i < k-1; i++)//this move the b forward K step
       {
           b = b._next;
           //System.out.println("i: " + i);
           if(b == null)
           {
                throw new IllegalArgumentException();
           }
       }

       while(b != _tail)//b?
       {
           a = a._next;//how do you know is next?
           b = b._next;
       }
        System.out.println("a: " + a._value);
        System.out.println("b: " + b._value);

       return a._value;
    }

    public void whileloop()
    {
        Node a = _head;
        Node b = _head;

//        while( b != _tail && b._next != _tail){ //b NOT 40 && b.next is NOT 40
//            //while will stop
//            b = b._next._next;//this work?
//            //System.out.println("b value: " + b._value);
//            a = a._next;
//            //System.out.println("a value: " + a._value);
//
//        }

        while( b != _tail && b._next != _tail){ //if true than run, b NOT 40 && b.next is NOT 40
            b = b._next._next;//this work?
            System.out.println("b value: " + b._value);

        }

    }

    public void addFirstCycles(int value){
        Node newNode = new Node(value);//why he use var instead of Node
        if(_head == null){
            _head = _tail = newNode;//important, every list must have head and tail
            size++;
//            System.out.println("head47: "+ _head);
//            System.out.println("value48: "+ _head._value);
        }else{
            newNode._next = _head;
            _head = newNode;
            _tail = _head; //it should be a loop
            size++;
//            System.out.println("head53: "+ _head);
//            System.out.println("value54: "+ _head._value);
        }
//        System.out.println("value53: "+ _head._value);
//        System.out.println("head52: "+ _head);

    }

    public void printMiddle()
    {
        Node a = _head;
        Node b = _head;
        boolean lessTwoNodes = false;
        
        if(_head == null){
            System.out.println("Empty LinkList");
            return;
        }

//        System.out.println("tail: " + _tail._value);
//        System.out.println("test 01");
        //  b != _tail && b._next != _tail
        while(b != _tail && b._next != _tail ){ //both will exception in turn of odd and even at the end
            //while will stop
            b = b._next._next;//this work?
            //System.out.println("b value: " + b._value);
            a = a._next;
            //System.out.println("a value: " + a._value);
            lessTwoNodes = true;
        }

//        System.out.println(b._value);
//        System.out.println(b._next);

        if(lessTwoNodes == false){
            System.out.println("It has less than three nodes");
            return;
        }

        if(b == _tail){//u got understand the loop
            System.out.println("middle: " + a._value);
        }else{
            System.out.println("middle: " + a._value + ", " + a._next._value);
        }
    }
}