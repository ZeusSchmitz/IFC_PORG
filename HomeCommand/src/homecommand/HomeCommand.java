package homecommand;

import command.CellingFanOffCommand;
import command.CellingFanOnCommand;
import command.GarageDoorDownCommand;
import command.GarageDoorUpCommand;
import command.LightOffCommand;
import command.LightOnCommand;
import command.StereoOffCommand;
import command.StereoOnWithCDComman;
import invoker.RemoteControl;
import receiver.CellingFan;
import receiver.GarageDoor;
import receiver.Light;
import receiver.Stereo;

public class HomeCommand {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room Light");
        Light kitchenLight = new Light("Kitchen Light");
        CellingFan cellingFan = new CellingFan();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CellingFanOnCommand cellingFanOn = new CellingFanOnCommand(cellingFan);
        CellingFanOffCommand cellingFanOff = new CellingFanOffCommand(cellingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDComman stereoOn = new StereoOnWithCDComman(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, cellingFanOn, cellingFanOff);
        remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(4, stereoOn, stereoOff);

        
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(0);
    }
    
}
