public class TudoMinusculo extends ProcessadorTexto {

  @Override
  protected char[] converterCaracteres(char[] chars) {
    for (int i = 0; i < chars.length; i++) {
      chars[i] = Character.toLowerCase(chars[i]);
    }
    return chars;
  }
  
}
