package behavioral.state.example1;

public class FanHighState extends State {
  private Fan fan;

  public FanHighState(Fan fan) {
    this.fan = fan;
  }

  @Override
  public void handleRequest() {
    logger.info("Turning fan on off.");
    fan.setState(new FanOffState(fan));
  }

  public String toString() {
    return "Fan is high";
  }
}
