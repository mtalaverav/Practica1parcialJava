package py.edu.uaa.pooj.operadores.test;
public class NumerosImparesOp {
	public static void main( String args[] ) {
		int[] numeros = { 2, 3, 4, 5, 10};
		for (int i=0; i< numeros.length; i++) {
			if (numeros[i]%2 != 0){
				System.out.print(numeros[i]);
			}
		}	
	}
}	
	