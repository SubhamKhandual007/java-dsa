import java.util.*;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // Taking array input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // // Printing array in matrix form
        // System.out.println("The 2D array is:");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print(numbers[i][j] + " ");
        //     }
        //     System.out.println(); // move to next row
        // }

        // sc.close();

        int x=sc.nextInt();
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("x is found at location ("+ i +","+ j +")");
                }
            }
        }

sc.close();
    }
}
