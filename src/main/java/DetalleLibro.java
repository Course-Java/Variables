public class DetalleLibro {
    public static void main(String[] args) {
        // Detalle de un Libro
        String tituloLibro = "El Señor de los Anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        System.out.println(tituloLibro);
        System.out.println(anioPublicacion);
        System.out.println(libroDisponible);
        System.out.println(precio);

        // Modificar el título del libro
        tituloLibro = "El señor de los anillos";

        System.out.println(tituloLibro);
    }
}
