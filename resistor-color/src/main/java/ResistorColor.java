
class ResistorColor {
    int colorCode(String color) {
        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        for (int i = 0; i < colors.length; i ++ ){
            if (color.equals(colors[i])) {
                return i;
            }
        }
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String[] colors() {
        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return colors;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
