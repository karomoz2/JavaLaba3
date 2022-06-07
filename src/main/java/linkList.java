import java.util.LinkedList;

public class linkList {

    public linkList() {}
    LinkedList<Integer> linLi=new LinkedList<>();

    public  String Add(int n)
    {
        String res="";
        long StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            linLi.add(i);
        }
        double EndTime= System.nanoTime()-StartTime;
        EndTime=EndTime/1_000_000.0;
        res=Double.toString(EndTime);
        linLi.clear();
        return res;
    }

    public  String Del(int n)
    {
        String res="";
        long StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            linLi.remove(i);
        }
        double EndTime= System.nanoTime()-StartTime;
        EndTime=EndTime/1_000_000.0;
        res=Double.toString(EndTime);
        return res;
    }


    public  String Get(int n)
    {
        String res="";
        long StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            linLi.get(i);
        }
        double EndTime= System.nanoTime()-StartTime;
        EndTime=EndTime/1_000_000.0;
        res=Double.toString(EndTime);
        return res;
    }


}
