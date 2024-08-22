package app;

public class Main {
    static int a;
    static int b;
    static int res;
    public static void main(String[] args) {
        System.out.println("My new app");
        System.out.println("For calculating");

        a = 10;
        b = 13;
        res = add(a, b);
        System.out.println("Result:" + res);
        res = multiply(a, b);
        System.out.println("Result:" + res);
    }
    private static int add(int a, int b){
        return a+b;
    }
    private static int multiply(int a, int b){
        return a*b;
    }
}
