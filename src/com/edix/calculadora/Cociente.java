package com.edix.calculadora;

/**
 * <h2>Clase Cociente, realiza la división de dos números reales o enteros, el
 * inverso de un número real y la raíz de un número.</h2>
 * 
 * Esta clase se utiliza para implementar todos los métodos que estén
 * relacionados con las operaciones de división de la calculadora.<br>
 * 
 * Más información sobre división de números enteros en
 * <a href="https://cutt.ly/SIgzfAW">cocienteEnteros</a><br>
 * Más información sobre división de números reales en
 * <a href="https://cutt.ly/WIglHaw">cocienteReales</a>
 * 
 * @see Suma
 * @see Resta
 * @see Producto
 * @see Calculadora
 * 
 * @author Israel Serrano, Pablo Baldazo, Ricardo Alvarado
 * @version 1.1
 */

public class Cociente {

	private static final int LIMITE = 2147483647;

	/**
	 * 
	 * Este método realiza la división de dos números enteros positivos y devuelve
	 * el cociente y en el caso de que el resultado no sea exacto también el
	 * resto.<br>
	 * 
	 * 
	 * @param num1 Dividendo de la división, no puede exceder el valor 2147483647 y
	 *             no puede ser negativo.
	 * @param num2 Divisor de la división, no puede exceder el valor 2147483647 y no
	 *             puede ser negativo.
	 * 
	 * @return Devuelve el cociente y en el caso de que el resultado no sea exacto
	 *         también el resto.<br>
	 *         Si el resultado supera el límite de int (-2,147,483,647) devuelve el
	 *         código de error -103.<br>
	 *         En caso de que uno de los parámetros sea negativo devuelve el código
	 *         de error: -100.<br>
	 *         Si alguno de los parámetros es mayor a 2,147,483,647 (límite del int)
	 *         devuelve el código de error: -102.
	 */

	public String cocienteDosEnteros(int num1, int num2) {

		int resultado = 0, resto = 0;

		if (num1 < 0 || num2 < 0)
			return "-100";
		else if (num1 == 0 || num2 == 0)
			return "-101";
		else if (num1 > LIMITE || num2 > LIMITE)
			return "-102";
		else {
			resultado = num1 / num2;
			resto = num1 % num2;

			if (num1 % num2 != 0)
				return "Cociente = " + resultado + " Resto = " + resto;
			else
				return "Cociente = " + resultado;
		}

	}

	/**
	 * Este método realiza la división de dos números reales positivos y devuelve el
	 * cociente y en el caso de que el resultado no sea exacto también el resto.<br>
	 * 
	 * 
	 * @param real1 Dividendo de la división, no puede exceder el valor 2147483647 y
	 *              no puede ser negativo.
	 * @param real2 Divisor de la división, no puede exceder el valor 2147483647 y
	 *              no puede ser negativo.
	 * @return Devuelve el cociente y en el caso de que el resultado no sea exacto
	 *         también el resto.<br>
	 *         Si el resultado supera el límite de int (-2,147,483,647) devuelve el
	 *         código de error -103.<br>
	 *         En caso de que uno de los parámetros sea negativo devuelve el código
	 *         de error: -100.<br>
	 *         Si alguno de los parámetros es mayor a 2,147,483,647 (límite del int)
	 *         devuelve el código de error: -102.
	 */

	public String cocienteDosReales(double real1, double real2) {

		double resultado = 0, resto = 0;

		if (real1 < 0 || real2 < 0)
			return "-100";
		else if (real1 == 0 || real2 == 0)
			return "-101";
		else if (real1 > LIMITE || real2 > LIMITE)
			return "-102";
		else {
			resultado = real1 / real2;
			resto = real1 % real2;

			if (real1 % real2 != 0)
				return "Cociente = " + resultado + " Resto = " + resto;
			else
				return "Cociente = " + resultado;
		}

	}

	/**
	 * Este método calcula el inverso de un número real positivo y devuelve el
	 * resultado.
	 * 
	 * @param real1 Número que se va a invertir, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @return Devuelve el inverso del valor introducido.<br>
	 *         En caso de el parámetro sea negativo devuelve el código de error:
	 *         -100.<br>
	 *         En caso de el parámetro sea cero devuelve el código de error:
	 *         -101.<br>
	 *         Si el parámetro es mayor a 2,147,483,647 (límite del int) devuelve el
	 *         código de error: -102.
	 */

	public double inverso(double real1) {

		if (real1 < 0)
			return -100;
		else if (real1 == 0)
			return -101;
		else if (real1 > LIMITE)
			return -102;
		else
			return 1 / real1;

	}

	/**
	 * Este método calcula la raíz cuadrada de un número entero y devuelve como
	 * resultado un número real.
	 * 
	 * @param num1 Número del cual se calcula la raíz cuadrada, no puede exceder el
	 *             valor 2147483647 y no puede ser negativo.
	 * @return Devuelve el resultado de la raíz cuadrada.<br>
	 *         En caso de el parámetro sea negativo devuelve el código de error:
	 *         -100.<br>
	 *         En caso de el parámetro sea cero devuelve el código de error:
	 *         -101.<br>
	 *         Si el parámetro es mayor a 2,147,483,647 (límite del int) devuelve el
	 *         código de error: -102.
	 */

	public double raiz(int num1) {

		if (num1 < 0)
			return -100;
		else if (num1 == 0)
			return -101;
		else if (num1 > LIMITE)
			return -102;
		else
			return Math.sqrt(num1);

	}

}
