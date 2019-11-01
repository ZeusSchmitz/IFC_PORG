package state;

public class Esgotado implements Estado {

    Maquina gumballMachine;

    public Esgotado(Maquina gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Não é possivel ejetar moeda, você não inseriu creditos");
    }

    @Override
    public void virarManivela() {
        System.out.println("Manivela girada, porém não existem bolinhas");
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Não é possivel inserir moeda, máquina esgotada");
    }

    @Override
    public void entregar() {
        System.out.println("Nenhuma bolinha entregue");
    }

    @Override
    public String toString() {
        return "esgotada";
    }
}
