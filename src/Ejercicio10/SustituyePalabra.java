package Ejercicio10;

import java.util.Scanner;

public class SustituyePalabra {

	public static void main(String[] args) {
		// INTRODUCCION DE VARIABLES
		String palabra = "" ;
		
		String texto = "";
		
		String PalabraSust = "";
		
		String Salida = "";
		
		// PROCESO
		
		texto = LeerTexto();
		
		palabra = LeerCadena();
		
		PalabraSust = PalabraSustituir();
		
		Salida = SustituyePalabra(texto,palabra,PalabraSust);
		
		// SALIDA

		System.out.println(Salida);
		
	}
	
	public static String LeerTexto(){
		Scanner teclado = new Scanner (System.in);
		
		String texto = "";
		
		System.out.println("Introduzca el texo: ");
		
		texto = teclado.nextLine();
		
		return texto;
		
	}
	public static String LeerCadena(){
		
		Scanner teclado = new Scanner (System.in);
		
		String palabra = " ";
		
		System.out.println("Introduzca la palabra que quiera sustituir: ");
		
		palabra = teclado.nextLine();
		
		return palabra;
	}
	
	public static String PalabraSustituir(){
		
		Scanner teclado = new Scanner (System.in);
		
		String palabra = "";
		
		System.out.println("Introduzca la palabra por la que quiere sustituir la palabra anterior: ");
		
		palabra = teclado.nextLine();
		
		return palabra;
	}
	public static String SustituyePalabra(String texto, String palabra, String palabraSust){
		
		String Sustituta = "";
		
		texto =texto.replace(palabra, palabraSust);
	
		
		return texto;
	}

}
