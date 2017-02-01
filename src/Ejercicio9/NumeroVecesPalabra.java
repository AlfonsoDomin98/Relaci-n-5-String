package Ejercicio9;

import java.util.Scanner;

public class NumeroVecesPalabra {

	public static void main(String[] args) {
		// VALIDACION DE VARIABLES
		String cadena ="";
		String palabra = "";
		int resultado = 0;
		
		// PROCESO
		cadena = LeerCadena();
		palabra = LeerPalabra();
		resultado = VecesPalabra(cadena,palabra);
		
		// SALIDA
		System.out.println("Numero de veces: " +resultado);
	}
	
	public static String LeerCadena(){
		Scanner teclado = new Scanner (System.in);
		
		String aux = "";
		
		System.out.println("Introduzca la cadena de texto: ");
		
		aux = teclado.nextLine();
		
		return aux;
	}
	
	public static String LeerPalabra (){
		Scanner teclado = new Scanner(System.in);
		
		String palabra = "";
		
		boolean esCorrecto = false;
		
		do{
			System.out.println("Introduzca una palabra de la cadena");
			try{
				palabra = teclado.nextLine();
				esCorrecto = true;
			}
			catch (Exception e){
				System.out.println("No ha introducido un valor correcto");
				esCorrecto = false;
				
			}
		}
		while(!esCorrecto);
		
		return palabra;
	}
	
	public static int VecesPalabra (String cadena, String palabra){
		String [] Arrays = cadena.split(palabra);
		
		int contador = 0;
		
		contador = Arrays.length;

		
		return contador;
	}
}
