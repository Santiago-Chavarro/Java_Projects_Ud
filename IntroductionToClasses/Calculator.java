public class Calculator{
    public Calculator(){

    }

    public int add(int a, int b){
        return a + b;
    }

    public int substract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int division(int a, int b){
        return a / b;
    }

    public int module(int a, int b){
        return a % b;
    }

    public static void main(String[] args) {
        Calculator mycCalculator = new Calculator();
        System.out.println(mycCalculator.add(12, 7));
        System.out.println(mycCalculator.substract(99, 12));
        System.out.println(mycCalculator.multiply(7, 2));
    }

}