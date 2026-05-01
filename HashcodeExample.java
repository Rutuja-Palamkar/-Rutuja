import java.util.HashSet;
import java.util.Objects;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return id == s.id && Objects.equals(name, s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class Main {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(101, "Bob");
        Student s2 = new Student(101, "Bob");

        set.add(s1);
        set.add(s2);

        System.out.println("Set size: " + set.size()); // Output: 1
    }
}
