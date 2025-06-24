package JAVABASIC2;

public class Calculator {
    static int Sum(int a, int b) {
        return a + b;
    }

    static float Product(float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Sum = " + Sum(5, 10));
        System.out.println("Product = " + Product(5.5F, 10.2F));
    }
}
