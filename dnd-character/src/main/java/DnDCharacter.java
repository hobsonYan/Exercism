import java.util.ArrayList;
import java.util.List;

class DnDCharacter {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

    public DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
        this.hitpoints = this.modifier(this.getConstitution()) + 10;
    }

    int ability() {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int num = (int) (Math.random() * 6) + 1;
            integers.add(num);
        }
        int min = 0;
        int sum = 0;
        for (int i = 0; i < integers.size(); i ++) {
            if (integers.get(i) < integers.get(min)) {
                min = i;
            }
        }
        for (int j = 0; j < integers.size(); j ++ ) {
            if (j != min) {
                sum += integers.get(j);
            }
        }
        return sum;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int modifier(int input) {
        int result = input - 10;
        return Math.floorDiv(result, 2);
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getStrength() {
        return this.strength;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getDexterity() {
        return this.dexterity;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getConstitution() {
        return this.constitution;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getIntelligence() {
        return this.intelligence;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getWisdom() {
        return this.wisdom;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getCharisma() {
        return this.charisma;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getHitpoints() {
        return this.hitpoints;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
