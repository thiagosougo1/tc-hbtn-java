 .atividades;

public class ModificarStatusVideo implements Atividade{
    @Override
    public void executar(){
        System.out.println("modificando status do video");
    }

    public ModificarStatusVideo(){
        executar();
    }
}
