package Problems.Numbers;

import java.io.IOException;
import java.util.Scanner;

//Write a program which take a number N as input from the user and You need to reverse the number.
//For example -:
//Input: Num=1998
//Output: Num=8991
// Time complexity O(N) --> N = size of digits
class ReverseNumber {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // not updating the existing arr data
        int reversedNumber = reverseNumber(number);
        System.out.println(reversedNumber);
    }

    public static int reverseNumber(int number) {
        // handling negative and single digit numbers
        // O(N) --> N = size of digits
        boolean isNegativeNumber = false;
        if (number < 0) {
            isNegativeNumber = true;
            number = (-1) * number;
        }
        if (number < 10 && number >= 0) {
            if (isNegativeNumber)
                return (-1) * number;
            return number;
        }
        int reversedNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = 10 * reversedNumber + lastDigit;
            number = number / 10;
        }
        if (isNegativeNumber)
            return (-1) * reversedNumber;
        return reversedNumber;
    }
}