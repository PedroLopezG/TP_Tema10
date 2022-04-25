import Interfaz.Menus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Menus menu = new Menus();
        menu.selectorEjercicios(teclado);
    }
}
