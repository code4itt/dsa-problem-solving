package Problems.Arrays;

import java.util.*;
import java.io.*;

//write a program that takes an array and Find Second largest element in an array
//For example -: Input: array = [12, 35, 1, 10, 34, 1]
//Output: The second largest element is 34.
// 0(2*n) -- O(N) time complexity
class SecondLargestNumber {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int secLargestElement = getSecondLargestNumber(arr, size);
        System.out.println(secLargestElement);
    }

    public static int getSecondLargestNumber(int[] arr, int size) {
        int maxElementIndex = 0;
        int secondMaxElementIndex = 0;

        // O(n)
        for (int i = 0; i < size; i++) {
            if (arr[i] >= arr[maxElementIndex]) {
                maxElementIndex = i;
            }
        }

        // O(n)
        for (int i = 0; i < size; i++) {
            if (arr[i] >= arr[secondMaxElementIndex] && i != maxElementIndex) {
                secondMaxElementIndex = i;
            }
        }
        return arr[secondMaxElementIndex];
    }
}