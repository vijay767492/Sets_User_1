import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSets {
    public static void main(String[] args) {
        // Create LinkedHashSet and add Person objects
        LinkedHashSet<Person> h = new LinkedHashSet<>();
        h.add(new Person(1, 4, "vijay"));
        h.add(new Person(2, 4, "dinesh"));
        h.add(new Person(1, 4, "vijay")); // Duplicate, won't be added
        h.add(new Person(4, 4, "dinesh")); // Duplicate, won't be added

        // Get an iterator for the LinkedHashSet
        Iterator<Person> iterator = h.iterator();

        // Iterate using a while loop and the iterator
        while (iterator.hasNext()) {
            Person p = iterator.next();
            System.out.println(p);
        }
    }
}
