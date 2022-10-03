package fox.menuCommand;

import fox.MenuCommand;

import java.io.*;

public class CommandDownloadGame implements MenuCommand {
    private File file = new File("fox.bin");

    public CommandDownloadGame() {
    }

    @Override
    public void ExecuteMenu() {
        System.out.println("Загрузить игру");
    }

    public <T> boolean writeToFile(T object) {
        boolean result = false;
        try (FileOutputStream fileOutput = new FileOutputStream(file);
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
            objectOutput.writeObject(object);
            result = true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public <T> T readFromFile() {
        Object result = null;
        try (FileInputStream fileInput = new FileInputStream(file);
             ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {
            result = objectInput.readObject();
            System.out.println(result);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return (T) result;
    }
}