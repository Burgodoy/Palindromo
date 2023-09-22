
package mx.itson.palindromo.proceso;


public class Validacion {
    /**
     * Pasa la oracion a minusculas, seguido de un reemplazo de espacios el cual
     * los elimina, prosigue creando un arreglo de caracteres de los elementos 
     * que contiene la variable oracion y por ultimo utilizando un ciclo for
     * comparamos cada elemento contenido en el arreglo.
     * @param oracion
     * @return El resultado de la comparacion "Es" o "No es" un palindromo
     */
    public String operacion(String oracion){
    
    String resultado = "Es un palindromo";
    
    char [] limpieza = oracion.toLowerCase().replace(" ", "").toCharArray();
    
    //variables de comparacion, uno representara el primer caracter del arreglo
    //el otro sera el ultimo caracter
    int caracteresNormal = 0;
    int caracteresInversos = limpieza.length - 1;
    
        for (char i : limpieza) {
            /*
            Esta es la verdadera validacion, este if compara los caracteres 
            iniciales y finales en caso de cumplirse la condicion se cierra ciclo
            y se modifica la respuesta. Si no es el caso la respuesta nunca 
            se modificara.
            */
            if (limpieza[caracteresNormal] != limpieza[caracteresInversos]) {
                resultado = "No es un palindromo";
                break;
            }
            caracteresNormal++;
            caracteresInversos--;
        }
        
    return resultado;
    } 
}
