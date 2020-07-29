import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class LargestSeriesProductCalculator {

    private String inputNumber;

    LargestSeriesProductCalculator(String inputNumber) {
        Pattern pattern = Pattern.compile("^[0-9]+");
        Matcher isNum = pattern.matcher(inputNumber);
        if (!isNum.matches() && inputNumber.length() > 0) {
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
        this.inputNumber = inputNumber;
//        throw new UnsupportedOperationException ("Delete this statement and write your own implementation.");
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }
        if (numberOfDigits > inputNumber.length()) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
        List<String> stringList = new LinkedList<>();
        long result = 0L;
        for (int i = 0; i < inputNumber.length() - numberOfDigits + 1; i++) {
            String s = inputNumber.substring(i, i + numberOfDigits);
            stringList.add(s);
            long num = 1;
            char[] chars = s.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                num = num * Long.parseLong(String.valueOf(chars[j]));
            }
            if (num > result) {
                result = num;
            }
        }
        return result;
//        throw new UnsupportedOperationException ("Delete this statement and write your own implementation.");
    }
}
