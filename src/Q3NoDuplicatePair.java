/**
 * Exercise 3.
 * Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
 * Write a program that will print out all pairs from arrays 1 and 2 that gives a sum of 13:
 * Expected output:
 * (6,7)
 * (9,4)
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * *     PSEUDOCODE    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Start
 *
 * //INPUT
 *
 * declare and initialize two arrays (original_array1 and original_array2)
 * declare and initialize integer variable to the two arrays
 * copy both arrays (original_array1 and original_array2) (if in case it is needed to be displayed)
 *
 * //PROCESS
 * sort both arrays
 * remove duplicate values from each of the two arrays >>>>>>
 * 	that means method call to remove_duplicate() // returns array with unique values
 * 		(refer the pseudocode of this method below)
 *
 * again sort the unique valued arrays (since orders might be rearranged during removal of duplicate values)
 * remove duplicate pairs (the previous one was removal of duplicate array members)
 * 	that means function call unique_pairs() // processes and prints the output
 *
 * method remove_duplicate( int[] array)
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 *
 * 	calculate length of array brought as parameter
 * 	FOR LOOP1
 * 		FOR LOOP2
 * 			IF (two array members have the same value)
 * 				swap this member with last index member
 * 				decrement by one array length
 * 				decrement by one the current index
 * 			END IF
 * 		END FOR LOOP2
 * 	END FOR LOOP1
 * 	copy the array with finally caluclated array length into no_duplicate_array
 * 	return no_duplicate array
 * end method remove_duplicate() method
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 *
 *
 * method unique_pairs(array1 , array2)
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 *
 * 	calculate array length of both arrays
 * 	declare two temporary arrays
 * 	declare and initialize int variable k to store number of members that fulfil the requriement (sum of pairs = 13)
 * 	declare int vairable to store sum of pairs
 *
 * //CALCULATE EVERY PAIR WHOSE SUM EQUAL TO 13
 * 	FOR LOOP1
 * 		FOR LOOP2
 * 			sum = array1(current index in loop 1) + array2 current index in loop2)
 * 			IF (sum equals 13)
 * 				swap array members of respective index to temporary array
 * 				increament int variable k
 * 			END IF
 * 		END FOR LOOP2
 * 	END FOR LOOP1
 * // at this level the pairs whose sum equals 13 are stored in the temporary array and
 * //if the array length variable k is not equal to the unique value arrays the initial value zero still exists.
 *
 * so to truncate those zero values using k copy both arrays into another array
 * // at this stage if there exists, there will be duplicate pairs with interchangeable values like (6,7) and (7,6)
 *
 * 	FOR LOOP1
 * 		FOR LOOP2
 * 			IF (the two index values are not equal)
 *
 * 				IF (a member in one array is found in another array)
 * 					swap the other pair with the final index array element
 * 					decrement the array length
 * 				END IF
 * 			END IF
 * 		END FOR LOOP2
 * 	END FOR LOOP1
 * transfer the array values to the final pair of unique arrays using the new array length
 *
 * //OUT PUT
 * 	IF (the array length is less than or equal to zero)
 * 		print Sorry no pair matchs your requirement
 * 	ELSE
 * 		FOR LOOP
 * 			print pair
 * 		END FOR LOOP
 *
 *
 *
 * ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
 *
 * end
 *
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * *     TEST DATA -1    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 * Input:
 * original_array1 = {9, 4, 9, 4, 4};
 * original_array2 = {4, 9, 4, 9, 9};
 *
 * Output:
 * (4,9)
 *
 *  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  * * * * * * * * * * * * * * * * *     TEST DATA -2    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 * Input:
 * original_array1 = {1, 7, 6, 5, 9};
 * original_array2 = {2, 7, 6, 3, 4};
 *
 * Output:
 * (6,7)
 * (9,4)
 *  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */

import java.util.Arrays;

public class Q3NoDuplicatePair {

    public static void main(String[] args) {                  // main() method

        int[] original_array1 = {1, 7, 6, 5, 9};              // sample original array {1, 7, 6, 5, 9}
        int[] original_array2 = {2, 7, 6, 3, 4};              // sample original array {2, 7, 6, 3, 4}
        int n1 = original_array1.length;
        int n2 = original_array2.length;
        int[] sorted_array1 = new int[n1];
        int[] sorted_array2 = new int[n2];


        // COPY ORIGINAL_ARRAY TO SORTED_ARRAY to start sorting
        for (int i = 0; i < n1; i++) {
            sorted_array1[i] = original_array1[i];
            sorted_array2[i] = original_array2[i];
        }

        // SORT the array called sorted_array using java library method
        Arrays.sort(sorted_array1);
        Arrays.sort(sorted_array2);

        // remove duplicate values from each array
        int[] unique_array1 = remove_duplicate(sorted_array1);
        int[] unique_array2 = remove_duplicate(sorted_array2);

        // SORT The unique array
        Arrays.sort(unique_array1);
        Arrays.sort(unique_array2);

        // remove duplicate pairs (UNIQUE PAIR)
        // in the previous process duplicate array members were removed but here duplicate pairs
        unique_pairs(unique_array1, unique_array2);

    }   // end of main() method


    // This method removes pair values from an array
    public static int[] remove_duplicate(int[] temp_array) {

        int n = temp_array.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // if two members have equal value, swap them with the last index value member
                // and decrement by one the array length
                if (temp_array[i] == temp_array[j]) {

                    // swap with last index value
                    temp_array[j] = temp_array[n - 1];
                    // reduce array length
                    n--;
                    // reduce the second for loop index to again check the swapped
                    // member which was in the last index
                    j--;
                }
            }
        }

        // copy the unique elements only.
        int[] no_duplicate_array = Arrays.copyOf(temp_array, n);

        return no_duplicate_array;

    }   // end of remove_duplicate() method

    public static void select_pairs(int[] array1, int[] array2){

    }   // end of select_pairs() method

    // This method removes unique pairs between two arrays.
    public static void unique_pairs(int[] array1, int [] array2){
        int n1 = array1.length;
        int n2 = array2.length;
        int [] temp1 = new int [n1];
        int [] temp2 = new int [n2];

        int k = 0;
        int sum;

        // calculate every pair whose sum could be 13
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {

                sum = array1[i] + array2[j];

                // if the sum of two pairs is 13 transfer pairs to respective temporary arrays
                if (sum == 13) {
                    temp1[k] = array1[i];                     // sample original array {6, 7, 9, 0, 0}
                    temp2[k] = array2[j];                     // sample original array {7, 6, 4, 0, 0}
                    k++;
                }
            }
        }

        // at this stage pairs with sum = 13 are identified
        // next step is to delete duplicate pairs

        //copy array removing zero pairs if there are.

        int[]temp_temp1 = Arrays.copyOf(temp1, k);        // sample original array {6, 7, 9}
        int[]temp_temp2 = Arrays.copyOf(temp2, k);        // sample original array {7, 6, 4}

        // check if same pairs exist (6, 7) is similar to (7,6)

        for(int i = 0; i < k; i++){
            for(int j = 0; j <k ; j++){
                if(i != j){
                    if(temp_temp1[i] == temp_temp2[j]){
                        // swap the duplicate array member with the last index value (both members of the pair)
                        int temp1_val = temp_temp1[j];
                        temp_temp1[j] = temp_temp1[k-1];
                        temp_temp1[k-1] = temp1_val;

                        // swap the duplicate array member with the last index value (both members of the pair)
                        int temp2_val = temp_temp2[j];
                        temp_temp2[j] = temp_temp2[k-1];
                        temp_temp2[k-1] = temp2_val;

                        k--;                                  // array length reduces if duplicate values are swaped to the last index
                    }
                }
            }
        }
        // sample out put at this step is temp array1 [6, 9]
        // sample out put at this step is temp array2 [7, 4]
        // print final result of pairs.
        int [] unique_array1 = Arrays.copyOf(temp_temp1, k);
        int [] unique_array2 = Arrays.copyOf(temp_temp2, k);

        // if there is not a single pair notify the user
        if(k <= 0){
            System.out.println("\nSorry No Pair matchs your Requirement.");
        }
        else{
            for(int i =0; i < k; i++){
                System.out.printf("(%d,%d)\n",unique_array1[i],unique_array2[i]);
            }
        }
    }   // end of unique_pairs() method
}   // END OF CLASS
