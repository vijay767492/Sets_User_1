public class Person{
// prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
int a;
int b;
String names;
public int getA() {
    return a;
}
public void setA(int a) {
    this.a = a;
}
public int getB() {
    return b;
}
public void setB(int b) {
    this.b = b;
}
public String getNames() {
    return names;
}
public void setNames(String names) {
    this.names = names;
}
public Person(int a, int b, String names) {
    this.a = a;
    this.b = b;
    this.names = names;
}
public Person() {
}
@Override
public String toString() {
    return "Person [a=" + a + ", b=" + b + ", names=" + names + "]";
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + a;
    result = prime * result + b;
    result = prime * result + ((names == null) ? 0 : names.hashCode());
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Person other = (Person) obj;
    if (a != other.a)
        return false;
    if (b != other.b)
        return false;
    if (names == null) {
        if (other.names != null)
            return false;
    } else if (!names.equals(other.names))
        return false;
    return true;
}
}
