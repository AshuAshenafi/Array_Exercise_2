/**
 * Exercise 5.
 * (Challenge!)  Prompt the user to input one line of a string.  Parse the string into a word, print out the word and length of the word. Assume that the maximum size of a line is 132.
 * Enter a string (max number of characters is 132)
 * Today is Friday and it is raining.
 * You entered Today is Friday and it is raining.
 * Today has 5 characters
 * is has 2 characters
 * Friday has 6 characters
 * and has 3 characters
 * it has 2 characters
 * is has 2 characters
 * raining. has 8 characters
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * *     PSEUDOCODE    * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 *Start
 *
 * // INPUT
 *
 * instantiate scanner object
 * declare String variable to store the input from user
 * declare integer variable to hold length of the String
 * prompt user to enter a string
 * assign the string to the String variable
 *
 * // PROCESS
 *
 * //calculate length of entered string
 * 	FOR LOOP
 * 		IF (till end of the string)
 * 			increament length variable
 * 		END IF
 * 	END FOR LOOP
 *
 * declare array (words[]) and initialize by spliting the String into words
 * print words
 *
 * end
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * *     TEST DATA -1    * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 * Enter a String (max number of chars is 132):
 * Thank God it is Friday.
 *
 * You entered: Thank God it is Friday. (Total = 19 chars.)
 *              -----------------------
 * Thank has 5 characters.
 * God has 3 characters.
 * it has 2 characters.
 * is has 2 characters.
 * Friday. has 7 characters.
 *
 *  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  * * * * * * * * * * * * * * * * * * * * * * *   TEST DATA -2    * * * * * * * * * * * * * * * * * * * * * * * * *
 *  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 *Enter a String (max number of chars is 132):
 * Java Boot Camp is 8 weeks program.
 *
 * You entered: Java Boot Camp is 8 weeks program. (Total = 28 chars.)
 *              ----------------------------------
 * Java has 4 characters.
 * Boot has 4 characters.
 * Camp has 4 characters.
 * is has 2 characters.
 * 8 has 1 character.
 * weeks has 5 characters.
 * program. has 8 characters.
 *
 */

import java.util.Scanner;

public class Q5StringParse {
    public static void main(String[] args) {

        // INPUT

        // instantiate scanner object
        Scanner keyboard = new Scanner(System.in);

        // to store data entered from the user
        String str_entered;
        int input_length = 0;

        System.out.println("Enter a String (max number of chars is 132):");
        String input = keyboard.nextLine();

        // receive from user
        str_entered = input;

        // PROCESS
        // calculate length of Entered String
        for (int i = 0; i < str_entered.length(); i++) {
            if (str_entered.charAt(i) != ' ') {
                input_length++;
            }
        }

        // use split() method
        String[] words = str_entered.split(" ");

        // OUTPUT
        System.out.println("\nYou entered: " + str_entered + " (Total = " + input_length + " chars.)");

        System.out.printf("%13s", "             ");
        for (int i = 1; i < (input_length + words.length); i++) {
            System.out.printf("-");
        }
        System.out.println();


        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) != ' ') {
                    count++;
                }
            }

            System.out.print(words[i] + " has " + count);
            if (count == 1) {
                System.out.printf(" character.");
            } else {
                System.out.printf(" characters.");
            }
            System.out.println();
        }
    }   // end of main() method
}   // end of class
