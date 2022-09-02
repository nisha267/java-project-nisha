/*WAP to input an array having 3 rows and 3 columns of type String.*/

package en.java;

import java.util.Scanner;

public class Multidimen {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);

        // create a 3d array
        int[][][] test = {
            {
              {1, -2, 3}, 
              {2, 3, 4}
            }, 
            { 
              {-4, -5, 6, 9}, 
              {1}, 
              {2, 3}
            } 
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
    }
}

}
