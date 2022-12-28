import java.util.*;

class Shape{
    protected Double area;

    public void computeArea(){
        this.area=0.0;
    }
}
class Circle extends Shape{
    private Double radius;
    public Circle(Double radius){
        this.radius=radius;
    }
    public void computeArea(){
        this.area=3.14*(this.radius)*(this.radius);
    }
}
class Rectangle extends Shape{
    private Double length;
    private Double breadth;

    public Rectangle(Double length,Double breadth){
        this.length=length;
        this.breadth=breadth;
    }   
    public void computeArea(){
        this.area=this.length*this.breadth;
    }
}
class Triangle extends Shape{
    private Double base;
    private Double height;

    public Triangle(Double base,Double height){
        this.base=base;
        this.height=height;
    }
    public void computeArea(){
        this.area=0.5*this.base*this.height;
    }
}

// Path: Main.java
public class shapeArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int shapeOption=sc.nextInt();

        if(shapeOption==1){
            Double radius=sc.nextDouble();
            Circle c=new Circle(radius);
            c.computeArea();
            System.out.printf("%.2f",c.area);
        }
        else if(shapeOption==2){
            Double length=sc.nextDouble();
            Double breadth=sc.nextDouble();
            Rectangle r=new Rectangle(length,breadth);
            r.computeArea();
            System.out.printf("%.2f",r.area);
        }
        else if(shapeOption==3){
            Double base=sc.nextDouble();
            Double height=sc.nextDouble();
            Triangle t=new Triangle(base,height);
            t.computeArea();
            System.out.printf("%.2f",t.area);
        }
        else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }

}
