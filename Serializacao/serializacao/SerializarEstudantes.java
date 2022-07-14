import java.util.*;
import java.io.*;

public class SerializarEstudantes<E> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        setNomeArquivo(nomeArquivo);
    }

    public String getNomeArquivo() {
        return this.nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
    public void serializar(List<Estudante> estudantes){
        try{
            FileOutputStream fout = new FileOutputStream(nomeArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fout);

            oos.writeObject(estudantes);
            oos.close();
        }
        catch(Exception ex){
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar(){
        List<Estudante> estudantes = null;
        try{
            FileInputStream fin = new FileInputStream(nomeArquivo);
            ObjectInputStream ois = new ObjectInputStream(fin);

            estudantes = (List<Estudante>)ois.readObject();
            ois.close();
        } catch(Exception ex){
            System.out.println("Nao foi possivel desserializar");
        }

        return estudantes;
    }
}
