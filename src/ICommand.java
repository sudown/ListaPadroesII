import java.io.BufferedWriter;
import java.io.IOException;

public interface ICommand {
    public void execute();
    public void store(BufferedWriter writer) throws IOException;
}