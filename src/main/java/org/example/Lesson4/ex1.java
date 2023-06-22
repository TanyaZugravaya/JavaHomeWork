package org.example.Lesson4;

import java.util.LinkedList;
import java.util.Scanner;

public class ex1 {
    public class ListNode {
        int value;
        ListNode next;
        ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            linkedList.add(scanner.nextInt());
        }
        System.out.println("linkedList = " + linkedList);
        LinkedList<Integer> reverseList = reverseLinkedList(linkedList);
        System.out.println("reverseList = " + reverseList);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> reverseList = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            Integer elem = linkedList.get(i);
            reverseList.add(elem);
        }
        return reverseList;
    }
}

