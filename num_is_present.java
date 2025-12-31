package Arrays;

import java.util.Scanner;

public class num_is_present {
    public static void main(String[]args){
        int[]num = new int[10];
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter the numbers ");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();

        }

        System.out.println("print the numbers of array ");

        for (int i : num) {
            System.out.println(i);
        }
         System.out.println("ENTER NUMBER YOU WANT TO FIND ");
        int n = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < num.length; i++) {
            if (n == num[i]) {
                
                System.out.println("number is present in array at " + i + " position ");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("number is not present ");
        }
        sc.close();
    }
}
