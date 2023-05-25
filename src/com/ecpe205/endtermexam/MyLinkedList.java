package com.ecpe205.endtermexam;

public class MyLinkedList {
    private Node head;
    private int size;


    /**
     * adds value to the tail
     * @param value
     */
    public void push (char value ) {
        Node node = new Node( value );
        Node node1 = head;
        if(head == null){
            head=node;
            size++;
        }
        else{
            while(node1.getNext() != null){
                node1 = node1.getNext();
            }
            node1.setNext(node);
            size++;
        }
    }

    /**
     * removes and returns the tail ; if the list is empty, return null
     * @param value
     */
    public Character pop () {
        Node node = head;
        Node tail;
        if(head == null){
            return null;
        }
        else if(size == 1){
            tail=head;
            head = null;
            size--;
            return tail.getValue();
        }
        else {
            for(int i = 0; i<size-1; i++){
                node = node.getNext();
            }
            tail = node;
            node.setNext(null);
            size--;
            return tail.getValue();

        }
    }

    /**
     * removes and returns the head; if the list is empty, return null
     */
    public Character removeFirst() {
        if (head != null) {
            Node newHead = head.getNext();
            Node oldHead = head;
            oldHead.setNext(null);
            head = newHead;
            size--;
            return oldHead.getValue();
        }
        else{
            return null;
        }
    }

    /**
     * returns true if the list is empty, otherwise return false
     * @return
     */
    public boolean isEmpty() {
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }
}
