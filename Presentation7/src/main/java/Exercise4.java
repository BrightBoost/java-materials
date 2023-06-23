import java.io.*;

public class Exercise4 {
    public static void main(String[] args) {
        // Add some text to messages.txt
        addTextToFile("example/messages/messages.txt", "Hello, World!");

        // Read messages.txt and write the content to log.txt using byte and character streams
        copyFileUsingByteStream("example/messages/messages.txt", "example/log.txt");
        copyFileUsingCharacterStream("example/messages/messages.txt", "example/log.txt");

        // Bonus: Reverse the content of log.txt
        reverseFileContent("example/log.txt");
    }

    private static void addTextToFile(String filePath, String text) {
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyFileUsingByteStream(String sourcePath, String destinationPath) {
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destinationPath)) {

            int byteValue;
            while ((byteValue = fis.read()) != -1) {
                fos.write(byteValue);
            }

            System.out.println("File copied using byte stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyFileUsingCharacterStream(String sourcePath, String destinationPath) {
        try (FileReader fileReader = new FileReader(sourcePath);
             FileWriter fileWriter = new FileWriter(destinationPath)) {

            int charValue;
            while ((charValue = fileReader.read()) != -1) {
                fileWriter.write(charValue);
            }

            System.out.println("File copied using character stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void reverseFileContent(String filePath) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw")) {
            long fileLength = randomAccessFile.length();
            if (fileLength <= 1) {
                return;
            }

            long leftIndex = 0;
            long rightIndex = fileLength - 1;
            byte leftByte, rightByte;

            while (leftIndex < rightIndex) {
                randomAccessFile.seek(leftIndex);
                leftByte = randomAccessFile.readByte();

                randomAccessFile.seek(rightIndex);
                rightByte = randomAccessFile.readByte();

                randomAccessFile.seek(leftIndex);
                randomAccessFile.writeByte(rightByte);

                randomAccessFile.seek(rightIndex);
                randomAccessFile.writeByte(leftByte);

                leftIndex++;
                rightIndex--;
            }

            System.out.println("File content reversed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
