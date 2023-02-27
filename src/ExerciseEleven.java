/** Program to Solve an Exercise in JetBrainsAcademy
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
        int price10 = 10;
        int price8 = 8;
        int totalIncome = 0;
        boolean even = false;
        //accesses evenOrOdd for numRows
        int numRows = scanner.nextInt();

        int numSeats = scanner.nextInt();

        int gesSeats = numRows * numSeats;
        System.out.println(gesSeats);
        //checks if gesSeats are Even or Odd
        boolean evenFromCheck = ExerciseEleven.evenOrOdd(gesSeats, even);
        //System.out.println(even);
        if (evenFromCheck) {
            System.out.println("is EVEN");
            ExerciseEleven.over60Even(gesSeats, price10, price8);
        }
        else {
            System.out.println("is ODD");
            ExerciseEleven.over60Odd(gesSeats, price10, price8, numSeats, numRows);
        }
    }

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
    private static void over60Even(int gesSeats, int price10, int price8) {
        gesSeats = gesSeats / 2;
        int PriceFront = gesSeats * price10;
        int PriceBack = gesSeats * price8;
        int gesPriceRoomOver60 = PriceFront + PriceBack;
        System.out.print(gesPriceRoomOver60 + "€");
    }
    private static void over60Odd(int gesSeats, int price10, int price8, int numSeats, int numRows) {
        /* gesSeats = gesSeats % 2;
        int PriceFront = (gesSeats + numSeats) * price10;
        int PriceBack = gesSeats * price8;
        int gesPriceRoomOver60 = PriceFront + PriceBack;
        System.out.print(gesPriceRoomOver60 + "€");

        if(numRows % 2 == 1) { */
        ExerciseEleven.helpMeCalc(price10, price8/*, gesSeats, numSeats, numRows*/);
            int numRowBack = numRows - numSeats; //one Row less
            int numRowsFront = numRows + numSeats; //add one Row
            int priceNumRowBack = (numRowBack * numSeats) * price8;
            int priceNumRowFront = (numRowsFront * numSeats) * price10;
            int gesPriceRoomOver60 = priceNumRowFront + priceNumRowBack;
            System.out.print(gesPriceRoomOver60 + "€ in Automatic Calc");

        /* }
        else {

        } */
    }
    private static void helpMeCalc(int price10, int price8/*, int gesSeats, int numSeats, int numRows*/) {
        int numRows = 11;
        int numSeats = 7;
        int numRowsBack = ((numRows * numSeats) - numSeats) / 2; // 77 - 7 = 70 70 / 2 = 35
        System.out.println("numRowsBack: " + numRowsBack);
        /* int numRowsBackDev2 = numRowsBack / 2; // 70 / 2 = 35
        System.out.println("numRowsBackDev2: " + numRowsBackDev2); */
        int priceNumRowBack = numRowsBack * price8;
        System.out.println("priceNumRowBack: " + priceNumRowBack);

        int numRowsFront = ((numRows * numSeats) + numSeats) / 2; // 77 + 7 = 84  84 / 2 = 42
        System.out.println("numRowsFront: " + numRowsFront);
        /* int numRowsFrontDev2 = numRowsFront / 2;
        System.out.println("numRowsFrontDev2" + numRowsFrontDev2); */
        int priceNumRowFront = numRowsFront * price10;
        System.out.println("priceNumRowFront: " + priceNumRowFront);
        int gesPriceRoomOver60 = priceNumRowFront + priceNumRowBack;
        System.out.println(gesPriceRoomOver60 + "€ in Manual Calc");
    }

}

