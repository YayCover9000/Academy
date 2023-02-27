import java.util.Scanner;
public class ExerciseEleven {
    public static void exerciseEleven() {
        Scanner scanner = new Scanner(System.in);
        /* Enter the number of rows:
            > 9
            Enter the number of seats in each row:
            > 7
            Total income:
            $560 */
        int numRows = scanner.nextInt();
        int numSeats = scanner.nextInt();
        int gesSeats = numRows * numSeats;
        System.out.print(gesSeats);
        if (gesSeats >= 50) {
            ges
        }
        System.out.println("give me a value to determan if odd or not");
        int value = scanner.nextInt();
        if (isEven(value)) {
            System.out.println(value + " isEven");
        }
        else if (isOdd(value)) {
            System.out.println(value + " isOdd");
        }
    }
    private static boolean isEven(int value) {
        return value % 2 == 0;
    }
    private static boolean isOdd(int value) {
        return value % 2 !=0;
    }

}
