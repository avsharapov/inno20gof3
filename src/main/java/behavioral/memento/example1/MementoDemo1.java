package behavioral.memento.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MementoDemo1 {
  private static Logger logger = LoggerFactory.getLogger(MementoDemo1.class);

  public static void main(String[] args) {
    Caretaker caretaker = new Caretaker();
    Employee emp = new Employee();

    emp.setName("John Wick");
    emp.setAddress("111 Main Street");
    emp.setPhone("888-555-1212");

    logger.info("Employee before save: {}", emp);

    caretaker.save(emp);

    emp.setPhone("444-555-6666");
    caretaker.save(emp);

    logger.info("Employee after changed phone number save: {}", emp);

    emp.setPhone("333-999-6666"); // <-- we haven't called save
    caretaker.revert(emp);
    logger.info("Reverts to last save point: {}", emp);

    caretaker.revert(emp);
    logger.info("Reverts to original: {}", emp);
  }
}
