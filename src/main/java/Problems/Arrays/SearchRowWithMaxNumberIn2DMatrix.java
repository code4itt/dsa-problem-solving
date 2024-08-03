package Problems.Arrays;

import java.util.Scanner;

/*
You have been given a non-empty grid ‘mat’ with 'n' rows and 'm' columns consisting of only 0s and 1s. All the rows are sorted in ascending order.
Your task is to find the index of the row with the maximum number of ones.
Note: If two rows have the same number of ones, consider the one with a smaller index. If there's no row with at least 1 zero, return -1.
Example 1:
Input Format:
 n = 3, m = 3,
mat[] =
1 1 1
0 0 1
0 0 0
Result:
 0
Explanation:
 The row with the maximum number of ones is 0 (0 - indexed).
*/
//5 5 1 0 1 1 1 1 0 0 0 1 1 1 1 1 1 1 0 0 0 0 1 0 0 0 0 0
public class SearchRowWithMaxNumberIn2DMatrix {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int elementToSearch = sc.nextInt();
        int[][] arrMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arrMatrix[i][j] = sc.nextInt();
            }
        }

        int result = searchRowWithMax1sIn2DSortedMatrix(arrMatrix, elementToSearch, rows, columns);
        System.out.print("Row has maximum 1s is: " + result);
    }

    static int searchRowWithMax1sIn2DSortedMatrix(int[][] arr, int elementToSearch, int rows, int columns) {
        int max_count = 0;
        int resultedRow = -1;
        for (int i = 0; i < rows; i++) {
            int lowerBound1s = lowerBoundOf1s(arr, elementToSearch, i, columns - 1);
            int row_count = columns - lowerBound1s;

            if(max_count < row_count) {
                max_count = row_count;
                resultedRow = i+1;
            }
        }
        return resultedRow;
    }

    static int lowerBoundOf1s(int[][] arr, int elementToSearch, int rows, int columns) {
        int low = 0;
        int high = columns - 1;
        int lowerBoundColumnIndex = columns;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[rows][mid] >= elementToSearch) {
                lowerBoundColumnIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return lowerBoundColumnIndex;
    }
}