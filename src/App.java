public class App {
    public static void main(String[] args) throws Exception {
      BuyProductFacade facade = new BuyProductFacade();
      Produto mouse = new Produto(1, "Logitec G403 Hero");
      facade.buyProduct(mouse);
    }
}
