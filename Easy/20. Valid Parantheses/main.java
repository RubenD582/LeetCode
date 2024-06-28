public class main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println(isValid("{}()"));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
    
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            char expectedChar;
    
            switch (currentChar) {
                case '(':
                    sb.append(')');
                    break;
                case '{':
                    sb.append('}');
                    break;
                case '[':
                    sb.append(']');
                    break;
                default:
                    

                if (sb.length() == 0) {
                    return false;
                }

                expectedChar = sb.charAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
                
                if (currentChar != expectedChar) {
                    return false;
                }
            } 
        }
    
        return sb.length() == 0;
    }
    
}