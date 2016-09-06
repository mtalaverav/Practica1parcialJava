package py.edu.uaa.pooj.operadores.test;
public class OperacionesMatematicas {
	// PRACTICA
	 public static void main(String[] args) {
		 int n[] = new int [10]; // crea el array 
		 //se carga el array con números generados de forma aleatoria.
		 for (int i = 0; i < n.length; i++) {
			 n[i] = (int) (Math.random() * 1000+1); 
		 }
	        System.out.println("El array es: ");
	        for (int i = 0; i < n.length; i++) {
	            int j = n[i];
	            System.out.print("[" + j + "]");
	        }
	       int minimo = encontrarMinimo(n);
	       System.out.println(" \nEl minimo es: " + "[" + minimo + "]");
	       
	       int maximo = encontrarMaximo(n);
	       System.out.println("El  máximo es" + "[" + maximo + "]");     
	 }     

public static int encontrarMinimo(int [] numeros) {
		// TODO "Encontrar el valor minimo de un array de enteros"
		int minimo = numeros [0];
		for  (int i=0 ; i < numeros.length; i++) {
			if(numeros[i]< minimo) {
                minimo = (numeros[i]);
            }
		}
		return minimo;		
}
	// PRACTICA
	public static int encontrarMaximo(int [] numeros) {
		// "Encontrar el valor maximo de un array de enteros"
		int maximo = numeros [0];
		for (int i=0 ; i < numeros.length; i++) {
			if (numeros [i]> numeros.length) {
				maximo = (numeros[i]);			
			}
		}
		return maximo;
	}
}
