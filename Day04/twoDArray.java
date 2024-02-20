package Day04;

import java.util.Scanner;

/**
 * twoDArray
 */
public class twoDArray {

      public static void search(int [][] arr, int rows,int cols, int key){
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j] == key){
                System.out.print(i+" "+j);
                return;
                }
            }
        }
        System.out.print("Element Not found");
        return;
    }
    
    //Print Array 
    public static void print(int [][] arr, int rows,int cols){
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    //Take input from 2d array
    public static void Input(int [][] arr, int rows,int cols){
        Scanner s =  new Scanner(System.in);
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = s.nextInt();
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("2d Array");
        int arr[][] = new int[3][3];
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println("Please enter elements for 2d array");
        Input(arr,rows,cols);
        print(arr,rows,cols);
        search(arr,rows,cols,9);
        
        
       
    }
}