import java.util.Scanner;
public class tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int income;
        float tax=0;
        System.out.println("enter the income");
        income = sc.nextInt();
        if (income<=250000) {
            tax=tax+0;
        }
      else if(income>250000 && income<=500000){
        tax=tax+0.05f*(income-250000.f);
      }
       else if (income>500000 && income<=1000000) {
            tax=tax+0.05f*(500000 - 250000);
            tax=tax+0.2f*(income - 500000);
      }  
      else if (income>=1000000) {
        tax=tax+0.05f*(500000 - 250000);
        tax=tax+0.2f*(1000000 - 500000);
        tax=tax+0.3f*(income - 1000000);
      }  
      System.out.println(tax);
      sc.close();  
      
    }
}
