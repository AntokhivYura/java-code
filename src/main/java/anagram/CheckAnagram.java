package anagram;

import java.util.Arrays;

public class CheckAnagram {

    /**
     * Check if Two Strings are anagrams by converting them to String array
     * After that arrays are sorted and compared by Arrays.equals()
     *
     * @param firstString
     * @param secondString
     * @return true if Strings are anagrams and false if not
     */
    public boolean checkAnagram(String firstString, String secondString) {
        if (firstString.isBlank() || secondString.isBlank()) {
            System.err.println("One of strings is blank or empty");
            return false;
        } else if (firstString.length() != secondString.length()) {
            System.err.println("Length of this strings is different");
            return false;
        }
        String[] firstArray = firstString.split("");
        String[] secondArray = secondString.split("");

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }
}
