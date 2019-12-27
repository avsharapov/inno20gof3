package behavioral.chainofresponsibility.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Director extends Handler {
  private static Logger logger = LoggerFactory.getLogger(Director.class);

  @Override
  void handleRequest(Request request) {
    if (request.getRequestType() == RequestType.CONFERENCE) {
      logger.info("Dirrectors can approve conferences");
    } else {
      successor.handleRequest(request);
    }
  }

}
