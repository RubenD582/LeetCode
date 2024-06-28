import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Output: "+letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        Map<String, String> keys = new HashMap<>();
        keys.put("2", "abc");
        keys.put("3", "def");
        keys.put("4", "ghi");
        keys.put("5", "jkl");
        keys.put("6", "mno");
        keys.put("7", "pqrs");
        keys.put("8", "tuv");
        keys.put("9", "wxyz");

        String start = keys.get(Character.toString(digits.charAt(0)));
        for (int i = 0; i < digits.length(); i++) {
            for (int j = 0; j < start.length(); j++) {
                String cString = Character.toString(digits.charAt(i))+Character.toString(start.charAt(j));
                result.add(cString);
            }
        }

        return result;
    }
}