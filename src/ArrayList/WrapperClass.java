// Package declaration
package ArrayList;

// Import the ArrayList class from the java.util package
import java.util.ArrayList;

/**
 * Demonstrates the use of wrapper classes and ArrayList in Java.
 */
public class WrapperClass {
    /**
     * Main method to test the functionality of wrapper classes and ArrayList.
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Using wrapper classes to create objects of primitive types
        Integer i = Integer.valueOf(4); // Create an Integer object with value 4
        Float f = Float.valueOf(4.3f);  // Create a Float object with value 4.3f

        // Print the values of the wrapper class objects
        System.out.println("Integer value: " + i);
        System.out.println("Float value: " + f);

        // Create an ArrayList to store Integer objects
        ArrayList<Integer> l1 = new ArrayList<>();

        // Add elements to the ArrayList
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // Access and print an element at a specific index
        System.out.println("Element at index 2: " + l1.get(2));

        // Iterate through the ArrayList and print its elements
        System.out.println("ArrayList elements:");
        for (int j = 0; j < l1.size(); j++) {
            System.out.println(l1.get(j));
        }

        // Insert an element at a specific index
        l1.add(1, 100);

        // Update an element at a specific index
        l1.set(1, 10);

        // Remove elements from the ArrayList
        l1.remove(1); // Remove the element at index 1
        l1.remove(Integer.valueOf(7)); // Remove the first occurrence of 7

        // Check if the ArrayList contains a specific element
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println("Does ArrayList contain 6? " + ans);

        // Print the final state of the ArrayList
        System.out.println("Final ArrayList: " + l1);
    }
}