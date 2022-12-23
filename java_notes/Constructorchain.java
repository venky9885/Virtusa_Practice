package java_notes;

public class Constructorchain {
    Constructorchain() {
        this(100);
        System.out.println("The Default Constructor");
    }

    Constructorchain(int a) {
        this(100, "vgh");
        System.out.println(a + "1 parametrized");
    }

    Constructorchain(int a, String s) {
        System.out.println(a + " " + s + "2 parametrized");
    }

    public static void main(String[] args) {
        Constructorchain c = new Constructorchain();

    }

}
