package Java8features;

import java.util.*;

//this is the exerisze ;
public class d_basic_Lambda_exersize {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );
//java 7 to sort by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLname().compareTo(o2.getLname());
            }
        });
//java 8 to reverse sort by last name in labda
        Collections.sort(people,(o1,o2)-> o2.getLname().compareTo(o1.getLname()));
        //print all list
        printAll(people);


//print name start with c -




    }

    private static void printAll(List<Person> personList) {
        for (Person p : personList) {
            System.out.println(p);
        }
    }


}


class Person {
    String fname;
    String lname;
    int num;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Person(String fname, String lname, int num) {
        this.fname = fname;
        this.lname = lname;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", num=" + num +
                '}';
    }
}