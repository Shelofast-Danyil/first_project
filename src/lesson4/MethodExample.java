package lesson4;

public class MethodExample {
    public static void main(String[] args) {
        System.out.println(increase(5, 20));
 
        System.out.println(min(increase(10, 5), 11));
    }


    public static int increase(int a, int index) {
        System.out.println("method invoked");
        a += index;
        System.out.println("method before return");
        return a;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

}
