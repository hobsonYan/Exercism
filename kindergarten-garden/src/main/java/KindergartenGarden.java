import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class KindergartenGarden {

    private String[] integerList;

    private final static Map<String, Object> MAP = new HashMap<>();
    static {
        MAP.put("Alice", 1);
        MAP.put("Bob", 2);
        MAP.put("Charlie", 3);
        MAP.put("David", 4);
        MAP.put("Eve", 5);
        MAP.put("Fred", 6);
        MAP.put("Ginny", 7);
        MAP.put("Harriet", 8);
        MAP.put("Ileana", 9);
        MAP.put("Joseph", 10);
        MAP.put("Kincaid", 11);
        MAP.put("Larry", 12);
    }

    KindergartenGarden(String garden) {
        this.integerList = garden.split("\n");
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    List<Plant> getPlantsOfStudent(String student) {
        int index = (int) MAP.get(student);
        List<Plant> plantList = new LinkedList<>();
        int i = (index - 1) * 2;
        plantList.add(Plant.getPlant(integerList[0].charAt(i)));
        plantList.add(Plant.getPlant(integerList[0].charAt(i + 1)));
        plantList.add(Plant.getPlant(integerList[1].charAt(i)));
        plantList.add(Plant.getPlant(integerList[1].charAt(i + 1)));
        return plantList;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
