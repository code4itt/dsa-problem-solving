package Problems.Arrays;

import java.util.Scanner;

/*
You have been given a 2-D array 'mat' of size 'N x M' where 'N' and 'M' denote the number of rows and columns, respectively. The elements of each row and each column are sorted in non-decreasing order.
But, the first element of a row is not necessarily greater than the last element of the previous row (if it exists).
You are given an integer ‘target’, and your task is to find if it exists in the given 'mat' or not.
Example 1:
Input Format:
 N = 2, M = 3, target = 9
mat[] =
[ 1, 3, 6,]
[ 5, 9, 7]
*/
//5 5 14 1 4 7 11 15 2 5 8 12 19 3 6 9 16 22 10 13 14 17 24 18 21 23 26 30
public class SearchIn2DSortedMatrix {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int elementToSearch = sc.nextInt();
        int[][] arrMatrix = new int[rows][columns];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                arrMatrix[i][j] = sc.nextInt();
            }
        }

        String result = searchElementIn2DMatrix(arrMatrix, elementToSearch, rows-1 ,  0, rows, columns);
        System.out.print(result);
    }

    static String searchElementIn2DMatrix(int[][] arr, int elementToSearch, int rows, int columns, int irow,  int icolumns) {

        while(rows >= 0 && columns < icolumns) {
            if(arr[rows][columns] == elementToSearch) {
                return "Position: rows:: "+rows+" columns:: "+columns;
            }
            if(arr[rows][columns] > elementToSearch) {
               rows--;
            } else {
                columns++;
            }
        }
        return "false";
    }
}