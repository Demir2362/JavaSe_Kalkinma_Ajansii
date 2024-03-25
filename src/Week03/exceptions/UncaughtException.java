package Week03.exceptions;

public class UncaughtException {

    public static void main (String[]args) {
        String  name = null;
        name.toUpperCase();


        if(name==null) {
            System.out.println("lutfen bir isim giriniz!");
        }else {
            name.toUpperCase();
        }
    }
}
