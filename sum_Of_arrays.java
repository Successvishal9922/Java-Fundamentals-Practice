package Arrays;

import java.util.Scanner;

public class sum_Of_arrays {
    public static void main(String[]args){
        int [] num = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers ");
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();

            sum += num[i];
        }
        
        System.out.println("print array numbers ");
        for (int i : num) {
            System.out.println(i);
        }
        System.out.println(" sum of arrays = " + sum);
        sc.close();
    }
}
