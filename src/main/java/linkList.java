import java.util.LinkedList;

public class linkList {

    public linkList() {}
    LinkedList<Integer> linLi=new LinkedList<>();

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
