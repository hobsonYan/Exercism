class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String num = String.valueOf(numberToCheck);
        char[] chars = num.toCharArray();
        int length = chars.length;
        double result = 0;
        for (int i = 0; i< length; i++) {
            result = result + Math.pow(Integer.parseInt(String.valueOf(chars[i])), length);
        }
        return result == numberToCheck;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

    }

}
