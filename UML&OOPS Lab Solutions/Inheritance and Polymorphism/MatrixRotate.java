import java.util.Scanner;

class Clock{
    void rotate(int mat[][],int rotate){
        System.out.println("Rotate");
    }
}

class Clockwise extends Clock{
    void rotate(int mat[][],int rotate){
        int rows = mat.length;
        int cols = mat[0].length;
        int temp[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                temp[i][j] = mat[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j] = temp[rows-j-1][i];
            }
        }
        rotate--;
        if(rotate>0){
            rotate(mat,rotate);
        }
    }
}

class AntiClockwise extends Clock{
    void rotate(int mat[][],int rotate){
        int rows = mat.length;
        int cols = mat[0].length;
        int temp[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                temp[i][j] = mat[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j] = temp[j][cols-i-1];
            }
        }
        rotate--;
        if(rotate>0){
            rotate(mat,rotate);
        }
    }
}

public class MatrixRotate {
    public static void main(String[] args) {
        int rows,cols;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int rotate=sc.nextInt();
        Clockwise c = new Clockwise();
        c.rotate(matrix,rotate);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        // AntiClockwise ac = new AntiClockwise();
        // ac.rotate(matrix,rotate);
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        sc.close();
    }
}
