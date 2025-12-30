import java.util.Scanner;
public class studentmarks {
    public static void main(String[] args) {
        int m,p,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks");
        m=sc.nextInt();
        System.out.println("enter the marks");
        p=sc.nextInt();
        System.out.println("enter the marks");
        c=sc.nextInt();
        float per=(m+p+c)/3.0f;
        System.out.println("percentage is :- "+per);
        if(per>=40 && m>=33 && p>=33 && c>=33){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        sc.close();

    }


}
