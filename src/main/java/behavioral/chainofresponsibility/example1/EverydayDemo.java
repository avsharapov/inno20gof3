package behavioral.chainofresponsibility.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EverydayDemo {
  private static Logger logger = LoggerFactory.getLogger(EverydayDemo.class);

  public static void main(String[] args) {
    logger.trace("Trace level of logging");
    logger.debug("Debug level of logging");
    logger.info("Info level of logging");
  }
}
