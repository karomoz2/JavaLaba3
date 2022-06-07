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


        System.out.format("________________________________________%n");
        System.out.format("|     Method    | Kolvo op |-Time (ms)-|%n");
        System.out.format("|---------------+----------+-----------|%n");
        System.out.printf("|%-15s|%10d|%11s|%n","add ArrayList", 1000, a.Add(1000));    a.Clear();
        System.out.printf("|%-15s|%10d|%11s|%n","add LinkedList", 1000, l.Add(1000));   l.Clear();
        System.out.printf("|%-15s|%10d|%11s|%n","add ArrayList", 6000, a.Add(6000));    a.Clear();
        System.out.printf("|%-15s|%10d|%11s|%n","add LinkedList", 6000, l.Add(6000));   l.Clear();
        System.out.printf("|%-15s|%10d|%11s|%n","add ArrayList", 10000, a.Add(10000));  a.Clear();
        System.out.printf("|%-15s|%10d|%11s|%n","add LinkedList", 10000, l.Add(10000)); l.Clear();
        System.out.format("|---------------+----------+-----------|%n");
        a.Add(10000);
        l.Add(10000);
        System.out.printf("|%-15s|%10d|%11s|%n","get ArrayList", 1000, a.Get(1000));
        System.out.printf("|%-15s|%10d|%11s|%n","get LinkedList", 1000, l.Get(1000));
        System.out.printf("|%-15s|%10d|%11s|%n","get ArrayList", 6000, a.Get(6000));
        System.out.printf("|%-15s|%10d|%11s|%n","get LinkedList", 6000, l.Get(6000));
        System.out.printf("|%-15s|%10d|%11s|%n","get ArrayList", 10000, a.Get(10000));
        System.out.printf("|%-15s|%10d|%11s|%n","get LinkedList", 10000, l.Get(10000));
        System.out.format("|---------------+----------+-----------|%n");
        System.out.printf("|%-15s|%10d|%11s|%n","del ArrayList", 1000, a.Del(1000));    a.Clear();a.Add(6000);
        System.out.printf("|%-15s|%10d|%11s|%n","del LinkedList", 1000, l.Del(1000));   l.Clear();l.Add(6000);
        System.out.printf("|%-15s|%10d|%11s|%n","del ArrayList", 3000, a.Del(3000));    a.Clear();a.Add(10000);
        System.out.printf("|%-15s|%10d|%11s|%n","del LinkedList", 3000, l.Del(3000));   l.Clear();l.Add(10000);
        System.out.printf("|%-15s|%10d|%11s|%n","del ArrayList", 5000, a.Del(5000));    a.Clear();a.Add(1000);
        System.out.printf("|%-15s|%10d|%11s|%n","del LinkedList", 5000, l.Del(5000));   l.Clear();l.Add(1000);
        System.out.format("|---------------+----------+-----------|%n");
        System.out.printf("|%-15s|%10d|%11s|%n","sort ArrayList", 1000, a.Sort());          a.Clear();a.Add(6000);
        System.out.printf("|%-15s|%10d|%11s|%n","sort LinkedList", 1000, l.Sort());         l.Clear();l.Add(6000);
        System.out.printf("|%-15s|%10d|%11s|%n","sort ArrayList", 6000, a.Sort());          a.Clear();a.Add(10000);
        System.out.printf("|%-15s|%10d|%11s|%n","sort LinkedList", 6000, l.Sort());         l.Clear();l.Add(10000);
        System.out.printf("|%-15s|%10d|%11s|%n","sort ArrayList", 10000, a.Sort());
        System.out.printf("|%-15s|%10d|%11s|%n","sort LinkedList", 10000, l.Sort());
        System.out.format("|--------------------------------------|%n");
    }
}
