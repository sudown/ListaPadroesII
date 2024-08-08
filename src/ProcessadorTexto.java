public abstract class ProcessadorTexto {

  public String processarTexto(String entrada) {
      char[] caracteres = extrairCaracteres(entrada);
      char[] caracteresConvertidos = converterCaracteres(caracteres);
      String resultado = juntarCaracteresConvertidos(caracteresConvertidos);
      return resultado;
  }

  protected char[] extrairCaracteres(String texto) {
      return texto.toCharArray();
  }

  protected abstract char[] converterCaracteres(char[] chars);

  protected String juntarCaracteresConvertidos(char[] chars) {
      return new String(chars);
  }
}
