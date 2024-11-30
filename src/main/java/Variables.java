public class Variables {
    public static void main(String[] args) {
        // Variables
        int edad = 31;
        double precio = 300.40;
        boolean disponible = true; // true/false
        char genero;
        genero = 'M'; //M-Masculino / F-Femenino

        // Acceder a las variables
        System.out.println(edad);

        // Modificar el valor
        edad = 35; // Sobreescribimos el valor de edad
        System.out.println(edad);

        // Ejercicio
        System.out.println(precio);
        System.out.println(disponible);
        System.out.println(genero);
    }
}

/*
* NOTAS:
* Puedes declarar variables y asignar valores en el mismo instante (declaración y asignación)
* Puedes declarar variables y luego, en otra línea, asignar el valor
* No es necesario volver a declarar el tipo de dato al usar la variable
* */