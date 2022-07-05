 

import java.util.*;

public class ProcessadorVideo {
    ArrayList<CanalNotificacao> canais;

    public ProcessadorVideo() {
        canais = new ArrayList<>();
    }
    
    public void registrarCanal(CanalNotificacao canal){
        canais.add(canal);
    }

    public void processar(Video video){
       for (CanalNotificacao canal: canais) {
            canal.notificar(new Mensagem(video.getArquivo()+" - "+video.getFormato(), TipoMensagem.LOG));

        }
    }
}
