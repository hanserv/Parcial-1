package com.calculadora;

//Importamos este paquete para usar la clase Scanner.
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
    //Esta funcion busca pedirle 2 numeros al usuario y setearlos, estos 2 numeros los declaramos anteriormente como atributos privados de la clase
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
        //Intanciamos la clase "CalculadoraMatematica" para poder utilizar los metodos.
        //Tambien intanciamos la clase Scanner para poder ingresar datos por consola.
        Scanner input = new Scanner(System.in);
        CalculadoraMatematica menu = new CalculadoraMatematica();
        
        //Declaramos la variable opcion y la inicializamos con -1 pero luego se le asignara un valor dado por el usuario.
        int opcion = -1;
        do {
            //Mostramos el menu por consola. "\n" representa un salto de linea.
            System.out.println("-- MENU --\n1. Ingresar numeros.\n2. Sumar.\n3. Restar.\n4. Multiplicar\n5. Dividir.\n0. Salir.\n\nIngrese una opcion:");
            
            //Aqui el usuario segun el menu, seleccionara una opcion
            opcion = input.nextInt();
            //Estas variables seran las que se pasaran como parametros en las funciones. Con menu.getNum() se le asigna el valor que tengan eses atributos.
            double numero1 = menu.getNum1();
            double numero2 = menu.getNum2();
            
            //En este switch el programa entrara en uno de los cases, segun la opcion que el usuario le ingreso por consola.
            //En caso de que no este especificada la opcion que el usuario ingreso, se ejecutara el bloque de codigo del "default"
            switch(opcion) {
                    
                case 1:
                    //En esta opcion se llama al metodo para darle un valor a los numeros con los cuales operamos.
                    menu.ingresarNumeros();
                    numero1 = menu.getNum1();
                    numero2 = menu.getNum2();
                    break;
                case 2:
                    //En esta opcion llamamos el metodo suma pasandole por parametro los numeros previamente seteados y mostramos en consola.
                    System.out.println("El resultado de la suma es: "+menu.suma(numero1,numero2));
                    break;
                case 3:
                    //En esta opcion llamamos el metodo resta pasandole por parametro los numeros previamente seteados y mostramos en consola.
                    System.out.println("El resultado de la resta es: "+menu.resta(numero1,numero2));
                    break;
                case 4:
                    //En esta opcion llamamos el metodo multiplicacion pasandole por parametro los numeros previamente seteados y mostramos en consola.
                    System.out.println("El resultado de la multiplicacion es: "+menu.multiplicacion(numero1,numero2));
                    break;
                case 5:
                    //En esta opcion llamamos el metodo division pasandole por parametro los numeros previamente seteados y mostramos en consola.
                    //Tenemos una validacion que valida si el segundo numero es igual a 0, si es asi muestra un mensaje de error, de lo contrario, muestra el resultado.
                    if(menu.getNum2() == 0) System.out.println("Error. No se puede dividir entre 0");
                    else System.out.println("El resultado de la division es: "+menu.division(numero1,numero2));
                    break;
                case 0:
                    //en caso de el usuario ingresar 0, se mostrara este mensaje y posteriormente se cerrara el programa. 
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Error. Opcion no valida.");
                    break;
            }
        } while(opcion != 0);
    }
}