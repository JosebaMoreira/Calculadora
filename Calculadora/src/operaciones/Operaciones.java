package operaciones;
/**
 * Esta clase contiene métodos para llevar a cabo operaciones básicas,
 * incluyendo suma, resta, multiplicación, división y cálculo del resto.
 */
public class Operaciones{
	/**
	 * Este metodo suma dos valores enteros.
	 * @param valor1 el primer numero que introduce el usuario
	 * @param valor2 el segundo numero que introduce el usuario
	 * @return la suma del valor1 y valor2
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
    /**
     * Este metodo resta dos valores enteros.
     * @param valor1 el primer numero que introduce el usuario
     * @param valor2 el segundo numero que introduce el usuario
     * @return la resta del valor1 y valor2
     */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
    /**
     * Este metodo multiplica dos valores enteros.
     * @param valor1 el primer numero que introduce el usuario
     * @param valor2 el segundo numero que introduce el usuario
     * @return la multiplicacion del valor1 y valor2
     */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
    /**
     * Este metodo divide dos valores enteros.
     * @param valor1 el primer numero que introduce el usuario
     * @param valor2 el segundo numero que introduce el usuario
     * @return la division del valor1 y valor2
     */
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    /**
     * Este metodo calcula el resto de la división entre dos valores enteros.
     * @param valor1 diviendo el primer numero que introduce el usuario
     * @param valor2 divisor el segundo numero que introduce el usuario
     * @return el resto de valor1 dividido por valor2
     */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}