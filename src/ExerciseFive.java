import java.util.Scanner;
public class ExerciseFive {
    public static void exerciseFive() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        boolean  firstNumBigerSecNum = secondNumber <= firstNumber;
        boolean firstNumSmallerSecNum = secondNumber >= firstNumber;
        boolean firstNumSmallerThirdNum = firstNumber <= thirdNumber;
        boolean firstNumBiggerThirdNum = firstNumber >= thirdNumber;
        boolean statement1 = firstNumBigerSecNum && firstNumSmallerThirdNum;
        boolean statment2 = firstNumBiggerThirdNum && firstNumSmallerSecNum;
        boolean output = false;

        if  (statement1 || statment2)   {
            output = true;
        }
        System.out.print(output);
    }
}
