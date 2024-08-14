package Tv;

import java.io.BufferedWriter;
import java.io.IOException;

import IComand.ICommand;

public class TvOff implements ICommand {
  private Tv tv;

  public TvOff(Tv tv) {
      this.tv = tv;
  }

  @Override
  public void execute() {
      tv.off();
  }

  @Override
  public void store(BufferedWriter writer) throws IOException {
    writer.write("TvOff\n");
  }
}