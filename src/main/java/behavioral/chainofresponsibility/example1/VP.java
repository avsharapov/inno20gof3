package behavioral.chainofresponsibility.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VP extends Handler {
  private static Logger logger = LoggerFactory.getLogger(VP.class);

  @Override
  void handleRequest(Request request) {
    if (request.getRequestType() == RequestType.PURCHASE) {
      if (request.getAmount() < 1500) {
        logger.info("VPs can approve purchases below 1500");
      } else {
        successor.handleRequest(request);
      }
    }
  }

}
