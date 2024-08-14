package CeilingFan;
import java.io.BufferedWriter;
import java.io.IOException;

import IComand.ICommand;

public class CeilingFanLow implements ICommand {
  private CeilingFan ceilingFan;

  public CeilingFanLow(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    this.ceilingFan.low();
    System.out.println(this.ceilingFan.getSpeed());
  }

  @Override
  public void store(BufferedWriter writer) throws IOException {
    writer.write("CeilingFanLow\n");
  }
}