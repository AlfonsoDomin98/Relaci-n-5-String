package Ejercicio11;

import java.util.Scanner;

public class MarcaSubCadena {

	public static void main(String[] args) {
		// INTRODUCCION DE VARIABLES
				String palabra = "" ;
				
				String texto = "";
				
				String PalabraSust = "";
				
				String Salida = "";
				
				// PROCESO
				
				texto = LeerTexto();
				
				palabra = LeerCadena();
				
				
				
				Salida = SustituyePalabra(texto,palabra);
				
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
			public static String SustituyePalabra(String texto, String palabra){
				
				String Sustituta = "";
				
				texto =texto.replaceFirst(palabra, "*");
			
				
				return texto;
			}


	}


