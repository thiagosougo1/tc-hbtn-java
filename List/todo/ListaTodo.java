
import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
    static List<Tarefa> tarefas;

    public ListaTodo(){
        tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);       
        int i = 0;
        for(Tarefa task : tarefas){
            if(task.getIdentificador() == tarefa.getIdentificador()){   
                i++;
            }
             if(i == 2){
                throw new IllegalArgumentException("Tarefa com identificador "+ task.getIdentificador()+" ja existente na lista");
            }
        }
    }

    public boolean marcarTarefaFeita(int identificador){
        boolean feita = false;
        for(Tarefa task : tarefas){
            if(task.getIdentificador() == identificador){
               task.setEstahFeita(true);
            } else{
                task.setEstahFeita(false);
            } 
        } return feita;
    }

    public boolean desfazerTarefa(int identificador){
        for(Tarefa task : tarefas){
            if(task.getIdentificador() == identificador){
                task.setEstahFeita(false);
            }
        }
        return false;
    }

    public void desfazerTodas(){
        for(Tarefa task: tarefas){
            task.setEstahFeita(false);
        }
    }

    public void fazerTodas(){
        for(Tarefa task: tarefas){
            task.setEstahFeita(true);
        }
    }

    public void listarTarefas(){
        for(Tarefa task : tarefas){
           if(task.getEstahFeita()){
                System.out.println("[X]  Id: " + task.getIdentificador() + " - Descricao: " + task.getDescricao());
           } else{
            System.out.println("[ ]  Id: " + task.getIdentificador() + " - Descricao: " + task.getDescricao());

           }

        }
    }
}
