package week02;

public class TypeCasting{
  public static  void main(String[] args){

      int dollar = 5;
      float dollarF = dollar;
      long dollarL = dollar;

 System.out.println("int"+dollar);
 System.out.println("long"+dollarL);
 System.out.println("float"+dollarF);

 float floatDollar = 13.5f;

 int intDollar = (int) floatDollar;
 System.out.println("floatDollar  : + floatDollar+ \nintDollar") + intDollar;

 long longdollar = 2;
 int  intdollar2 = (int)  longDollar;

 long longvalue = 12345678101112L;
 int intvalue = (int)  longvalue;
 System.out.println(longvalue);
 System.out.println(intvalue);

 float number1 = 5.0f;
 float sum = (number1 + 5);
 System.out.println(sum);










}
}





