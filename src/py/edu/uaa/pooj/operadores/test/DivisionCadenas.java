package py.edu.uaa.pooj.operadores.test;

public class DivisionCadenas {

	public static class TestCadenas {

		public String[] divisionCadenas(String cadena) {

			// retorna un array de String conteniendo el resultado de la
			// division de

			// la cadena ingresada, utilizando como delimitador

			// el pasado como parametro al metodo split, que en este caso es ";"

			String arrayString[];

			// el caracter por el que se separara la cadena es pasado como
			// parametro

			arrayString = cadena.split(";");

			return arrayString;
		}

		public static void main(String[] args) {

			TestCadenas testC = new TestCadenas();

			System.out.print("Separador de Cadenas: \n");

			String[] arrayString = testC.divisionCadenas("Cadena;imprimir");

			int i = 0;

			for (String string : arrayString) {

				System.out.println("Cadena en posicion " + i + " " + string);

				i++;

			}

		}

	}
}
