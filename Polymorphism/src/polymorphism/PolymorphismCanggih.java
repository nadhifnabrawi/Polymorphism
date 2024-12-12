/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author nadhif
 */
public class PolymorphismCanggih extends Polymorphism {
     private int modulus;
    private double doubleModulus;

    void setModulus(int a, int b) {
        modulus = a % b;
    }
    void setModulus(int a, int b, int c) {
        modulus = (a % b) % c;
    }
    void setModulus(double a, double b) {
        doubleModulus = a % b;
    }
    void setModulus(double a, double b, double c) {
        doubleModulus = (a % b) % c;
    }
    int getModulus (){
        return modulus;
    }
    double getDoubleModulus(){
        return doubleModulus;
    }
}

