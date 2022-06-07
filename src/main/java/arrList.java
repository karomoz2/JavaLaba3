import java.util.ArrayList;
import java.util.Collections;


public class arrList {

    ArrayList<Integer> arLi=new ArrayList<>();

    public arrList() {}
    //Добавление
    public  String Add(int n)
    {
        String res="";
        double StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            arLi.add(i);
        }
        double EndTime= System.nanoTime()-StartTime;
        EndTime=EndTime/1_000_000.0;
        res=Double.toString(EndTime);

        return res;
    }
    //Очистка
    public  void Clear()
    {
        arLi.clear();
    };
    //Удаление
    public  String Del(int n)
    {
        String res="";
        long StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            arLi.remove(i);
        }
        double EndTime= System.nanoTime()-StartTime;
        EndTime=EndTime/1_000_000.0;
        res=Double.toString(EndTime);

        return res;
    }
    //Получение
    public  String Get(int n)
    {
        String res="";
        long StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            arLi.get(i);
        }
        double EndTime= System.nanoTime()-StartTime;
        EndTime=EndTime/1_000_000.0;
        res=Double.toString(EndTime);
        return res;
    }
    //Сортировка
    public  String Sort()
    {
        String res="";
        long StartTime = System.nanoTime();
        Collections.sort(arLi);
        double EndTime= System.nanoTime()-StartTime;
        EndTime=EndTime/1_000_000.0;
        res=Double.toString(EndTime);
        return res;
    }

}
