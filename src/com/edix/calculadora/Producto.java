package com.edix.calculadora;



/**
 * <h2>Clase Producto, realiza la multiplicación de dos o tres números reales o
 * enteros y la potencia de un número.</h2>
 * 
 * Esta clase se utiliza para implementar todos los métodos que estén
 * relacionados con las operaciones de multiplicación de la calculadora.<br>
 * 
 * Más información sobre multiplicación de números enteros en
 * <a href="https://cutt.ly/KIgjFwq">productoEnteros</a><br>
 * Más información sobre multiplicación de números reales en
 * <a href="https://cutt.ly/rIgjKLM">productoReales</a>
 * 
 * @author Israel Serrano, Pablo Baldazo, Ricardo Alvarado
 * @version 1.1
 */

public class Producto {
	

	private static final int LIMITE = 2147483647;

	/**
	 * Este método realiza la multiplicación de dos números enteros positivos y
	 * devuelve el resultado de dicha multiplicación.
	 * 
	 * @param num1 Primer operando de la multiplicación, no puede exceder el valor
	 *             2147483647 y no puede ser negativo.
	 * @param num2 Segundo operando de la multiplicación, no puede exceder el valor
	 *             2147483647 y no puede ser negativo.
	 * @return Devuelve el resultado de la multiplicación.<br>
	 *         Si el resultado supera el límite de int (2,147,483,647) devuelve el
	 *         código de error -103.<br>
	 *         En caso de que uno de los parámetros sea negativo devuelve el código
	 *         de error: -100.<br>
	 *         Si alguno de los parámetros es mayor a 2,147,483,647 (límite del int)
	 *         devuelve el código de error: -102.
	 */

	public int productoDosEnteros(int num1, int num2) {
		if (num1 < 0 || num2 < 0) {
			return -100;
		}

		else if (num1 > LIMITE || num2 > LIMITE) {
			return -102;
		}
        
		int resultado = num1 * num2;

		if (resultado < 0) {
			return -103;
		} else {
			return resultado;
		}

	}

	/**
	 * Este método realiza la multiplicación de dos números reales positivos y
	 * devuelve el resultado de dicha multiplicación.
	 * 
	 * @param real1 Primer operando de la multiplicación, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @param real2 Segundo operando de la multiplicación, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @return Devuelve el resultado de la multiplicación.<br>
	 *         Si el resultado supera el límite de int (2,147,483,647) devuelve el
	 *         código de error -103.<br>
	 *         En caso de que uno de los parámetros sea negativo devuelve el código
	 *         de error: -100.<br>
	 *         Si alguno de los parámetros es mayor a 2,147,483,647 (límite del int)
	 *         devuelve el código de error: -102.
	 */

	public double productoDosReales(double real1, double real2) {
		if (real1 < 0 || real2 < 0) {
			return -100;
		}

		else if (real1 > LIMITE || real2 > LIMITE) {
			return -102;
		}

		double resultado = real1 * real2;

		if (resultado > LIMITE) {
			return (-103);
		} else {
			return resultado;
		}

	}

	/**
	 * Este método realiza la multiplicación de tres números reales positivos y
	 * devuelve el resultado de dicha multiplicación.
	 * 
	 * @param real1 Primer operando de la multiplicación, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @param real2 Segundo operando de la multiplicación, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @param real3 Tercer operando de la multiplicación, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @return Devuelve el resultado de la multiplicación.<br>
	 *         Si el resultado supera el límite de int (2,147,483,647) devuelve el
	 *         código de error -103.<br>
	 *         En caso de que uno de los parámetros sea negativo devuelve el código
	 *         de error: -100.<br>
	 *         Si alguno de los parámetros es mayor a 2,147,483,647 (límite del int)
	 *         devuelve el código de error: -102.
	 */

	public double productoTresReales(double real1, double real2, double real3) {

		if (real1 < 0 || real2 < 0 || real3 < 0) {
			return -100;
		}

		else if (real1 > LIMITE || real2 > LIMITE || real3 > LIMITE) {
			return -102;
		}

		double resultado = real1 * real2 * real3;

		if (resultado > LIMITE) {
			return (-103);
		} else {
			return resultado;
		}

	}

	/**
	 * Este método realiza la potencia de un números entero positivo, tiene dos
	 * parámetros, el primero será la base y el segundo será el exponente. Devuelve
	 * el resultado de la potencia.<br>
	 * 
	 * @param num1 Base de la potencia, no puede exceder el valor 2147483647 y no
	 *             puede ser negativo.
	 * @param num2 Exponente de la potencia, no puede exceder el valor 2147483647 y
	 *             no puede ser negativo.
	 * @return Devuelve el resultado de la potencia.<br>
	 *         Si el resultado alcanza el límite de int (2,147,483,647) o lo supera,
	 *         devuelve el código de error -103.<br>
	 *         En caso de que uno de los parámetros sea negativo devuelve el código
	 *         de error: -100.<br>
	 *         Si el parámetro es mayor a 2,147,483,647 (límite del int) devuelve el
	 *         código de error: -102.
	 * 
	 */

	public int potencia(int num1, int num2) {
		if (num1 < 0 || num2 < 0) {
			return -100;
		}

		else if (num1 > LIMITE || num2 > LIMITE) {
			return -102;
		}

		int resultado = (int) Math.pow(num1, num2);

		if (resultado >= LIMITE) {
			return -103;
		} else {
			return resultado;
		}

	}
	
	
}
