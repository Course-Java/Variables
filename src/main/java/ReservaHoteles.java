public class ReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hoteles ***");
        System.out.println(" ");

        // Definimos las variables
        var nombre = "Maximiliano";
        var estancia = 4;
        var tarifa = 100.00F;
        var hasVistaMar = true;

        System.out.println("nombre = " + nombre);
        System.out.println("estancia = " + estancia);
        System.out.println("tarifa = " + tarifa);
        System.out.println("isVistaMar = " + hasVistaMar);

        System.out.println(" ");

        nombre = "Jose";
        estancia = 5;
        tarifa = 95.50F;
        hasVistaMar = false;

        System.out.println("nombre = " + nombre);
        System.out.println("estancia = " + estancia);
        System.out.println("tarifa = " + tarifa);
        System.out.println("isVistaMar = " + hasVistaMar);
    }
}
