package receiver;

public class Light {

    String comodo;

    public Light(String comodo) {
        this.comodo = comodo;
    }

    public void on() {
        System.out.println(comodo + " Luz on");
    }

    public void off() {
        System.out.println(comodo + " Luz off");
    }

}
