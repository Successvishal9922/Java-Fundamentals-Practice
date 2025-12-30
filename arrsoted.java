import java.util.*;
public class arrsoted {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean ismark=true;
        int[]mark=new int[5];
        System.out.println("enter elements");
        for (int i = 0; i < mark.length; i++) {
            mark[i]=sc.nextInt();
            
        }
        for (int i = 0; i < mark.length-1; i++) {
            if (mark[i]>mark[i+1]) {
               ismark=false;
               break;
                }
        }
        if (ismark) {
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
       sc.close();
    }
}
