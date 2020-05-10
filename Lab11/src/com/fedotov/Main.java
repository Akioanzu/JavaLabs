package com.fedotov;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {


       public static void main(String[] args) {
           Comparator<Person> Agecomp = new PersonAgeComparator();
           Comparator<Person> Surcomp = new PersonSurnameComparator();
           Comparator<Person> Nacomp = new PersonNameComparator();
           ArrayList<Person> people = new ArrayList<Person>();
           people.add(new Person("Pankova","Marina", 19));
           people.add(new Person("Hlopin","Sergey",45));
           people.add(new Person("Katkov","Vladimir",36));
           people.add(new Person("Stronova","Anastasiya",15));

           System.out.println("----------Not sorted----------");
           printArray(people);
           System.out.println("----------Age----------");
           people.sort(Agecomp);
           printArray(people);
           System.out.println("----------Surname----------");
           people.sort(Surcomp);
           printArray(people);
           System.out.println("----------Name----------");
           people.sort(Nacomp);
           printArray(people);

    }
 public static void printArray(ArrayList<Person> List) {

     for(Person  p : List){

         System.out.println(p.getSurname()+ " " +p.getName() + " " + p.getAge());
     }

 }
}
class Person{
    private String surname;
    private String name;
    private int age;
    public Person(String s,String n, int a){
        surname=s;
        name=n;
        age=a;
    }
    String getSurname(){return surname;}
    String getName(){return name;}
    int getAge(){return age;}
}

class PersonSurnameComparator implements Comparator<Person> {

    public int compare(Person a, Person b){

        return a.getSurname().compareTo(b.getSurname());
    }
}

class PersonNameComparator implements Comparator<Person> {

    public int compare(Person a, Person b){

        return a.getName().compareTo(b.getName());
    }
}
class PersonAgeComparator implements Comparator<Person>{

    public int compare(Person a, Person b){

        if(a.getAge()> b.getAge())
            return 1;
        else if(a.getAge()< b.getAge())
            return -1;
        else
            return 0;
    }
}