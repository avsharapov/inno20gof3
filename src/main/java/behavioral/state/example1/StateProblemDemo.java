package behavioral.state.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StateProblemDemo {
  private static Logger logger = LoggerFactory.getLogger(StateProblemDemo.class);

  public static void main(String[] args) {
    ProblemFan fan = new ProblemFan();
    logger.info("{}", fan);
    fan.pullChain();
    logger.info("{}", fan);
    fan.pullChain();
    logger.info("{}", fan);
    fan.pullChain();
    logger.info("{}", fan);
  }

}

class ProblemFan {
  private static Logger logger = LoggerFactory.getLogger(ProblemFan.class);

  static final int OFF = 0;
  static final int LOW = 1;
  static final int MED = 2;

  int state = OFF;

  public ProblemFan() {
    // empty constructor
  }

  // many if else statements - it's a problem
  public void pullChain() {
    if (state == OFF) {
      logger.info("Turning fan on to low.");
      state = LOW;
    } else if (state == LOW) {
      logger.info("Turning fan med.");
      state = MED;
    } else if (state == MED) {
      logger.info("Turning fan off.");
      state = OFF;
    }
  }

  public String toString() {
    if (state == OFF) {
      return "Fan is off";
    } else if (state == LOW) {
      return "Fan is on low";
    } else if (state == MED) {
      return "Fan is on med";
    }
    return "Invalida state.";
  }
}