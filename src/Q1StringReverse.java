/**
 * Exercise 1. Write a program to print a string in reverse:
 *
 * ************************************** PSEUDOCODE **************************************
 *
 *  Start
 *      declare and initialize String variable to hold the String
 *      declare a char array with length equal to length of the String
 * 	        FOR LOOP
 * 		        assign each character of the String to current char array of char
 * 	        END FOR LOOP
 *  print the original String
 * 	        FOR LOOP
 * 		        print each member of char array
 * 	        END FOR LOOP
 *  end
 *
 ***********************************TEST DATA -1 *******************************************
 * Welcome
 * emocleW
 *
 ***********************************TEST DATA -1 *******************************************
 * Montgomery
 * yremogtnoM
 *
 */
public class Q1StringReverse {
    public static void main(String[] args) {

        // INPUT
        String[] word = {"Welcome"};

        // PROCESS
        char[] word_1st_order = new char[word[0].length()];

        for (int i = 0; i < word[0].length(); i++) {
            word_1st_order[i] = word[0].charAt(i);
        }

        // OUTPUT
        System.out.printf("%s\n", word);
        for (int i = word[0].length() - 1; i >= 0; i--) {
            System.out.printf("" + word_1st_order[i]);
        }
    }
}