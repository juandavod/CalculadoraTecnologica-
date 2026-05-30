/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoratecnologica;

import java.util.Scanner;

/**
 *
 * @author juandavid
 */
public class CalculadoraTecnologica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¡Bienvenido a la Calculadora Tecnológica!");
        {

        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.println("Ingrese el primer número:");
        num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número:");
        num2 = teclado.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);

    }}}
    

