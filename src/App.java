public class App {
  public static void main(String[] args) throws Exception {
      ConfigSingleton cfg = ConfigSingleton.getInstance();

      cfg.getAllConfig();
      System.out.println(cfg.getConfigValue("AppId"));
    }
}
