
class Acronym {

    private String acronym;

    Acronym(String phrase) {
        String[] words = phrase.split(" ");
        acronym = "";
        for (String word : words) {
            String[] w = word.split("[ ,_-]+");
            for (String i : w) {
                if (i.length() > 0) {
                    acronym += i.toUpperCase().charAt(0);
                }
            }
        }
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String get() {
        return acronym;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
