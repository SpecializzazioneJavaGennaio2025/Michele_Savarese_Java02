
public class Person {

    public String name;
    public String surname;
    private int age;

    public Person() {
    }

    public Person(String name, String surname, int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    public int  getAge() {
        return age;
    }


//!Metodi
    public void introduceYourSelf() {
        System.out.println(this.name + " " + this.surname + ", " + this.age + " anni.");
    }



//! this non obbligatorio in java
}
