/**Programm to Solve an Exercise in JetBrainsAcademy
 * it shall calculate the price for seats in a Cinema
 *
 * @autor Yassuan Foljanty Catanzaro
 * */
import java.util.Scanner;
public class ExerciseEleven{
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
        boolean even = false;
        //accesses evenOrOdd for numRows
        int numRows = scanner.nextInt();
                                                                            /* value = numRows;
                                                                            ExerciseEleven.evenOrOdd(value, even); */
                                                                            //accesses evenOrOdd for numSeats
        int numSeats = scanner.nextInt();
                                                                            /* value = numSeats;
                                                                            ExerciseEleven.evenOrOdd(value, even); */
                                                                            //calculates all Seats in room
        int gesSeats = numRows * numSeats;
        System.out.println(gesSeats);
        //checks if gesSeats are Even or Odd
        value = gesSeats;
        ExerciseEleven.evenOrOdd(value, even);
        System.out.println(even);
        if (!even) {

        }
        else {

        }

         //gesSeats smaller 60
            if (gesSeats <= 60) {
                price = 10;
                System.out.print(price + "€ per Seat");
            }
                                                                /* case 1: //gesSeats bigger 60
                                                                    if (gesSeats > 60) {
                                                                        System.out.println(" more then 60 Seats");
                                                                        boolean gesSeatsEven = false; */
                                                                 /*if ( numRows % 2 == 0) { //gesSeats Even
                                                                            gesSeatsEven = true;
                                                                        }
                                                                        if (gesSeatsEven == true) {
                                                                            int frontPart = numRows / 2;
                                                                            int frontPartPrice = 10 * frontPart;
                                                                            System.out.println();
                                                                        } */
                   // int totalIncome = frontPartPrice *
        }


            /* //Does not give out remainder
            numRows = numRows / 2;
            System.out.println(numRows); */


        //System.out.println("give me a value to determan if odd or not");
        //int value = scanner.nextInt();




    private static boolean evenOrOdd(int value, boolean even){

        if (isEven(value)) {
            System.out.println(value + " isEven");
            even = true;
        }
        else if (isOdd(value)) {
            System.out.println(value + " isOdd");
            even = false;
        }
        return even;
    }

    private static boolean isEven(int value) {
        return value % 2 == 0;
    }
    private static boolean isOdd(int value) {
        return value % 2 !=0;
    }

}

