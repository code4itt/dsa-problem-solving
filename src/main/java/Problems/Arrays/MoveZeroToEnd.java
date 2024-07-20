package Problems.Arrays;

import java.io.IOException;
import java.util.Scanner;

//write a program that will moves all Zeroes to end of an array
//For example -: Input: array = [1,2,0,4,3,0,5,0];
//Output : array = [1, 2, 4, 3, 5, 0, 0, 0];.
//  time complexity O(N)
// space O(N)
class MoveZeroToEnd {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // not updating the existing arr data
        int[] updatedArr = moveZeroToEnd(arr, size);
        printArray(updatedArr, size);
    }

    public static int[] moveZeroToEnd(int[] arr, int size) {
        int[] newArr = new int[size];
        int lastZeroIndex = size - 1;
        int firstIndex = 0;
        int numberToMoveToEnd = 0;
        // time complexity O(N)
        for (int i = 0; i < size; i++) {
            if (arr[i] == numberToMoveToEnd) {
                newArr[lastZeroIndex] = numberToMoveToEnd;
                lastZeroIndex--;
            } else {
                newArr[firstIndex] = arr[i];
                firstIndex++;
            }
        }
        return newArr;
    }

    public static void printArray(int[] arr, int size) {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }
}