import java.util.Scanner;
public class ExerciseSix {
    public static void exerciseSix() {
/**Given an integer as an input, print True if its value falls within the interval (−15,12]∪(14,17)∪[19,+∞).
 *  Otherwise, print False (case sensitive).
 *     numbers denoted with a parenthesis () are exclusive;
 *     numbers denoted with a square bracket [] are inclusive.*/
/* zahl <= -15 && zahl > 12 && 13,14 && 17,18,19 */
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
       /* boolean comp = true;
        if (((input < -15) && (input > 12)) && input < 14 && input > 17 && input < 19) {
            comp = false;
        }
        if (comp == true) {
            System.out.print("True");
        } else if (comp == false) {
            System.out.print("False");
        } */

        /* boolean comp = false;
        if ((input >= -15 && input < 12) || (input > 14 && input < 17) || (input >= 19)) {
            comp = true;
        } if (comp == true) {
            System.out.print("True");
        } else if (comp == false) {
            System.out.print("False");
        } */

        boolean comp = false;
        if ((-15 < input && input <= 12) || (-14 < input && input < 17) || 19 <= input) {
            comp = true;
        } if (comp == true) {
            System.out.print("True");
        } else if (comp == false) {
            System.out.print("False");
        }

    }
}
