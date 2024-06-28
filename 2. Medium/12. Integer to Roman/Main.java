import java.util.LinkedHashMap;
import java.util.Set;

public class Main {
    static LinkedHashMap<Integer, String> symbols = new LinkedHashMap<>();
    public static void main(String[] args) {
        symbols.put(1000, "M");
        symbols.put(900, "CM");
        symbols.put(500, "D");
        symbols.put(400, "CD");
        symbols.put(100, "C");
        symbols.put(90, "XC");
        symbols.put(50, "L");
        symbols.put(40, "XL");
        symbols.put(10, "X");
        symbols.put(9, "IX");
        symbols.put(5, "V");
        symbols.put(4, "IV");
        symbols.put(1, "I");

        String result = intToRoman(1924); // CL
        System.out.println(result);
    }

    public static String intToRoman(int num) {
        String string = Integer.toString(num);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            int current = Character.getNumericValue(string.charAt(i));
            int decimal = current * (int) Math.pow(10, (string.length() - i - 1));

            if (symbols.get(decimal) != null) {
                result.append(symbols.get(decimal));
            } else {
                Set<Integer> keys = symbols.keySet();

                int sum = decimal;
                while (sum > 0) {
                    for (Integer key : keys) {
                        if (sum >= key) {
                            result.append(symbols.get(key));
                            sum -= key;
                            break;
                        }
                    }
                }
            }
        }

        return result.toString();
    }
}
