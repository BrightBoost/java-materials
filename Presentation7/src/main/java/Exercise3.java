import java.io.File;
import java.io.IOException;

public class Exercise3 {
    public static void main(String[] args) {
        // Create a new folder "example"
        File exampleFolder = new File("example");
        exampleFolder.mkdir();

        // Add a file "log.txt" to the "example" folder
        File logFile = new File("example/log.txt");
        try {
            logFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Add a folder "messages" to the "example" folder
        File messagesFolder = new File("example/messages");
        messagesFolder.mkdir();

        // Create a txt file for messages in the "messages" folder
        File messagesFile = new File("example/messages/messages.txt");
        try {
            messagesFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the pathname of the messages.txt to the console
        System.out.println("Pathname of messages.txt: " + messagesFile.getAbsolutePath());

        // Verify both files exist
        System.out.println("log.txt exists: " + logFile.exists());
        System.out.println("messages.txt exists: " + messagesFile.exists());

        // Verify whether example/nothere.txt exists
        File nonExistentFile = new File("example/nothere.txt");
        System.out.println("example/nothere.txt exists: " + nonExistentFile.exists());
    }
}
