import java.util.*;
public class multidimensionarr {
    public static void main(String[]args){
        int[][]flat=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter flats");
        for (int i = 0; i < flat.length; i++) {
            for (int j = 0; j < flat.length; j++) {
                flat[i][j]=sc.nextInt();
            }
        }
      for (int i = 0; i < flat.length; i++) {
        for (int j = 0; j < flat.length; j++) {
            System.out.print(flat[i][j]);
            System.out.print(" ");
        }
        System.out.println("");
      }  
      sc.close(); }
}
