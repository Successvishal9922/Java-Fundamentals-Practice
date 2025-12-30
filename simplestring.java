import java.util.Scanner;
public class simplestring {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name= "vishal";
        String surname= "jadhav";
        System.out.println(name + surname);
        System.out.println("enter the string");
        String v=sc.next();//this print only one word
        String vi=sc.nextLine();//this print the sentence
        System.out.println(vi);
        System.out.println(v);
        sc.close();
    }
}
