public class Constantes {
    public static void main(String[] args) {
        System.out.println("*** Constante en Java ***");
        final var DIAS_SEMANA = 7;
        System.out.println("DIAS_SEMANA = " + DIAS_SEMANA);
        //DIAS_SEMANA = 8;
        final var PI = 3.1416;
        System.out.println("PI = " + PI);
        System.out.println("Math.PI" + Math.PI);
        final var MENSAJE_BIENVENIDA = "Bienvenid@ a la Universidad Java";
        System.out.println("MENSAJE_BIENVENIDA = " + MENSAJE_BIENVENIDA);
        final var MINUTOS_POR_SEGUNDO = 60;
        System.out.println("MINUTOS_POR_SEGUNDO = " + MINUTOS_POR_SEGUNDO);
    }
}

/*
 * NOTAS:
 * Una constante en Java es una variable cuyo valor NO puede modificarse al inicializarse
 * Una constante en Java se utilizan para valores que sabemos que no cambiarán a lo largo de la ejecución del programa
 * Para declarar una constante en Java usamos la sintaxis: final tipo nombreConstante = valor;
 * También podemos usar el tipo va para definir una constante
 * El nombre de una constante mayormente están en mayúsculas y si hay más letras, separarlas con _
 * Dentro de Java, ya existen constantes definidas (en bibliotecas y así)
 */