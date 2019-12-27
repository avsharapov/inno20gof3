package behavioral.state.example1;

public class FanLowState extends State {
  private Fan fan;

  public FanLowState(Fan fan) {
    this.fan = fan;
  }

  @Override
  public void handleRequest() {
    logger.info("Turning fan on med.");
    fan.setState(new FanMedState(fan));
  }

  public String toString() {
    return "Fan is low";
  }
}
