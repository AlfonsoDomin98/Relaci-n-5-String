package Ejercicio1;

public class NumeroEspacios {

	public static void main(String[] args) {
		// INTRODUCCION DE VARIABLES
		String cadena = "Hola Pepe Ramon";
		int salida =0;
		
		
		// PROCESO
		salida = NumeroEspacios(cadena);
		
		// SALIDA
		System.out.println(salida);

	}
	public static int NumeroEspacios (String cadena){
		int palabra[] = new int[cadena.length()] ;
		int contador = 0;
		int b = 0;
		for(b = 0; b < palabra.length; b++){
			
			palabra[b] = contador++;
			
		}
		
		return contador;
	}

}
