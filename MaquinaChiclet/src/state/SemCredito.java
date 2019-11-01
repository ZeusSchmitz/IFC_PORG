package state;

public class SemCredito implements Estado {

    Maquina maquina;

    public SemCredito(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Voce inseriu uma moeda");
        maquina.setState(maquina.getComCreditoState());
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Voce nao inseriu moedas!");
    }

    @Override
    public void virarManivela() {
        System.out.println("Manivela gerada, porém não existem creditos");
    }

    @Override
    public void entregar() {
        System.out.println("Sem creditos!");
    }

    @Override
    public String toString() {
        return "esperando moedas serem inseridas";
    }

}
