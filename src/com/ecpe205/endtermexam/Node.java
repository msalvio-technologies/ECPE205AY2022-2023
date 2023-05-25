package com.ecpe205.endtermexam;

//do not edit

public class Node {
    private char value;
    private Node next;

    public Node (char value){
        this.value=value;
    }


    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
