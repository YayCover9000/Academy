import java.util.Scanner;
import java.util.ArrayList;
public class CoffeeComperator {
    public static void CoffeeComperator() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> coffeeTypesIncludedInAbo = new ArrayList<String>();
        String coffeeTypes = sc.nextLine();
            do {coffeeTypesIncludedInAbo.add(coffeeTypes);
                coffeeTypes = sc.nextLine();
            }while (!coffeeTypes.equals("END"));
            sc.close();
    }
}
