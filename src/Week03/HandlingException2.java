package Week03;

public class HandlingException2 {
    public static void main(String[] args) {
        int number1 = 5;
        String name =null;
        name.toUpperCase();
        try {
        }catch (NullPointerException e) {
            System.out.println("Caught NPE");
        } finally {
            System.out.println("finally block");



        }

    }
}
