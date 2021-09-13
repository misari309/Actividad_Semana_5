package src_class;

public class Rectangle {
    
    public static double base;
    public static double height;
    
    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public Rectangle(){
    
    }
    public double area(){
        double areaR = base*height;
        return areaR;
    }
    
    public double perimeter(){
        double perimeterR = 2*base+2*height;
        return perimeterR;
    } 
    
    public double getBase(){
        return this.base;
    }
    
    public double getHeight(){
        return this.height;
    }
}
