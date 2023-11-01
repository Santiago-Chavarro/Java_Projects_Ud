package figures;

public class RightTriangle {
    double base;
    double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public double area(){
        return (this.base * this.height) / 2;
    }
    
    public double perimeter(){
        double hipotenuse = Math.pow(Math.pow(this.base, 2) + Math.pow(this.height, 2), 0.5);
        return hipotenuse;
    }
}
