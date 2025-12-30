import java.util.*;
public class arr {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int []marks;
        marks=new int[5];
        System.out.println("enter marks");
        for (int i = 0; i < marks.length; i++) {
            marks[i]=sc.nextInt();
            
        }
        System.out.println("print elements");
        for (int element : marks) {
            System.out.println(element);
        }
        System.out.println("mark[2]= "+marks[2]);
  sc.close();
    }
}
