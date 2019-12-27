package behavioral.templatemethod.example1;

public class StoreOrder extends OrderTemplate {
  @Override
  public void doCheckout() {
    logger.info("Ring up items from cart.");
  }

  @Override
  public void doPayment() {
    logger.info("Process payment with Card present");
  }

  @Override
  public void doReceipt() {
    logger.info("Print receipt");
  }

  @Override
  public void doDelivery() {
    logger.info("Bag items at counter");
  }
}
