package com.ecpe205.endtermexam;

public class MyFunctions {
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
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i)>= 'A'&& word.charAt(i)<=('z')){
                Character input = word.charAt(i);
                stack.push(input);
            }

        }
        for(int i = word.length()-1; i>=0; i--){
            if(word.charAt(i)>= 'A'&& word.charAt(i)<=('z')){
                Character input = word.charAt(i);
                queue.push(input);
            }
        }
        while(stack.isEmpty() == false){
            if(stack.pop().toString().toLowerCase().equals(queue.pop().toString().toLowerCase()) == false) {
                return false;
            }
        }
        return true;



    }
}
