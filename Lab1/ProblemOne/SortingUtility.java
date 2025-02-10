package Lab1.ProblemOne;

import java.util.List;

import static java.util.Collections.swap;

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
            bubbleSort(items);
        }
        return items;
    }

    private void quickSort(List<Product> items, int low, int high) {
        if (low < high) {
            Product pivot = items.get(high);
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (items.get(j).getName().compareTo(pivot.getName()) <= 0) {
                    i++;
                    swap(items, i, j);
                }
            }

            swap(items, i + 1, high); // move pivot back to last
            int partitionIndex = i + 1;

            quickSort(items, low, partitionIndex - 1);  // Left part
            quickSort(items, partitionIndex + 1, high); // Right part
        }
    }

    private void bubbleSort (List<Product> items) {
        boolean swap;
        for (int i = 0; i < items.size() - 1; i++) {
            swap = false;
            for (int j = 0; j < items.size()-i-1; j++) {
                if (items.get(j).getPrice() > items.get(j+1).getPrice()) {
                    swap = true;
                    swap(items, j, j+1);
                }
            }
            if (!swap)
                break;
        }
    }
}