package py.edu.uaa.pooj.operadores.test;

public class TestCadenas {

	private static String cadena1;
	private static String cadena2;
	private static String cadenax;

	public String concatenar(String cadena1, String cadena2) {
		cadena1 = "melissa ";
		cadena2 = "talavera";
		// retorna la concatenacion de la cadena1 con la cadena2
		return cadena1 + cadena2;
	}

	public String convertirMinusculas(String cadena) {
		// retona la cadena pasada como parametro, convertida a minusculas
	     
		return cadena.toLowerCase();
	}

	public String convertirMayusculas(String cadena) {
		// retorna la cadena pasada como parametro, convertida a mayusculas
		return cadena.toUpperCase();
	}

	public int obtenerLongitudCadena(String cadena) {
		// obtiene la longitud de la cadena (cantidad de caracteres que tiene)
		return cadena.length();
	}

	public boolean compararCadenaDiferenciandoMayusculas(String cadena1,
			String cadena2) {
		// retorna true si las cadenas son iguales y false si las cadenas son
		// diferentes
		// IMPORTANTE: diferencia entre mayusculas y minusculas
		return cadena1.equals(cadena2);	
	}

	public boolean compararCadenaSinDiferenciarMayusculasYMinusculas(
			String cadena1, String cadena2) {
		// retorna true si las cadenas son iguales y false si las cadenas son
		// diferentes
		// IMPORTANTE: NO diferencia entre mayusculas y minusculas
		return cadena1.equalsIgnoreCase(cadena2);
	}

	public String[] divisionCadenas(String cadena) {
		// retorna un array de String conteniendo el resultado de la division de
		// la cadena ingresada, utilizando como delimitador
		// el pasado como parametro al metodo split, que en este caso es ";"

		String arrayString[];
		// el caracter por el que se separara la cadena es pasado como parametro
		arrayString = cadena.split(";");
		return arrayString;
	}

	public String subcadena(String cadena, int inicio, int fin) {
		// Se obtiene la cadena delimitada en las posiciones 2 y 4
		return cadena.substring(inicio, fin);
	}

	public char obtenerCaracterCadena(String cadena, int posicion) {
		// retona el caracter de una cierta posicion de la cadena
		return cadena.charAt(posicion);
	}

	public boolean verificarSiComienzaCon(String cadena, String cadenaAVerificar) {
		// retorna true si la cadena comienza con la subcadena ingresada como
		// parametro
		return cadena.startsWith(cadenaAVerificar);
	}

	public boolean verificarSiTerminaCon(String cadena, String cadenaAVerificar) {
		// retorna true si la cadena termina con la subcadena ingresada como
		// parametro 
		return cadena.endsWith(cadenaAVerificar);
	}

	public boolean verificarSiContiene(String cadena, String cadenaAVerificar) {
		// retorna true si la cadena contiene la subcadena pasada como parametro
		return cadena.contains(cadenaAVerificar);
	}

	public int obtenerIndiceSubcadena(String cadena, String subcadena) {
		// retorna el indice de la cadena donde comienza la subcadena ingresada
		// como parametro
		return cadena.indexOf(subcadena);
	}

	public static void main(String[] args) {
		TestCadenas testC = new TestCadenas();
		System.out.println(testC.concatenar("Hola", " Que tal?"));
		
		String sCadena = "Esto Es Una Cadena De TEXTO";	
	    System.out.println(sCadena.toLowerCase());

	    String cadena = "no estoy GritanDo"; 
	    System.out.println(cadena.toUpperCase());
	    
	    String cadenaS = " Hola!! ";
	    System.out.println(cadenaS.length());
	   
	    cadena1 = new String("Hola");
	    cadena2 = new String("HolA");
	    System.out.println(cadena1.equals(cadena2));
	    
	    System.out.println(cadena1.equalsIgnoreCase(cadena2));
	    
	    String colores = "rojo,amarillo,verde,azul,morado,marrón";
	    int inicio = colores.indexOf(",");
	    int fin = colores.indexOf(",", inicio + 1);
	    System.out.println(colores.substring(inicio + 1, fin));
	    System.out.println(colores.substring(inicio + 1));
	    
	    cadenax = new String("alan daniel ");
	    System.out.println(cadenax.charAt(2));  
	    
	    System.out.println(cadena.startsWith("No"));
	    System.out.println(cadenax.endsWith("daniel")); 
	    
	    System.out.println(cadena2.contains("HolA como te va"));
	    System.out.println(cadena.indexOf(cadenax));
	}
}
