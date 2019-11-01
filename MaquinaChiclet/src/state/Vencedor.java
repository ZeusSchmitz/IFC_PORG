package state;

public class Vencedor implements Estado {

    Maquina maquina;

    public Vencedor(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Aguarde, entregando segunda bolinha");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Aguarde, entregando segunda bolinha");
    }

    @Override
    public void virarManivela() {
        System.out.println("Aguarde, entregando segunda bolinha");
    }

    @Override
    public void entregar() {
        maquina.liberandoBolinha();
        if (maquina.getCount() == 0) {
            maquina.setState(maquina.getEsgotadoState());
        } else {
            maquina.liberandoBolinha();
            System.out.println("Você ganhou!!!!!!!!! Entregando segunda bolinha");
            if (maquina.getCount() > 0) {
                maquina.setState(maquina.getSemCreditoState());
            } else {
                System.out.println("Sem bolinhas! :(");
                maquina.setState(maquina.getEsgotadoState());
            }
        }
    }

    @Override
    public String toString() {
        return "Ganhador!!!";
    }
}
