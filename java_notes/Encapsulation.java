package java_notes;

class Employ {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Employ emp = new Employ();
        emp.setId(1);
        emp.setName("John");
        emp.setAge(25);
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
    }
}
