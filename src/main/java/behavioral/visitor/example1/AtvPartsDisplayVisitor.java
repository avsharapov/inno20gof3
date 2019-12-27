package behavioral.visitor.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {
  private static Logger logger = LoggerFactory.getLogger(AtvPartsDisplayVisitor.class);

  @Override
  public void visit(Fender fender) {
    logger.info("We have a fender.");
  }

  @Override
  public void visit(Oil oil) {
    logger.info("We have oil.");
  }

  @Override
  public void visit(Wheel wheel) {
    logger.info("We have a wheel.");
  }

  @Override
  public void visit(PartsOrder partsOrder) {
    logger.info("We have an order.");
  }
}
