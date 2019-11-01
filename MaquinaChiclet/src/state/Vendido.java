package state;

public class Vendido implements Estado {

    Maquina maquina;

    public Vendido(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Aguardar, entregando bolinha");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Moeda já utlizada");
    }

    @Override
    public void virarManivela() {
        System.out.println("Manivela já foi virada");
    }

    @Override
    public void entregar() {
        maquina.liberandoBolinha();
        if (maquina.getCount() > 0) {
            maquina.setState(maquina.getSemCreditoState());
        } else {
            System.out.println("Bolinhas esgotadas!");
            maquina.setState(maquina.getEsgotadoState());
        }
    }

    @Override
    public String toString() {
        return "liberando bolinha!";
    }
}
