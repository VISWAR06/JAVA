import java.util.ArrayList;

public class countsub {

    public static int ss(int[] arr, int i, ArrayList<Integer> current, int s, int sum) {
        if (i == arr.length) {
            if (s == sum) {
                System.out.println(current);
                return 1;
            }
            return 0;
        }

        // TAKE
        current.add(arr[i]);
        int l = ss(arr, i + 1, current, s + arr[i], sum);

        // BACKTRACK
        current.remove(current.size() - 1);

        // NOT TAKE
        int r = ss(arr, i + 1, current, s, sum);

        return l + r;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int sum = 3;
        ArrayList<Integer> current = new ArrayList<>();

        int count = ss(arr, 0, current, 0, sum);
        System.out.println("\nCount: " + count);
    }
}