package Week03.array;

public class ArryOutputTemplate {

    public  static void  main (String[] args) {
        int [] numberArr= {15,13,20,50,31,56,75};
        int sayac = 0;
        System.out.println("[");
        for(int number : numberArr){
            if (sayac<numberArr. length-1) {
                System.out.println("[");
            } else {
                System.out.print(number);
            }
            sayac++;

        }
        System.out.println("]");
        }


}
