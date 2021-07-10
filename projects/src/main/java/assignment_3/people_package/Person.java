package assignment_3.people_package;
/*
    This is the class you need to work on
    If you were to create a class from scratch, please remember that the name of the class should match
    the name of the file the class resides in. (this is more of a convention thing)

    Reference:
    1) https://stackoverflow.com/questions/1841847/can-i-compile-a-java-file-with-a-different-name-than-the-class
 */

import java.util.concurrent.ThreadLocalRandom;

public class Person {

    private  String name;
    private  int age;
    private  int id;

    public Person(String name, int age) {
        this.id = ThreadLocalRandom.current().nextInt(0, 1000 + 1);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  " ID  : " + id + "\n" +
                " Name: " + name + "\n" +
                " Age : " + age  + "\n" +
                "***************" ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 63 + name.hashCode() + id;
    }

    //Comparator -> future use
    //Comparator<Person> nameComparator = (person1, person2) -> person1.getName().compareTo(person2.getName());
    //Comparator<Person> ageComparator = (person1, person2) -> (int) (person1.getAge() - person2.getAge());
}
