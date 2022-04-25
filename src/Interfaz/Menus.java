package Interfaz;

import Ejercicios.Calculadora;
import Ejercicios.Raiz;
import Exceptions.ArgumentoNegativoException;
import Exceptions.DesbordaCapacidadException;
import Exceptions.OperadorNoValidoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menus {
    public void selectorEjercicios(Scanner teclado) throws Exception {
        int seleccion = 0;
        boolean ejecutado = false;
        while (seleccion != 3) {

            menu();
            seleccion = teclado.nextInt();
            switch (seleccion) {
                case 1:
                    ejecutado = false;
                    while (!ejecutado) {
                        try {
                            teclado.nextLine();
                            Raiz rc = new Raiz();
                            rc.raizCuadrada(teclado);
                            ejecutado = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Valor no valido");
                        } catch (ArgumentoNegativoException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 2:
                    ejecutado = false;
                    while (!ejecutado) {
                        try {
                            teclado.nextLine();
                            Calculadora c = new Calculadora();
                            c.calcular(teclado);
                            ejecutado = true;
                        }catch (InputMismatchException e) {
                            System.out.println("Introduce lo que se te pide");
                        }catch(DesbordaCapacidadException ex){
                            System.out.println("El resultado desborda la capacidad de esta calculadora.");
                        }catch(ArithmeticException ex){
                            System.out.println("La división por cero no esta definida");
                        }catch(OperadorNoValidoException ex){
                            System.out.println(ex.getMessage());
                        }
                    }
                        break;
                        case 3:
                            System.out.println("Saliendo . . .");
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                            break;
                    }
            }

        }
        private static void menu () {
            System.out.println("\nSeleccione un ejercico:");
            System.out.println("1 - El cálculo de la raíz cuadrada ");
            System.out.println("2 - La calculadora en Java ");
            System.out.println("3 - Salir");
        }
    }

