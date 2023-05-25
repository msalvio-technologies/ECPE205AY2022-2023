package com.ecpe205.endtermexam;

public class MyLinkedList {
    private Node head;
    private int size;


    /**
     * adds value to the tail
     * @param value
     */
    public void push (char value) {
        Node n = new Node();
        n.setValue(value);
        if (head == null){
            head = n;
        }else{
            Node currentLast = head;
            while(currentLast.getNext() != null){
                currentLast = currentLast.getNext();
            }
            currentLast.setNext(n);
        }
        size++;
    }

    /**
     * removes and returns the tail ; if the list is empty, return null
     * @param value
     */
    public Character pop () {
        Node save = new Node();
        if (head == null ){
            return null;
        }else if(head.getNext() == null){
            save = head;
            head = null;
            size--;
        }else {
            Node currentNode = head;
            for(int i = 0; i < size - 2; i++)
            {
                currentNode = currentNode.getNext();
            }

            Node lastNode = currentNode.getNext();
            currentNode.setNext(null);
            return lastNode.getValue();
        }
        return save.getValue();
    }

    /**
     * removes and returns the head; if the list is empty, return null
     */
    public Character removeFirst() {
        if (head != null){
            Node oldHead = head;
            Node newHead = head.getNext();
            oldHead.setNext(null);
            head = newHead;
            head.setNext(newHead.getNext());
            size--;
            return oldHead.getValue();
        }else if (head == null){
            head = null;
        }
        return null;
    }

    /**
     * returns true if the list is empty, otherwise return false
     * @return
     */
    public boolean isEmpty() {
        if (head == null){
            return true;
        }
        return false;
    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }
    public void display(){
        Node charac = head;
        while(charac != null){
            System.out.print(charac.getValue());
            charac = charac.getNext();
        }
    }
}
