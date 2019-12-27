package behavioral.command.example2;

import java.util.ArrayList;
import java.util.List;

// invoker
public class Switch {
  private List<Command> commandList = new ArrayList<>();

  public void storeCommand(Command command) {
    commandList.add(command);
  }

  public void executeCommand() {
    for (Command command : commandList) {
      command.execute();
    }
  }
}
