package behavioral.command.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandEverydayDemo {
  public static void main(String[] args) {
    Task task1 = new Task(10, 12); // encapsulates request
    Task task2 = new Task(11, 13);

    Thread thread1 = new Thread(task1);
    thread1.start(); // invoker

    Thread thread2 = new Thread(task2);
    thread2.start();
  }

}

class Task implements Runnable {
  private static Logger logger = LoggerFactory.getLogger(Task.class);
  private int num1;
  private int num2;

  public Task(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  @Override
  public void run() { // execute method
    logger.info("{}", num1 * num2); // receiver
  }
}

