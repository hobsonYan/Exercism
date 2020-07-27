import java.util.Arrays;

class ReverseString {

    String reverse(String inputString) {
        char[] chars = inputString.toCharArray();
        if (chars.length == 0) {
            return inputString;
        }
        char[] ch = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ch[chars.length - 1 - i] = chars[i];
        }
        StringBuilder outputString = new StringBuilder();
        for (int i = 0; i< ch.length; i++) {
            outputString.append(ch[i]);
        }
        return outputString.toString();
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
  
}
