/*
 * Write a java program to rotate a matrix n times in clockwise direction and anti-clockwise direction using inheritance.
 * Create base class Clock
 * From this extends a child class Clockwise and AntiClockwise.
 * Both these child classes should contain the method rotate(int n) which rotates the matrix n times in clockwise and anti-clockwise direction respectively.
 */
/*
 * Sample Input:
 * 3
 * 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 1
 */
/*
 * Sample Output:
 * Clockwise:
 * 4 1 2
 * 7 5 3
 * 8 9 6
 */

import java.util.Scanner;

class Clock {
    int n;
    int[][] matrix;
    int[][] rotatedMatrix;

    public Clock() {
        n = 0;
        matrix = new int[n][n];
        rotatedMatrix = new int[n][n];
    }



    public void rotate() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[j][n - 1 - i] = matrix[i][j];
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Clockwise extends Clock {
    public Clockwise() {
        super();
    }

    public void rotate(int n) {
        if(n==0)
            return;
        super.rotate();
        rotate(n-1);
    }
}

class AntiClockwise extends Clock {
    public AntiClockwise() {
        super();
    }

    public void rotate(int n) {
        if(n==0)
            return;
        super.rotate();
        rotate(n-1);
    }
}

public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n = n1;
        int[][] matrix = new int[n][n];
        int[][] rotatedMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int rotations = sc.nextInt();
        

        

        sc.close();
    }
}