package Tv;

import java.io.BufferedWriter;
import java.io.IOException;

import IComand.ICommand;

public class TvOn implements ICommand {
  private Tv tv;

  public TvOn(Tv tv) {
      this.tv = tv;
  }

  @Override
  public void execute() {
      tv.on();
  }

  @Override
  public void store(BufferedWriter writer) throws IOException {
    writer.write("TvOn\n");
  }
}