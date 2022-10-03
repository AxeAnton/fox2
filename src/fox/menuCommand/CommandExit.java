package fox.menuCommand;

import fox.MenuCommand;

public class CommandExit implements MenuCommand {
    @Override
    public void ExecuteMenu() {
        System.exit(0);
    }
}