package com.eyepoppy;

public class Node {

    private int value;
    private Node next;//type of itself?

    //what about constructor?
    //I forgot. Yes it require a constructor to pass value

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
