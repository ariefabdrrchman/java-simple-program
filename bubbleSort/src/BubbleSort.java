import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] a = {8,3,5,2,6,1,4,7};
        System.out.println("before sorting process:");
        System.out.println(Arrays.toString(a));

        int buffer;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    buffer = a[j];
                    a[j] = a[i];
                    a[i] = buffer;
                }
            }
        }

        System.out.println("\nafter sorting process:");
        System.out.println(Arrays.toString(a));

    }

}
