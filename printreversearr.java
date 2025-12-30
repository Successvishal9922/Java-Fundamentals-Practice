import java.util.*;
public class printreversearr {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]num=new int[5];
        System.out.println("take the num from user");
        for (int i = 0; i < num.length; i++) {
            num[i]= sc.nextInt();
        }
        System.out.println("print the number in rev order");
        for (int i = num.length-1 ; i >=0; i--) {//we take num.length-1 because the it takes the arr length but arr lenth is 5 and arr is starting from zero and when prnt arr in rev order that time the arr at 4 th location
            System.out.println("num"+i +'='+num[i]);
        }
   sc.close();
    }
}
