import java.util.Random;

public class ServicoPagamento {
  public static boolean makePayment() {
    Random random = new Random();
    double chance = random.nextDouble();
    return chance < 0.8;
  }
}
