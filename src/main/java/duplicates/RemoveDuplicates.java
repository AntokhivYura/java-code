package duplicates;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    /**
     * Removes duplicates from ArrayList by creating a new ArrayList
     * and adding elements from first ArrayList if there is no such element
     *
     * @param list ArrayList of elements with duplicates
     * @return ArrayList with no duplicates
     */
    public List<String> removeDuplicates(List<String> list) {
        if (list == null || list.isEmpty()) {
            System.err.println("List is empty or null");
            return list;
        }
        List<String> listWithNoDuplicates = new ArrayList<>();

        for (String elem : list) {
            if (!listWithNoDuplicates.contains(elem)) {
                listWithNoDuplicates.add(elem);
            }
        }

        return listWithNoDuplicates;
    }

    /**
     * Removes duplicates from ArrayList by converting it to LinkedHashSet
     *
     * @param list ArrayList of elements with duplicates
     * @return ArrayList with no duplicates
     */
    public List<String> removeDuplicatesEasy(List<String> list) {
        if (list == null || list.isEmpty()) {
            System.err.println("List is empty or null");
            return list;
        }
        Set<String> listWithNoDuplicates = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(listWithNoDuplicates);

        return list;
    }
}
