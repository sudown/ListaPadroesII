package Light;

import java.io.BufferedWriter;
import java.io.IOException;

import IComand.ICommand;

public class LightOn implements ICommand {
  private Light light;

  public LightOn(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    this.light.on();
  }

  @Override
  public void store(BufferedWriter writer) throws IOException {
    writer.write("LightOn\n");
  }
  
}
