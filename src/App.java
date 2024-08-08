public class App {
  public static void main(String[] args) throws Exception {
    String entrada = "Hello, World!";
    ProcessadorTexto ToUpperCase = new TudoMaiusculo();
    ProcessadorTexto ToLowerCase = new TudoMinusculo();

    String entradaUpper = ToUpperCase.processarTexto(entrada);
    String entradaLower = ToLowerCase.processarTexto(entrada);

    System.out.println("texto original: '" + entrada + "'");
    System.out.println("texto maiusculo: '" + entradaUpper + "'");
    System.out.println("texto minusculo: '" + entradaLower + "'");
  }
}
