package com.edix.calculadora;

/**
 * <h2>Clase Suma, realiza la suma de dos o tres números reales o enteros y
 * acumulación de valores.</h2>
 * 
 * 
 * Esta clase se utiliza para implementar todos los métodos que estén
 * relacionados con las operaciones de suma de la calculadora.<br>
 * 
 * 
 * Más información sobre suma de números enteros en
 * <a href="https://cutt.ly/qIgiBuF">sumaEnteros</a><br>
 * Más información acerca de la suma de números reales en
 * <a href="https://cutt.ly/3IgoKCC">sumaReales</a>
 * 
 * @author Israel Serrano, Pablo Baldazo, Ricardo Alvarado
 * @version 1.1
 * 
 */

public class Suma {
	

	private static final int LIMITE = 2147483647;
	/**
	 * Acumulado de la suma que se realiza de manera iterativa.
	 */
	
	int acumulado=0;
	
	/**
	 * Este método realiza la suma de dos números enteros positivos y devuelve el
	 * resultado de dicha suma.
	 * 
	 * @param num1 Primer operando de la suma, no puede exceder el valor 2147483647
	 *             y no puede ser negativo.
	 * @param num2 Segundo operando de la suma, no puede exceder el valor 2147483647
	 *             y no puede ser negativo.
	 * @return Devuelve el resultado de la suma.<br>
	 *         Si el resultado supera el límite de int (2,147,483,647) devuelve el
	 *         código de error -103.<br>
	 *         En caso de que uno de los parámetros sea negativo devuelve el código
	 *         de error: -100.<br>
	 *         Si alguno de los parámetros es mayor a 2,147,483,647 (límite del int)
	 *         devuelve el código de error: -102.
	 */

	
	public int sumaDosEnteros(int num1, int num2) {
		
		if (num1<0 || num2<0) {
			return -100;
		}
		else if (num1>LIMITE || num2>LIMITE){
			return -102;
			
		}
		
		int resultado = num1+num2;
		
		if(resultado<0) {
			return -103;
		}
		
		else {
			return resultado;
		}
		
		
	}
	

	/**
	 * Este método realiza la suma de dos números reales positivos y devuelve el
	 * resultado de dicha suma.
	 * 
	 * @param real1 Primer operando de la suma, no puede exceder el valor 2147483647
	 *              y no puede ser negativo.
	 * @param real2 Segundo operando de la suma, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @return Devuelve el resultado de la suma.<br>
	 *         Si el resultado supera el límite de int (2,147,483,647) devuelve el
	 *         código de error -103.<br>
	 *         En caso de que uno de los parámetros sea negativo devuelve el código
	 *         de error: -100.<br>
	 *         Si alguno de los parámetros es mayor a 2,147,483,647 (límite del int)
	 *         devuelve el código de error: -102.
	 */
	
	public double sumaDosReales(double real1, double real2) {
		if (real1<0 || real2<0) {
			return -100;
		}
		else if (real1>LIMITE || real2>LIMITE){
			return -102;
			
		}
	    double resultado = real1+real2;
		
		if(resultado<0) {
			
			return -103;
		}
		else {
			return resultado;
		}
	}
	
	/**
	 * Este método realiza la suma de tres números reales positivos y devuelve el
	 * resultado de dicha suma.
	 * 
	 * @param real1 Primer operando de la suma, no puede exceder el valor 2147483647
	 *              y no puede ser negativo.
	 * @param real2 Segundo operando de la suma, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @param real3 Tercer operando de la suma, no puede exceder el valor 2147483647
	 *              y no puede ser negativo.
	 * @return Devuelve el resultado de la suma.<br>
	 *         Si el resultado supera el límite de int (2,147,483,647) devuelve el
	 *         código de error -103.<br>
	 *         En caso de que uno de los parámetros sea negativo devuelve el código
	 *         de error: -100.<br>
	 *         Si alguno de los parámetros es mayor a 2,147,483,647 (límite del int)
	 *         devuelve el código de error: -102.
	 */
	
	public double sumaTresReales(double real1, double real2, double real3) {
		if (real1<0 || real2<0 || real3<0) {
			return -100;
		}
		else if (real1>LIMITE || real2>LIMITE || real3>LIMITE){
			return -102;
			
		}
	    double resultado = real1+real2+real3;
	    
		if(resultado<0) {
			return -103;
		}
		else {
		    return resultado;
		}
		
	}
	
	/**
	 * Este método acumula la suma de los valores de manera iterativa.<br>
	 * En caso de que el parámetro sea negativo devuelve el código de error:
	 * -100.<br>
	 * Si el resultado supera el límite de int (2,147,483,647) devuelve el código de
	 * error -103.
	 * 
	 * @param num Número introducido para sumar al valor acumulado, no puede exceder
	 *            el valor 2147483647 y no puede ser negativo.
	 */
	public void acumulador(int num) {
		if (num < 0)
            System.out.println(-100);
        else if (num > LIMITE)
            System.out.println(-102);
        else
            acumulado += num;
        if (acumulado < 0)
            System.out.println(-103);
  
	}

}
