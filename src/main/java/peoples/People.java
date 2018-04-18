package peoples;

import java.util.ArrayList;

public class People {

    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findByID(long iD) {
        Person personThing = null;
        for (Person p : personList) {
            if (iD == personThing.getiD()) {
                personThing = p;
            }
        }

        return personThing;
    }

    public void remove(Person person){
        personList.remove(person);
    }


    public void removeById(long iD){
        for(Person p : personList){
            if (iD == p.getiD()){
                personList.remove(p);
            }
        }
    }

    public int getCount(){
        return personList.size();
    }

}