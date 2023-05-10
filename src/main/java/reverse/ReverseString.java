package reverse;

public class ReverseString {
    /**
     * Returns reversed String
     *
     * @param stringValue
     * @return reversed String
     */
    public String reverseString(String stringValue) {
        if (stringValue == null || stringValue.isBlank()) {
            return "String is blank or null";
        }
        String afterReverse = "";
        char tmp;

        for (int i = 0; i < stringValue.length(); i++) {
            tmp = stringValue.charAt(i);
            afterReverse = tmp + afterReverse;
        }
        return afterReverse;
    }
}
