package Ejercicios;

import Exceptions.DesbordaCapacidadException;
import Exceptions.OperadorNoValidoException;

import java.util.Scanner;

public class Calculadora {
    public void calcular(Scanner teclado) throws OperadorNoValidoException, DesbordaCapacidadException {
        System.out.println("Introducir un número entero: ");
        int n1 = teclado.nextInt();
        System.out.println("¿operador? (+ - * / % o s para salir)");
        String operador = teclado.next();
        if (!(operador.equals("+")) && !(operador.equals("-")) && !(operador.equals("*")) && !(operador.equals("/")) && !(operador.equals("%"))) {
            if (operador.equals("s")) {
                System.out.println("Saliendo . . .");
            } else {
                throw new OperadorNoValidoException("Operador no válido");
            }
        } else {
            System.out.println("Introducir un número entero: ");
            int n2 = teclado.nextInt();
            if(operador.equals("+")){
//            if (this.sumar(a,b)<-2147483648 || this.sumar(a,b)>2147483647 ){
//                throw new DesbordaCapacidadException("El resultado desborda la capacidad de esta calculadora.");
//
//            }else {
                System.out.println(String.format("%d + %d = %d", n1, n2, this.sumar(n1, n2)));
//            }
            }
            if(operador.equals("*")){
                System.out.println(String.format("%d x %d = %d",n1,n2,this.multiplicar(n1, n2)));
            }
            if(operador.equals("-")){
                System.out.println(String.format("%d - %d = %d",n1,n2,this.restar(n1, n2)));
            }
            if(operador.equals("/")){
                System.out.println(String.format("%d / %d = %.2f",n1,n2,this.dividir(n1, n2)));
            }
            if(operador.equals("%")){
                System.out.println(String.format("%d %% %d = %d",n1,n2,this.resto(n1, n2)));
            }

            }


        }

    public int sumar(int x, int y) throws DesbordaCapacidadException {

        return x+y;
    }

    public int restar(int x, int y) throws DesbordaCapacidadException{
        return x-y;
    }

    public int multiplicar(int x, int y) throws DesbordaCapacidadException{
        return x*y;
    }

    public double dividir(int x, int y){
        double division = x/y;
        return division;
    }

    public int resto(int x, int y){
        return x%y;
    }
    }

