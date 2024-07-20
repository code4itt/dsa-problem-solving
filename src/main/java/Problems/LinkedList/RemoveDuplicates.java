package Problems.LinkedList;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

//write a program that takes an array and Find Second largest element in an array
//For example -: Input: array = [12, 35, 1, 10, 34, 1]
//Output: The second largest element is 34.
// 0(2*n) -- O(N) time complexity
class RemoveDuplicates {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        /* Linked list 3->5->3->7->8->5->10 from input */
        Node startNode = new Node(sc.nextInt());
        startNode.nextNode = new Node(sc.nextInt());
        startNode.nextNode.nextNode = new Node(sc.nextInt());
        startNode.nextNode.nextNode.nextNode = new Node(sc.nextInt());
        startNode.nextNode.nextNode.nextNode.nextNode = new Node(sc.nextInt());
        startNode.nextNode.nextNode.nextNode.nextNode.nextNode = new Node(sc.nextInt());
        startNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new Node(sc.nextInt());

        // linked list before removal of duplications
        System.out.println("Before removal of duplication:");
        printLinkedList(startNode);
        removeDuplicateFromLinkedList(startNode);
        System.out.println("After removal of duplication:");
        // linked list after removal of duplications
        printLinkedList(startNode);
    }

    static class Node {
        int value;
        Node nextNode;

        Node(int value) {
            this.value = value;
        }
    }

    static void removeDuplicateFromLinkedList(Node node) {
        HashSet<Integer> elementSet = new HashSet<>();
        Node prevNode = null;
        while (node != null) {
            if (elementSet.contains(node.value)) {
                prevNode.nextNode = node.nextNode;
            } else {
                elementSet.add(node.value);
                prevNode = node;
            }
            node = node.nextNode;
        }
    }

    static void printLinkedList(Node list) {
        while (list != null) {
            System.out.print(list.value + "-->");
            list = list.nextNode;
        }
        System.out.println();
    }
}