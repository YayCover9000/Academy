public class ExerciseThree {
    public static void ExerciseThree() {
        int a = -1;
        int b = a++;
        int c = b;
        System.out.println(b);
        System.out.println(1 - b);
        System.out.println(c);
        System.out.print(1 - a++); //1 -1 = 2 weil der Compiler rechnet: 1-(-1) = 2 // und - plus - ist + ergo 1+1!!
    }
}
