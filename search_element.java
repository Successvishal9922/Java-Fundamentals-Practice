import java.util.Scanner;

public class search_element {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int num[]= new int[size];
        for (int i = 0; i < num.length; i++) {
            System.out.println("enter element");
            num[i]=sc.nextInt();
        }
        System.out.println("enter the search element");
        int search = sc.nextInt();
        for (int j = 0; j < num.length; j++) {
            if (num[j]==search) {
                System.out.println("element is present");
            
            }
            
        }
        sc.close();
    }
    
}
