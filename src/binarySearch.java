import java.util.ArrayList;
import java.util.List;

public class binarySearch {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0, 1);
        list.add(1, 3);
        list.add(2, 5);
        list.add(3, 7);
        list.add(4, 9);

        int item = 7;

        System.out.println("Этот элемент по счёту: " + methodBinarySearch(list, item));


    }

    public static int methodBinarySearch(List<Integer> list, int item) {
        int low = 0;
        int high = list.size() - 1;


        while (low <= high) {

            int mid = (low + high) / 2;

            int guess = list.get(mid);

            if (guess == item) {
            return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

    throw  new IllegalArgumentException("Элемент не найден");}
}
