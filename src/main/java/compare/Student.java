package compare;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String name;
    private final String sureName;
    private final int age;

    public Student(String name, String sureName, int age) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(sureName, student.sureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sureName, age);
    }

    /**
     * Override method compareTo of interface Comparable
     *
     * @param otherObj the object to be compared with this.
     * @return negative int if this comes before otherObj alphabetically,
     * returns positive int if this comes after otherObj alphabetically
     * and returns 0 if this and otherObj is equals
     */
    @Override
    public int compareTo(Student otherObj) {
        int compareName = this.name.compareTo(otherObj.name);
        if (compareName != 0) {
            return compareName;
        }

        int compareSureName = this.sureName.compareTo(otherObj.sureName);
        if (compareSureName != 0) {
            return compareSureName;
        }

        return Integer.compare(this.age, otherObj.age);
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", "Wick", 27);
        Student student2 = new Student("Jack", "Williams", 67);

        System.out.println(student1.compareTo(student2));
        System.out.println(student1.equals(student2));
    }
}

