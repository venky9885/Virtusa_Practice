package java_notes;

//hierarical inheritance
// all classes are related to each other by animal
class Animal {
    Animal() {
        System.out.println("Animal is created");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog is created");
    }
}

class puppy extends Dog {
    puppy() {
        System.out.println("puppy is created");
    }
}

public class InheritanceTwo {
    public static void main(String[] args) {
        puppy p = new puppy();

    }
}
