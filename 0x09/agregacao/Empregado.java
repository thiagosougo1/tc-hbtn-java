package agregacao;

public class Empregado {
    private String nome;
    private int codigo;
    private Endereco endereco;

    public Empregado(String nome, int codigo, Endereco endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void apresentar(){
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        System.out.println("País: " + pais);
    }
}
