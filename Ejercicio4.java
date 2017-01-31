package HolaMundo;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Enunciado: crear un programa que solicite introducir por consola
	 * un número entero en el intervalo [1, 12]. A continuación, el programa
	 * debe imprimir por pantalla el nombre completo del mes que corresponde
	 * al entero introducido.
	 */
	public static void main(String[] args) {
		String[] meses = {"Ene","Feb","Mar","May","Abr","Jun","Jul","Ago","Sep","Oct","Nov","Dic"}; 
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un entero entre el 1 y el 12: ");
		int num = entrada.nextInt();
		while(num < 1 || num > 12){
			System.out.println("Numero incorrecto, vuelva a introducir un entero entre 1 y 12: ");
			int num1 = entrada.nextInt();
			num = num1;
		}
		System.out.println(meses[num-1]);
	}
}
