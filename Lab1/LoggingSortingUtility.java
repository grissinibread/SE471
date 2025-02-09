package Lab1;

import java.util.List;

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
            System.out.println("Items sorted using quick sort!");
            for (int i = 0; i < items.size(); i++) {
                System.out.println(items.get(i).getName() + " " + items.get(i).getID()+ " " + items.get(i).getPrice());
            }
        }
        // ID, name, price
        else {
            System.out.println("Items sorted using bubble sort!");
            for(int i = 0; i < items.size(); i++) {
                System.out.println(items.get(i).getID() + " " + items.get(i).getName() + " " + items.get(i).getPrice());
            }
        }
    }
}