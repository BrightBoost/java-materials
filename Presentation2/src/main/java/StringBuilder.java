public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();

        // Create the string "hithere" using a loop
        for (int i = 0; i < 2; i++) {
            sb.append("hi");
        }
        sb.append("there");

        System.out.println("Original string: " + sb.toString());

        // Convert the string to uppercase
        sb = new java.lang.StringBuilder(sb.toString().toUpperCase());

        // Add a space between "hi" and "there"
        sb.insert(2, " ");

        // Reverse the string
        sb.reverse();

        System.out.println("Modified string: " + sb.toString());
    }
}
