package OOPjava.HW3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Family<T extends Person> implements Iterable<T> {
    String lastName;
    List<T> famMembers = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return famMembers.iterator(); // не поняла смысл, без него все также работает
    }

    public Family(String lastName) {
        this.lastName = lastName;
    }
 
    public String getLastName() {
        return lastName;
    }

    public Family<T> addMember(T member) {
        famMembers.add(member);
        return this;
    }

    @Override
    public String toString() {
        return "Family members " + this.lastName + ": " + famMembers;
    }

}
