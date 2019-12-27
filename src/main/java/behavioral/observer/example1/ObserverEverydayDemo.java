package behavioral.observer.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ObserverEverydayDemo {
  public static void main(String[] args) {
    TwitterStream observable = new TwitterStream();

    Client observer1 = new Client("Bryan");
    Client observer2 = new Client("Mark");

    observable.addPropertyChangeListener(observer1);
    observable.addPropertyChangeListener(observer2);

    observable.someoneTweeted("Hello!");
  }
}

// concrete subject
class TwitterStream {
  private PropertyChangeSupport support;
  private String tweet;

  public TwitterStream() {
    this.support = new PropertyChangeSupport(this);
  }

  public void addPropertyChangeListener(PropertyChangeListener pcl) {
    support.addPropertyChangeListener(pcl);
  }

  public void removePropertyChangeListener(PropertyChangeListener pcl) {
    support.removePropertyChangeListener(pcl);
  }

  public void someoneTweeted(String value) {
    support.firePropertyChange("tweet", this.tweet, value);
    this.tweet = value;
  }
}

class Client implements PropertyChangeListener {
  private static Logger logger = LoggerFactory.getLogger(Client.class);

  private String name;

  Client(String name) {
    this.name = name;
  }


  @Override public void propertyChange(PropertyChangeEvent evt) {
    logger.info("Update {}'s stream, someone tweeted something.", name);
    logger.info("Old value = {}; new value = {}", evt.getOldValue(), evt.getNewValue());
  }
}