import java.util.Scanner;

public class sumof_numbers {
    public static void main(String[]args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("enter number "+i);
            int num = sc.nextInt();
            sum = sum+num;
        }
        System.out.println("total sum = "+ sum);
        sc.close();
    }
}
