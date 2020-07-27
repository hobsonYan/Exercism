class Proverb {

    String[] words;

    Proverb(String[] words) {
        this.words = words;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String recite() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            result.append("For want of a ").append(words[i]).append(" the ").append(words[i + 1]).append(" was lost.\n");
        }
        if (words.length > 0) {
            result.append("And all for the want of a ").append(words[0]).append(".");
        }
        return result.toString();
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
