package py.edu.uaa.pooj.operadores.test;

public class TestOperadoresIteradores {
	/*
	 * Metodo que suma un array de enteros que recibe como parametro
	 * Retorna el resultado de la suma
	 */
	public int sumar(int[] numeros) {
		int resultado = 0;
		for (int i = 0; i < numeros.length; i++) {
			resultado = resultado + numeros[i];
		}
		return resultado;
	}

	 //PRACTICA: implementar la resta recibiendo un array de enteros
	public int restar(int [] numeros) {
		//TODO "Implementar el metodo restar"
		int resultado = 0; 
		for (int i = 0; i < numeros.length; i++) {
				resultado = resultado - numeros[i];
		}
		return resultado;
	}
	
	// PRACTICA: implementar la multiplicacion recibiendo un array de enteros
	 
	public int multiplicar(int [] numeros) {
		//TODO "Implementar el metodo multiplicar"
		int resultado = 2; 
		for (int i = 0; i < numeros.length; i++) {
				resultado = resultado * numeros[i];
		}
		return resultado;
	}

	public static void main(String[] args) {
		//Se crea un objeto de la clase TestOperadoresIteradores, llamado testOpIt
		TestOperadoresIteradores testOpIt = new TestOperadoresIteradores();
		//Se crea un array de enteros a ser sumados
		int[] numerosASumar = { 10, 20, 30, 40, 50 };
		/*Se imprime el resultado de la invocacion al metodo sumar de testOpIt habiendole
		 * pasado como parametro el array numerosASumar
		 */
		System.out.println(testOpIt.sumar(numerosASumar));
		
		//resta
		TestOperadoresIteradores testResta = new TestOperadoresIteradores();	
		int[] numerosARestar = { 10, 88, 30, 40, 500 };
		System.out.println(testResta.restar(numerosARestar)); 
		
		//multiplicacion
		TestOperadoresIteradores testMultiplicacion = new TestOperadoresIteradores();
		int[] numerosAMultiplicar = { -30, 20, 30, 40, 300 };
		System.out.println(testMultiplicacion.multiplicar(numerosAMultiplicar)); 
	}
}
