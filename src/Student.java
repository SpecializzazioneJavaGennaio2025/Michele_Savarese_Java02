public class Student extends Person{
public int vote;

public Student(String name, String surname, int age, int vote){

super(name, surname, age);
this.vote=vote;


}


//!overraide
@Override
public void introduceYourSelf(){
    System.out.println("Ciao sono" + name +" " + surname + " e ho " + getAge() + " anni. Ma soprattutto io porto " + vote + " voti al sindaco per avere il posto fisso.");
}

}
