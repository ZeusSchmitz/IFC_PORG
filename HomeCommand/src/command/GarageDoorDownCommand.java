package command;

import interfaceCom.Command;
import receiver.GarageDoor;

public class GarageDoorDownCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor gd) {
        garageDoor = gd;
    }

    @Override
    public void execute() {
        garageDoor.dowm();
    }
}
