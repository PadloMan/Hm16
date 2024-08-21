package org.example;
public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        System.out.println("5 + 3 = " + calculator.add(5, 3));
        System.out.println("3 - 2 = " + calculator.subtract(3, 2));
        System.out.println("2 * 3 = " + calculator.multiply(2, 3));
        System.out.println("15 / 3 = " + calculator.divide(15, 3));
    }

}
