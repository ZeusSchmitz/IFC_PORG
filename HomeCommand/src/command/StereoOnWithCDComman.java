package command;

import interfaceCom.Command;
import receiver.Stereo;

public class StereoOnWithCDComman implements Command {

    Stereo stereo;

    public StereoOnWithCDComman(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {

        stereo.on();
        stereo.setCD();
        stereo.setVol(5);
    }

}
