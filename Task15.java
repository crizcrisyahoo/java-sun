//TASK 15
// calculateArea(): double (Math.PI * radius * radius;)
// calculatePerimeter(); double (  2 * Math.PI * radius;)

import java.lang.Math;

public class Task15 {
    public static void main(String[] args) {
        Circle c = new Circle("blue",2);
        System.out.println(c.calculateArea());
        System.out.println(c.calculatePerimeter());
        
        Rectangle r = new Rectangle("green", 40, 20);
        System.out.println(r.calculateArea());
        System.out.println(r.calculatePerimeter());
    }
}

interface Shape{
    double calculateArea();
    double calculatePerimeter();
    
}

abstract class AbstractShape implements Shape{
    String color;
    double length;
    double width;

    public AbstractShape(String color, double length, double width){
        this.color = color;
        this.length = length;
        this.width = width;
    } 
}

class Circle extends AbstractShape{    
    String color;
    double radius;

    public Circle(String color, double radius) {
        super(color, radius, radius);
        this.color = color;
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter(){
        return 2 * Math.PI * radius ;
    }
    public double radius(){
        return 0;
    }
}

class Rectangle extends AbstractShape{
    

    public Rectangle(String color, double length, double width){
        super(color, length, width);
    }
    public double calculateArea(){
        return length * width;
    }
    public double calculatePerimeter(){
        return 2 * (length * width);        
    }

}