import java.util.*;
public class sumofmatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [][]matrix1=new int[2][2];
        int[][]matrix2=new int[2][2];
        int [][]result=new int[2][2];
        System.out.println("enter matrix1");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter matrix 2");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrix2[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
       
            sc.close();
        }
    }

