public class Main {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int index = 0;
        String output = "";
        for (int i = 0; i < numRows; i++) {
            index = 2 * (numRows - 1);
            for (int j = i; j < s.length(); j += index) {
                output += s.charAt(j);

                if (i > 0 && i < numRows - 1 && j + index - 2 * i < s.length()) {
                    output += s.charAt(j + index - 2 * i);
                }
            }
        }

        return output;
    }
}