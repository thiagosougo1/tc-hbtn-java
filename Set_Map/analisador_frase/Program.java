package analisador_frase;

import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        TreeMap<String, Integer> contagemFrase1 = AnalisadorFrase.contagemPalavras("Tres pratos de trigo para tres tigres tristes");
        @SuppressWarnings("unchecked")
        TreeMap<String, Integer> contagemFrase2 = AnalisadorFrase.contagemPalavras("O que eh que Caca quer? Caca quer caqui. Qual caqui que Caca quer? Caca quer qualquer caqui.");
        @SuppressWarnings("unchecked")
        TreeMap<String, Integer> contagemFrase3 = AnalisadorFrase.contagemPalavras("Larga a tia, largatixa! Lagartixa, larga a tia!");
        @SuppressWarnings("unchecked")
        TreeMap<String, Integer> contagemFrase4 = AnalisadorFrase.contagemPalavras("Maria-mole eh molenga, se nao eh molenga, nao eh maria-mole. Eh coisa malemolente, nem mala, nem mola, nem Maria, nem mole.");
        @SuppressWarnings("unchecked")
        TreeMap<String, Integer> contagemFrase5 = AnalisadorFrase.contagemPalavras("Pilha de palha e telha velha. Palha na pilha e velha telha. Pilha de telha e palha velha.");
        @SuppressWarnings("unchecked")
        TreeMap<String, Integer> contagemFrase6 = AnalisadorFrase.contagemPalavras("Embaixo da pia tem um pinto que pia, quanto mais a pia pinga mais o pinto pia!");

        System.out.println(contagemFrase1);
        System.out.println(contagemFrase2);
        System.out.println(contagemFrase3);
        System.out.println(contagemFrase4);
        System.out.println(contagemFrase5);
        System.out.println(contagemFrase6);
    } 
}
