package duplicados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {
    public static TreeSet buscar(int[] valores){
        List<Integer> valor = new ArrayList<>();
        Set<Integer> ts = new TreeSet<>();

        for (int i = 0; i < valores.length; i++) {
            valor.add(valores[i]);
            
            if(Collections.frequency(valor, valores[i]) > 1){
                ts.add(valores[i]);
            };
        }

        System.out.println(ts);

        return null;
    }
}
