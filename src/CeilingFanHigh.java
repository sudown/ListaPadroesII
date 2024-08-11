import java.io.BufferedWriter;
import java.io.IOException;

public class CeilingFanHigh implements ICommand {
  private CeilingFan ceilingFan;

  @Override
  public void execute() {
    this.ceilingFan.high();
  }

  @Override
  public void store(BufferedWriter writer) throws IOException {
    writer.write("CeilingFanHigh\n");
  }
}
