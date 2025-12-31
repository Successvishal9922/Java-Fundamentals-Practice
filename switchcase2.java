import java.util.Scanner;

public class switchcase2 {
    public static void main (String[]args){
        char ch;
        System.out.println("eneter the character");
        Scanner sc = new Scanner(System.in);
        
        ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':      
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':      
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println(ch + " is vovel ");
                break;
        
            default:
            if ((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')){
                System.out.println(ch + " is consonant ");
            }else{
                System.out.println(ch + " not valid letter ");
            }
                break;
        }
        System.out.println("thank you for using our service");
        sc.close();
    }
}
