/**
 * Clasa Persoana
 */
public class Person {
    String name; // attribute or instance variable
    int age = 0;

    //constructor implicit
    public Person() {
        this.age = 0;
        this.name = "no name";
        System.out.println("Constructorul implicit a fost apelat");
    }

    public Person(String name) {
        System.out.println("Contructor explicit cu 1 parametru a fost apelat");
        this.name = name;
        displayHello();
    }

    public void displayHello() {
        System.out.println("Hello dear " + this.name);
    }

    //metode
}