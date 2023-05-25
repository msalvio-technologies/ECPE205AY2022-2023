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

    public static boolean isPalindrome(String string) {
        MyLinkedList stack = new MyLinkedList();
        MyLinkedList queue = new MyLinkedList();

        char[] characters = string.toCharArray();
        for(char i : characters)
        {
            var lowered = Character.toLowerCase(i);

            for(char checkCharacter = 'a'; checkCharacter <= 'z'; checkCharacter++)
            {
                if (String.valueOf(checkCharacter).equalsIgnoreCase(String.valueOf(lowered)))
                {
                    // Character is a letter!
                    stack.push(lowered);
                    queue.push(lowered);
                    break;
                }
            }
        }
        while(!stack.isEmpty())
        {
            var stackRes = stack.pop().toString();
            var queueRes = queue.removeFirst().toString();
            if (!stackRes.equalsIgnoreCase(queueRes))
            {

                return false;
            }
        }

        return true;
    }
}

