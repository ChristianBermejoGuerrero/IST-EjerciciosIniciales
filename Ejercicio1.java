package HolaMundo;

public class Ejercicio1 {
	/**
	 * Primer ejemplo de declaración y uso de variables con tipos primitivos
	 */
	
	public static int suma(int num1, int num2) {
		return num1 + num2;
	}
	
	// Implementar un método suma_double para sumar dos números double que se
	// pasen como argumentos
	
	public static double suma_double(double num1, double num2) {
		return num1 + num2;
	}
	
	public static int resta(int num1, int num2) {
		return num1 + num2;
	}
	
	public static double media(int num1, int num2) {
		return (num1 + num2)/2.0;
	}
	
	public static int max(int num1, int num2){
		// (num1 > num2) ? num1 : num2 ---> equivalente utilizando el operador ternario
		if (num1 > num2){
			return num1;
		} else {
			return num2;
		}
	}
	
	public static int min(int num1, int num2){
		if (num1 < num2){
			return num1;
		} else {
			return num2;
		}
	}
	
	public static void main(String[] args){
		int a = 1, b = 2, c = 3;
		float d = 3.f, e = 4.f;
		double x = 3.14, y = 2.71, z = 1.1412;
		
		System.out.println("La suma de los tres enteros es:" + suma((int)e,(int)d));
		System.out.println("La suma double de los dos enteros es:" + suma_double(x+y,z));
		System.out.println("La media de los dos enteros es:" + media(a,b));
		System.out.println("El maximo de los dos enteros es:" + max(c,b));
		System.out.println("El minimo de los dos enteros es:" + min(c,b));
		
		// Pregunta 1: ¿Podemos usar el método suma(int, int) con argumentos 
		// de tipo float o double? ¿Cómo?
		// A: Si se podria utilizar mediante casting (int)num1 (num es double)
		//    suma ((int)num1,(int)num2) siendo num1,num2 float o double
		
		// Pregunta 2: ¿Qué ocurre si usamos el método suma_double(double, double)
		// con dos números int como argumentos? ¿Y si usamos dos números float?
		// A: Lo podemos utilizar sin problemas, ya que el destino es mayor que el origen y este
		//    va a promocionar
		
		// Pregunta 3: Completa los tres métodos que faltan por implementar y comprueba
		// su correcto funcionamiento en este método main.
		// A: DONE

	}
}
