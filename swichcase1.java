import java.util.Scanner;

public class swichcase1 {
    public static void main (String[]args){
        int date;
        System.out.println("enter a date");
        Scanner sc = new Scanner(System.in);
        date = sc.nextInt();

        switch (date) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wensday");
                break;    
            case 4:
                System.out.println("thersday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

        
            default:
            System.out.println("invalid date");
                break;
        }
        System.out.println("thank you for using our service");
        sc.close();
    }
}
