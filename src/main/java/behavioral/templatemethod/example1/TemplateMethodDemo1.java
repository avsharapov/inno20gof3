package behavioral.templatemethod.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateMethodDemo1 {
  private static Logger logger = LoggerFactory.getLogger(TemplateMethodDemo1.class);

  public static void main(String[] args) {
    logger.info("========Web Order=========");
    OrderTemplate webOrder = new WebOrder();
    webOrder.processOrder();
    logger.info("========Store Order=========");
    OrderTemplate storeOrder = new StoreOrder();
    storeOrder.processOrder();
    logger.info("========Web Order=========");
    OrderTemplate webOrderGift = new WebOrder();
    webOrderGift.isGift = true;
    webOrderGift.processOrder();
  }
}
