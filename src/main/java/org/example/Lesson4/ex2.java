package org.example.Lesson4;

import java.util.Stack;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("isValid(\"()\") = " + isValid("()"));
        System.out.println("isValid(\"()[]{}\") = " + isValid("()[]{}"));
        System.out.println("isValid(\"(]\") = " + isValid("(]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            switch (s.charAt(i)) {
                case ')':
                    if (brackets.isEmpty() || !brackets.pop().equals('('))
                        return false;
                    break;
                case '}':
                    if (brackets.isEmpty() || !brackets.pop().equals('{'))
                        return false;
                    break;
                case ']':
                    if (brackets.isEmpty() || !brackets.pop().equals('['))
                        return false;
                    break;
                default:
                    brackets.push(s.charAt(i));
                    break;
            }
        }
        return brackets.isEmpty();
    }
}
