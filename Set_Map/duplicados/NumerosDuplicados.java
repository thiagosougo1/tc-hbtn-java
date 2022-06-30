package duplicados;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {
    public static TreeSet buscar(int[] valores){
        Set<Integer> ts = new HashSet<>();
        for (int i = 0; i < valores.length; i++) {
            ts.add(valores[i]);
           // System.out.print("["+valores[i]+"] ");
        }
        System.out.println();
    System.out.println(ts);
        return null;
    }
}
