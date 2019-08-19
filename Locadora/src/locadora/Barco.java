package locadora;

import navegacao.ModoMovimento;

public abstract class Barco {

    private ModoMovimento comportamentoMovimento;
    private String modelo;

    public void display() {
        performMovimento();
    }

    public void performMovimento() {
        getComportamentoMovimento().modoMovimentar();
    }

    public ModoMovimento getComportamentoMovimento() {
        return comportamentoMovimento;
    }

    public void setComportamentoMovimento(ModoMovimento comportamentoMovimento) {
        this.comportamentoMovimento = comportamentoMovimento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
