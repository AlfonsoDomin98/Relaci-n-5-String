package Ejercicio3;

import java.util.Scanner;

public class EsPalindromo {

	public static void main(String[] args) {
		// INTRODUCCION DE VARIABLES
		String palabra = "";
		String alreves = "";
		int aux = 0;
		boolean salida;
		
		
		// PORCESO
		palabra = LeerCadena();
		
		salida = esPalindromo(palabra,alreves);
		
		// SALIDA
		System.out.println(salida);
		
		// salida= esPalindromo(palabra, alreves);

	}
	public static String LeerCadena(){
		Scanner teclado = new Scanner(System.in);
		
		String palabra = "";
		
		System.out.println("Introduzca la palabra: ");
		
		palabra = teclado.nextLine();
		
		return palabra;
		
	}
	
	public static boolean esPalindromo (String palabra, String alreves){

		String modificado = palabra.replaceAll(" ","").toLowerCase();
        int i=0;
        while (i < modificado.length() / 2)
        {
            if (modificado.charAt(i) != modificado.charAt(modificado.length() -1 -i))
                return false;
            i++;
        }
        return true;
	}
	
}
