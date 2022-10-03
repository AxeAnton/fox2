package fox.menuCommand;

import fox.Execute;
import fox.MenuCommand;

public class CommandStartGame implements MenuCommand {
    @Override
    public void ExecuteMenu() {
        new Execute("Старт").start();
    }
}
