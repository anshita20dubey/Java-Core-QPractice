package Arrays;

import java.util.Scanner;
/*
   normal 2D printing
   1 2 3 4 5 6 7 8 9
      1 2 3
      4 5 6
      7 8 9
*/

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                for (int k = 0; k < arr[i]arr[j].length; k++) {}
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
