package Lab1;

import java.util.List;

// TODO: Implement methods
public class SortingUtility implements SortingUtilityIF {

    @Override
    public List sort(int sortingApproach, List<Product> items) {
        int i, j;
        // quicksort
        if(sortingApproach == 0) {
            quickSort(items, 0, items.size() - 1);
        }
        // bubblesort
        else {
            System.out.println(sortingApproach);
        }
        return items;
    }

//    private void quickSort (List<Product> items, int low, int high) {
//        System.out.println("current list");
//        for (int p = 0; p < items.size(); p++) {
//            System.out.println(items.get(p).getName() + " " + items.get(p).getID()+ " " + items.get(p).getPrice());
//        }
//        if (low < high) {
//            Product pivot = items.get(high); // pivot = last item
//            System.out.println("pivot " + pivot.getName());
//            int i = low-1;
//            for (int j = low; j < high; j++) {
//                System.out.println("item " + items.get(j).getName());
//                if (pivot.getPrice() >= items.get(j).getPrice()) {
//                    System.out.println("swap " + items.get(j).getName() + " " + items.get(i).getName());
//                    i++;
//                    swap (items, i, j);
//                }
//            }
//            System.out.println("swap " + items.get(high).getName() + " " + items.get(i+1).getName());
//            swap(items, i+1, high); // swap to new pivot
//
//            //recurse
//            System.out.println("recurse 1 " + items.get(low).getName() + " " + items.get(i).getName());
//            System.out.println("recurse 2 " + items.get(high).getName() + " " + items.get(i+2).getName());
//            if (low<i){
//                quickSort (items, low, i); // sort items smaller than pivot
//            }
//            if (i+2 <= high){
//                quickSort (items, i + 2, high); // sort items higher than pivot
//            }
//        }
//    }

    private void quickSort(List<Product> items, int low, int high) {
        if (low < high) {
            int i = partition(items, low, high);
            quickSort(items, low, i - 1);  // Left part
            quickSort(items, i + 1, high); // Right part
        }
    }

    private int partition(List<Product> items, int low, int high) {
        Product pivot = items.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (items.get(j).getPrice() <= pivot.getPrice()) {
                i++;
                swap(items, i, j);
            }
        }
        swap(items, i + 1, high); // move pivot back to last
        return i + 1;
    }

//    private void bubbleSort (List<Product> items, int low, int high) {
//
//    }
    private void swap (List<Product> items, int i, int j) {
        Product temp = items.get(i);
        items.set(i, items.get(j));
        items.set(j, temp);
    }
}
