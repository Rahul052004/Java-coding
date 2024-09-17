import java.util.*;

public class ArrangeElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -2, 4, -2, -4, 5};

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negetive = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive.add(arr[i]);
            } else {
                negetive.add(arr[i]);
            }
        }

        int arr2[] = new int[arr.length];
        int c = 0;
        int j = 0;

        // Arrange elements in arr2
        while (c < positive.size() && c < negetive.size()) {
            arr2[j] = positive.get(c);
            arr2[j + 1] = negetive.get(c);
            c++;
            j += 2;
        }

        // Add remaining positive elements, if any
        while (c < positive.size()) {
            arr2[j] = positive.get(c);
            c++;
            j++;
        }

        // Add remaining negative elements, if any
        while (c < negetive.size()) {
            arr2[j] = negetive.get(c);
            c++;
            j++;
        }

        System.out.println(Arrays.toString(arr2));
    }
}
