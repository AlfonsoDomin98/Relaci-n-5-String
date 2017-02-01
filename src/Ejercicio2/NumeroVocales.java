package Ejercicio2;

public class NumeroVocales {

	public static void main(String[] args) {
		// INTRODUCCION DE VARIABLES
		String cadena = "hola que tal estamos";
		int salida = 0;
		
		// PROCESO
		salida = NumeroVocales(cadena);
		
		// SALIDA
		System.out.println(cadena);
		System.out.println("Numero de Vocales: "+salida);

	}
	public static int NumeroVocales ( String palabra){
		
		int contador = 0;

		
		for (int b = 0; b < palabra.length(); b++){
			
			if(palabra.charAt(b)=='a' || palabra.charAt(b) == 'e' || palabra.charAt(b)=='i' || palabra.charAt(b)=='o' || palabra.charAt(b) == 'u'){
	
			  contador ++;	
			}
		}
		
		return contador;
	}

}
