package behavioral.state.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class State {
  protected static Logger logger = LoggerFactory.getLogger(State.class);

  public void handleRequest() {
    logger.info("Shouldn't be able to get here");
  }

}
