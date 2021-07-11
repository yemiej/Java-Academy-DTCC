package assignment_3.people_package;

import java.util.*;
import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

public class PeopleOperations {
    private static String STAR_UNDERLINE ="*************************";

    public static void main (String args []) {
        /* Please ensure that you create an ArrayList of Person(s) with at least 4 members    */

        ArrayList<Person> people =new ArrayList<>();
        people.add(new Person("Tunji"));
        people.add(new Person("Saif"));
        people.add(new Person("John"));
        people.add(new Person("Elda"));
        people.add(new Person("Saif"));
        people.add(new Person("John"));

        // Cloning the arraylist of people
        ArrayList<Person> people1 = new ArrayList<Person>(people);
        // display the original list
        displayOriginalList(people);

        Person youngestPerson = getYoungestPerson(people);
        System.out.println("\n Youngest Person is "+ youngestPerson.getName() + "\n Details|" + youngestPerson);
        Person oldestPerson = getOldestPerson(people);
        System.out.println("\n Oldest Person is " + oldestPerson.getName() + "\n Details|" + oldestPerson );
        ArrayList<Person> sortedByAgeList = getSortedListByAge(people1); //sort by reference issue
        ArrayList<Person> sortedByNameList = getSortedListByName(people, false);
        double averageAge = findAverageAge(people);

        /*
            For the below to work where you can see what you've done, you must have
            done the section 1 recap portion where you override the toString() method of the Person class!
         */

        System.out.println("\n  List Sorted By Age");
        System.out.println(STAR_UNDERLINE);
        for(Person p : sortedByAgeList) {
            System.out.println(p);
        }

        System.out.println("\n  List Sorted By Name ");
        System.out.println(STAR_UNDERLINE);
        for(Person p : sortedByNameList) {
            System.out.println(p);
        }

        System.out.println("\nAverage Age of people in the List " + String.format("%.2f",averageAge));
    }

    public static Person getYoungestPerson(ArrayList<Person> list) {
        return getSortedListByAgeBySwapping(list).get(0);
    }

    public static Person getOldestPerson(ArrayList<Person> list)   {
        return getSortedListByAgeBySwapping(list).get(list.size()-1);
    }

    public static ArrayList<Person> getSortedListByAgeBySwapping(ArrayList<Person> list)  {
        int lstSize = list.size();
        Person tempPerson;
        for(int i=0; i < lstSize; i++){
            for(int j=0; j < lstSize; j++){
                if(list.get(i).getAge() < list.get(j).getAge()){
                    tempPerson =  list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tempPerson);
                }
            }
        }
      return list;
    }

    public static ArrayList<Person> getSortedListByAge(ArrayList<Person> list)  {
        list.sort(comparingInt(Person::getAge));
     return list;
    }

    public static ArrayList<Person> getSortedListByName(ArrayList<Person> list, boolean isAscending) {
        list.sort(comparing(Person::getName));
        if(!isAscending) {
            Collections.reverse(list);
        }
     return list;
    }

    private static void displayOriginalList(List<Person> personList){
        System.out.println(String.format("%2s %4s %-11s %3s", "S/No", " Id", " Name", "Age"));
        System.out.println(STAR_UNDERLINE);
        int sNo=0;
        for(Person person : personList){
            System.out.println(String.format("%2d. %6s %-10s %3s", ++sNo, person.getId(), person.getName(), person.getAge()));
        }
        System.out.println(STAR_UNDERLINE);
    }

    public static double findAverageAge(List<Person> list) {
        double noOfPersonsInList = list.size();
        double sumOfAge=0;
        for(Person person : list){
            sumOfAge = sumOfAge + person.getAge();
        }
      return sumOfAge / noOfPersonsInList ;
    }
}