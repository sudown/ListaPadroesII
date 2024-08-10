public class BuyProductFacade {
  public void buyProduct(Produto product) {
    if (ServicoEstoque.isAvailable(product)) {
      System.out.println("Produto disponivel");
      if (ServicoPagamento.makePayment()) {
        System.out.println("Pagamento efetuado");
        ServicoRemessa.shipProduct(product);
      } else {
        System.out.println("Pagamento não efetuado");
      }
    } else {
      System.out.println("Produto não disponível");
    }
  }
}
