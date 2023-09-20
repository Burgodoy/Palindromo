package mx.itson.palindromo.ui;

import java.util.Scanner;
import mx.itson.palindromo.proceso.Validacion;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Escriba su oracion para determinar"
                + " si es o no un palindromo");
        
        Scanner scanner = new Scanner(System.in);
        String oracion = scanner.nextLine();
        
        /*Instancimos variable respuesta para poder utilizar el metodo operacion 
        en el cual se realizan todos los procedimientos para obtener la respuesta */
        String respuesta = new Validacion().operacion(oracion);

        //Mostramos resultado
        System.out.println(respuesta);
        
          
    }
    
}
