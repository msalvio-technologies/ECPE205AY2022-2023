package com.ecpe205.endtermexam;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MyFunctionsTest {
    MyLinkedList linkedList = new MyLinkedList();


    /**
     * 1. Create a Test that will test the push function ; Push 5 values , check the size and if the values are added in correct order
     */
    @Test
    void ShouldPushValues(){
        linkedList.push('a');
        assertEquals(1 ,linkedList.getSize());
        linkedList.push('b');
        assertEquals(2 ,linkedList.getSize());
        linkedList.push('c');
        assertEquals(3 ,linkedList.getSize());
        linkedList.push('d');
        assertEquals(4 ,linkedList.getSize());
        linkedList.push('e');
        assertEquals(5 ,linkedList.getSize());


    }




    /**
     * 2. Create a Test that will test the push-pop function ; Check if the pop returns the correct value and make sure to test pop when the list is empty ;
     * also check the size
     */


    @Test
    void ShouldPushAndPop(){
        linkedList.push('a');
        assertEquals(1 ,linkedList.getSize());
        linkedList.push('b');
        assertEquals(2 ,linkedList.getSize());
        linkedList.push('c');
        assertEquals(3 ,linkedList.getSize());
        assertEquals('c', linkedList.pop());
        assertEquals(2,linkedList.getSize());
        assertEquals('b',linkedList.pop());
        assertEquals(1,linkedList.getSize());


    }


    /**
     * 3. Create a Test that will test the addLast ; Add 5 values, check the size and if the values are added in correct order
     */
    /**
     * 4. Create a Test for removeFirst; add 5 values using addLast, then execute removeFirst, for each, check if the size is correct and if the correct value is returned;
     * Make sure to test removeFirst when the list is empty
     */
    @Test
    void ShouldRemoveFirst(){
        linkedList.push('a');
        linkedList.push('b');
        linkedList.push('c');
        linkedList.push('d');
        assertEquals('a',linkedList.removeFirst());
        assertEquals(3,linkedList.getSize());
        assertEquals('b',linkedList.removeFirst());
        assertEquals(2,linkedList.getSize());
        assertEquals('c',linkedList.removeFirst());
        assertEquals(1,linkedList.getSize());




    }


    /**
     * 5. Create a Test method for isEmpty ; Use Push/Pop function and addLast/removeFirst function
     */
    @Test
    void ShouldKnowIsEmpty(){
        linkedList.push('a');
        linkedList.push('b');
        linkedList.push('c');
        linkedList.push('d');
        linkedList.push('e');
        assertEquals('a',linkedList.removeFirst());
        assertEquals(4,linkedList.getSize());
        assertEquals('b',linkedList.removeFirst());
        assertEquals(3,linkedList.getSize());
        assertEquals('e', linkedList.pop());
        assertEquals(2,linkedList.getSize());
        assertEquals('d', linkedList.pop());
        assertEquals(1,linkedList.getSize());
        assertEquals('c', linkedList.pop());
        assertEquals(0,linkedList.getSize());
        assertEquals(true, linkedList.isEmpty());

    }


    /**
     * 6. Create a Test method for isPalindrome with the following values
     * I did, did I? - palindrome
     * Racecar - palindrome
     * hello - not a palindrome
     */
    @Test
    void ShouldTestPalindrome(){
        MyFunctions word = new MyFunctions();

        assertEquals(true,word.isPalindrome("RACEcar"));
        assertEquals(false,word.isPalindrome("HONda"));
        assertEquals(true,word.isPalindrome("Civic"));
        assertEquals(true,word.isPalindrome("Iddiddi"));
    }

}