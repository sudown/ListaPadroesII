import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoteControll {
  List<ICommand> commands = new ArrayList<>();
  Map<String, ICommand> commandMap = new HashMap<>();

  public void setCommand() {
    this.commandMap.put("CeilingFanHigh", new CeilingFanHigh());
  }

  public void setCommand(ICommand command) {
    commands.add(command);
  }

  public void buttonWasPressed(int key) {
    this.commands.get(key).execute();
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("comandos.txt", false))) {
      this.commands.get(key).store(writer);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}