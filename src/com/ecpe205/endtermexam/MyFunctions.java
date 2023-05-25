package com.ecpe205.endtermexam;

public class MyFunctions {
    public static void main(String[] args) {
        String word1, word2, word3;
        word1 = "I did, did I?";
        word2 = "Racecar";
        word3 = "hello";
        MyLinkedList stack = new MyLinkedList();
        for (int i=0; i<word1.length()-1;i++){
            while(word1.charAt(i)>='a'&&word1.charAt(i)<='z'){
                Character push = word1.charAt(i);
                stack.push(push);}
        }
        stack.Display();
    }
    /**
     * returns true if it is a palindrome, otherwise returns false
     * ignore spaces and other punctuations you can do so by checking if the character is
     * x >= 'a' and x <= 'z'
     *
     *
     * The palindrome uses stack and queues. The algorithm will be discussed during the examination
     * @return
     */
    public static boolean isPalindrome(String word) {
        MyLinkedList stack = new MyLinkedList();
        MyLinkedList queue = new MyLinkedList();
        for (int i=0; i<=word.length()-1;i++){
            if(word.charAt(i)>='A'&&word.charAt(i)<='z'){
            Character push = word.charAt(i);
            stack.push(push);}
        }
        stack.Display();
        for(int i=word.length()-1;i>=0;i--){
            if(word.charAt(i)>='A'&&word.charAt(i)<='z'){
            Character push = word.charAt(i);
            queue.push(push);}
        }
        queue.Display();

        while(!stack.isEmpty())
        {
            if (!stack.pop().toString().equalsIgnoreCase(queue.pop().toString()))
            {
                return  false;
            }
        }

        return true;
    }


}
