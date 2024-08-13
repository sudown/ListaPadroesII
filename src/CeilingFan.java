public class CeilingFan {
  private String speed;

  public void high(){
    System.out.print("ceiling fan: ");
    this.speed = "high";
  }

  public void medium(){
    System.out.print("ceiling fan: ");
    this.speed = "medium";
  }

  public void low(){
    System.out.print("ceiling fan: ");
    this.speed = "low";
  }

  public void off(){
    System.out.print("ceiling fan: ");
    this.speed = "off";
  }

  public String getSpeed(){
    return this.speed;
  }
}
