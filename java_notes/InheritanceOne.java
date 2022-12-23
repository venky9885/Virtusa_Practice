package java_notes;

class Person {
    String name;
    int age;

    public void introd() {
        System.out.println("Default Constructor");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class Another extends Person {
    String genre;

    /**
     * @param name
     * @param age
     * @param genre
     */
    public Another(String name, int age, String genre) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.genre = genre;

        // Person p = new Person(name, age);

    }

    public void playMusic() {
        System.out.println(name + "Playing Music" + genre);
    }
}

public class InheritanceOne {

    public static void main(String[] args) {

        Another a = new Another("vgh", 20, "rock");
        a.introd();
        a.playMusic();

    }
}
