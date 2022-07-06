import provedores.*;

public class ProcessadorPedido {
    private ProvedorFrete provedorFrete ;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido){
       Frete resultado =  provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal());

       pedido.setFrete(resultado);
    }

    public ProvedorFrete getProvedorFrete() {
        return provedorFrete;
    }

    public void setProvedorFrete(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }
}
