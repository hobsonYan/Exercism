
public class Twofer {
    public String twofer(String name) {

        if (name != null && !"".equals(name)) {
            return "One for " + name + ", one for me.";
        }
        if ("".equals(name)){
            return "One for , one for me.";
        }
        return "One for you, one for me.";

//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
