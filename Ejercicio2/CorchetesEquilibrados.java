package Ejercicio2;

import java.util.Scanner;
import java.util.HashMap;

public class CorchetesEquilibrados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cadena: ");
        String cadena = sc.next();
        System.out.print(isBalanced(cadena));
    }

    public static String isBalanced(String cadena) {
        Stack<Character> pila = new Stack<Character>();
        HashMap<Character, Character> parejas = new HashMap<Character, Character>();
        parejas.put(')', '(');
        parejas.put(']', '[');
        parejas.put('}', '{');

        for (int i = 0; i < cadena.length(); i++) {
            char simbolo = cadena.charAt(i);

            if (simbolo == '[' || simbolo == '(' || simbolo == '{')
                pila.push(simbolo);
            else {
                if (parejas.get(simbolo) == pila.peek())
                    pila.pop();
                else
                    return "NO";
            }
    }
}
