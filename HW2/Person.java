package OOPjava.HW2;

public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("unknown name", 0);
    }

    public String getInfo() {
        return String.format("Name: %s, age: %d", this.name, this.age);
    }
}
