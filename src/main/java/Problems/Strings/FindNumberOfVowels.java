package Problems.Strings;

import java.io.IOException;
import java.util.Scanner;

//You are given a string S containing both uppercase and lowercase letters.
//Note:-   You need to find out the number of vowels in the given string.
//For example -:
//Input: Hackingly
//Output: 2
// Time complexity O(N) --> N = size of string
class FindNumberOfVowels {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String givenStr = sc.nextLine();

        int numberOfVowels = findNoOfVowels(givenStr);
        System.out.println(numberOfVowels);
    }

    public static int findNoOfVowels(String str) {
        String supportedVowels = "aeiouAEIOU";
        int numberOfVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            if (supportedVowels.contains(str.substring(i, i + 1))) {
                numberOfVowels++;
            }
        }
        return numberOfVowels;
    }
}