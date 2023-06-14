package TestWork_Java;

public class Croco implements Comparable<Croco> {
    Integer id;

    public Integer getId() {
        return id;
    }

    String name;

    public String getName() {
        return name;
    }

    Integer weight;

    public Integer getWeight() {
        return weight;
    }

    public Croco(Integer id, String name, Integer weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return String.format("Toy  %d - id - %s - name - %d - weight", id, name, weight);
    }

    @Override
    public int compareTo(Croco other) {
        /*
         * TODO Auto-generated method stub
         * throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
         */
        if (other == null) {
            return -1; // this < other
        }
        int delta = this.weight - other.weight;
        if (delta != 0) {
            return -delta;
        }
        return this.name.compareTo(other.name);
    }

}
