import java.util.*;
public class sales_tax {
    public static void main(String[]args){
        int amount;
        int tax = 0;
        System.out.println("enter amount");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        if (amount >= 250000 && amount <=500000) {
            System.out.println("5% tax will apply");
            tax = (amount/100)*5;
            System.out.println("total tax apply on " + amount + " = " + tax);
        }
        else if(amount >= 500000 && amount <=1000000){
            System.out.println("20% tax will apply");
            tax = (amount/100)*20;
            System.out.println("total tax apply on " + amount + " = " + tax);
        }
        else if(amount >= 1000000){
            System.out.println("30% tax will apply");
            tax = (30/100)*amount;
            System.out.println("total tax apply on " + amount + " = " + tax);
        }
        else{
            System.out.println("tax will be 40%");
        }
        sc.close();
    }
}
