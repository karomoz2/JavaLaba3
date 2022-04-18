import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.lang.Object;

public class Colectes {

    static void TestAdd(int n, List<Integer> list)
    {
        System.out.printf("%-10s%-,20d","Add",n);


        long time = System.nanoTime();

        for(int i=0;i<n;i++)
            list.add(i);

        time = System.nanoTime() - time;
        System.out.printf("%-12.3f\n", time/1_000_000.0);
    }
    private static void TestGet(int n, List<Integer> list)
    {
        System.out.printf("%-10s%-,20d","Get",n);

        long time = System.nanoTime();

        for(int i=0;i<n;i++)
            list.get(i);

        time = System.nanoTime() - time;
        System.out.printf("%-12.3f\n", time/1_000_000.0);
    }
    private static void TestDelete(int n, List<Integer> list)
    {
        System.out.printf("%-10s%-,20d","Delete",n);

        long time = System.nanoTime();

        for(int i=0;i<n;i++)
            list.remove(i);

        time = System.nanoTime() - time;
        System.out.printf("%-12.3f\n", time/1_000_000.0);
    }

    private static void TestSort(int n, List<Integer> list)
    {
        System.out.printf("%-10s%-,20d","Sort",n);

        long time = System.nanoTime();

        Collections.sort(list);

        time = System.nanoTime() - time;
        System.out.printf("%-12.3f\n", time/1_000_000.0);
    }

    static void printListName(List<Integer> list)
    {
        if (list.getClass().toString().equals("class java.util.LinkedList"))
            System.out.printf("%-15s", "LinkedList");
        else
            System.out.printf("%-15s", "ArrayList");
    }
    static void Testing(List<Integer> Linkedlist, List<Integer> Arraylist)
    {
        for(int i=1000;i<=100000;i=i*10) {
            printListName(Linkedlist);
            TestAdd(i, Linkedlist);
        }
        System.out.println();
        for(int i=1000;i<=100000;i=i*10) {
            printListName(Arraylist);
            TestAdd(i, Arraylist);
        }
        System.out.println();
        for(int i=1000;i<=20000;i=i*4) {
            printListName(Linkedlist);
            TestGet(i, Linkedlist);
        }
        System.out.println();
        for(int i=1000;i<=20000;i=i*4) {
            printListName(Arraylist);
            TestGet(i, Arraylist);
        }
        System.out.println();
        for(int i=1000;i<=20000;i=i*4) {
            printListName(Linkedlist);
            TestDelete(i, Linkedlist);
        }
        System.out.println();
        for(int i=1000;i<=20000;i=i*4) {
            printListName(Arraylist);
            TestDelete(i, Arraylist);
        }
        System.out.println();
        for(int i=1000;i<=20000;i=i*4) {
            printListName(Linkedlist);
            TestSort(i, Linkedlist);
        }
        System.out.println();
        for(int i=1000;i<=20000;i=i*4) {
            printListName(Arraylist);
            TestSort(i, Arraylist);
        }
    }



    public static void main(String[] args) {
        LinkedList<Integer> listLinked = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.printf("%-15s%-10s%-20s%-12s%n","List type","Method","Col-vo oper","Time(ms)");
        Testing(listLinked, arrayList);
        //System.out.println();
        //Testing(array);
    }

}
