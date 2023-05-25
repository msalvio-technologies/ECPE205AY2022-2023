package com.ecpe205.endtermexam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyFunctionsTest {

    private MyLinkedList linkedList =
            new MyLinkedList();


    // Sample items to push.
    char[] itemsToPush = {'a', 'b', 'c', 'd', 'e'};

    /**
     * 1. Create a Test that will test the push function ; Push 5 values , check the size
     * and if the values are added in correct order
     */
    @Test
    public void shouldPush()
    {
        // Push 5 character values.
        for(char i : itemsToPush)
            linkedList.push(i);

        // Check size.
        assertEquals(itemsToPush.length, linkedList.getSize());

        // Check if values are in correct order.
        for(int i = 0; i < itemsToPush.length; i++)
        {
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
    public void shouldPushPop()
    {
        // Push the items.
        for(char i : itemsToPush)
            linkedList.push(i);

        // Check the pop.
        for(int i = linkedList.getSize() - 1; i <= 0; i--)
        {
            var currentCharToCheck = itemsToPush[i];
            var linkedListChar = linkedList.pop();

            assertEquals(currentCharToCheck, linkedListChar);
        }
    }

    /**
     * 3. Create a Test that will test the addLast ; Add 5 values, check the size and if
     * the values are added in correct order
     */
    @Test
    public void shouldAddTail()
    {

    }

    /**
     * 4. Create a Test for removeFirst; add 5 values using addLast, then execute removeFirst, for each, check if the size is correct and if the correct value is returned;
     * Make sure to test removeFirst when the list is empty
     */
    @Test
    public void shouldRemoveFirst()
    {

    }

    /**
     * 5. Create a Test method for isEmpty ; Use Push/Pop function and addLast/removeFirst function
     */


    /**
     * 6. Create a Test method for isPalindrome with the following values
     * I did, did I? - palindrome
     * Racecar - palindrome
     * hello - not a palindrome
     */

}