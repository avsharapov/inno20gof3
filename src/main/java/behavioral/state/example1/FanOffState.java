package behavioral.state.example1;

public class FanOffState extends State {

  private Fan fan;

  public FanOffState(Fan fan) {
    this.fan = fan;
  }

  @Override
  public void handleRequest() {
    logger.info("Turning fan on low.");
    fan.setState(new FanLowState(fan));
  }

  public String toString() {
    return "Fan is off";
  }
}
