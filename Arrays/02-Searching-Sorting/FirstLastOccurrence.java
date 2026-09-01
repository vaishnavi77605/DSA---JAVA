import java.util.*;

public class FirstLastOccurrence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int first = -1;
        int last = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {

                if (first == -1) {
                    first = i;
                }

                last = i;
            }
        }

        System.out.println("First: " + first);
        System.out.println("Last: " + last);

        sc.close();
    }
}