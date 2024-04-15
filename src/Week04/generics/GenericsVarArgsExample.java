package Week04.generics;

public class GenericsVarArgsExample {

    public static <T> void  printArray(T...items){
        for (T item : items){
            System.out.println(item + "");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("String Dizisi");
        printArray("merhaba ", "dünya","java");


        System.out.println("Integer dizisi");
        printArray(1,2,3,4,"merhaba",6,7);

        System.out.println("double dizisi");
        printArray(3,14,80,2,718);


    }
}
