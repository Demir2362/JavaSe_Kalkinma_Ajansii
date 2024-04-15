package Week04.polymorphism.compiletime;

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        int result1 = math.add(10, 20);// int  add(int a, int b) metodu cagrılabilir.
        double result2 = math.add(20 , 30);

    }
}
