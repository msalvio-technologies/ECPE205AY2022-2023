package com.ecpe205.endtermexam;

public class MyFunctions {

    /**
     * returns true if the character is a letter
     */
    private static boolean isValidCharacter(Character character)
    {
        for(char i = 'a'; i <= 'z'; i++)
        {
            if (character.toString().equalsIgnoreCase(String.valueOf(i)))
                return true;
        }
        return false;
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
    public static boolean isPalindrome(String string) {
        var stack = new MyLinkedList();
        var queue = new MyLinkedList();

        for (char i : string.toCharArray()) {
            if (isValidCharacter(i))
            {
                stack.push(i);
                queue.push(i);
            }
        }

        while(!stack.isEmpty())
        {
            if (!stack.pop().toString().toLowerCase().equals(queue.removeFirst().toString().toLowerCase()))
            {
                return false;
            }
        }


        return true;
    }
}
