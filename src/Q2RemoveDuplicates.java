/**
 * Exercise 2. Prompt the user to input 10 integer values and store them
 * into an array. If there are any duplicate values in that array,
 * remove them and print out the remaining values.
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * *     PSEUDOCODE    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 *   Start
 *   // INPUT
 *   instantiate scanner object
 *   declare array (entered_array[]) to store ten integers that user will enter
 *   declare temporary array (temp_array) with the same array length
 *   declare integer variable to hold length of final array
 *   	FOR LOOP
 *  		prompt user to enter ten integers
 *   		scan and assign each input to entered_array
 *   	END FOR LOOP
 *
 *   // PROCESS
 *
 *   	FOR LOOP
 *   		copy the original entered_array[] to temp_array[]
 *   	END FOR LOOP
 *
 *   	FOR LOOP1
 *   		FOR LOOP2
 *   			IF (two array members have the same value)
 *   				swap this member with last index member
 *   				decrement by one array length
 *   				decrement by one the current index
 *   			END IF
 *   		END FOR LOOP2
 *   	END FOR LOOP1
 *   declare and initialize no_duplicate_array with finally caluclated temp_array
 *   close scanner object
 *
 *   // OUTPUT
 *
 *   print entered_array[]
 *   print no-duplicate_array[]
 *   end
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * *     TEST DATA - 1   * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 * Enter ten numbers.
 * Enter ( 1/10): 11
 * Enter ( 2/10): 12
 * Enter ( 3/10): 13
 * Enter ( 4/10): 14
 * Enter ( 5/10): 15
 * Enter ( 6/10): 14
 * Enter ( 7/10): 13
 * Enter ( 8/10): 12
 * Enter ( 9/10): 11
 * Enter (10/10): 10
 *      Entered Array: [11, 12, 13, 14, 15, 14, 13, 12, 11, 10]
 * No-Duplicate Array: [11, 12, 13, 14, 15, 10]
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ** * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * *   TEST DATA - 2  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ** * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 * Enter ten numbers.
 * Enter ( 1/10): 5
 * Enter ( 2/10): 5
 * Enter ( 3/10): 5
 * Enter ( 4/10): 5
 * Enter ( 5/10): 5
 * Enter ( 6/10): 5
 * Enter ( 7/10): 5
 * Enter ( 8/10): 5
 * Enter ( 9/10): 5
 * Enter (10/10): 5
 *      Entered Array: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
 * No-Duplicate Array: [5]
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q2RemoveDuplicates {
    public static void main(String[] args) {

        // INPUT

        // instantiate scanner object
        Scanner keyboard = new Scanner(System.in);

        // to store data entered from the user
        int [] entered_array = new int[10];
        int n = entered_array.length;
        int k = n;
        int [] temp_array = new int[n];

        // prompt user to insert data
        System.out.println("Enter ten numbers.");

        // receive from user
        for(int i = 0; i < n; i++){
            System.out.printf("Enter (%2d/%d): ", (i+1), n);
            int input = keyboard.nextInt();
            // assign entered valuse to array members
            entered_array[i] = input;
        }

        // PROCESS

        // copy entered array into temp_array
        for(int i = 0; i < n; i++){
            temp_array[i] = entered_array[i];
        }

        //remove duplicates
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {

                // if two members have equal value, swap them with the last index value member
                // and decrement by one the array length
                if (temp_array[i] == temp_array[j]) {

                    // swap with last index value
                    temp_array[j] = temp_array[k - 1];
                    // reduce array length
                    k--;
                    // reduce the second for loop index to again check the swapped
                    // member which was in the last index
                    j--;
                }
            }
        }

        // copy the unique elements only.
        int[] no_duplicate_array = Arrays.copyOf(temp_array, k);

        keyboard.close();   // close scanner object

        // OUTPUT
        System.out.print("     Entered Array: ");
        System.out.println(Arrays.toString(entered_array));

        System.out.print("No-Duplicate Array: ");
        System.out.println(Arrays.toString(no_duplicate_array));

    }
}
