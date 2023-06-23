import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class Exercise7 {
    public static void main(String[] args) {
        // UnaryOperator to add .docx suffix if not present
        UnaryOperator<String> addDocxSuffix = name -> {
            if (!name.endsWith(".docx")) {
                return name + ".docx";
            }
            return name;
        };

        // BinaryOperator to add or replace the suffix
        BinaryOperator<String> addOrReplaceSuffix = (name, suffix) -> {
            int dotIndex = name.lastIndexOf(".");
            if (dotIndex != -1) {
                return name.substring(0, dotIndex) + "." + suffix;
            } else {
                return name + "." + suffix;
            }
        };

        // Test the UnaryOperator
        String documentName1 = "document1";
        String documentName2 = "document2.docx";
        System.out.println("UnaryOperator Result:");
        System.out.println(addDocxSuffix.apply(documentName1)); // Output: document1.docx
        System.out.println(addDocxSuffix.apply(documentName2)); // Output: document2.docx

        // Test the BinaryOperator
        String fileName1 = "file1.txt";
        String fileName2 = "file2";
        String newSuffix = "pdf";
        System.out.println("BinaryOperator Result:");
        System.out.println(addOrReplaceSuffix.apply(fileName1, newSuffix)); // Output: file1.pdf
        System.out.println(addOrReplaceSuffix.apply(fileName2, newSuffix)); // Output: file2.pdf
    }
}
