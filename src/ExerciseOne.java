public class ExerciseOne {
    public static void exerciseOne() {
        int a = 9;
        int b = 0;
        int array[] = new int[10];
        while (a > -1) {
            //System.out.println(a);
            array[b] = a;
            a--;
            b++;
        }
        for(int element : array) {
            System.out.print(element + " ");
        }
    }
}
