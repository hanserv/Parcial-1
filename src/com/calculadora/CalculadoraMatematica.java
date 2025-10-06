package com.calculadora;

import java.util.Scanner;

/**
 *
 * @author hanse
 */
public class CalculadoraMatematica {    
    //Declaramos los 2 atributos privados con los cuales se va a operar.
    public double num1;
    private double num2;
    
    //Constructor que inicia los valores en 0 al momento de instanciar la clase.
    public CalculadoraMatematica() {
        this.num1 = 0;
        this.num2 = 0;
    }
    
    //Getters and Setters (Con ellos accedemos a los 2 atributos que se crearon privados).
    public double getNum1() {
        return num1;
    }
    
    //Ejemplo. Este es un setter, tiene la palabra clave void porque no devuelve valor, solo setea.
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    //Por otra parte aqui tenemos double, al ser un get estamos esperando un valor, ese valor lo retornamos con la palabra clave "return".
    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    // Metodos de operaciones
    // Metodo simple que retorna el resultado de sumar dos numeros que se le pasen al momento de llamar al metodo.
    public double suma(double num1, double num2) {
        return num1 + num2;
    }
    // Como su nombre lo indica, este resta en vez de sumar.
    public double resta(double num1, double num2) {
        return num1 - num2;
    }
    //Metodo de multiplicar, igual retorna el resultado de multiplicar los 2 numeros que pide como parametro.
    public double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }
    //Igual que los anteriores, en este caso este devuelve la division entre los 2 numeros que recibe.
    public double division(double num1, double num2) {
        return num1 / num2;
    }
    
    //Metodo cambiar valor a los numeros
    public void ingresarNumeros() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        setNum1(input.nextDouble());
        System.out.print("Ingrese otro numero: ");
        setNum2(input.nextDouble());
        System.out.println("Numeros seteados correctamente!");
    }
    
    //main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CalculadoraMatematica menu = new CalculadoraMatematica();
        
        int opcion = -1;
        do {
            System.out.println("-- MENU --\n1. Ingresar numeros.\n2. Sumar.\n3. Restar.\n4. Multiplicar\n5. Dividir.\n0. Salir.\n\nIngrese una opcion:");
            opcion = input.nextInt();
            double numero1 = menu.getNum1();
            double numero2 = menu.getNum2();
            
            switch(opcion) {
                    
                case 1:
                    menu.ingresarNumeros();
                    numero1 = menu.getNum1();
                    numero2 = menu.getNum2();
                    break;
                case 2:
                    System.out.println("El resultado de la suma es: "+menu.suma(numero1,numero2));
                    break;
                case 3:
                    System.out.println("El resultado de la resta es: "+menu.resta(numero1,numero2));
                    break;
                case 4:
                    System.out.println("El resultado de la multiplicacion es: "+menu.multiplicacion(numero1,numero2));
                    break;
                case 5:
                    if(menu.getNum2() == 0) System.out.println("Error. No se puede dividir entre 0");
                    else System.out.println("El resultado de la division es: "+menu.division(numero1,numero2));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Error. Opcion no valida.");
                    break;
            }
        } while(opcion != 0);
        System.out.println("Programa finalizado!");
    }
}