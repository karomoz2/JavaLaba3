import java.util.ArrayList;




public class arrList {

    ArrayList<Integer> arLi=new ArrayList<>();

    public arrList() {}

    public  String AddArr(int n)
    {
        String res="100";
        long StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            arLi.add(i);
        }
        long EndTime= System.nanoTime()-StartTime;
        //EndTime=EndTime.scaleByPowerOfTen( -6 );
        EndTime=EndTime/100000;
        res=Long.toString(EndTime);
        return res;
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


}
