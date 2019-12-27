package behavioral.chainofresponsibility.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CEO extends Handler {
  private static Logger logger = LoggerFactory.getLogger(CEO.class);

  @Override
  void handleRequest(Request request) {
    logger.info("CEOs can approve anything they want");
  }
}
