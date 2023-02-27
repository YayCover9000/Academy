/**Programm to Solve an Exercise in JetBrainsAcademy
 * it shall calculate the price for seats in a Cinema
 *
 * @autor Yassuan Foljanty Catanzaro
 * */
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
        int value;
        int price;
        //accesses evenOrOdd for numRows
        int numRows = scanner.nextInt();
        value = numRows;
        ExerciseEleven.evenOrOdd(value);
        //accesses evenOrOdd for numSeats
        int numSeats = scanner.nextInt();
        value = numSeats;
        ExerciseEleven.evenOrOdd(value);
        //calculates all Seats in room
        int gesSeats = numRows * numSeats;
        System.out.println(gesSeats);

        if (gesSeats <= 60) {
            price = 10;
            System.out.print(price + "€ per Seat");
        }
        else if (gesSeats > 60) {
            System.out.print(" more then 60 Seats");
        }
        //System.out.println("give me a value to determan if odd or not");
        //int value = scanner.nextInt();



    }
    private static int evenOrOdd(int value){
        if (isEven(value)) {
            System.out.println(value + " isEven");
        }
        else if (isOdd(value)) {
            System.out.println(value + " isOdd");
        }
        return value;
    }
    private static boolean isEven(int value) {
        return value % 2 == 0;
    }
    private static boolean isOdd(int value) {
        return value % 2 !=0;
    }

}
