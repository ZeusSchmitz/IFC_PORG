package receiver;

public class Stereo {

    public void on() {
        System.out.println("Radio on");
    }

    public void off() {
        System.out.println("Radio off");
    }

    public void setCD() {
        System.out.println("Radio executando midia CD");
    }

    public void setDVD() {
        System.out.println("Radio executando midia DVD");
    }

    public void setRadio() {

    }

    public void setVol(int vol) {
        System.out.println("Volume do radio: " + vol);
    }

}
