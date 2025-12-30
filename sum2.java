import java.util.Scanner;
public class sum2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int a=sc.nextInt();
        System.out.println("enter num2");
        int b=sc.nextInt();
        System.out.println("enter num3");
        int c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("sum = "+sum);
        sc.close();


    }
}
