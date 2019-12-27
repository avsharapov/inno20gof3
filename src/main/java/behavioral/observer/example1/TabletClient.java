package behavioral.observer.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TabletClient extends Observer {
  private static Logger logger = LoggerFactory.getLogger(TabletClient.class);

  public TabletClient(Subject subject) {
    this.subject = subject;
    subject.attach(this);
  }

  public void addMessage(String message) {
    subject.setState(message + " - sent from tablet");
  }

  @Override
  void update() {
    logger.info("Tablet Stream: {}", subject.getState());
  }
}
