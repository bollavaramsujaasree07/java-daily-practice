public class UserInput {
    public static void main(String[] args) {
        // Example of reading user input in Java
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("");
        int num = scanner.nextInt();
        
        System.out.println(num);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
        // Note: Always close the scanner when done to free up resources.
        // This is especially important in larger applications or when using multiple scanners. 

    }
}
