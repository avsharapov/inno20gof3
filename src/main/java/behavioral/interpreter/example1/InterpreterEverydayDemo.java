package behavioral.interpreter.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterEverydayDemo {
  private static Logger logger = LoggerFactory.getLogger(InterpreterEverydayDemo.class);

  public static void main(String[] args) {
    String input = "lions, and tigers, and bears! Oh, my!";

    Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger)");
    Matcher m = p.matcher(input);

    while (m.find()) {
      String group = m.group();
      logger.info("Found a {}.", group);
    }
  }

}
