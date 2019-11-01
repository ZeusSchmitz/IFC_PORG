package state;

public class Maquina {

    Estado esgotadoState;
    Estado semCreditoState;
    Estado comCreditoState;
    Estado vendidoState;
    Estado vencedorState;

    Estado state = esgotadoState;
    int count = 0;

    public Maquina(int numeroBolinhas) {
        esgotadoState = new Esgotado(this);
        semCreditoState = new SemCredito(this);
        comCreditoState = new ComCredito(this);
        vendidoState = new Vendido(this);
        vencedorState = new Vencedor(this);

        this.count = numeroBolinhas;
        if (numeroBolinhas > 0) {
            state = semCreditoState;
        }
    }

    public void inserirMoeda() {
        state.inserirMoeda();
    }

    public void ejetarMoeda() {
        state.ejetarMoeda();
    }

    public void girarManivela() {
        state.virarManivela();
        state.entregar();
    }

    void setState(Estado state) {
        this.state = state;
    }

    void liberandoBolinha() {
        System.out.println("Bolinha liberada!");
        if (count != 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    public Estado getState() {
        return state;
    }

    public Estado getEsgotadoState() {
        return esgotadoState;
    }

    public Estado getSemCreditoState() {
        return semCreditoState;
    }

    public Estado getComCreditoState() {
        return comCreditoState;
    }

    public Estado getVendidoState() {
        return vendidoState;
    }

    public Estado getVencedorState() {
        return vencedorState;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Possui: ").append(count).append(" bolinha(s)");

        result.append("\n");
        result.append("A maquina está no estado: ").append(state).append("\n");
        return result.toString();
    }

}
