package week02;

public class SingleOperator {
    public static void main(String[] args) {
        int number1 = 87, number2 = 13;
        boolean condition = true;

//Ön Arttırma Azaltma Operatörü:

        System.out.println("(A) Degeri: " + number1 + "\t(++A) Degeri: " + (++number1));
        System.out.println("(B) Degeri: " + number2 + "\t(--B) Degeri: " + (--number2));

        // Sonra artırma ve azaltma operatoru
        System.out.println("(A) Degeri : + number1 "+ "\t(A++) Degeri " + (number1++));
        System.out.println("(B) Degeri) :+ number2 "+"\t(B--) Degeri" +(number2--));

System.out.println("A degeri = " + number1 + "degeri = " + number2);

// Mantıksal Degil  operator;

    }
}