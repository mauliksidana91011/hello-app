// public class array{
//     public static void main(String[] args) {

//         // Create a string array with 5 elements
//         String[] fruits = {"Apple", "Banana", "Mango", "Orange", "Grapes"};

//         // Print the elements
//         for (int i = 0; i < fruits.length; i++) {
//             System.out.println(fruits[i]);
//         }
//     }
// }

public class Main {
    public static void main(String[] args) {

        // Create an array with 5 elements
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        // Print array elements and calculate sum
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum = sum + numbers[i];
        }

        // Print the sum
        System.out.println("Sum of elements = " + sum);
    }
}




