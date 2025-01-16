
public class App {

    // public static void main(String[] args) throws Exception {
    //     // System.out.println("Hello, World!");
    //     info("Alessandro", "Scaccia");
    //     info("Piero", "Nicodemo");
    // }
    // public static void info() {
    //     String name = "Jotaro";
    //     String surname = "Kujo";
    //     System.out.println(name + " " + surname);
    // }
    // public static void info() {
    //     String name1 = "Nicoletta";
    //     String surname1 = "Barbambella";
    //     System.out.println(name1 + " " + surname1);
    // }
    // public static void info(String name, String surname) {
    //     System.out.println("\n Hello ma babi " + name + " " + surname);
    // }
    public static void main(String[] args) throws Exception {
        // System.out.println();
        Person p = new Person("Maccaroni","Chees",63);
//! Tramite la dot notation possiamo entrare all'interno di un oggetto.



        p.introduceYourSelf();

        // System.out.println(p);
    }



}