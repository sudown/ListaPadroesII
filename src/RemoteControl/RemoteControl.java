package RemoteControl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import CeilingFan.CeilingFan;
import CeilingFan.CeilingFanHigh;
import CeilingFan.CeilingFanLow;
import IComand.ICommand;
import Light.Light;
import Light.LightOff;
import Light.LightOn;
import Tv.Tv;
import Tv.TvOff;
import Tv.TvOn;

public class RemoteControl {
  List<ICommand> commands = new ArrayList<>();
  Map<String, ICommand> commandMap = new HashMap<>();

  public RemoteControl() {
    CeilingFan ceilingFan = new CeilingFan();
    this.commandMap.put("CeilingFanHigh", new CeilingFanHigh(ceilingFan));
    this.commandMap.put("CeilingFanLow", new CeilingFanLow(ceilingFan));
    this.commandMap.put("CeilingFanOff", new CeilingFanLow(ceilingFan));

    Tv tv = new Tv();
    this.commandMap.put("TvOn", new TvOn(tv));
    this.commandMap.put("TvOff", new TvOff(tv));

    Light light = new Light();
    this.commandMap.put("LightOn", new LightOn(light));
    this.commandMap.put("LightOff", new LightOff(light));
  }

  public void addCommand(ICommand command) {
    commands.add(command);
  }

  public void pressButton(int index) {
    if (index < commands.size()) {
      commands.get(index).execute();
      try (BufferedWriter writer = new BufferedWriter(new FileWriter("commands.txt", false))) {
        this.commands.get(index).store(writer);
      } catch (IOException e) {
        e.printStackTrace();
      }
    } else {
      System.out.println("Não há um comando para esse botão " + index);
    }
  }

  public void loadCommands() {
    try (BufferedReader reader = new BufferedReader(new FileReader("commands.txt"))) {
      String commandName;
      while ((commandName = reader.readLine()) != null) {
        ICommand command = commandMap.get(commandName);
        if (command != null) {
          command.execute();
        } else {
          System.out.println("Comando inexistente: " + commandName);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}