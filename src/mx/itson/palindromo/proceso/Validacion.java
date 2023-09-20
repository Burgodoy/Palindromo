package mx.itson.palindromo.proceso;


public class Validacion {
        
    public String operacion(String oracion){
        //El resultado lo iniciamos como palindromo, en cso de no darse el resultado cambiara.
        String resultado = "Esta oracion es un palindromo";
        
        /*Este metodo que crearemos llamado creamos un arreglo de caracteres para guardar el resultado de nuestra
        variable oracion la cual le estamos dando 3 metodos, los cuales
        se encargan de llevar la palabra completa a minusculas, seguido de un 
        reemplazo de espacios blancos a una cadena vacia para asi obtener como 
        resultado la eliminacion de estos y posteriormente realizaremos 
        su separacion en el arreglo por caracteres.*/
        char[] separacion = oracion.toLowerCase().replace(" ", "").toCharArray();

        /*Creamos dos variables, una para iniciar un contador con el cual podremos
        hacer la comparacion y otra con el numero exacto de los elememntos del
        rreglo que creamos anteriormente*/
        int caracteresNormal = 0;
        
        /*La variable en la cual sabemos cuantos elementos tenemos en total debemos 
        restarle 1 ya que recordemos los arreglos inician desde el 0 por ende la 
        posicion 1 es el 0 y para poder utilizarla ocupamos restarle ese 1*/
        int caracteresInversos = separacion.length - 1;
        
        //utilizamos un for en donde utilizaremos cada elemento del arreglo de 
        //caracteres separacion
        for (char i : separacion) {
            
            /*Con un if checamos que la primera variable y segunda sean diferentes,
             si llegase a darse la condicion automaticamente resultado pasa a ser 
            No es palindromo y rompemos ciclo para retornar el resultado.
            En caso contrario agregamos un numero al principal y quitamos uno
            al final para asi comprobar ahora estos */
            if (separacion[caracteresNormal] != separacion[caracteresInversos]) {
                resultado = "Esta oracion No es un palindromo";
                break;
            }
            caracteresNormal++;
            caracteresInversos--; 
        }
        
        return resultado;
    }
    
}
