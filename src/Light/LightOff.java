package Light;

import java.io.BufferedWriter;
import java.io.IOException;

import IComand.ICommand;

public class LightOff implements ICommand {
  private Light light;

  public LightOff(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    this.light.off();
  }

  @Override
  public void store(BufferedWriter writer) throws IOException {
    writer.write("LightOff\n");
  }
}
