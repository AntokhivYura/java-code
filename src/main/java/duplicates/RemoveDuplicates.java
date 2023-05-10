package duplicates;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public List<String> removeDuplicates(List<String> list) {
        if (list == null || list.isEmpty()) {
            System.err.println("List is empty or null");
            return list;
        }
        List<String> listWithNoDuplicates = new ArrayList<>(list.size());

        for (String elem : list) {
            if (!listWithNoDuplicates.contains(elem)) {
                listWithNoDuplicates.add(elem);
            }
        }

        return listWithNoDuplicates;
    }

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


    public static void main(String[] args) {
        RemoveDuplicates duplicates = new RemoveDuplicates();

        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("John");
        listWithDuplicates.add("Sofie");
        listWithDuplicates.add("Megan");
        listWithDuplicates.add("John");
        listWithDuplicates.add("Sofie");


        System.out.println(duplicates.removeDuplicates(listWithDuplicates));
        System.out.println(duplicates.removeDuplicatesEasy(listWithDuplicates));
    }
}
