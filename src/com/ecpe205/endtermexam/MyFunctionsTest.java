package com.ecpe205.endtermexam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyFunctionsTest {
    private MyLinkedList generateLinkedList() {
        return new MyLinkedList();
    }

    // Sample items to push.
    char[] itemsToPush = {'a', 'b', 'c', 'd', 'e'};

    /**
     * 1. Create a Test that will test the push function ; Push 5 values , check the size
     * and if the values are added in correct order
     */
    @Test
    public void shouldPush() {
        var linkedList = generateLinkedList();
        // Push 5 character values.
        for (char i : itemsToPush)
            linkedList.push(i);

        // Check size.
        assertEquals(itemsToPush.length, linkedList.getSize());

        // Check if values are in correct order.
        for (int i = 0; i < itemsToPush.length; i++) {
            var currentCharToCheck = itemsToPush[i];
            var linkedListChar = linkedList.removeFirst();
            assertEquals(currentCharToCheck, linkedListChar);
        }

        // Check size again, since we removed first it should be 0.
        assertEquals(0, linkedList.getSize());
    }


    /**
     * 2. Create a Test that will test the push-pop function ; Check if the pop returns the
     * correct value and
     * make sure to test pop when the list is empty ;
     * also check the size
     */
    @Test
    public void shouldPushPop() {
        var linkedList = generateLinkedList();
        // Push the items.
        for (char i : itemsToPush)
            linkedList.push(i);

        // Check the pop.
        for (int i = linkedList.getSize() - 1; i >= 0; i--) {
            var currentCharToCheck = itemsToPush[i];
            var linkedListChar = linkedList.pop();

            assertEquals(currentCharToCheck, linkedListChar);
        }

        // LinkedList should be empty by now.
        var nullNode = linkedList.pop();
        assertEquals(null, nullNode);
    }

    /**
     * 3. Create a Test that will test the addLast ; Add 5 values, check the size and if
     * the values are added in correct order
     */
    @Test
    public void shouldAddTail() {
        var linkedList = generateLinkedList();

        // Push the items.
        for (char i : itemsToPush)
            linkedList.push(i);

        // Check the pop.
        for (int i = linkedList.getSize() - 1; i >= 0; i--) {
            var currentCharToCheck = itemsToPush[i];
            var linkedListChar = linkedList.pop();

            assertEquals(currentCharToCheck, linkedListChar);
        }
    }

    /**
     * 4. Create a Test for removeFirst; add 5 values using addLast, then execute removeFirst, for each,
     * check if the size is correct and if the correct value is returned;
     * Make sure to test removeFirst when the list is empty
     */
    @Test
    public void shouldRemoveFirst() {
        var linkedList = generateLinkedList();

        // Push the items.
        for (char i : itemsToPush)
            linkedList.push(i);

        int expectedSize = itemsToPush.length;
        for (char i : itemsToPush) {
            var linkedListNode = linkedList.removeFirst();

            assertEquals(linkedListNode, i);

            expectedSize--;

            assertEquals(expectedSize, linkedList.getSize());
        }

        // LinkedLists should be empty by now.
        var nullNode = linkedList.removeFirst();
        assertEquals(null, nullNode);
    }

    /**
     * 5. Create a Test method for isEmpty ; Use Push/Pop function and addLast/removeFirst function
     */
    @Test
    public void shouldCheckIfEmpty() {
        var linkedList = generateLinkedList();

        // Should be empty at first.
        assertEquals(true, linkedList.isEmpty());

        // Push the items.
        for (char i : itemsToPush)
            linkedList.push(i);

        // Pop the items.
        for (char i : itemsToPush)
            linkedList.pop();

        // Push more items.
        for (char i : itemsToPush)
            linkedList.push(i);

        // Remove heads.
        for (char i : itemsToPush)
            linkedList.removeFirst();

        // Should be empty again.
        assertEquals(true, linkedList.isEmpty());

    }


    /**
     * 6. Create a Test method for isPalindrome with the following values
     * I did, did I? - palindrome
     * Racecar - palindrome
     * hello - not a palindrome
     */
    @Test
    public void shouldCheckPalindrome() {
        assertEquals(true, MyFunctions.isPalindrome("I did, did I?"));
        assertEquals(true, MyFunctions.isPalindrome("Racecar"));
        assertEquals(false, MyFunctions.isPalindrome("hello"));
    }

}