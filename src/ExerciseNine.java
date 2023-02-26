import java.util.Scanner;
public class ExerciseNine {
    public static void exerciseNine() {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        int output = 1;
        for (int i = firstInput; firstInput < secondInput; i++) {
            output *= i;
        }
        System.out.print(output);
    }
}
