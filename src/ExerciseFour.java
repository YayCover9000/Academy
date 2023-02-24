import java.util.Scanner;

public class ExerciseFour {
    public static void exerciseFour() {
/**Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.
The program should print out the resulting string.*/
/* replace(old, new) returns a new string obtained by replacing all occurrences
of old with new that can be chars or strings. */

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print(input.replace('a', 'b'));


    }
}

