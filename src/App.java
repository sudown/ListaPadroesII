import CeilingFan.CeilingFan;
import CeilingFan.CeilingFanHigh;
import CeilingFan.CeilingFanLow;
import CeilingFan.CeilingFanOff;
import IComand.ICommand;
import Light.Light;
import Light.LightOff;
import Light.LightOn;
import RemoteControl.MacroCommand;
import RemoteControl.RemoteControl;
import Tv.Tv;
import Tv.TvOff;
import Tv.TvOn;

public class App {
  public static void main(String[] args) throws Exception {
    RemoteControl remoteControl = new RemoteControl();
    CeilingFan ceilingFan = new CeilingFan();
    Tv tv = new Tv();
    Light light = new Light();
    ICommand[] commands = {
        new LightOn(light),
        new CeilingFanLow(ceilingFan),
        new CeilingFanHigh(ceilingFan),
        new TvOn(tv),
        new CeilingFanOff(ceilingFan),
        new TvOff(tv),
        new LightOff(light)
    };

    ICommand macro = new MacroCommand(commands);

    remoteControl.addCommand(macro);
    remoteControl.addCommand(commands[0]);
    remoteControl.addCommand(commands[6]);
    remoteControl.addCommand(commands[1]);
    remoteControl.addCommand(commands[2]);
    remoteControl.addCommand(commands[3]);
    remoteControl.addCommand(commands[5]);

    //remoteControl.pressButton(0);
    remoteControl.loadCommands();
  }
}
