package behavioral.mediator.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

// receiver
public class Light extends Component {
  private static Logger logger = LoggerFactory.getLogger(Light.class);
  private boolean isOn = false;
  private int id;

  public Light(ConcreteMediator mediator, int id) {
    super(mediator);
    mediator.registerLight(this);
    this.id = id;
  }


  public boolean isOn() {
    return isOn;
  }

  public void on() {
    logger.info("Light in {} switched On.", id);
    isOn = true;
    mediator.notify(this, "on");
  }

  public void off() {
    logger.info("Light in {} switched Off.", id);
    isOn = false;
    mediator.notify(this, "off");
  }

}
