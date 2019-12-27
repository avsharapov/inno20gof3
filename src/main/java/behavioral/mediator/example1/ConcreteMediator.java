package behavioral.mediator.example1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
  private List<Light> lights = new ArrayList<>();

  public void registerLight(Light light) {
    lights.add(light);
  }

  @Override public void notify(Component sender, String event) {
    if (event.equals("on")) {
      for (Light light : lights) {
        if (!light.equals(sender)) {
          if (light.isOn()) {
            light.off();
          }
        }
      }
    }
  }
}
