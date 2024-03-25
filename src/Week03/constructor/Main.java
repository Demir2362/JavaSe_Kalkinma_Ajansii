package Week03.constructor;

public class Main {
    private String  name;
  Main(){
      System.out.println("Constructor Called...");
  }
    public static void main(String[] args) {
        Main obj = new Main();
        Main obj2 = new Main();
        System.out.println();
        obj.name ="Constructor name field.";
        obj2.name="Constructor name field.";
        System.out.println("The name is : " +obj.name+"\nThe second name is : " + obj.name);
    }
}
