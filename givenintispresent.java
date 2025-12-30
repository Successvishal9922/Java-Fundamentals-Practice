import java.util.*;
public class givenintispresent {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[]element=new int[5];
        System.out.println("enter elements");
        for (int i = 0; i < element.length; i++) {
            element[i]=sc.nextInt();
        }
        int num;
        System.out.println("enter num");
        num=sc.nextInt();
        for (int i : element) {
            if (num==i) {
                System.out.println("present");
            }
           
        }
        sc.close();
    }
}
