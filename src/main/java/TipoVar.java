public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");

        // Sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);

        // Con el uso de var
        var nombre2 = "Carlos";
        System.out.println("nombre2 = " + nombre2);

        // Definir otras variables usando
        var edad = 30; // Se infiere el tipo int
        System.out.println("edad = " + edad);

        var sueldo = 5000.5F; // Se infiere el tipo float
        System.out.println("sueldo = " + sueldo);

        var esCasado = false; // Se infiere tipo boolean
        System.out.println("esCasado = " + esCasado);

        esCasado = true;
        // esCasado = "No"; No podemos asignar un tipo distinto

        // Se debe definir su valor
        //var precio; esto lanza un error, tenemos que asignar un valor
        //precio = 10;

        // Se debe poder inferir el tipo de dato
        //var apellido = null; no se puede inferir el tipo de dato
        /*
        * NOTAS:
        * Con var, el tipo de dato de la variable que estamos definiendo va a depender del valor que le estemos asignamos. var nombre = "Ximena" (ahora nombre es tipo String)
        * Con var, debes inicializarla al declararse
        * Con var, el tipo debe ser inferible
        * Con var, por ejemplo, si a una variable le asignamos un valor tipo String, la variable, durante el tiempo de vida, será tipo String y no le podemos asignar otro tipo de dato
        * Con var, estas variables solo existen durante el tiempo de ejecución del metodo
        * */
    }
}
