package Week04.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;

public class ArrayList04 {

    public static void main(String[] args) {

        ArrayList<Integer>numberList = new  ArrayList<>();
        numberList.add(3);
        numberList.add(4);
        numberList.add(11);
        numberList.add(4);
        System.out.println("Before sort " + numberList);
        Collections.sort(numberList);
        System.out.println("After sort " + numberList"\n");
        Collections.sort(numberList,Collections.reverseOrder());
        System.out.println("After reverse " + numberList+"\n");
        numberList.sort(Collections.reverseOrder());
        System.out.println("After reverse" + numberList+"\n");

        System.out.println("size :" + numberList.size()+"\n");


        ArrayList numberList2 = (ArrayList)  numberList. clone();
        System.out.println("Clone List "+ numberList2+"\n");


        System.out.println("for-each");





        {
        {



            }
        };
    }
}
