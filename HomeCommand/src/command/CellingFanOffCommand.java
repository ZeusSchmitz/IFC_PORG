package command;

import interfaceCom.Command;
import receiver.CellingFan;

public class CellingFanOffCommand implements Command {

    CellingFan cellingFan;

    public CellingFanOffCommand(CellingFan cf) {
        this.cellingFan = cf;
    }

    @Override
    public void execute() {
        cellingFan.off();
    }
}
