package Lab1;

import java.util.List;

// TODO: Implement methods
public class SortingUtility implements SortingUtilityIF {
    LoggingSortingUtility loggingSortingUtility = new LoggingSortingUtility();

    @Override
    public void sort(int sortingApproach, List<Product> items) {
        // quicksort
        if(sortingApproach == 0) {

        }
        // bubblesort
        else {

        }
        loggingSortingUtility.sort(sortingApproach, items);
    }
}
