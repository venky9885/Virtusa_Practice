package java_notes;

//public,-accssible to all classes

//private,-only accessible to the class
class Priv {
    private void msg() {
        System.out.println("Hello java");
    }

    public static void main(String[] args) {
        Priv obj = new Priv();
        obj.msg();
    }
}
// protected,-only accessible to the class and its subclasses
// static,-only one copy of the method is created and shared by all objects
// default,-only accessible to the package

public class Methods {
    int a;
    String s;

    // Non parameterized constructor
    // Methods() {
    // System.out.println("Default Constructor");
    // }
    // Parameterized constructor
    Methods(int a, String s) {
        this.a = a;
        this.s = s;
    }

    public static void main(String[] args) {
        Methods m = new Methods(10, "vgh");
        System.out.println(m.a);
        System.out.println(m.s);
    }
}
