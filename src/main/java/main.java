import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class main {
    public  static void main(String args[]) {
        System.out.println("Vsem privet!");
        int n=10;
        Colectes a=new Colectes();

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













    }
}
