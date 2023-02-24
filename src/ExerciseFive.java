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
        boolean output = false;

        if((firstNumBigerSecNum && firstNumSmallerThirdNum) || (firstNumBiggerThirdNum && firstNumSmallerSecNum)){
            output = true;
        }
        System.out.print(output);
    }
}
