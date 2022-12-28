public class OverloadedMain {
    
    public static void main(String s1){
        System.out.println("Overloaded: "+s1);
    }

    public static void main(String s1, String s2){
        System.out.println("Overloaded: "+s1+" & "+s2);
    }

    public static void main(String[] args) {
        System.out.println("Hi");
        main("Hello World");
        main("Tom", "Jerry");
    }
}
