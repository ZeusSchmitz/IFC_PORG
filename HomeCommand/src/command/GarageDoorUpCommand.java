package command;

import interfaceCom.Command;
import receiver.GarageDoor;

public class GarageDoorUpCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor gd) {
        garageDoor = gd;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
