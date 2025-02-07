package Lab1;

import java.util.List;

// TODO: implement methods
public class LoggingSortingUtility implements SortingUtilityIF{
    private final SortingUtilityIF sortingUtility = new SortingUtility();

    @Override
    public List sort(int sortingApproach, List<Product> items) {
        System.out.println("Items sorted!");
        logSortedProducts(sortingApproach, sortingUtility.sort(sortingApproach, items));
        return items;
    }

    private void logSortedProducts(int sortingApproach, List<Product> items) {
        // name, ID, price
        if(sortingApproach == 0) {

        }
        // ID, name, price
        else {

        }
    }
}