package com.collection;

public class StringReferenceCheck {
    public static void main(String[] args) {
        String s1 = "Java";        // String literal (stored in the String Pool)
        String s2 = "Java";        // Reuses the reference from the String Pool
        String s3 = new String("Java"); // Creates a new object in the heap

        // Compare references
        System.out.println(s1 == s2); // true (both refer to the same object in the String Pool)
        System.out.println(s1 == s3); // false (s3 refers to a different object in the heap)
    }
}
