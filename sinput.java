 import java.util.*;
 public class sinput {
    public static void main(String[] args) {
        System.out.println(" taking simple input from user");
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        float b=sc.nextFloat();
        System.out.println("print a :"+a);
        System.out.println("print b : "+b);
        sc.close();
    }
    
}
