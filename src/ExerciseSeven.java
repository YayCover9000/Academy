public class ExerciseSeven {
    public static void exerciseSeven() {
        int startIncl = 1, endExcl = 11;

        int sum = 0;
        for (int i = startIncl; i < endExcl; i++) {
            sum += i;
        }

        System.out.println(sum); // it prints "55"
    }

}
