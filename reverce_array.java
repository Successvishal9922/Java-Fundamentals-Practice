package Arrays;

import java.util.Scanner;

public class reverce_array {
    public static void main(String[]args){
        int [] val = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the values ");
        for (int i = 0; i < val.length; i++) {
            val[i]= sc.nextInt();
        }

        System.out.println( " print an reverse array");

        for (int i = val.length-1; i >= 0; i--) {
            System.out.println(val[i]);
        }
    }
}
