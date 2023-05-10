package anagram;

import java.util.Arrays;

public class Anagram {

    public boolean checkAnagram(String firstString, String secondString){
        if(firstString.isBlank() || secondString.isBlank()){
            System.err.println("One of strings is blank or empty");
            return false;
        } else if (firstString.length() != secondString.length()){
            System.err.println("Length of this strings is different");
            return false;
        }
        String[] firstArray = firstString.split("");
        String[] secondArray = secondString.split("");

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }

    public static void main(String[] args) {

        Anagram task = new Anagram();
        System.out.println(task.checkAnagram("!low-salt!", "owls-lat!!"));
    }
}
