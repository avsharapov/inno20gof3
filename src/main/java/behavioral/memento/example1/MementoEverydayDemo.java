package behavioral.memento.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MementoEverydayDemo {
  private static Logger logger = LoggerFactory.getLogger(MementoEverydayDemo.class);

  public static void main(String[] args) {
    EverydayEmployee emp = new EverydayEmployee();
    emp.setName("Bryan Hansen");
    emp.setAddress("111 E Code Street");
    emp.setPhone("123-123-1231");

    serializable(emp);

    EverydayEmployee newEmp = deserialize();
    if (newEmp != null) {
      logger.info("{}", newEmp.getName());
    }
  }

  private static void serializable(EverydayEmployee emp) {
    try (FileOutputStream fileOut = new FileOutputStream("./employee.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
      out.writeObject(emp);
    } catch (IOException e) {
      logger.error("ОЙ!", e);
    }
  }

  private static EverydayEmployee deserialize() {
    EverydayEmployee emp = null;
    try (FileInputStream fileIn = new FileInputStream("./employee.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn)) {
      emp = (EverydayEmployee) in.readObject();
    } catch (ClassNotFoundException | IOException e) {
      logger.error("ОЙ!", e);
    }
    return emp;
  }
}
