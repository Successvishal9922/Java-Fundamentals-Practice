import java.util.Scanner;

public class check_int {
    public static void main (String []args){
        System.out.println("enter the number ");
        Scanner sc= new Scanner(System.in);
       

        if (sc.hasNextInt()) {
             int n = sc.nextInt();
            System.out.println("given value is integer");
        }
        else{
            System.out.println("not integer ");
        }
        sc.close();
    }
}
