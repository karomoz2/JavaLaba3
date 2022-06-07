import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Colectes {
    ArrayList<Integer> arLi=new ArrayList<>();
    LinkedList<Integer> linLi=new LinkedList<>();
   // int n;

    public Colectes()
    {
       // arLi=null;
        //linLi=null;
      //  n=kolvo;
    }
   /* public Colectes(ArrayList<int> arrayList, LinkedList<int> linked, int kolvo)
    {
        arLi=arrayList;
        linLi=linked;
        n=kolvo;
    }*/
    public  void AddArr(int n)
    {
        long StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            arLi.add(i);
        }
        long EndTime= System.nanoTime()-StartTime;
       // EndTime=EndTime/1_000_000;
        System.out.print(EndTime/1_000_000.0);
    }
    public  void AddLinked(int n)
    {
        long StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            linLi.add(i);
        }
        long EndTime= System.nanoTime()-StartTime;
        //EndTime=EndTime/100000;
        System.out.print(EndTime/1_000_000.0);
    }

    public  void DelArr(int n)
    {
        long StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            arLi.remove(i);
        }
        long EndTime= System.nanoTime()-StartTime;
        // EndTime=EndTime/1_000_000;
        System.out.print(EndTime/1_000_000.0);
    }

    public  void DelLi(int n)
    {
        long StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            linLi.remove(i);
        }
        long EndTime= System.nanoTime()-StartTime;
        // EndTime=EndTime/1_000_000;
        System.out.print(EndTime/1_000_000.0);
    }

    public  void GetArr(int n)
    {
        long StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            arLi.get(i);
        }
        long EndTime= System.nanoTime()-StartTime;
        // EndTime=EndTime/1_000_000;
        System.out.print(EndTime/1_000_000.0);
    }

    public  void GetLi(int n)
    {
        long StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            linLi.get(i);
        }
        long EndTime= System.nanoTime()-StartTime;
        // EndTime=EndTime/1_000_000;
        System.out.print(EndTime/1_000_000.0);
    }


}
