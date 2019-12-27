package behavioral.visitor.example1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {
  private static Logger logger = LoggerFactory.getLogger(AtvPartsShippingVisitor.class);
  double shippingAmount = 0;

  @Override
  public void visit(Fender fender) {
    shippingAmount += 3;
    logger.info("Fender are light and cheap to ship.");
  }

  @Override
  public void visit(Oil oil) {
    shippingAmount += 9;
    logger.info("Oil is hazardous and has fee to ship.");
  }

  @Override
  public void visit(Wheel wheel) {
    shippingAmount += 15;
    logger.info("Wheels are bulky and expensive to ship.");
  }

  @Override
  public void visit(PartsOrder partsOrder) {
    logger.info("If they bought more than 3 things we will give them a discount on shipping.");
    List<AtvPart> parts = partsOrder.getParts();
    if (parts.size() > 3) {
      shippingAmount -= 5;
    }
    logger.info("Shipping amount is: {}", shippingAmount);
  }
}
