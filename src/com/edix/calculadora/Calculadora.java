package com.edix.calculadora;

/**
 * <h2>Clase Calculadora, representa una calculadora y varios de sus métodos
 * para realizar operaciones aritméticas.</h2>
 * 
 * A través de la clase calculadora, se puede llamar a los métodos de las clases
 * suma, resta, producto y cociente.<br>
 * 
 * Los parámetros y resultados tienen que cumplir unas reglas, en caso contrario
 * obtendremos los siguientes códigos de error:
 * <ul>
 * <li>-100 Error al introducir un parámetro negativo.
 * <li>-101 Error al introducir el valor cero como parámetro.
 * <li>-102 Error al sobrepasar el valor máximo permitido del parámetro.
 * <li>-103 Error al sobrepasar el valor maximo permitido del resultado.
 * </ul>
 * 
 * 
 * @author Israel Serrano, Pablo Baldazo, Ricardo Alvarado
 * @version 1.1
 *
 */

public class Calculadora {
	/**
	 * Este es el método principal donde se va a ejecutar la calculadora.
	 * 
	 * @param args Argumentos de la línea de comandos.
	 */

	public static void main(String[] args) {
		
		Suma sum=new Suma();
		System.out.println(sum.sumaDosEnteros(5, -1));
		System.out.println(sum.sumaDosReales(41561.1451,5646.54654));
		System.out.println(sum.sumaTresReales(9, 5, -2));
		sum.acumulador(44242);
		System.out.println(sum.acumulado);

	}

}

