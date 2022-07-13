import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas){
        TreeMap<String, TreeSet<Pessoa>> mapPessoas = pessoas.stream().collect(
            Collectors.groupingBy(Pessoa::getCargo, () -> new TreeMap<>(Comparator.reverseOrder()), 
            Collectors.toCollection(TreeSet::new))
        );
        return mapPessoas;
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> listaPessoas){
        return listaPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
    }
}
