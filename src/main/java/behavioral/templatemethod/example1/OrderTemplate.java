package behavioral.templatemethod.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class OrderTemplate {
  protected static Logger logger = LoggerFactory.getLogger(OrderTemplate.class);

  public boolean isGift;

  public abstract void doCheckout();

  public abstract void doPayment();

  public abstract void doReceipt();

  public abstract void doDelivery();

  public void wrapGift() {
    logger.info("Gift wrapped.");
  }

  public final void processOrder() {
    doCheckout();
    doPayment();
    if (isGift) {
      wrapGift();
    } else {
      doReceipt();
    }
    doDelivery();
  }
}
