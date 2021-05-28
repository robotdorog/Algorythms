import java.util.ArrayList;
import java.util.List;

public class SortingbyChoise {

    public static void main(String[] args) {

        ArrayList<Integer> unsorted = new ArrayList<>();
        unsorted.add(10);
        unsorted.add(5);
        unsorted.add(7);
        unsorted.add(3);
        unsorted.add(9);
        unsorted.add(1);
        unsorted.add(1);
        unsorted.add(1);


        System.out.println("Несортированный список" + unsorted);
        System.out.println("Сортированный список" + selectionSort(unsorted));
    }

//    private static ArrayList<Integer> unsortedList() {
//        ArrayList<Integer> unsortedList = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            unsortedList.add((int) (Math.random() * 11));
//        }
//        return unsortedList;
//    }


    private static int findSmallest(ArrayList<Integer> list) {
        int smallest = list.get(0);
        int smallest_index = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                smallest_index = i;

            }
        }
        return smallest_index;
    }

    private static ArrayList<Integer> selectionSort(ArrayList<Integer> list) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        int listLenght = list.size();
        for (int i = 0; i < listLenght; i++) {
            int smallest_index = findSmallest(list);

            resultArray.add(list.get(smallest_index));
            list.remove(smallest_index);


        }
        return resultArray;
    }
}