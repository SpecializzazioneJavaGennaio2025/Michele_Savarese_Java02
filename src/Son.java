
    public class Son extends Person{
        public String hobby;

        public Son(String name, String surname, int age, String hobby){

        super(name, surname, age);
        this.hobby=hobby;


        }


        //!overraide
        @Override
        public void introduceYourSelf(){
            System.out.println("Ciao sono" + name +" " + surname + " e ho " + getAge() + " anni. Ma soprattutto mi piace tanto " + hobby);
        }

        }
