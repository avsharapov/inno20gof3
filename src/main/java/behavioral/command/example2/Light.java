package behavioral.command.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// receiver
public class Light {
  private static Logger logger = LoggerFactory.getLogger(Light.class);
  private boolean isOn = false;

  public boolean isOn() {
    return isOn;
  }

  public void toggle() {
    if (isOn) {
      off();
      isOn = false;
    } else {
      on();
      isOn = true;
    }
  }

  private void on() {
    logger.info("Light switched On.");
  }

  private void off() {
    logger.info("Light switched Off.");
  }
}
