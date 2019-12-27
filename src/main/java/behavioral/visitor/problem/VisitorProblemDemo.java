package behavioral.visitor.problem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VisitorProblemDemo {
  private static Logger logger = LoggerFactory.getLogger(VisitorProblemDemo.class);

  public static void main(String[] args) {
    PartsOrder order = new PartsOrder();
    order.addPart(new Wheel());
    order.addPart(new Fender());
    order.addPart(new Oil());

    double shippingCost = order.calculateShipping();
    logger.info("{}", shippingCost);
  }
}
