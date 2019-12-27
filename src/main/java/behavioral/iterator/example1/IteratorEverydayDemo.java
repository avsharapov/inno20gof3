package behavioral.iterator.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEverydayDemo {
  private static Logger logger = LoggerFactory.getLogger(IteratorEverydayDemo.class);

  public static void main(String[] args) {

    List<String> names = new ArrayList<>();
    names.add("Tom");
    names.add("John");
    names.add("Max");

    Iterator<String> iterator = names.iterator();

    while (iterator.hasNext()) {
      String name = iterator.next();
      logger.info("{}", name);
      iterator.remove();
    }

    logger.info("Names size: {}", names.size());
  }
}
