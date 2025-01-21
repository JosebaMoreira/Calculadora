package menu;
import java.util.Scanner;
/**
 * Esta clase se encarga de presentar las opciones disponibles al usuario,
 * así como de solicitar y recibir la entrada de datos necesarios para
 * realizar las operaciones matemáticas.
 */
public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    /**
     * Este metodo solicita al usuario que ingrese dos números enteros.
     * @return un array de enteros que contiene los dos números metidos por el usuario
     */
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    
    /**
     * Este metodo muestra un menú de operaciones y solicita al usuario que seleccione.
     * @return la operación seleccionada por el usuario
     */
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    
    /**
     * Este metodo pregunta al usuario si desea continuar utilizando la calculadora.
     * @return true si el usuario desea continuar; false si el usuario elige no continuar
     */
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("�Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}