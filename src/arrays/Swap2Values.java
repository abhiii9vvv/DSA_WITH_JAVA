package First.src.arrays;

public class Swap2Values {
    static void swap(int a , int b){
        System.out.println("orignal A-"+a);
        System.out.println("orignal B-"+b);

        int temp=a;
        a=b;
        b=temp;
        System.out.println("AFTER A-"+a);
        System.out.println("AFTER B-"+b);

    }

    static void swapWithoutTemp(int a,int b){
        System.out.println("orignal A-"+a);
        System.out.println("orignal B-"+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("AFTER A-"+a);
        System.out.println("AFTER B-"+b);

    }

    public static void main(String[] args) {
        System.out.println("With Temp");
        swap(1,2);
        System.out.println("Without Temp");
        swap(2,4);
    }
}
