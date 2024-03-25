package Week03.constructor;

import java.security.PublicKey;

public class ParameterizedConstructor {
String name;

String lastname;

int age;
String gender;


ParameterizedConstructor(int age, String gender){
    //  isim çakişmasıolacacagı için "this". anahtar kelimesi
    //  kulanılarak sınıfın field ı age'ı olan age£e erişecegimi  belirtiyorum.
    this. age = age;
    this.gender= gender;

}
}
