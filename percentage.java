import java.util.Scanner;
public class percentage {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sub1");
        int a=sc.nextInt();
        System.out.println("enter sub2");
        int b=sc.nextInt();
        System.out.println("enter sub3");
        int c=sc.nextInt();
        System.out.println("enter sub4");
        int d=sc.nextInt();//for percentage use float and sc.nextfloat()
        System.out.println("enter sub5");
        int e=sc.nextInt();
        float per=(a+b+c+d+e)*100/500;
        System.out.println("percentage = "+per);
        sc.close();

    }
}
