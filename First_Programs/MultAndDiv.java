/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multanddiv;

/**
 *
 * @author Santiago
 */
public class MultAndDiv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double subtotal = 30;
        double tax = 0.0875;
        double total = subtotal + (subtotal*tax);
        double perPerson = total/4;
        System.out.println("The total is " + total + " USD");
        System.out.println("Each person pays " + perPerson + " USD");
        
    
}
}
