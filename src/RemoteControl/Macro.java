package RemoteControl;
import java.io.BufferedWriter;
import java.io.IOException;

import IComand.ICommand;

public class Macro implements ICommand {
  private ICommand[] commands;

  public Macro(ICommand[] commands) {
    this.commands = commands;
  }

  @Override
  public void execute() {
    for (ICommand command : commands) {
      command.execute();
    }
  }

  @Override
  public void store(BufferedWriter writer) throws IOException {
    for (ICommand command : commands) {
      command.store(writer);
    }
  }
}
