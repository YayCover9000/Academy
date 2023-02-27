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
        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numSeats = scanner.nextInt();

        int gesSeats = numRows * numSeats;
        System.out.println(gesSeats);
        //checks if gesSeats are Even or Odd
        boolean evenFromCheck = ExerciseEleven.evenOrOdd(gesSeats, even);
        if ( gesSeats <= 60) {
            totalIncome = gesSeats * 10;
            System.out.println("Total income:" + "\n" + "$" + totalIncome);
        }
        else if (evenFromCheck) {
            System.out.println("is EVEN");
            ExerciseEleven.over60Even(gesSeats, price10, price8);
        }
        else {
            System.out.println("is ODD");
            ExerciseEleven.over60Odd(price10, price8, numSeats, numRows);
        }
    }

    private static boolean evenOrOdd(int value, boolean even){

        if (isEven(value)) {
            //System.out.println(value + " isEven");
            even = true;
        }
        else if (isOdd(value)) {
            //System.out.println(value + " isOdd");
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
        System.out.println(gesPriceRoomOver60 + "€ in over60EVEN");
        System.out.println("Total income:" + "\n" + "$" + gesPriceRoomOver60);
    }
    private static void over60Odd(int price10, int price8, int numSeats, int numRows) {
        ExerciseEleven.helpMeCalc(price10, price8);
        //Calculating Seats in BackBlock + Price 8€
        int numRowsBack = ((numRows * numSeats) + numSeats) / 2; // 77 + 7 = 84  84 / 2 = 42
        System.out.println("numRowsBack: " + numRowsBack);
        int priceNumRowBack = numRowsBack * price8;
        System.out.println("priceNumRowBack: " + priceNumRowBack);
        //Calculating Seats in FrontRow + Price 10€
        int numRowsFront = ((numRows * numSeats) - numSeats) / 2; // 77 - 7 = 70 70 / 2 = 35
        System.out.println("numRowsFront: " + numRowsFront);
        int priceNumRowFront = numRowsFront * price10;
        System.out.println("priceNumRowFront: " + priceNumRowFront);
        //Calculating Price for whole Cinema
        int gesPriceRoomOver60 = priceNumRowFront + priceNumRowBack;
        System.out.println(gesPriceRoomOver60 + "€ in Automatic Calc in over60ODD");
        System.out.println("Total income:" + "\n" + "$" + gesPriceRoomOver60);

    }
    private static void helpMeCalc(int price10, int price8) {
        System.out.println("This Methode prints Calculation for 8 Rows and 9 Seats");
        int numRows = 8;
        int numSeats = 9;
        //Calculating Seats in BackBlock + Price 8€
        int numRowsBack = ((numRows * numSeats) + numSeats) / 2; // 72 + 9 = 81  81 / 2 = 40,5
        System.out.println("numRowsBack: " + numRowsBack);
        int priceNumRowBack = numRowsBack * price8;
        System.out.println("priceNumRowBack: " + priceNumRowBack);
        //Calculating Seats in FrontRow + Price 10€
        int numRowsFront = ((numRows * numSeats) - numSeats) / 2; // 77 - 7 = 70 70 / 2 = 35
        System.out.println("numRowsFront: " + numRowsFront);
        int priceNumRowFront = numRowsFront * price10;
        System.out.println("priceNumRowFront: " + priceNumRowFront);
        //Calculating Price for whole Cinema
        int gesPriceRoomOver60 = priceNumRowFront + priceNumRowBack;
        System.out.println(gesPriceRoomOver60 + "€ in Manual Calc");
        System.out.println("Total income:" + "\n" + "$" + gesPriceRoomOver60);
        System.out.println("______________________________________________________________________________");
    }

}

