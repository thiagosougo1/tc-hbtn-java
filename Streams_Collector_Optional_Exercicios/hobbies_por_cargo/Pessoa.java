import java.util.*;

public class Pessoa implements Comparable<Pessoa>{
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;
    private List<String> hobbies;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario, List<String> hobbies)  {
        setCodigo(codigo);
        setNome(nome);
        setCargo(cargo);
        setIdade(idade);
        setSalario(salario);
        setHobbies(hobbies);
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<String> getHobbies() {
        return this.hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString(){
        return String.format("[%d] %s %s %d R$ %f", getCodigo(), getNome(), getCargo(), getIdade(), getSalario());
    }

    @Override
    public int compareTo(Pessoa pessoa) {
       return nome.compareTo(pessoa.getNome());
    }

}
