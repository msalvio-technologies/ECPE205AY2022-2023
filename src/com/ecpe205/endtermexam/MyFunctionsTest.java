package com.ecpe205.endtermexam;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MyFunctionsTest {
    MyLinkedList linkedList;
    @BeforeAll
    void setup(){
        linkedList = new MyLinkedList();
    }
    /**
     * 1. Create a Test that will test the push function ; Push 5 values , check the size and if the values are added in correct order
     */
    @ParameterizedTest
    @MethodSource("arrayOfCharSets")
    void shouldPushValues(int size,String word){
        for (int counter = 0; counter < word.length(); counter++){
            linkedList.push(word.charAt(counter));
        }
        assertEquals(size,linkedList.getSize());
        assertEquals(word.charAt(0),linkedList.getHead().getValue());

    }

    /**
     * 2. Create a Test that will test the push-pop function ; Check if the pop returns the correct value and make sure to test pop when the list is empty ;
     * also check the size
     */
    @ParameterizedTest
    @MethodSource("arrayOfCharSets")
    void shouldPushPop(int size,String word){
        for (int counter = 0; counter < word.length(); counter++){
            linkedList.push(word.charAt(counter));
        }
        assertEquals(word.charAt(word.length()-1),linkedList.pop());

    }
    /**
     * 3. Create a Test that will test the addLast ; Add 5 values, check the size and if the values are added in correct order
     */
    @ParameterizedTest
    @MethodSource("arrayOfCharSets")
    void shouldAddLast(int size,String word){
        for (int counter = 0; counter < word.length(); counter++){
            linkedList.push(word.charAt(counter));
        }
        assertEquals(size,linkedList.getSize());
        assertEquals(word.charAt(0),linkedList.getHead().getValue());

    }

    /**
     * 4. Create a Test for removeFirst; add 5 values using addLast, then execute removeFirst, for each, check if the size is correct and if the correct value is returned;
     * Make sure to test removeFirst when the list is empty
     */
    @ParameterizedTest
    @MethodSource("arrayOfCharSets")
    void removeFirst(int size,String word){
        for (int counter = 0; counter < word.length(); counter++){
            linkedList.push(word.charAt(counter));
        }
        assertEquals(size,linkedList.getSize());
        assertEquals(word.charAt(0),linkedList.getHead().getValue());
        assertEquals(word.charAt(0),linkedList.removeFirst());
        assertEquals(size,linkedList.getSize());

    }


    /**
     * 5. Create a Test method for isEmpty ; Use Push/Pop function and addLast/removeFirst function
     */
    @Test
    void shouldReturnIfEmpty(){
        MyLinkedList l1 = new MyLinkedList();
        l1.push('a');
        assertFalse(l1.isEmpty());
        System.out.print(l1.pop());
        assertTrue(l1.isEmpty());
    }


    /**
     * 6. Create a Test method for isPalindrome with the following values
     * I did, did I? - palindrome
     * Racecar - palindrome
     * hello - not a palindrome
     */
    @ParameterizedTest
    @MethodSource("arrayOfStringSets")
    void shouldCheckIfPalindrome(String word){
        MyFunctions functions = new MyFunctions();
        assertTrue(functions.isPalindrome(word));

    }
    static Stream<Arguments> arrayOfCharSets () {
        return Stream.of(
                Arguments.of(5,"hello")
        );
    }
    static Stream<Arguments> arrayOfStringSets () {
        return Stream.of(
                Arguments.of("I did, did I?"),
                Arguments.of("Racecar"),
                Arguments.of("hello")
        );
    }

}