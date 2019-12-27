package behavioral.iterator.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;

public class IteratorDemo1 {
  private static Logger logger = LoggerFactory.getLogger(IteratorDemo1.class);

  public static void main(String[] args) {
    BikeRepository repo = new BikeRepository();
    repo.addBike("Cervelo");
    repo.addBike("Scott");
    repo.addBike("Fuji");

    Iterator<String> bikeIterator = repo.iterator();
    while (bikeIterator.hasNext()) {
      String next = bikeIterator.next();
      logger.info("{}", next);
    }
  }
}
