import java.util.*;
public class sumofarr {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]numbers=new int[5];
        System.out.println("enter the number");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=sc.nextInt();
        }
        int sum=0;
        for (int i : numbers) {
            sum=sum+i;
        }
        System.out.println("sum of array "+sum);
        sc.close();
    }
}
