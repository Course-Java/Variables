public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de Datos en Java
        // Enteros
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);

        short tipoShort = 32767;
        System.out.println("tipoShort = " + tipoShort);

        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);

        long tipoLong = 9223372036854775807L;
        System.out.println("tipoLong = " + tipoLong);

        // Punto flotante
        float tipoFloat = 3.14F;
        System.out.println("tipoFloat = " + tipoFloat);

        double tipoDouble = 3.1315;
        System.out.println("tipoDouble = " + tipoDouble);
    }
}

/*
* NOTAS:
* Con el atajo soutv podemos imprimir directamente el valor de la anterior variable
* La variable tipo byte puede almacenar hasta 8 bits
* La variable tipo short puede almacenar hasta 16 bits
* La variable tipo int puede almacenar hasta 32 bits
* La variable tipo long puede almacenar hasta 64 bits
* En Java, todos los números enteros se consideran de tipo int por defecto. Sin embargo, si queremos especificar un tipo de dato diferente, podemos hacerlo de dos formas: utilizando un cast explícito (tipoDato)valor para números pequeños (como byte o short), o agregando un sufijo como L para números grandes que exceden el rango de int.
* Por defecto, todos los números con punto flotante se consideran tipo double. Sin embargo, si queremos especificar un tipo de dato diferente (en este caso float), podemos simplemente agregar una F o f al final del número (lo mismo con double colocando el D o d, pero en esí ya está por default)
* */