public class Hello {
    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World");
        } else {
            // Loop through all arguments
            for (String name : args) {
                System.out.println("Hello, " + name);
            }
        }
    }
}[]