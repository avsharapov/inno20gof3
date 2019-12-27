package behavioral.state.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StateDemo1 {
  private static Logger logger = LoggerFactory.getLogger(StateDemo1.class);

  public static void main(String[] args) {
    Fan fan = new Fan();
    logger.info("{}", fan);
    fan.pullChain();
    logger.info("{}", fan);
    fan.pullChain();
    logger.info("{}", fan);
    fan.pullChain();
    logger.info("{}", fan);
    fan.pullChain();
    logger.info("{}", fan);
  }
}
