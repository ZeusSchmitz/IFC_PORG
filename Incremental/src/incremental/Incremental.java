package incremental;

    /*Primeiramento no exercício na calsse Teste é gerado n Instancias
      Após alterado para Singleton adicionado uniqueInstance e efetuado a retrição,
      verificado que sómente uma instancia é gerada.
    */
public class Incremental {
    private static Incremental uniqueInstance;
    private static int count = 0;
    private int numero;

    Incremental() {
        numero = ++count;
    }

    @Override
    public String toString() {
        return "Incremental " + numero;
    }

    public static synchronized Incremental getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Incremental();
        }
        return uniqueInstance;
    }
}
