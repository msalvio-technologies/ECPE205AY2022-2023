package com.ecpe205.endtermexam;

public class MyLinkedList {
    private Node head;
    private int size;


    /**
     * adds value to the tail
     * @param value
     */
    public void push(char value) {
        var newNode = new Node();
        newNode.setValue(value);

        if (head == null)
        {
            head = newNode;
            size++;
            return;
        }

        // There's already a head, get the tail
        // and set next.
        getTail().setNext(newNode);
        size++;
    }

    /**
     * gets the nth node from the last
     */
    private Node getTail(int backwards /* index from the last */)
    {
        var currentNode = head;
        for(int i = 0; i < size - 1 - backwards; i++)
        {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    /**
     * gets the very last node
     * @return
     */
    private Node getTail()
    {
        return getTail(0);
    }

    /**
     * removes and returns the tail ; if the list is empty, return null
     */
    public Character pop() {

        if (isEmpty())
            return null;

        if (size <= 1) // There's only a head, return the head.
        {
            size--;
            return removeFirst();
        }

        var currentTail = getTail();
        var nodeBeforeTail = getTail(1);
        nodeBeforeTail.setNext(null);

        size--;
        return currentTail.getValue();
    }

    /**
     * removes and returns the head; if the list is empty, return null
     */
    public Character removeFirst() {
        if (isEmpty())
            return null;

        var currentHead = head;
        head = head.getNext();
        size--;
        return currentHead.getValue();
    }

    /**
     * returns true if the list is empty, otherwise return false
     * @return
     */
    public boolean isEmpty() {
        return head == null;
    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }
}
