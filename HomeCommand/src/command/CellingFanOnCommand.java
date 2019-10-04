package command;

import interfaceCom.Command;
import receiver.CellingFan;

public class CellingFanOnCommand implements Command {

    CellingFan cellingFan;

    public CellingFanOnCommand(CellingFan cf) {
        this.cellingFan = cf;
    }

    @Override
    public void execute() {
        cellingFan.lowSpeed();
    }

}
