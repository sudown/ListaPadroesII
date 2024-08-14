package CeilingFan;
import java.io.BufferedWriter;
import java.io.IOException;

import IComand.ICommand;

public class CeilingFanHigh implements ICommand {
  private CeilingFan ceilingFan;

  public CeilingFanHigh(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    this.ceilingFan.high();
    System.out.println(this.ceilingFan.getSpeed());
  }

  @Override
  public void store(BufferedWriter writer) throws IOException {
    writer.write("CeilingFanHigh\n");
  }
}
