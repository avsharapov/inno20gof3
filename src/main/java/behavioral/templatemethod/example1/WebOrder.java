package behavioral.templatemethod.example1;

public class WebOrder extends OrderTemplate {
  @Override
  public void doCheckout() {
    logger.info("Get items from cart,");
    logger.info("Set gifts preferences,");
    logger.info("Set delivery address,");
    logger.info("Set billing address.");
  }

  @Override
  public void doPayment() {
    logger.info("Process payment without Card present");
  }

  @Override
  public void doReceipt() {
    logger.info("Email receipt");
  }

  @Override
  public void doDelivery() {
    logger.info("Ship the item to address");
  }
}
