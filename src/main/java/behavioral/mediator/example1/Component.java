package behavioral.mediator.example1;

public abstract class Component {
  protected Mediator mediator;

  public Component(Mediator mediator) {
    this.mediator = mediator;
  }

}
