import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoteControl {
  List<ICommand> commands = new ArrayList<>();
  Map<String, ICommand> commandMap = new HashMap<>();

  public RemoteControl() {
    CeilingFan ceilingFan = new CeilingFan();
    this.commandMap.put("CeilingFanHigh", new CeilingFanHigh(ceilingFan));
    this.commandMap.put("CeilingFanLow", new CeilingFanLow(ceilingFan));
    this.commandMap.put("CeilingFanOff", new CeilingFanLow(ceilingFan));
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

  public void storeCommand(int index) {
    this.commands.get(index).execute();
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("commands.txt", false))) {
      this.commands.get(index).store(writer);
    } catch (IOException e) {
      e.printStackTrace();
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