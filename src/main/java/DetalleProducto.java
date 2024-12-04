public class DetalleProducto {
    public static void main(String[] args) {
        // Asignamos los valores a las variables
        System.out.println("*** Tienda en Linea (Detalle Producto) ***");
        String nombre = "Jabón";
        float precio = 10.99F;
        int cantidadDisponible = 0;
        boolean esDisponible = false;

        // Imprimimos los valores
        System.out.println("nombre = " + nombre);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("esDisponible = " + esDisponible);

        // Modificamos los valores
        nombre = "Tarro de leche";
        precio = 6.99F;
        cantidadDisponible = 50;
        esDisponible = true;

        System.out.println(); // Salta de línea

        // Imprimimos los valores
        System.out.println("nombre = " + nombre);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("esDisponible = " + esDisponible);
    }
}
