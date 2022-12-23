///!classess= in java
//tostring() is a method of object class
//hashCode() is a method of object class
//equals() is a method of object class
//getClass() is a method of object class
//finalize() is a method of object class
//clone() is a method of object class
//wait,notify(),notifyall() is a method of object class

package java_notes;

/**
 * HashCodes
 */
import java.util.Date;

class Student {
    static int last_roll = 100;
    int roll_num;

    Student() {
        roll_num = last_roll;
    }

    public int hashCode() {
        return roll_num;
    }

}

public class ObjectClass {

    public static void main(String[] args) {

        // Hashcode

        Student h1 = new Student();
        System.out.println(h1);
        System.out.println(h1.toString());
        // get class
        Object obj = new String("abc");
        Class c = obj.getClass();
        System.out.println(c.getName());
        // finalize
        ObjectClass h = new ObjectClass();
        System.out.println(h.hashCode());

        h = null;
        System.gc();
        System.out.println("end");
        // clone
        Date d = new Date();
        System.out.println(d.toString());
        Date d1 = (Date) d.clone();
        System.out.println(d1.toString());

    }

    protected void finalize() {
        System.out.println("finalize method called");
    }
}
