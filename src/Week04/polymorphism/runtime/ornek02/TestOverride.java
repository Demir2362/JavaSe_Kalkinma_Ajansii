package Week04.polymorphism.runtime.ornek02;

public class TestOverride {
    public static void main(String[] args) {
        System.out.println("##############");
        System.out.println("Animal");
        System.out.println("###############");


         Animal animal = new Animal();
         animal.feetSize();
         System.out.println(animal.size);
         System.out.println();


         System.out.println("#############");
         System.out.println("dogAnimal");
         System.out.println("###############");
         Dog dog= new Dog();

    }



}
