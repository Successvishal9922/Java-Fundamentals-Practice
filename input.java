import java.util.*;
public class input {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);//for taking input from user
        System.out.println("enter the number");//this for printing
        int a ;
        a= sc.nextInt();
        System.out.println("enter the 2nd number");
        int b=sc.nextInt();//you can use sc.nextfloat() or  others
        int sum=a+b;
        System.out.println("sum is "+sum);
        boolean d = sc.hasNextInt();//it specifies the type of enterd number   
        System.out.println(d);
        System.out.println();
        boolean m= sc.hasNextFloat();
        System.out.println(m);
        sc.close();


    }
}
