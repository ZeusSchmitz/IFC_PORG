package imobiliaria;

import definirValor.DefinirValorComportamento;

public abstract class Imovel {
    
    private int comodos;
    private float espaco;
    private String localizacao;
    private DefinirValorComportamento comportamentoValor;
    
    public Imovel(String loc, int comodos, float espaco){        
        setLocalizacao(loc);
        setComodos(comodos);
        setEspaco(espaco);
    }

    public void display() {
        performanceDefinirValor();        
    }
    public void performanceDefinirValor(){
        getComportamentoValor().definirValor(getLocalizacao(), getComodos(), getEspaco());
    }
    public int getComodos() {
        return comodos;
    }

    public void setComodos(int comodos) {
        this.comodos = comodos;
    }

    public float getEspaco() {
        return espaco;
    }

    public void setEspaco(float espaco) {
        this.espaco = espaco;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public DefinirValorComportamento getComportamentoValor() {
        return comportamentoValor;
    }

    public void setComportamentoValor(DefinirValorComportamento comportamentoValor) {
        this.comportamentoValor = comportamentoValor;
    }
    
}
