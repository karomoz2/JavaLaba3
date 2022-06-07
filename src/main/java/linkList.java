import java.util.Collections;
import java.util.LinkedList;

public class linkList {

    public linkList() {}
    LinkedList<Integer> linLi=new LinkedList<>();
    //Добавление
    public  String Add(int n)
    {
        String res="";
        double StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            linLi.add(i);
        }
        double EndTime= System.nanoTime()-StartTime;
        EndTime=EndTime/1_000_000.0;
        res=Double.toString(EndTime);
        return res;
    }
    //Очистка.
    public  void Clear()
    {
        linLi.clear();
    };
    //Удаление
    public  String Del(int n)
    {
        String res="";
        double StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            linLi.remove(i);
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
        double StartTime = System.nanoTime();
        for(int i=0; i<n;i++)
        {
            linLi.get(i);
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
        double StartTime = System.nanoTime();
        Collections.sort(linLi);
        double EndTime= System.nanoTime()-StartTime;
        EndTime=EndTime/1_000_000.0;
        res=Double.toString(EndTime);
        return res;
    }

}
