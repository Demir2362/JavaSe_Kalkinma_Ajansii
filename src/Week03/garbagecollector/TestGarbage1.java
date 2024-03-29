package Week03.garbagecollector;

public class TestGarbage1 {
    public static  void main(String[]args){
        TestGarbage1 garbage1 = new TestGarbage1();
        /* bunlar heapte ayrı yerde tutuluyor. */
        TestGarbage1 garbage2 = new TestGarbage1();

        TestGarbage1 garbage3 = new TestGarbage1();
        /* bunlar heapte aynı nesneyi refarans allıyorlar.*/
        TestGarbage1 garbage4 = garbage3;

        garbage1 = null;
        garbage2 = null;
        garbage3 = null;
        garbage4 = null;// bunun çöpü yoktur, çünkü degerini garbage3'den alıyor.
        // yani garbege3 ve garbege4  heap'te aynı degere refaranslanmiş.
        new TestGarbage1();
         System.gc();

    }
}
