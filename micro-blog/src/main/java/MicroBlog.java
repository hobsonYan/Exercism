class MicroBlog {

    public String truncate(String input) {

        int count = input.codePointCount(0, input.length());
        return input.substring(0, input.offsetByCodePoints(0, Math.min(count, 5)));
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
