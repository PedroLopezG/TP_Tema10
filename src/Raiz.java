package Ejercicios;

import Exceptions.ArgumentoNegativoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Raiz {
    public void raizCuadrada(Scanner teclado)throws ArgumentoNegativoException, InputMismatchException {
        System.out.print("Introducir un valor: ");
        int argumento = teclado.nextInt();
        if (argumento < 0){
                throw new ArgumentoNegativoException("La raíz cuadrada no está definida para un número negativo.");
        }else {
            double r = Math.sqrt(argumento);
            System.out.println(String.format("√%d = %.2f", argumento, r));
        }
    }
}
