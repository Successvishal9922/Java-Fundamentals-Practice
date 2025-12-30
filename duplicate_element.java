import java.util.Scanner;

public class duplicate_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the elements");
        int i;
        for ( i= 0; i < arr.length; i++) {
            System.out.println("enter");
            arr[i]=sc.nextInt();
        }
        boolean foundDuplicate = false;
        for (int j = 0; j < arr.length; j++) {
            for (int j2 = i+1; j2 < arr.length; j2++) {
                if (arr[i]==arr[j]) {
                    foundDuplicate = true;
                    System.out.println("duplicate entry "+ arr[j]);
                }
            
            }
            
        }
    }
}
