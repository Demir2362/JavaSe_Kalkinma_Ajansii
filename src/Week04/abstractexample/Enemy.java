package Week04.abstractexample;

public class Enemy {


    int health;

    int damage;


    public abstract  void attack();// abstract method çünkü her düşmanın atagı farklıdır.

    public void  takeDamage(int damage){
        health = health - damage;
        System.out.println("Enemy is damaged : " + damage);
        System.out.println("Enemy health is : "+ health);



    }
}
