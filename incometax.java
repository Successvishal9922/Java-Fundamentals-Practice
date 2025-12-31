import java.util.Scanner;

public class incometax {
    public static void main(String[]args){
        int income;
        float tax  ;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your income ");
        income = sc.nextInt();

        if (income <= 250000) {
            tax = 0;
            System.out.println("tax = "+ tax);
        }
        else if (income > 250000 && income <= 500000) {
            tax = (income - 250000)* 0.05f;

            System.out.println("tax between 2.5-5l = " + tax);
        }
        else if (income > 500000 && income <= 1000000){
            tax = (250000 *0.05f)+(income - 500000)*0.10f;
            System.out.println("tax bet 5- 10l = " + tax);
        }
        sc.close();
    }
}
