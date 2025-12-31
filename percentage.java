import java.util.Scanner;

public class percentage {
    public static void main(String[]args){
       /*  int total =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total subject");
        int sub = sc.nextInt();
        for (int i = 1; i <= sub; i++) {
            int mark;
            while (true) {
                 System.out.println("enter the marks of " + i);
                mark = sc.nextInt();
             if (mark >= 0 && mark <= 100) {
                break;
             }
            else{
                System.out.println("marks are invalid plese enter corrct marks ");
            }
            }
           
             total += mark;
        }
       double percentage = (double)total/(sub*100) *100;
       System.out.println("total marks "+total);
       System.out.println("percentage = "+percentage);
       sc.close();*/

       int total = 0;
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the subject ");
       int sub = sc.nextInt();

       for (int i = 1; i <= sub; i++) {
        int Marks;
        while (true) {
            System.out.println("enter the marks " + i);
            Marks = sc.nextInt();
            if (Marks >= 0 && Marks <=100) {
                break;
            }
            else{
                System.out.println("invalid marks ");
            }

        }

        total+=Marks;

       }
       double per = (double)total/(sub*100);
       System.out.println("total marks " + total);
       System.out.println("percentage " + per);
       sc.close();
    }
}
