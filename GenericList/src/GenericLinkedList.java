/**
 * Created by pdomok01 on 11/01/2016.
 */
public class GenericLinkedList {
    Object obj
    <T>;

    public void insert(Person person) {
        if (personListStart == null) {
            personListStart = person;
            System.out.println(person.getName() + " has joined the queue in position 1.");
        } else {
            personListStart.addPerson(person);
        }
    }

    public Person retrieve() {
        if (personListStart == null) {
            System.out.println("There are no people in the queue.");
            return null;
        } else {
            Person personLeaving = personListStart;
            personListStart = personListStart.getNext();
            System.out.println(personLeaving.getName() + " has left the queue.");
            return personLeaving;
        }
    }

    public String toString() {
        if (personListStart == null) {
            return "The queue is empty.";
        } else {
            return personListStart.getQueueNames();
        }
    }
}
