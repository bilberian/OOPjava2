package OOPjava.HW3;

public class Person implements GeoTree {
    private int id;
    protected String name;
    protected int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {
        this(0, "unknown name", 0);
    }

    public String getInfo() {
        return String.format("%s(ID %d)", this.name, this.id);
    }

    @Override
    public void relatesTo(Relationship.Bond bond, Person whom) {
        System.out.println(this.getInfo() + " is a " + bond + " to " + whom.getInfo());
    }

    public boolean isMember(Family<Person> name) {
        for (Person pers : name) {
            if (this.equals(pers)) {
                System.out.println(this.getInfo() + " belongs to " + name.getLastName());
                return true;
            }
        }
        return false;
    }
}
