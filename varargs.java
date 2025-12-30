public class varargs {
    static int sum(int ...arr){//here ...arr work like an array
        int result=0;
        for (int i : arr) {
            result+=i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5));
        
    }
}
