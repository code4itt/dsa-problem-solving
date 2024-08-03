package Problems.Arrays;

import CommonClasses.DoublyLinkedList;
import java.util.Scanner;

/*
Given an array of integers converts it to a doubly linked list.
Example 1:
Input Format: arr = [1, 2, 4, 3]
Result: DLL: 1 <-> 2 <-> 4 <->3
*/
public class ConvertToDoublyLinkedList {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];

        for(int i=0;i<sizeOfArray;i++) {
            arr[i] = sc.nextInt();
        }

        DoublyLinkedList node = new DoublyLinkedList(arr[0], null, null);
        convertArrayToDoublyLinkedList(arr, node);
        System.out.println("Printing the doubly linked list from start <--->");
        printDoublyLinkedList(node);
    }

    static void convertArrayToDoublyLinkedList(int[] arr, DoublyLinkedList node) {
        DoublyLinkedList head = node;
        for(int i=1; i<arr.length ; i++) {
            head.next = new DoublyLinkedList(arr[i], null, head);
            head = head.next;
        }
        System.out.println("Printing the doubly linked list from back <--->");
        printDoublyLinkedListFromBack(head);
    }

    static void printDoublyLinkedList(DoublyLinkedList node) {
        while( node != null) {
            System.out.print(node.data + "<-->");
            node = node.next;
        }
    }

    static void printDoublyLinkedListFromBack(DoublyLinkedList node) {
        while( node != null) {
            System.out.print(node.data + "<-->");
            node = node.back;
        }
    }
}