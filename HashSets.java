import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class HashSets{
public static void main(String[]args){
  
  // Prepare Hashset object here and add person class objects in them iterate it by using for each

    HashSet<Person> h=new HashSet<>();
    h.add(new Person(1,4,"vijay"));
    h.add(new Person(2,4,"dinesh"));
    h.add(new Person(1,4,"vijay"));
    h.add(new Person(4,4,"dinesh"));
    for (Person integer : h) {
       System.out.println(integer);
}
}

}
