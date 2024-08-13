public class App {
  public static void main(String[] args) throws Exception {
    RemoteControl remoteControl = new RemoteControl();
    CeilingFan ceilingFan = new CeilingFan();
    ICommand[] commands = {
        new CeilingFanHigh(ceilingFan),
        new CeilingFanLow(ceilingFan),
        new CeilingFanOff(ceilingFan)
    };

    ICommand macro = new MacroCommand(commands);
    
    remoteControl.addCommand(macro);

    remoteControl.pressButton(0);
    remoteControl.loadCommands();
  }
}
