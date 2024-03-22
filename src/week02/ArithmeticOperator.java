package week02;

public class ArithmeticOperator {

public  static void main (String[]args){
    int number1 = 25, number2 = 3, number3 = 17;
    String websiteName = "Web sitemiz: ", websiteUri = "www.biLgeadam.com";

// stringlerde ekleme operatörü kullanırsak
    System.out.println("Merhaba!\n" + websiteName + websiteUri + " Sitemize ziyaret edin!");// \ -> ALT +*

     // eKLEME - Cıkarma operatorleri:
    System.out.println("A + B = "+ (number1+number2));
    System.out.println("A - B = " + (number1-number2));

    // Carpma ve Bolme Operatorleri
    System.out.println("A * B = " + (number1 * number2));
    System.out.println("A / 5 = " + ( number1/5));

    // Mod Alma Operatoru
    System.out.println("C % B = " + (number3%number2));


    //Ön Arttırma Azaltma Operatörü:
    System.out.println("(A) Degeri: "+ number1 + "\t(A++) Degeri " + (number1++));

}

}