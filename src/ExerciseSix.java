import java.util.Scanner;
public class ExerciseSix {
    public static void exerciseSix() {
/**Given an integer as an input, print True if its value falls within the interval (−15,12]∪(14,17)∪[19,+∞).
 *  Otherwise, print False (case-sensitive).
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
        final int one = -15;
        final int two = 12;
        final int three = 14;
        final int four = 17;
        final int five = 19;
        boolean range1 = one < input && input <= two;
        boolean range2 = three < input && input < four;
        boolean range3 = five <= input;
        if (range1 || range2 || range3) {
            comp = true;
        } if (comp) {
            System.out.print("True");
        } else if (!comp) {
            System.out.print("False");
        }
        scanner.close();
    }
}
