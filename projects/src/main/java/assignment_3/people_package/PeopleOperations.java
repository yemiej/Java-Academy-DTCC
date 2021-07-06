package assignment_3.people_package;

//import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PeopleOperations {
    public static void main (String args []) {
        /*
            Please ensure that you create an ArrayList of Person(s) with at least
            4 members
         */


        ArrayList<Person> theListOfPersons = new ArrayList<Person>();

        //List<Person> people =new ArrayList<>(0);
        Person p1 = new Person("Tunji",12);
        Person p2 = new Person("James",34);
        Person p3 = new Person("John",17);
        Person p4 = new Person("Elda",34);
        Person p5 = new Person("Saif",50);
        theListOfPersons.add(p1);
        theListOfPersons.add(p2);
        theListOfPersons.add(p3);
        theListOfPersons.add(p4);
        theListOfPersons.add(p5);

       /* for(Person p : people) {
            System.out.println(p);
        }
       */

        ArrayList<Person> people = theListOfPersons;

        Person youngestPerson = getYoungestPerson(people);
        System.out.println("\n Youngest Person is "+ youngestPerson.getName() + "\n Details|" + youngestPerson);

        Person oldestPerson = getOldestPerson(people);
        System.out.println("\n Oldest Person  is " + oldestPerson.getName() + "\n Details|" + oldestPerson);
        ArrayList<Person> sortedByAgeList = getSortedListByAge(people);
        ArrayList<Person> sortedByNameList = getSortedListByName(people, false);


        /*
            For the below to work where you can see what you've done, you must have
            done the section 1 recap portion where you override the toString() method of the
            Person class!
         */

        System.out.println("List Sorted By Age");
        System.out.println("******************");
        for(Person p : sortedByAgeList) {
            System.out.println(p);
        }

        System.out.println("\nList Sorted By Name ");
        System.out.println("**********************");
        for(Person p : sortedByNameList) {
            System.out.println(p);
        }
    }

    public static Person getYoungestPerson(ArrayList<Person> list) {
        return getSortedListByAge(list).get(0);
    }

    public static Person getOldestPerson(ArrayList<Person> list)   {
        return getSortedListByAge(list).get(list.size()-1);
    }

    public static ArrayList<Person> getSortedListByAge(ArrayList<Person> list)  {
        int lstSize = list.size();
        Person tempPerson = null;
        for(int i=0; i < lstSize; i++){
            for(int j=0; j < lstSize; j++){
                if(list.get(i).getAge() < list.get(j).getAge()){
                    tempPerson =  list.get(i) ;
                    list.set(i, list.get(j));
                    list.set(j, tempPerson);
                }
            }
        }
        return list;
    }

    public static ArrayList<Person> getSortedListByName(ArrayList<Person> list, boolean isAscending) {
        int lstSize = list.size();
        Person tempPerson ;
        for(int i=0; i < lstSize; i++){
            for(int j=0; j < lstSize; j++){
                int compare = list.get(j).getName().compareTo(list.get(i).getName());
                if(compare < 0 && isAscending){
                    tempPerson =  list.get(i) ;
                    list.set(i, list.get(j));
                    list.set(j, tempPerson);
                }
                else{
                    tempPerson =  list.get(j) ;
                    list.set(j, list.get(i));
                    list.set(i, tempPerson);
                }
            }
        }
        return list;
    }




   /* public static Person getYoungestPerson(ArrayList<Person> list) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Please implement this method");
    }

    public static Person getOldestPerson(ArrayList<Person> list) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Please implement this method");
    }

    public static ArrayList<Person> getSortedListByAge(ArrayList<Person> list) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Please implement this method");
    }

    public static ArrayList<Person> getSortedListByName(ArrayList<Person> list, boolean isAscending) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Please implement this method");
    }*/


}
