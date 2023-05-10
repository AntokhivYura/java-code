package reverse;

public class Reverse {


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


    public static void main(String[] args) {
        Reverse task = new Reverse();
        System.out.println(task.reverseString("Lorem Ipsum"));
    }
}
