import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Colectes {
    //Замер добавления
    static void TestAdd(int n, List<Integer> list)
    {
        System.out.print("      Add");
        System.out.print("         "+n);
        long time = System.nanoTime();

        for(int i=0;i<n;i++)
            list.add(i);

        time = System.nanoTime() - time;
        System.out.printf("           "+ time/1_000_000.0);
    }
    //Замер получения
    private static void TestGet(int n, List<Integer> list)
    {
        System.out.print("      Get");
        System.out.print("         "+n);
        long time = System.nanoTime();

        for(int i=0;i<n;i++)
            list.get(i);

        time = System.nanoTime() - time;
        System.out.printf("           "+ time/1_000_000.0);
    }
    //Замер удаления
    private static void TestDelete(int n, List<Integer> list)
    {
        System.out.print("      Delete");
        System.out.print("      "+n);

        long time = System.nanoTime();

        for(int i=0;i<n;i++)
            list.remove(i);

        time = System.nanoTime() - time;
        System.out.printf("           "+ time/1_000_000.0);
    }
    //Замер сортировки
    private static void TestSort(int n, List<Integer> list)
    {
        //System.out.printf("%-10s%-,20d","Sort",n);
        System.out.print("      Sort");
        System.out.print("        "+n);
        long time = System.nanoTime();

        Collections.sort(list);

        time = System.nanoTime() - time;
        System.out.print("           "+ time/1_000_000.0);
    }
    //Замер размера
    private static void TestSize(int n, List<Integer> list)
    {
        //System.out.printf("%-10s%-,20d","Sort",n);
        System.out.print("      Size");
        System.out.print("        "+n);
        long time = System.nanoTime();

        list.size();

        time = System.nanoTime() - time;
        System.out.print("           "+ time/1_000_000.0);
    }


    static void printListName(List<Integer> list)
    {
        if (list.getClass().toString().equals("class java.util.LinkedList"))
            System.out.print("LinkedList");
        else
            System.out.print("ArrayList ");
    }
    static void Testing(List<Integer> Linkedlist, List<Integer> Arraylist)
    {
        System.out.println();
        for(int i=1000;i<=8000;i=i*2) {
            printListName(Linkedlist);
            TestAdd(i, Linkedlist);
            System.out.println();
        }
        System.out.println();
        for(int i=1000;i<=8000;i=i*2) {
            printListName(Arraylist);
            TestAdd(i, Arraylist);
            System.out.println();
        }
        System.out.println();
        for(int i=1000;i<=8000;i=i*2) {
            printListName(Linkedlist);
            TestGet(i, Linkedlist);
            System.out.println();
        }
        System.out.println();
        for(int i=1000;i<=8000;i=i*2) {
            printListName(Arraylist);
            TestGet(i, Arraylist);
            System.out.println();
        }
        System.out.println();
        for(int i=1000;i<8000;i=i*2) {
            printListName(Linkedlist);
            TestDelete(i, Linkedlist);
            System.out.println();
        }
        System.out.println();
        for(int i=1000;i<8000;i=i*2) {
            printListName(Arraylist);
            TestDelete(i, Arraylist);
            System.out.println();
        }
        System.out.println();
        for(int i=1000;i<=8000;i=i*2) {
            printListName(Linkedlist);
            TestSort(i, Linkedlist);
            System.out.println();
        }
        System.out.println();
        for(int i=1000;i<=8000;i=i*2) {
            printListName(Arraylist);
            TestSort(i, Arraylist);
            System.out.println();
        }


        System.out.println();
        for(int i=1000;i<=8000;i=i*2) {
            printListName(Linkedlist);
            TestSize(i, Linkedlist);
            System.out.println();
        }
        System.out.println();
        for(int i=1000;i<=8000;i=i*2) {
            printListName(Arraylist);
            TestSize(i, Arraylist);
            System.out.println();
        }
    }



    public static void main(String[] args) {
        LinkedList<Integer> listLinked = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("List type     Method      Col-vo oper     Time(ms)");
        Testing(listLinked, arrayList);

    }

}
