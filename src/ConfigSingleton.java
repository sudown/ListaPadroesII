import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ConfigSingleton {
  private static ConfigSingleton instance;
  private static Map<String, String> configData;

  private ConfigSingleton() {
    configData = new HashMap();
    loadConfigFile();
  }

  public static ConfigSingleton getInstance() {
    if(instance == null) {
      instance = new ConfigSingleton();
    }
    return instance;
  }

  private void loadConfigFile() {
    String configFilePath = "src/config.cfg";
    try (BufferedReader reader = new BufferedReader(new FileReader(configFilePath))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] entry = line.split("=", 2);
        if (entry.length == 2) {
          configData.put(entry[0], entry[1]);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String getConfigValue(String value){
    return configData.get(value);
  }

  public void getAllConfig(){
    for (String key : configData.keySet()) {
      System.out.println(key + '=' + configData.get(key));
    }
  }

}
