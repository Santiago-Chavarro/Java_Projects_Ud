package figures;

public class Test {
    public static void main(String[] args) {
        Circle medium_pizza = new Circle(12);
        System.out.println("El area de la pizza es: " + medium_pizza.Area());
        System.out.println("El perimetro de la pizza es: " + medium_pizza.Perimeter());
        
        Circle lote = new Circle(25);
        System.out.println("El area del lote es: " + lote.Area());
        System.out.println("El perimetro del lote es: " + lote.Perimeter());
        
        Rectangle desk = new Rectangle(12, 2);
        System.out.println("El area de la mesa es: " + desk.area());
        System.out.println("El perimetro de la mesa es: " + desk.perimeter());
        
        RightTriangle chocoramoSquare = new RightTriangle(3, 5);
        System.out.println("El area de una esquina de chocoramo es: " + chocoramoSquare.area());
        System.out.println("El perimetro de una esquina de chocoramo es: " + chocoramoSquare.perimeter());
    }
    
}
