import java.io.BufferedWriter;
import java.io.IOException;

public class MacroCommand implements ICommand {
    private ICommand[] commands;

    public MacroCommand(ICommand[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (ICommand command : this.commands) {
            command.execute();
        }
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        for (ICommand command : this.commands) {
            command.store(writer);
        }
    }
  
}