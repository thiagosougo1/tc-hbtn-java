import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class AnalisadorFrase {
    @SuppressWarnings("unchecked")

    public static TreeMap contagemPalavras(String frase){
        TreeMap<String, Integer> contPalavras = new TreeMap<String, Integer>();
        String[] fraseSplit = frase.toLowerCase().replace(".", "").replace("?", "").replace("!", "").split(" ");
        List<String> listPalavras = new ArrayList<>(List.of(fraseSplit));

        for (int i = 0; i < fraseSplit.length; i++) {
            contPalavras.put(fraseSplit[i], Collections.frequency(listPalavras, fraseSplit[i]));
        }
        return contPalavras;
    }
}
