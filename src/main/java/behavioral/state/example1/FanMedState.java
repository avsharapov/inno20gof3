package behavioral.state.example1;

public class FanMedState extends State {
  private Fan fan;

  public FanMedState(Fan fan) {
    this.fan = fan;
  }

  @Override
  public void handleRequest() {
    logger.info("Turning fan on high.");
    fan.setState(new FanHighState(fan));
  }

  public String toString() {
    return "Fan is med";
  }
}
