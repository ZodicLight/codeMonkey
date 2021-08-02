package com.eyepoppy;

public class Btree {
    private class Node{//linklist
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value = value;
        }

        @Override
        public String toString(){
            return "Node =" + value;
        }

    }

    private Node root;

    public void insert(int value)
    {
        Node node = new Node(value);

        if (root == null){ //root is empty
            root = node;
            return;
        }

        Node current = root;
        while(true){//infinite loop
            if(value < current.value) {
             if(current.leftChild == null){//eventually the node will be null
                 current.leftChild = node;
                 break;
             }
             current = current.leftChild;
            }
            else {
                if(current.rightChild == null){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value)
    {

        Node current = root;
        while(current != null)
        {
            if(value < current.value)
                current = current.leftChild;
            else if(value > current.value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }

    public void traversePostOrder(){
        System.out.println("PostOrder:");
        traversePostOrder(root); //<- how does this work?
    }

    private void traversePostOrder(Node root){
        if(root == null)
            return;
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }


    public void traverseInOrder(){
        System.out.println("InOrder:");
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root){//sorted
        if(root == null)
            return;

        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }


    public void traversePreOrder(){//overload
        System.out.println("PreOrder:");
        traversePreOrder(root);//call the private root node and method here

    }

    private void traversePreOrder(Node root){
        if(root == null)
            return;

        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }
}
