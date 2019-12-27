package behavioral.strategy.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StrategyDemo1 {
  private static Logger logger = LoggerFactory.getLogger(StrategyDemo1.class);

  public static void main(String[] args) {
    CreditCard amexCard = new CreditCard(new AmexStrategy());

    amexCard.setNumber("379185883464283");
    amexCard.setDate("03/2020");
    amexCard.setCvv("123");

    logger.info("Is Amex valid: {}", amexCard.isValid());

    CreditCard amexCard2 = new CreditCard(new AmexStrategy());

    amexCard2.setNumber("379185883464282");
    amexCard2.setDate("04/2021");
    amexCard2.setCvv("423");

    logger.info("Is Amex valid: {}", amexCard2.isValid());

    CreditCard visaCard = new CreditCard(new VisaStrategy());

    visaCard.setNumber("4539589763663402");
    visaCard.setDate("05/2021");
    visaCard.setCvv("263");

    logger.info("Is Visa valid: {}", visaCard.isValid());
  }
}
