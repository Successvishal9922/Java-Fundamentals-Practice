import java.util.Scanner;

public class calculater_using_switch {
    public static void main(String[]argas){
        int choice ;
        System.out.println("enter choice");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        int a,b;
        System.out.println("enter numbers for calculation");
        a = sc.nextInt();
        b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(" addition of " + a + " and " + b + " = "+ (a+b));
                break;
             case 2:
                System.out.println(" substraction of " + a + " and " + b + " = "+ (a-b));
                break;

             case 3:
                System.out.println(" multiplication of " + a + " and " + b + " = "+ (a*b));
                break;
        
            default:
            System.out.println("enter valid choice");
                break;
        }
        sc.close();
    }
}
