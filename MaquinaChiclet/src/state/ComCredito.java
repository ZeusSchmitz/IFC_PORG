package state;

import java.util.Random;

public class ComCredito implements Estado {

    Random ganhadorRandom = new Random(System.currentTimeMillis());
    Maquina maquina;

    public ComCredito(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Você não pode inserir mais moedas");
    }

    @Override
    public void entregar() {
        System.out.println("Bolinha entregue");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Moeda devolvida");
        maquina.setState(maquina.getSemCreditoState());
    }

    @Override
    public void virarManivela() {
        System.out.println("Manivela acionada");
        int vencedor = ganhadorRandom.nextInt(10);
        //verifica se foi ganhador (número randomico com 10 possibilidades de 0 a 9 foi 5)
        if ((vencedor == 5) && (maquina.getCount() > 1)) {
            maquina.setState(maquina.getVencedorState());
        } else {
            maquina.setState(maquina.getVendidoState());
        }
    }

    @Override
    public String toString() {
        return "Aguardando girar a manivela";
    }
}
