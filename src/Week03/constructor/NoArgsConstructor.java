package Week03.constructor;

public class NoArgsConstructor {

    String name;
    String lastname;
    String county;

    NoArgsConstructor(){
        county = "Turkey";

    }

    public static void main(String[] args) {
        NoArgsConstructor obj1 = new NoArgsConstructor();
       obj1.name= "Alperen";
       obj1.lastname="İkinci";




    }
}
