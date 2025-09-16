package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Problems {

    /**
     * Reverses the given ArrayList of integers.
     *
     * @param list the ArrayList to be reversed
     */
    static void reverseList(ArrayList<Integer> list) {
        // Initialize two pointers, one at the start and one at the end of the list
        int i = 0, j = list.size() - 1;

        // Continue the loop until the two pointers meet
        while (i < j) {
            // Swap the elements at the current positions of the two pointers
            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);

            // Move the pointers towards the center of the list
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList of integers and add some elements to it
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the original list
        System.out.println("Original List: " + list);

        // Reverse the list using the custom reverseList method
        reverseList(list);
        System.out.println("Reversed List: " + list);

        // Reverse the list again using the Collections.reverse method
        Collections.reverse(list);
        System.out.println("List after using Collections.reverse(): " + list);

        // Sort the list using the Collections.sort method
        Collections.sort(list);
        System.out.println("List after sorting: " + list);

        // Create an ArrayList of strings and add some elements to it
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hey");
        list1.add("my");
        list1.add("name");
        list1.add("is");
        list1.add("Abhinav Tiwary");

        // Print the original list of strings
        System.out.println("Original List of Strings: " + list1);

        // Sort the list of strings using the Collections.sort method
        Collections.sort(list1);
        System.out.println("List of Strings after sorting: " + list1);
    }
}