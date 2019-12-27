package behavioral.mediator.example1;

public class MediatorDemo1 {
  public static void main(String[] args) {
    ConcreteMediator concreteMediator = new ConcreteMediator();

    Light lamp1 = new Light(concreteMediator, 1);
    Light lamp2 = new Light(concreteMediator, 2);

    lamp1.on();
    lamp2.on();
  }
}
