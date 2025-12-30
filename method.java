public class method {
    static void change(int x){//int x is an parametar
        x=5;
        //return 0;
    }
    static void change2(int[]arr){
        arr[0]=95;
    }
    public static void main(String[] args) {
       /*  int a=10;
        change(a);//this function can not change the value a because x is the copy of the not actual value
        System.out.println(a);
*/
        int[] marks={10,20,30,40};// but in arry it will be change because its gives an reference not a actual value //marks khali refer kar raha he uske object ko thats why it chang the value
        change2(marks);
        System.out.println(marks[0]);
    }
}
