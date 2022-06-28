
import java.util.List;

public class ManipularArrayNumeros {

    public static void adicionarNumero(List<Integer> numeros, int i) {
        if(!buscarPosicaoNumero(numeros, i))
            numeros.add(i);
        else throw new IllegalArgumentException("Numero jah contido na lista");
    }

    public static void removerNumero(List<Integer> numeros, int i) {
        if(buscarPosicaoNumero(numeros, i)){
            int index = numeros.indexOf(i);
            numeros.remove(index);
        } else throw new IllegalArgumentException("Numero nao encontrado na lista");
    }

    public static void substituirNumero(List<Integer> numeros, int i, int j) {
        if(buscarPosicaoNumero(numeros, i)){
            int index = numeros.indexOf(i);
            numeros.set(index, j);
        } else {
            adicionarNumero(numeros, j);
        }
       
    }

    public static boolean buscarPosicaoNumero(List<Integer> numeros, int i){
        if(numeros.contains(i)){
            return true;
        } else return false;
    }
}
