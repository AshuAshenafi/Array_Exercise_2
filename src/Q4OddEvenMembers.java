/**
 *  Exercise 4. Prompt the user to input 10 values and store them into an array.
 *  Output the total number of odd and even values in the array.
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * *     PSEUDOCODE    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **
 *
 * Start
 *
 * // INPUT
 * instantiate scanner object
 * declare array of length ten to store entered data (entered_array[])
 * declare array temp_odd[] to hold odd numbers
 * declare array temp_even[] to hold even numbers
 * declare and initialize int variables (n_odd) to hold length of odd array dynamically
 * declare and initialize int variables (n_even) to hold length of even array dynamically
 * 	FOR LOOP
 * 		prompt user to enter ten integer values
 * 		assign each entry to current index entered_array[]
 * 	END FOR LOOP
 *
 * // PROCESS
 *
 * 	FOR LOOP
 * 		IF (number modulus of two is zero)
 * 			assign current index value to temp_even
 * 			increment n_even by one
 * 		ELSE
 * 			assign current index value to temp_odd
 * 			increment n_odd by one
 * 		END IF
 * declare and initialize even_array copied from temp_even with the new n_even array length
 * declare and initialize odd_array copied from temp_odd with the new n_odd array length
 * close scanner object
 *
 * // OUTPUT
 *
 * print entered_array[]
 * print even_array[]
 * end
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * *     TEST DATA -1    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 *Enter ten numbers.
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
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  * * * * * * * * * * * * * * * * *     TEST DATA -2    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 * Enter ten numbers.
 * Enter ( 1/10): 1
 * Enter ( 2/10): 2
 * Enter ( 3/10): 3
 * Enter ( 4/10): 4
 * Enter ( 5/10): 5
 * Enter ( 6/10): 4
 * Enter ( 7/10): 3
 * Enter ( 8/10): 2
 * Enter ( 9/10): 1
 * Enter (10/10): 0
 *      Entered Array: [1, 2, 3, 4, 5, 4, 3, 2, 1, 0]
 * No-Duplicate Array: [1, 2, 3, 4, 5, 0]
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q4OddEvenMembers {

    public static void main(String[] args) {

        // INPUT

        // instantiate scanner object
        Scanner keyboard = new Scanner(System.in);

        // to store data entered from the user
        int [] entered_array = new int[10];
        int n = entered_array.length;
        int [] temp_odd = new int[n];
        int [] temp_even = new int [n];
        int n_even = 0;
        int n_odd = 0;

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

        // assign even and odd values inseparate arrays
        for(int i = 0; i < n; i++){
            // even values
            if(entered_array[i] %2 == 0){
                temp_even[n_even++] = entered_array[i];
            }
            // odd values
            else{
                temp_odd[n_odd++] = entered_array[i];
            }
        }
        // transfer values to final array with exact array length
        int [] even_array = Arrays.copyOf(temp_even, n_even);
        int [] odd_array = Arrays.copyOf(temp_odd, n_odd);

        keyboard.close();

        // OUTPUT

        System.out.println("\nENTERED VALUES: " + Arrays.toString(entered_array));
        System.out.println("---------------------------------------------------");
        System.out.println("   EVEN VALUES: " + Arrays.toString(even_array));
        System.out.println("    ODD VALUES: " + Arrays.toString(odd_array));

    }
}
