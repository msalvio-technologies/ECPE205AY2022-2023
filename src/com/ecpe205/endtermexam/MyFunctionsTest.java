package com.ecpe205.endtermexam;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class MyFunctionsTest {
    MyLinkedList list;
    MyFunctions functions;
    @BeforeAll
    void setup(){
        list = new MyLinkedList();
        functions = new MyFunctions();
    }

    /**
     * 1. Create a Test that will test the push function ; Push 5 values , check the size and if the values are added in correct order
     */
    @Test
    public void shouldPush(){
        MyLinkedList list = new MyLinkedList();
        assertEquals(0,list.getSize());
        list.push('a');
        assertEquals('a',list.getHead().getValue());
        assertEquals(1,list.getSize());
        list.push('b');
        assertEquals(2,list.getSize());
        list.push('c');
        assertEquals(3,list.getSize());
        list.push('d');
        assertEquals(4,list.getSize());
        list.push('e');
        assertEquals(5,list.getSize());

        assertEquals('b',list.getHead().getNext().getValue());
        assertEquals('c',list.getHead().getNext().getNext().getValue());
        assertEquals('d',list.getHead().getNext().getNext().getNext().getValue());
        assertEquals('e',list.getHead().getNext().getNext().getNext().getNext().getValue());
    }

    /**
     * 2. Create a Test that will test the push-pop function ; Check if the pop returns the correct value and make sure to test pop when the list is empty ;
     * also check the size
     *
     */
        @Test
        public void shouldPop(){
            MyLinkedList list = new MyLinkedList();
            assertEquals(null,list.pop());
            assertEquals(0,list.getSize());
            list.push('a');
            list.push('b');
            list.push('c');
            assertEquals(3,list.getSize());
            assertEquals('c',list.pop());
            assertEquals('b',list.pop());
        }

    /**
     * 3. Create a Test that will test the addLast ; Add 5 values, check the size and if the values are added in correct order
     */

    /**
     * 4. Create a Test for removeFirst; add 5 values using addLast, then execute removeFirst, for each, check if the size is correct and if the correct value is returned;
     * Make sure to test removeFirst when the list is empty
     */
    @Test
    public void shouldRemoveFirst(){
        MyLinkedList list = new MyLinkedList();
        list.push('w');
        list.push('a');
        list.push('s');
        list.push('d');
        list.push('b');
        assertEquals(5,list.getSize());
        assertEquals('w',list.removeFirst());
        assertEquals(4,list.getSize());
        assertEquals('a',list.removeFirst());
        assertEquals(3,list.getSize());
        assertEquals('s',list.removeFirst());
        assertEquals(2,list.getSize());
        assertEquals('d',list.removeFirst());
        assertEquals(1,list.getSize());
        assertEquals('b',list.removeFirst());
        assertEquals(0,list.getSize());
    }


    /**
     * 5. Create a Test method for isEmpty ; Use Push/Pop function and addLast/removeFirst function
     */
    @Test
    public void shouldEmpty(){
        MyLinkedList list = new MyLinkedList();
        list.push('a');
        assertEquals(false,list.isEmpty());
        list.pop();
        assertEquals(true,list.isEmpty());
    }


    /**
     * 6. Create a Test method for isPalindrome with the following values
     * I did, did I? - palindrome
     * Racecar - palindrome
     * hello - not a palindrome
     */
    @Test
    public void shouldPalindrome(){
        String word1, word2, word3;
        word1 = "I did, did I?";
        word2 = "Racecar";
        word3 = "hello";
        assertEquals(true,MyFunctions.isPalindrome(word1));
        assertEquals(true,MyFunctions.isPalindrome(word2));
        assertEquals(false,MyFunctions.isPalindrome(word3));
    }

}