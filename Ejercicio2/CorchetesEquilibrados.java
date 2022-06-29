package Ejercicio2;

import java.util.Scanner;

public class CorchetesEquilibrados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cadena: ");
        String cadena = sc.next();
        System.out.print(isBalanced(cadena));
    }
}
