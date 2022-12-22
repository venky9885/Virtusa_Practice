package java_notes;

import java.util.*;

// int arr =  new arr[10];
// for (int i = 0; i < arr.length; i++) {
//     arr[i] = i;
// }

class darray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        // 1D array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i : arr) {
            System.out.println(i);
        }
        // 2D array
        int arr2[][] = new int[3][3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
    }
}