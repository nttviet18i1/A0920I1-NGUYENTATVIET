package _00_review;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    List<Person> personList;

    public PersonManager(List<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person){
        personList.add(person);
    }


    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void updatePerson(Person person) {
        int index = personList.indexOf(person);
        if(index == -1){
            // nếu không ton tai thi coi nhu la tao moi
            addPerson(person);
        } else {
            this.personList.set(index, person);
        }
    }

    public void remove(Person person){
        int index = personList.indexOf(person);
        if(index == -1){
            System.out.println(person.getName() + " is not exist.");
            return;
        } else {
            this.personList.remove(index);
        }
    }

    public void remove(int index){
        if(index <0 || index >= this.personList.size()){
            System.out.println("index not correct!");
            return;
        } else {
            this.personList.remove(index);
        }
    }

    public List<Person> search(String name){
//        int index = personList.indexOf(new Person(name, 0));
        List<Person> resultList = new ArrayList<>();
        for (Person person: personList) {
            if(person.getName().equals(name)){
                resultList.add(person);
            }
        }
        return resultList;
    }

    public List<Person> searchContaining(String name){
        List<Person> resultList = new ArrayList<>();
        for (Person person: personList) {
            if(person.getName().contains(name)){
                resultList.add(person);
            }
        }
        return resultList;
    }
}
