import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class main {
    public  static void main(String args[]) {
        System.out.println("Vsem privet!");
        int n=10;
        arrList a=new arrList();
        linkList l=new linkList();


        /*
        a.AddArr(10000);
        System.out.println("");
        System.out.println("Link!");
        a.AddLinked(10000);
        System.out.println("");

        System.out.println("Get!");
        a.GetArr(10000);
        System.out.println("");
        System.out.println("Link!");
        a.GetLi(10000);
        System.out.println("");

        System.out.println("Delenn");
        a.DelArr(1000);
        System.out.println("");
        System.out.println("Link!");
        a.DelLi(1000);
        System.out.println("");

        System.out.println("");System.out.println("");System.out.println("");
       // System.out.println("Metod        Kol-vo       Time");
*/
        // String Method=("add");
        //String kolvo=("1000");
       // String Time=a.AddArr(10000);


        System.out.format("________________________________________%n");
        System.out.format("|     Method    | Kolvo op |-Time (ms)-|%n");
        System.out.format("|---------------+----------+-----------|%n");
        System.out.printf("|%-15s|%10d|%11s|%n","add ArrayList", 1000, a.Add(1000));
        System.out.printf("|%-15s|%10d|%11s|%n","add LinkedList", 1000, l.Add(1000));
        System.out.printf("|%-15s|%10d|%11s|%n","add ArrayList", 10000, a.Add(10000));
        System.out.printf("|%-15s|%10d|%11s|%n","add LinkedList", 10000, l.Add(10000));
        System.out.printf("|%-15s|%10d|%11s|%n","add ArrayList", 50000, a.Add(50000));
        System.out.printf("|%-15s|%10d|%11s|%n","add LinkedList", 50000, l.Add(50000));





    }
}
