import java.util.Scanner;
public class maxelementarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[5];
        System.out.println("enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr.length;//this is my method the simple method is max=0
        int min=arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
            if (arr[i]<min) {
                min=arr[i];
            }
            
        }
        System.out.println("max element"+max);
        System.out.println("min element"+min);
        sc.close();
    }
}
