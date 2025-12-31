import java.util.Scanner;

public class sum_of_numbers {
    public static void main (String []args){
        int n;
        int num = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter total numbers ");
        n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println("enter number");
            num += sc.nextInt();
        }
        System.out.println("sum = " +num);
        sc.close();
    }
}
