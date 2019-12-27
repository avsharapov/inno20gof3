package behavioral.state.example1;

public class Fan {
  private State state;

  public Fan() {
    state = new FanOffState(this);
  }

  public void pullChain() {
    state.handleRequest();
  }

  public String toString() {
    return state.toString();
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

}
