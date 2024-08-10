import java.util.Random;

public class ServicoEstoque {
  public static boolean isAvailable(Produto product){
    Random random = new Random();
    double chance = random.nextDouble();
    return chance < 0.8;
    }
}
