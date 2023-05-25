package com.ecpe205.endtermexam;

public class MyLinkedList {
    private Node head;
    private int size;
    public static void main(String[] args) {
        String word1, word2, word3;
        word1 = "I did, did I?";
        word2 = "Racecar";
        word3 = "hello";
        MyLinkedList stack = new MyLinkedList();
        for (int i=0; i<=word1.length()-1;i++){
            if(word1.charAt(i)>='A' && word1.charAt(i)<='z'){
                Character push = word1.charAt(i);
                stack.push(push);}
        }
        stack.Display();
    }


    /**
     * adds value to the tail
     *
     * @param value
     * @return
     */
    public void push (char value) {
        Node node = head;
        Node tail = new Node();
        tail.setValue(value);
        if(head==null){
            head = tail;
        }
        else{
            while(node.getNext()!=null){
                node=node.getNext();
            }
            node.setNext(tail);
        }
        size++;
    }

    /**
     * removes and returns the tail ; if the list is empty, return null
     * @paramvalue
     */
    public Character pop () {
        Node node = head;
        Node tail = new Node();
        if(head.getNext()==null){
            tail = head;
            head = null;
            size--;
            return tail.getValue();
        }
        if(head.getNext()!=null){
            while(node.getNext().getNext()!=null){
                node = node.getNext();
            }
            tail = node.getNext();
            node.setNext(null);
            size--;
            return tail.getValue();
        }
        return null;
    }

    /**
     * removes and returns the head; if the list is empty, return null
     */
    public Character removeFirst() {
        Node oldHead = head;
        Node newHead = head.getNext();
        if(head.getNext()==null){
            Node save = head;
            head=null;
            size--;
            return save.getValue();
        }
        if(head.getNext()!=null){
            Node save = oldHead;
            head = newHead;
            oldHead.setNext(null);
            size--;
            return save.getValue();
        }
        return null;
    }

    /**
     * returns true if the list is empty, otherwise return false
     * @return
     */
    public boolean isEmpty() {
        if(head==null){
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
    public  void Display(){
        Node node = head;
        if(head==null){
            System.out.print("null");
        }
        while(node.getNext()!=null){
            System.out.print(node.getValue());
            node = node.getNext();
        }
        System.out.print(node.getValue());
        System.out.println();
    }
}
