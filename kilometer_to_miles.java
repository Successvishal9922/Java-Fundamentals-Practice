import java.util.Scanner;

public class kilometer_to_miles {
    public static void main(String[]args){
        System.out.println("enter kilometer");
        Scanner sc = new Scanner(System.in);
        float kilometer = sc.nextInt();
        float miles = kilometer *0.621371f;

        System.out.println("kilometer to miles "+ miles);
        sc.close();
    }
}
