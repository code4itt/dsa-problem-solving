package Problems.Arrays;

import CommonClasses.Node;

import java.util.Scanner;

/*
Given an array arr[] of size N. The task is to create a linked list from the given array and return the head of the linked list.
Example 1:
Input Format: N=3, arr[]=[0,1,2]
Result 0->1->2
*/
public class ConvertToLinkedList {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];

        for(int i=0;i<sizeOfArray;i++) {
            arr[i] = sc.nextInt();
        }

        Node node = new Node(arr[0]);
        convertArrayToLinkedList(arr, node);
        printLinkedList(node);
    }

    static void convertArrayToLinkedList(int[] arr, Node node) {
        Node result = node;
        for(int i=1; i<arr.length ; i++) {
            result.next = new Node(arr[i]);
            result = result.next;
        }
    }

    static void printLinkedList(Node node) {
        while( node != null) {
            System.out.print(node.data + "-->");
            node = node.next;
        }
    }


}