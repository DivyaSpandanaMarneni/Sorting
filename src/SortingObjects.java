/**
 * Created by marne on 1/25/2017.
 */
class Person{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName,String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayPerson(){
        System.out.println("Last Name: "+lastName+", First Name: "+firstName+", age: "+age);
    }

    public String getLastName(){
        return lastName;
    }
}//end of Person class

class ObjectsArray{
    private Person[] persons;
    private int numPersons;

    public ObjectsArray(int max){
        this.numPersons = 0;
        persons = new Person[max];
    }

    public void insertPerson(String firstName, String lastName, int age){
        persons[numPersons] = new Person(firstName,lastName,age);
        numPersons++;
    }

    public void display(){
        for(int i=0;i<numPersons;i++){
            persons[i].displayPerson();
        }

        System.out.println();
    }

    public Person[] insertionSort(){

        int in,out;
        for(out =1;out<numPersons;out++){
            Person temp = persons[out];
            in=out;

            while ((in>0) && (persons[in-1].getLastName().compareTo(temp.getLastName())>0)){
                persons[in] = persons[in-1];
                in--;
            }//end of while loop
            persons[in] = temp;
        }//end of for loop

        return persons;
    }
}

public class SortingObjects {

    public static void main(String[] args){

        int maxSize = 100;
        ObjectsArray objectsArray = new ObjectsArray(maxSize);
        objectsArray.insertPerson("James","Janet",25);
        objectsArray.insertPerson("Chandana","Cliff",22);
        objectsArray.insertPerson("Julia","Roberts",30);
        objectsArray.insertPerson("Jennifer","Aniston",40);
        objectsArray.insertPerson("Gen","Gilbert",60);
        
        Person[] result = objectsArray.insertionSort();

        objectsArray.display();

    }
}
