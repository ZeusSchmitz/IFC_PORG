package maquinachiclet;

import state.Maquina;

public class MaquinaChiclet {

    public static void main(String[] args) {

        Maquina maquina = new Maquina(15);

        System.out.println(maquina);

        maquina.inserirMoeda();
        maquina.girarManivela();
        maquina.inserirMoeda();
        maquina.girarManivela();

        System.out.println(maquina);

        maquina.girarManivela();
        maquina.inserirMoeda();
        maquina.girarManivela();

        System.out.println(maquina);

        maquina.inserirMoeda();
        maquina.girarManivela();
        maquina.inserirMoeda();
        maquina.girarManivela();

        System.out.println(maquina);

        maquina.inserirMoeda();
        maquina.girarManivela();
        maquina.inserirMoeda();
        maquina.girarManivela();

        System.out.println(maquina);

        maquina.inserirMoeda();
        maquina.girarManivela();
        maquina.inserirMoeda();
        maquina.girarManivela();

        System.out.println(maquina);

        maquina.inserirMoeda();
        maquina.girarManivela();
        maquina.girarManivela();

        System.out.println(maquina);

    }

}
