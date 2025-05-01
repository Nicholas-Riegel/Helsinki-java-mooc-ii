//Employees. Employees -object contains a list of Person -objects. The class has a constructor which takes no parameters, and the following methods:

// NB: The print method of the Employees class must be implemented using an iterator!

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    
    private List<Person> employees;

    public Employees(){
        this.employees = new ArrayList<>();
    }

    // adds the given person to the employees list
    public void add(Person personToAdd){
        employees.add(personToAdd);
    } 

    // adds the given list of people to the employees list
    public void add(List<Person> peopleToAdd){
        for (Person p : peopleToAdd){
            employees.add(p);
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education){
                iterator.remove();
            }
        }
    }

    // prints all employees
    public void print(){
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    // prints the employees whose education matches the education given as a parameter.
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education){
                System.out.println(person);
            }
        }
    } 
    
}
