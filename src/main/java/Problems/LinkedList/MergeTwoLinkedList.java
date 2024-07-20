package Problems.LinkedList;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

//Given two sorted linked lists consisting of N and M nodes respectively. In which you have to merge two objects and return a single objects.
//For example -:
//Input: arr1= [3,8,4,12]
//arr2= [15,1,6,19]
//Output: [1,3,4,6,8,12,15,19]
// 0(n+m) -- O(n+m) time complexity
class MergeTwoLinkedList {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        /* Linked list 3->4->8->12 from input */
        Node firstStartNode = new Node(sc.nextInt());
        firstStartNode.nextNode = new Node(sc.nextInt());
        firstStartNode.nextNode.nextNode = new Node(sc.nextInt());
        firstStartNode.nextNode.nextNode.nextNode = new Node(sc.nextInt());

        /* Linked list 3->5->3->7->8->5->10 from input */
        Node secondStartNode = new Node(sc.nextInt());
        secondStartNode.nextNode = new Node(sc.nextInt());
        secondStartNode.nextNode.nextNode = new Node(sc.nextInt());
        secondStartNode.nextNode.nextNode.nextNode = new Node(sc.nextInt());

        // linked list before removal of duplications
        System.out.println("Before merging the two sorted linked list:");
        printLinkedList(firstStartNode);
        printLinkedList(secondStartNode);

        Node mergedNode = mergeTwoLinkedListInSortedOrder(firstStartNode, secondStartNode);

        System.out.println("After merging the two sorted linked list into one:");
        printLinkedList(mergedNode);
    }

    static class Node {
        int value;
        Node nextNode;

        Node(int value) {
            this.value = value;
        }
    }

    static Node mergeTwoLinkedListInSortedOrder(Node firstHead, Node secondHead) {
        Node dummyHead = new Node(0);
        Node tail = dummyHead;

        while (firstHead != null && secondHead != null) {
            if (firstHead.value <= secondHead.value) {
                tail.nextNode = firstHead;
                firstHead = firstHead.nextNode;
            } else {
                tail.nextNode = secondHead;
                secondHead = secondHead.nextNode;
            }
            tail = tail.nextNode;
        }

        // appending first head to tail if second head become null
        if (firstHead != null) {
            tail.nextNode = firstHead;
        }

        // appending second head to tail if first head become null
        if (secondHead != null) {
            tail.nextNode = secondHead;
        }

        return dummyHead.nextNode;
    }

    static void printLinkedList(Node list) {
        while (list != null) {
            System.out.print(list.value + "-->");
            list = list.nextNode;
        }
        System.out.println();
    }
}