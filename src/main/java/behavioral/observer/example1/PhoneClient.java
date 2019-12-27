package behavioral.observer.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PhoneClient extends Observer {
  private static Logger logger = LoggerFactory.getLogger(PhoneClient.class);

  public PhoneClient(Subject subject) {
    this.subject = subject;
    subject.attach(this);
  }

  public void addMessage(String message) {
    subject.setState(message + " - sent from phone");
  }

  @Override
  void update() {
    logger.info("Phone Stream: {}", subject.getState());
  }
}
