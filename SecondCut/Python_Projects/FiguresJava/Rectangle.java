package figures;

public class Rectangle {
    double base;
    double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area(){
        return this.base * this.height;
    }
    
    public double perimeter(){
        return 2 * (this.base + this.height);
    }    
}
