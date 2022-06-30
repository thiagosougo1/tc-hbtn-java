package todo;

import java.util.ArrayList;

public class ListaTodo {
    static ArrayList<Tarefa> tarefas;

    public ListaTodo(){
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);       
        for(Tarefa task : tarefas){
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
                System.out.println("[x] Id: " + task.getIdentificador() + " - Descricao: " + task.getDescricao());
           } else{
            System.out.println("[ ] Id: " + task.getIdentificador() + " - Descricao: " + task.getDescricao());

           }

        }
    }
}
