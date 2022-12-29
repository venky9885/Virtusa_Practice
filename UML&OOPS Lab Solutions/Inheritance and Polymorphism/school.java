import java.util.*;

class Person{
    String name;
    int year;
    
    public Person(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String toString(){
        return ("Name : " + this.name + "\nBirthYear : " + this.year);
    }
}

class Staff extends Person{
    public float salary;
    
    public Staff(String name, int year, float salary){
        super(name, year);
        this.salary = salary;
    }

    @Override
    public String toString(){
        return (super.toString() + "\nOld Salary : " + this.salary);
    }
}

class Student extends Person{
    String department,name;
    float attendance;
    int year;

    public Student(String name, int year, String department, float attendance){
        super(name, year);
        this.department = department;
        this.attendance = attendance;
    }
    String Eligible ="No";
    void calculate(){
        if(this.attendance >= 75){
            Eligible = "Yes";
        }
    }
    @Override
    public String toString(){
        return (super.toString() + "\nDepartment : " + this.department + "\nEligible : " + this.Eligible);
    }
}

class TeachingStaff extends Staff{
    String subject;
    float result;
    float newSalary;
    public TeachingStaff(String name, int year, float salary, String subject, float result){
        super(name, year, salary);
        this.result = result;
        this.subject = subject;
    }

    void calculateSalary(){
        float increment = (float)((result*0.1)*(salary/100));
        newSalary = salary + increment;
    }

    @Override
    public String toString(){
        return (super.toString() + "\nSubject : " + this.subject + "\nNew Salary : " + this.newSalary);
    }
}

class NonTeachingStaff extends Staff{
    float newSalary;
    String lab;
    int experience;

    public NonTeachingStaff(String name, int year, float salary, String lab, int experience){
        super(name, year, salary);
        this.lab = lab;
        this.experience = experience;
    }
    void calculateSalary(){
        float increment = (float)(experience*salary/100);
        newSalary = salary + increment;
    }

    public String toString(){
        return (super.toString() + "\nLab : " + this.lab + "\nNew Salary : " + this.newSalary);
    }
}

public class school {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int personCode = sc.nextInt();
        String name = sc.next();
        int year = sc.nextInt();
        
        if(personCode==1){
            String department = sc.next();
            float attendance = sc.nextFloat();
            Student s = new Student(name, year, department, attendance);
            s.calculate();
            System.out.println(s.toString());
        }
        else if(personCode==2){
            String subject = sc.next();
            float result = sc.nextFloat();
            float salary = sc.nextFloat();
            TeachingStaff t = new TeachingStaff(name, year, salary, subject, result);
            t.calculateSalary();
            System.out.println(t.toString());
        }
        else if(personCode==3){
            sc.nextLine();
            String lab = sc.nextLine();
            int experience = sc.nextInt();
            float salary = sc.nextFloat();
            NonTeachingStaff n = new NonTeachingStaff(name, year, salary, lab, experience);
            n.calculateSalary();
            System.out.println(n.toString());
        }
        else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
/*
 * Sample Input 1:
 * 1
 * Kumar
 * 1986
 * MCA
 * 85
 */
/*
 * Sample Input 2:
 * 2
 * Vikram
 * 1980
 * Maths
 * 90
 * 50000
 */
/*
* Sample Input 3:
* 3
* Arun
* 1984
* DS LAB    
* 3
* 15000
*/