package figures;

public class Circle {
    private final double pi;
    private double radius;
    
    public Circle(double diameter) {
        radius = diameter / 2;
        pi = 3.14;
    }
    
    public double Area(){
        return this.radius * Math.pow(this.pi, 2);
    }
    
    public double Perimeter(){
        return this.pi * this.radius * 2;
    }
}
