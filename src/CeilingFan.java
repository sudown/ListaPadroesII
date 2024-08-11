public class CeilingFan {
  private String speed;

  public void high(){
    this.speed = "high";
  }

  public void medium(){
    this.speed = "medium";
  }

  public void low(){
    this.speed = "low";
  }

  public void off(){
    this.speed = "off";
  }

  public String getSpeed(){
    return this.speed;
  }
}
