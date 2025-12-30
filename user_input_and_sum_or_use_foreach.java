import java.util.Scanner;

public class user_input_and_sum_or_use_foreach {
    public static void main(String[]args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of an array");
        int size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("enter a array element");
        for (int i = 0; i < num.length; i++) {
            System.out.println("enter the next element");
            num[i]=sc.nextInt();
        }
        for (int elements : num) {
            System.out.println("next");
            System.out.println(elements);
            sum= sum+elements;
        }
        System.out.println("sum of an array = "+sum);
        sc.close();
    }
}
